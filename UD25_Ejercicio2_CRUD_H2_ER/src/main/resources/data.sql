
DROP TABLE IF EXISTS empleados;
DROP table IF EXISTS departamentos;

CREATE TABLE departamentos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100) not null,
    presupuesto int not null
);

CREATE TABLE empleados(
	id varchar(8) NOT NULL PRIMARY KEY,
    nombre nvarchar(100) not null,
    apellidos nvarchar(255) not null,
    departamento int not null,
CONSTRAINT departamentos_fk FOREIGN KEY (departamento) REFERENCES departamentos(id)
);


insert into departamentos (nombre,presupuesto)values('Departamento 1',1000);
insert into departamentos (nombre,presupuesto)values('Departamento 2',1100);
insert into departamentos (nombre,presupuesto)values('Departamento 3',1200);
insert into departamentos (nombre,presupuesto)values('Departamento 4',1300);
insert into departamentos (nombre,presupuesto)values('Departamento 5',1400);

insert into empleados (id, nombre, apellidos, departamento) values ('98765432','Cristina','Cano',1);
insert into empleados (id, nombre, apellidos, departamento) values ('98765433','Victor','Rosario',2);
insert into empleados (id, nombre, apellidos, departamento) values ('98765434','Asier','Moreno',3);
insert into empleados (id, nombre, apellidos, departamento) values ('98765435','Estefania','Colombo',4);
insert into empleados (id, nombre, apellidos, departamento) values ('98765436','Lourdes','Navarro',5);