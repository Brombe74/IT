

create database STUDENTI;
use STUDENTI;

create table studente 
(
Matricola int (10)NOT NULL,
Nome char(10) not null,
Cognome char(10) not null,
Anno int(4) not null,
primary key(Matricola),
)engine=innodb;

create table corso
(
id int(10) not null,
Materia char(15) not null,
Livello int(1),
Docente char(30),
primary key(id),
)engine=innodb;;

create table Docente
(
id int(10) not null,
Nome char(10),
Cognome char(10),
primary key(id),
)engine=innodb;

create table Scuola
(
id int(10) not null,
Nome char(20) not null,
N_studenti int(4)not null,
N_docenti int(2) not null,
N_personale int(2) not null,
primary key(id),
)engine=innodb;
