
DROP TABLE IF EXISTS articulos;
DROP TABLE IF EXISTS fabricantes;

CREATE TABLE fabricantes(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100) not null
);

CREATE TABLE articulos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100) not null,
    precio int not null,
    fabricante int not null,
    FOREIGN KEY (fabricante) REFERENCES fabricantes(id)
);

INSERT INTO fabricantes (nombre) VALUES
('Apple'),
('LG'),
('Sony');

INSERT INTO articulos (nombre, precio, fabricante) VALUES 
('Pórtatil', 1900,1),
('Monitor', 299, 2),
('Altavoz', 199, 3);
