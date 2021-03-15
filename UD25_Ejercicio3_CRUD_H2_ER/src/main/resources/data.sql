
DROP TABLE IF EXISTS cajas;
DROP TABLE IF EXISTS almacenes;

CREATE TABLE almacenes(
    id INT AUTO_INCREMENT,
    lugar VARCHAR(100) DEFAULT NULL,
    capacidad INT DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE cajas(
    id VARCHAR (5) DEFAULT NULL,
    contenido VARCHAR(100) DEFAULT NULL,
    valor INT DEFAULT NULL,
    almacen INT DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT FK_almacenes FOREIGN KEY (almacen) REFERENCES almacenes(id)
);

INSERT INTO almacenes (lugar,capacidad)VALUES('A',500);
INSERT INTO almacenes (lugar,capacidad)VALUES('B',1000);
INSERT INTO almacenes (lugar,capacidad)VALUES('C',1500);
INSERT INTO almacenes (lugar,capacidad)VALUES('D',2000);
INSERT INTO almacenes (lugar,capacidad)VALUES('E',2500);

INSERT INTO cajas (id, contenido, valor, almacen)VALUES('12','Tomates',100,1);
INSERT INTO cajas (id, contenido, valor, almacen)VALUES('22','Pimientos',150,2);
INSERT INTO cajas (id, contenido, valor, almacen)VALUES('32','Cebollas',200,3);
INSERT INTO cajas (id, contenido, valor, almacen)VALUES('42','Patatas',250,3);
INSERT INTO cajas (id, contenido, valor, almacen)VALUES('52','Brocoli',300,2);


