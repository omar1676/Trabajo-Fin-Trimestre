/*1. Listar videojuegos con su desarrollador*/
SELECT v.titulo, v.genero, d.nombre_empresa
FROM videojuegos v
JOIN desarrollador d
ON v.desarrollador_id = d.id_desarrollador;

/*Merchandising con videojuegos*/
SELECT m.tipo, m.precio, v.titulo
FROM merchandising m
JOIN videojuegos v 
ON m.videojuegoid = v.id_juego;

/*Partidas con jugadores*/
SELECT p.id_partida, j.jugador_nombre, p.horas_juego
FROM partidas p
JOIN jugador j 
ON p.jugador_id = j.id_jugador;

/*Plataformas con videojuegos*/
SELECT pl.tipo_plataforma, v.titulo
FROM plataformas pl
JOIN videojuegos v 
ON pl.juegoid = v.id_juego;

/*Jugadores con sus invitados*/
SELECT j1.jugador_nombre AS jugador, j2.jugador_nombre AS invitado
FROM jugador j1
LEFT JOIN jugador j2 
ON j1.id_jugador = j2.jugador_id_invitado;

/*Videojuegos con partidas y jugadores*/
SELECT v.titulo, j.jugador_nombre, p.horas_juego
FROM partidas p
JOIN jugador j 
ON p.jugador_id = j.id_jugador
JOIN videojuegos v 
ON p.idjuego = v.id_juego;

/*Merchandising y desarrollador indirectamente*/
SELECT m.tipo, d.nombre_empresa
FROM merchandising m
JOIN videojuegos v 
ON m.videojuegoid = v.id_juego
JOIN desarrollador d 
ON v.desarrollador_id = d.id_desarrollador;

/*Partidas y plataformas*/
SELECT j.jugador_nombre, pl.tipo_plataforma, v.titulo
FROM partidas p
JOIN jugador j 
ON p.jugador_id = j.id_jugador
JOIN videojuegos v 
ON p.idjuego = v.id_juego
JOIN plataformas pl 
ON v.id_juego = pl.juegoid;

/*Total horas jugadas por jugador*/
SELECT j.jugador_nombre, SUM(p.horas_juego) AS total_horas
FROM partidas p
JOIN jugador j 
ON p.jugador_id = j.id_jugador
GROUP BY j.jugador_nombre;

/*Cantidad de juegos por desarrollador*/
SELECT d.nombre_empresa, COUNT(v.id_juego) AS total_juegos
FROM videojuegos v
JOIN desarrollador d 
ON v.desarrollador_id = d.id_desarrollador
GROUP BY d.nombre_empresa;

/*Precio promedio de merchandising por videojuego*/
SELECT v.titulo, AVG(m.precio) AS precio_promedio
FROM merchandising m
JOIN videojuegos v 
ON m.videojuegoid = v.id_juego
GROUP BY v.titulo;

/*Videojuegos más caros*/
SELECT titulo, precio
FROM videojuegos
ORDER BY precio DESC
LIMIT 3;

/*Jugadores que no invitaron a nadie*/
SELECT j.jugador_nombre
FROM jugador j
LEFT JOIN jugador j2 
ON j.id_jugador = j2.jugador_id_invitado
WHERE j2.id_jugador IS NULL;

/*Jugador que más horas ha jugado*/
SELECT j.jugador_nombre, j.nickname, p.horas_juego
FROM jugador j
JOIN partidas p 
ON j.id_jugador = p.jugador_id
WHERE p.horas_juego = (
    SELECT MAX(horas_juego)
    FROM partidas
);

/*Videojuego más caro*/
SELECT titulo, precio
FROM videojuegos
WHERE precio = (
    SELECT MAX(precio)
    FROM videojuegos
);

/*Videojuego con más horas totales jugadas por jugadores invitados*/
SELECT v.titulo,
       v.genero,
       SUM(p.horas_juego) AS total_horas,
       COUNT(DISTINCT j.id_jugador) AS jugadores_invitados
FROM videojuegos v
JOIN partidas p 
ON v.id_juego = p.idjuego
JOIN jugador j 
ON p.jugador_id = j.id_jugador
WHERE j.id_jugador IN (
    SELECT jugador_id_invitado
    FROM jugador
    WHERE jugador_id_invitado IS NOT NULL
)
GROUP BY v.id_juego
HAVING total_horas = (
    SELECT MAX(sub.total_horas)
    FROM (
        SELECT SUM(p2.horas_juego) AS total_horas
        FROM partidas p2
        JOIN jugador j2 
        ON p2.jugador_id = j2.id_jugador
        WHERE j2.id_jugador IN (
            SELECT jugador_id_invitado
            FROM jugador
            WHERE jugador_id_invitado IS NOT NULL
        )
        GROUP BY p2.idjuego
    ) AS sub
);
