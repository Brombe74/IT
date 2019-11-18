
-- create database 191118_Calcio;


create table 191118_Squadra
  (
    Nome varchar(15),
    citta varchar(10),
    sede varchar(15),
    colori varchar(10),
    primary key(Nome)
  );

create table 191118_Calciatore
(
  Id int(5) auto_increment,
  Nome varchar(10),
  Cognome varchar(10),
  ruolo varchar(10),
  nazionalita varchar(10),
  primary key(Id)
);

create table 191118_Ingaggio
(
  Squadra varchar(10) NOT NULL,
  Calciatore int(5) NOT NULL,
  Compenso int(5),
  Foreign key(Squadra) references 191118_Squadra(Nome),
  Foreign key(Calciatore) references 191118_Calciatore(Id),
  primary key(Squadra,Calciatore)
);

create table 191118_Arbitro
(
  Id int(5),
  Nome varchar(10),
  Cognome varchar(10),
  primary key(Id)
);

create table 191118_Incontro
(
  data datetime,
  SquadraInCasa varchar(10),
  SquadraOspite varchar(10),
  GolSqcasa int(3),
  GolSqFuori int(3),
  Arbitro int(5),
  Foreign key(SquadraInCasa) references 191118_Squadra(Nome),
  Foreign key(SquadraOspite) references 191118_Squadra(Nome),
  Foreign key(Arbitro) references 191118_Arbitro(Id),
  primary key(data)
);

insert into 191118_Squadra (Nome, citta, sede, colori) values ('FC Paviola', 'Paviola' , 'Paviola', 'Nero Grigio');
insert into 191118_Calciatore (Id,Nome,Cognome,ruolo,nazionalita) values (1,'Lorem', 'Ipsum', 'Hacker', 'Italiana');
insert into 191118_Ingaggio (Squadra,Calciatore,Compenso) values ('FC Paviola', 1, 2500);
insert into 191118_Arbitro (Id,Nome,Cognome) values (25,'Nicola','Angelo');
