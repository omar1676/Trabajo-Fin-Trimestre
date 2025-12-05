/*Jugadores y sus partidas*/
SELECT j.nickname, v.titulo, p.horas_juego
FROM partidas p
JOIN jugador j ON
 p.id_jugador = j.id_jugador
JOIN videojuegos v 
ON p.id_juego = v.id_juego;

/*Merchandising y el videojuego que pertenece*/
SELECT m.tipo, m.precio, v.titulo
FROM merchandising m
JOIN videojuegos v 
ON m.id_juego = v.id_juego;

/*Plataformas y juegos asociados*/
SELECT p.tipo_plataforma, v.titulo
FROM plataformas p
JOIN videojuegos v 
ON p.id_juego = v.id_juego;

/*Juegos con su desarrollador*/
SELECT v.titulo, d.nombre_empresa
FROM videojuegos v
JOIN desarrollador d 
ON v.id_desarrollador = d.id_desarrollador;

/*Partidas con datos del jugador y desarrollador*/
SELECT j.nickname, v.titulo, d.nombre_empresa, p.horas_juego
FROM partidas p
JOIN jugador j 
ON p.id_jugador = j.id_jugador
JOIN videojuegos v 
ON p.id_juego = v.id_juego
JOIN desarrollador d 
ON v.id_desarrollador = d.id_desarrollador;

/*Jugadores invitados por otros jugadores*/
SELECT j.nickname AS anfitrion, COUNT(j.jugador_id_invitado) AS invitado
FROM jugador j
GROUP BY anfitrion
HAVING invitado = 1;

/*Juegos, plataformas y merchandising*/
SELECT v.titulo, p.tipo_plataforma, m.tipo AS merchandising
FROM videojuegos v
LEFT JOIN plataformas p 
ON v.id_juego = p.id_juego
LEFT JOIN merchandising m 
ON v.id_juego = m.id_juego;

/*Total de horas jugadas por juego*/
SELECT v.titulo, SUM(p.horas_juego) AS total_horas
FROM partidas p
JOIN videojuegos v 
ON p.id_juego = v.id_juego
GROUP BY v.id_juego;

/*Número de jugadores por país*/
SELECT pais, COUNT(*) AS numero_jugadores
FROM jugador
GROUP BY pais;

/*Jugadores con más horas que la media*/
SELECT nickname, total_horas
FROM (
    SELECT j.nickname, SUM(p.horas_juego) AS total_horas
    FROM partidas p
    JOIN jugador j 
    ON p.id_jugador = j.id_jugador
    GROUP BY j.id_jugador
) AS tabla
WHERE total_horas > (
    SELECT AVG(horas_juego) FROM partidas
);

/*Juegos más caros que el precio promedio*/
SELECT titulo, precio
FROM videojuegos
WHERE precio = (
SELECT AVG(precio) 
FROM videojuegos);

/*Jugadores que han jugado el juego más largo*/
SELECT j.nickname, p.horas_juego
FROM partidas p
JOIN jugador j 
ON p.id_jugador = j.id_jugador
WHERE p.horas_juego = (
    SELECT MAX(horas_juego) 
    FROM partidas
);

/*Jugadores que han jugado más horas que el promedio de horas invertidas en cada juego*/
SELECT j.nickname, j.pais, p.horas_juego, v.titulo
FROM partidas p
JOIN jugador j 
ON p.id_jugador = j.id_jugador
JOIN videojuegos v 
ON p.id_juego = v.id_juego
WHERE p.horas_juego > (
        SELECT AVG(p2.horas_juego)
        FROM partidas p2
        WHERE p2.id_juego = p.id_juego
    )
ORDER BY v.titulo, p.horas_juego DESC;
