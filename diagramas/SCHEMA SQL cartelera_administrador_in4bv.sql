drop database if exists cartelera_administrador_in4bv;
create database cartelera_administrador_in4bv;
use cartelera_administrador_in4bv;
DROP TABLE IF EXISTS roles;

CREATE TABLE roles (
  id_rol int NOT NULL AUTO_INCREMENT,
  nombre_rol varchar(45) DEFAULT NULL,
  PRIMARY KEY (id_rol)
);

insert into roles Values(1, "admin"), (2, "user"), (3, "tester"), (4, "cliente");

DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
  id_usuario varchar(45) NOT NULL,
  nombre varchar(45) DEFAULT NULL,
  apellido varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  contrasena_hash varchar(120) DEFAULT NULL,
  id_rol int DEFAULT NULL,
  PRIMARY KEY (id_usuario),
  KEY id_rol_idx (id_rol),
  CONSTRAINT id_rol FOREIGN KEY (id_rol) REFERENCES roles (id_rol)
);

DROP TABLE IF EXISTS movie;

CREATE TABLE movie(
  id_movie int NOT NULL AUTO_INCREMENT,
  title varchar(60) NOT NULL,
  url_poster varchar(240) DEFAULT NULL,
  PRIMARY KEY (id_movie)
) ;

DROP TABLE IF EXISTS functions;

CREATE TABLE functions(
id_functions varchar(60) NOT NULL,
screening_time TIME,
ticket_price decimal(10,2) NOT NULL,
seating_capacity int NOT NULL,
PRIMARY KEY (id_functions)
);

DROP TABLE IF EXISTS ticket;

CREATE TABLE ticket(
id_ticket varchar(60) NOT NULL,
ticket_price decimal(10,2) NOT NULL,
id_movie int NOT NULL AUTO_INCREMENT,
id_functions varchar(60) NOT NULL,
PRIMARY KEY (id_ticket),
KEY id_functions_idx(id_functions),
CONSTRAINT id_functions FOREIGN KEY (id_functions) REFERENCES functions(id_functions),
KEY id_movie_idx(id_movie),
CONSTRAINT id_movie FOREIGN KEY (id_movie) REFERENCES movie(id_movie)
);

DROP TABLE IF EXISTS facturas;

CREATE TABLE facturas (
    id_factura VARCHAR(60) NOT NULL,
    id_usuario VARCHAR(60) DEFAULT NULL,
    id_ticket varchar(60) NOT NULL,
    monto DECIMAL(10 , 2 ) DEFAULT NULL,
    fecha DATETIME DEFAULT NULL,
    PRIMARY KEY (id_factura),
    KEY id_usuario (id_usuario),
    CONSTRAINT facturas_ibfk_1 FOREIGN KEY (id_usuario)
	REFERENCES usuarios(id_usuario),
    KEY id_ticket (id_ticket),
    CONSTRAINT facturas_ibtfk_2 FOREIGN KEY (id_ticket)
    REFERENCES ticket (id_ticket)
);

