-- Crear base de datos
CREATE DATABASE IF NOT EXISTS timemachine
DEFAULT CHARACTER SET utf8mb4
COLLATE utf8mb4_0900_ai_ci;
USE timemachine;

-- -------------------------------------------------
-- Tabla: desarrollador
-- -------------------------------------------------
DROP TABLE IF EXISTS desarrollador;
CREATE TABLE desarrollador (
    id_desarrollador INT NOT NULL AUTO_INCREMENT,
    nombre_empresa VARCHAR(45) NOT NULL,
    juego VARCHAR(45),
    fecha_lanzamiento DATE,
    PRIMARY KEY (id_desarrollador),
    UNIQUE (nombre_empresa)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Datos desarrollador
INSERT INTO desarrollador (nombre_empresa, juego, fecha_lanzamiento) VALUES
('Nintendo', 'The Legend of Zelda: Breath of the Wild', '2017-03-03'),
('Rockstar Games', 'Grand Theft Auto V', '2013-09-17'),
('CD Projekt Red', 'The Witcher 3: Wild Hunt', '2015-05-19'),
('Ubisoft', 'Assassin''s Creed Valhalla', '2020-11-10'),
('Bethesda Game Studios', 'Skyrim', '2011-11-11');

-- -------------------------------------------------
-- Tabla: videojuegos
-- -------------------------------------------------
DROP TABLE IF EXISTS videojuegos;
CREATE TABLE videojuegos (
    id_juego INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(45) NOT NULL,
    genero VARCHAR(45) NOT NULL,
    precio DOUBLE,
    desarrollador_id INT NOT NULL,
    lanzamiento DATE,
    PRIMARY KEY (id_juego),
    UNIQUE (genero),
    KEY desarrolador_id_idx (desarrollador_id),
    CONSTRAINT fk_desarrollador FOREIGN KEY (desarrollador_id)
        REFERENCES desarrollador(id_desarrollador)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Datos videojuegos
INSERT INTO videojuegos (titulo, genero, precio, desarrollador_id, lanzamiento) VALUES
('Breath of the Wild', 'Aventura', 59.99, 1, '2017-03-03'),
('GTA V', 'Accion', 29.99, 2, '2013-09-17'),
('The Witcher 3', 'RPG', 39.99, 3, '2015-05-19'),
('Assassin''s Creed Valhalla', 'Mundo Abierto', 49.99, 4, '2020-11-10'),
('Skyrim', 'Fantasia', 19.99, 5, '2011-11-11');

-- -------------------------------------------------
-- Tabla: jugador
-- -------------------------------------------------
DROP TABLE IF EXISTS jugador;
CREATE TABLE jugador (
    id_jugador INT NOT NULL AUTO_INCREMENT,
    jugador_nombre VARCHAR(45) NOT NULL,
    nickname VARCHAR(45) NOT NULL UNIQUE,
    email VARCHAR(45) NOT NULL UNIQUE,
    pais VARCHAR(45) NOT NULL UNIQUE,
    jugador_id_invitado INT DEFAULT NULL,
    PRIMARY KEY (id_jugador),
    CONSTRAINT fk_jugador_invitado FOREIGN KEY (jugador_id_invitado)
        REFERENCES jugador(id_jugador)
        ON DELETE SET NULL
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Datos jugador
INSERT INTO jugador (jugador_nombre, nickname, email, pais, jugador_id_invitado) VALUES
('Carlos Ramirez', 'Carlitos', 'carlos@example.com', 'España', NULL),
('Ana Torres', 'AnitaGamer', 'ana@example.com', 'México', 1),
('John Smith', 'JS_Warrior', 'john@example.com', 'USA', NULL),
('Laura Gomez', 'LauPlay', 'laura@example.com', 'Argentina', NULL),
('Marco Rossi', 'RedRossi', 'marco@example.com', 'Italia', NULL);

-- -------------------------------------------------
-- Tabla: merchandising
-- -------------------------------------------------
DROP TABLE IF EXISTS merchandising;
CREATE TABLE merchandising (
    id_mercha INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(45) NOT NULL UNIQUE,
    precio DOUBLE,
    videojuegoid INT,
    PRIMARY KEY (id_mercha),
    KEY videojuego_id_idx (videojuegoid),
    CONSTRAINT fk_merch_videojuego FOREIGN KEY (videojuegoid)
        REFERENCES videojuegos(id_juego)
        ON DELETE SET NULL
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Datos merchandising
INSERT INTO merchandising (tipo, precio, videojuegoid) VALUES
('Camiseta Oficial', 25.99, 1),
('Poster Edición Especial', 15.50, 2),
('Figura Coleccionista', 89.99, 3),
('Taza Exclusiva', 12.99, 4),
('Llaveros Premium', 8.99, 5);

-- -------------------------------------------------
-- Tabla: plataformas
-- -------------------------------------------------
DROP TABLE IF EXISTS plataformas;
CREATE TABLE plataformas (
    id_plataforma INT NOT NULL AUTO_INCREMENT,
    tipo_plataforma VARCHAR(45) NOT NULL UNIQUE,
    juego VARCHAR(45),
    juegoid INT NOT NULL,
    PRIMARY KEY (id_plataforma),
    KEY juego_id_idx (juegoid),
    CONSTRAINT fk_plataforma_juego FOREIGN KEY (juegoid)
        REFERENCES videojuegos(id_juego)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Datos plataformas
INSERT INTO plataformas (tipo_plataforma, juego, juegoid) VALUES
('Nintendo Switch', 'Breath of the Wild', 1),
('PlayStation 4', 'GTA V', 2),
('PC', 'The Witcher 3', 3),
('PlayStation 5', 'Assassin''s Creed Valhalla', 4),
('Xbox Series X', 'Skyrim', 5);

-- -------------------------------------------------
-- Tabla: partidas
-- -------------------------------------------------
DROP TABLE IF EXISTS partidas;
CREATE TABLE partidas (
    id_partida INT NOT NULL AUTO_INCREMENT,
    jugador_id INT NOT NULL,
    idjuego INT,
    horas_juego DOUBLE UNIQUE,
    fecha_partida DATE,
    PRIMARY KEY (id_partida),
    KEY juegoid_idx (idjuego),
    KEY id_jugador_idx (jugador_id),
    CONSTRAINT fk_partida_jugador FOREIGN KEY (jugador_id)
        REFERENCES jugador(id_jugador)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    CONSTRAINT fk_partida_videojuego FOREIGN KEY (idjuego)
        REFERENCES videojuegos(id_juego)
        ON DELETE SET NULL
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Datos partidas
INSERT INTO partidas (jugador_id, idjuego, horas_juego, fecha_partida) VALUES
(1, 1, 10.5, '2024-12-01'),
(2, 2, 5.0, '2024-11-20'),
(3, 3, 22.7, '2024-10-15'),
(4, 4, 12.3, '2024-09-05'),
(5, 5, 8.8, '2024-08-30');
