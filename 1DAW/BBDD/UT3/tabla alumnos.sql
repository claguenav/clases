CREATE DATABASE UT3_Ejemplos;
USE UT3_Ejemplos;

-- crear tabla
-- NOT NULL para que el campo sea OBLIGATORIO
-- COMA EN TODOS LOS CAMPOS 
-- El ultimo campo NO LLEVA coma
CREATE TABLE alumnos(
	NRE MEDIUMINT UNSIGNED NOT NULL PRIMARY KEY, -- ESTO LUEGO NO SE HACE ASI, LO HACEMOS ASI AL SER LA PRIMERA TABLA
    DNI VARCHAR(10),
    nombre VARCHAR(30) NOT NULL,
	apellido1 VARCHAR (30) NOT NULL,
    apellido2 VARCHAR (30), 
    NOTA DECIMAL(4,2)
);


CREATE TABLE asignaturas(
	codeAsig VARCHAR(5) NOT NULL PRIMARY KEY,
    denominacion VARCHAR(50) NOT NULL,
    numHoras TINYINT,
    curso TINYINT
);
-- No se puede definir pirmary key en mas de dos campos, se debe hacer con CONSTRAINT
CREATE TABLE matriculas (
	NRE_Alum MEDIUMINT UNSIGNED NOT NULL,
    id_Asig VARCHAR(5) NOT NULL,
    nota TINYINT,
    CONSTRAINT PK_matriculas PRIMARY KEY (NRE_Alum,id_Asig),
    CONSTRAINT FK_matri_alum FOREIGN KEY (NRE_Alum) REFERENCES alumnos(NRE), 
    CONSTRAINT FK_matri_asig FOREIGN KEY (id_Asig) REFERENCES asignaturas(codeAsig)
);

DROP TABLE matriculas;

INSERT INTO alumnos VALUES (1111,'1234a','Pepe','Martinez','Sanchez',6.5);
INSERT INTO alumnos VALUES (1112,'2233B','Antonio','García','Lopez',8.5);
INSERT INTO alumnos VALUES (7777,'2233B','Adrian','Sevilla','Lopez',6.7);


SELECT * 
FROM alumnos;

INSERT INTO asignaturas VALUES ('BBDD','Bases de Datos',5,1);
INSERT INTO asignaturas VALUES ('SI','Sistemas Informaticos',5,1);
INSERT INTO asignaturas VALUES ('ED','Entornos de Desarrollo',3,1);

INSERT INTO matriculas VALUES (1111,'BBDD',5);
INSERT INTO matriculas VALUES (7777,'BBDD',5);
INSERT INTO matriculas VALUES (1112,'BBDD',5);



SELECT * 
FROM matriculas;