🎮 README — Base de Datos TimeMachine

Bienvenido al documento oficial del proyecto TimeMachine, una base de datos diseñada para gestionar información relacionada con videojuegos, jugadores, partidas, plataformas, inventario y merchandising.

Este README explica:
1️⃣ La base de datos
2️⃣ Su schema/tablas
3️⃣ Las consultas SQL incluidas

🗄️ 1) Base de Datos

Nombre: timemachine
Charset: utf8mb4
Collation: utf8mb4_0900_ai_ci
Motor principal: InnoDB ⚙️

📌 Creación de la base de datos
    CREATE DATABASE IF NOT EXISTS `timemachine`
    /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */
    /*!80016 DEFAULT ENCRYPTION='N' */;
    USE `timemachine`;

📥 Para importar el dump
    mysql -u usuario -p < dump.sql
Incluye configuraciones de MySQL para desactivar restricciones temporalmente, acelerar la carga y asegurar integridad.

🧩 2) Esquema de la Base de Datos (Tablas y Relaciones)

A continuación, se describen todas las tablas del proyecto con sus claves, columnas e índices.
✨ Incluye observaciones para mejorar el diseño.

🏢 desarrollador

🔑 Llave primaria: id_desarrollador
📌 Campos destacados:

nombre_empresa (único) 🏭

juego y id_juego → ⚠️ datos redundantes

🎮 videojuegos

🔗 Relacionado con desarrollador vía id_desarrollador

📌 Campos:

titulo

genero

precio 💲

lanzamiento 📅

id_desarrollador (FK)

👤 jugador

📌 Datos del jugador:

jugador_nombre

nickname (único) 🎭

email

pais 🌍

fecha_nacimiento

edad (⚠️ redundante con la fecha)

📍 Observación:

jugador_id_invitado no tiene FK definida → se recomienda revisar su propósito.

🕹️ partidas

Relaciona jugadores y videojuegos ▶️

📌 Campos:

id_jugador (FK)

id_juego (⚠️ no tiene FK en el dump, recomendable añadirla)

horas_juego

fecha_partida

🧱 inventario

Objetos del juego:

id_juego (sin FK declarada)

objeto

🔧 Tiene índices duplicados (juego_id_idx / gameid_idx)

🛍️ merchandising

Artículos promocionales del juego:

tipo (único) 🛒

precio

id_juego

🖥️ plataformas

Plataformas donde está disponible un juego:

tipo_plataforma (Switch, PC, PS5…)

id_juego

🔧 Falta FK hacia videojuegos

🧠 3) Consultas SQL Incluidas

Aquí están TODAS las consultas del proyecto, cada una con una breve descripción.
📌 Mantengo tu orden original.

1️⃣ Jugadores y sus partidas 🎮👤
    SELECT j.nickname, v.titulo, p.horas_juego
    FROM partidas p
    JOIN jugador j ON p.id_jugador = j.id_jugador
    JOIN videojuegos v ON p.id_juego = v.id_juego;

2️⃣ Merchandising y su juego asociado 🛍️🎮
    SELECT m.tipo, m.precio, v.titulo
    FROM merchandising m
    JOIN videojuegos v ON m.id_juego = v.id_juego;

3️⃣ Plataformas y juegos 🖥️🎮
    SELECT p.tipo_plataforma, v.titulo
    FROM plataformas p
    JOIN videojuegos v ON p.id_juego = v.id_juego;

4️⃣Juegos y sus desarrolladores 🏭🎮
    SELECT v.titulo, d.nombre_empresa
    FROM videojuegos v
    JOIN desarrollador d ON v.id_desarrollador = d.id_desarrollador;

5️⃣ Partidas + Jugador + Desarrollador 🧠
    SELECT j.nickname, v.titulo, d.nombre_empresa, p.horas_juego
    FROM partidas p
    JOIN jugador j ON p.id_jugador = j.id_jugador
    JOIN videojuegos v ON p.id_juego = v.id_juego
    JOIN desarrollador d ON v.id_desarrollador = d.id_desarrollador;

6️⃣ Jugadores invitados 🎟️
    SELECT j.nickname AS anfitrion, COUNT(j.jugador_id_invitado) AS invitado
    FROM jugador j
    GROUP BY anfitrion
    HAVING invitado = 1;

7️⃣ Juegos + Plataformas + Merchandising 💽🖥️🛍️
    SELECT v.titulo, p.tipo_plataforma, m.tipo AS merchandising
    FROM videojuegos v
    LEFT JOIN plataformas p ON v.id_juego = p.id_juego
    LEFT JOIN merchandising m ON v.id_juego = m.id_juego;

8️⃣ Total de horas jugadas por juego ⏱️
    SELECT v.titulo, SUM(p.horas_juego) AS total_horas
    FROM partidas p
    JOIN videojuegos v ON p.id_juego = v.id_juego
    GROUP BY v.id_juego;

9️⃣ Número de jugadores por país 🌎
    SELECT pais, COUNT(*) AS numero_jugadores
    FROM jugador
    GROUP BY pais;

🔟 Jugadores con más horas que la media ⏳📈
    SELECT nickname, total_horas
    FROM (
        SELECT j.nickname, SUM(p.horas_juego) AS total_horas
        FROM partidas p
        JOIN jugador j ON p.id_jugador = j.id_jugador
        GROUP BY j.id_jugador
    ) AS tabla
    WHERE total_horas > (
        SELECT AVG(horas_juego) FROM partidas
    );

1️⃣1️⃣ Juegos cuyo precio coincide con la media 💲⚖️
    SELECT titulo, precio
    FROM videojuegos
    WHERE precio = (
        SELECT AVG(precio) FROM videojuegos
    );


📌 Si buscas más caros que la media, debería ser >.

1️⃣2️⃣ Jugadores del juego con más horas 🔝
    SELECT j.nickname, p.horas_juego
    FROM partidas p
    JOIN jugador j ON p.id_jugador = j.id_jugador
    WHERE p.horas_juego = (
        SELECT MAX(horas_juego) FROM partidas
    );

1️⃣3️⃣ Jugadores que superan el promedio por juego ⭐
    SELECT j.nickname, j.pais, p.horas_juego, v.titulo
    FROM partidas p
    JOIN jugador j ON p.id_jugador = j.id_jugador
    JOIN videojuegos v ON p.id_juego = v.id_juego
    WHERE p.horas_juego > (
            SELECT AVG(p2.horas_juego)
            FROM partidas p2
            WHERE p2.id_juego = p.id_juego
        )
    ORDER BY v.titulo, p.horas_juego DESC;
