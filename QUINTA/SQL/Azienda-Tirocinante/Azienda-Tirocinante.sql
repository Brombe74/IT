-- CREATE DATABASE AziendaTirocinante;
-- USE AziendaTirocinante;



CREATE TABLE 191126Azienda
(
  id int(10) NOT NULL,
  Nome varchar(15),
  Luogo varchar(20),
  Settore varchar(20),
  Tipologia varchar(10),
  PRIMARY KEY(id)
);

CREATE TABLE 191126Tutor
(
  id int(10) NOT NULL,
  Nome varchar(10),
  Cognome varchar(10),
  Materia varchar(10),
  PRIMARY KEY(id)
);

CREATE TABLE 191126Tirocinante
(
  Matricola int(10) NOT NULL,
  Nome varchar(10),
  Cognome varchar(10),
  Classe char(3),
  Idazienda int(10) NOT NULL,
  Idtutor int(10) NOT NULL,
  PRIMARY KEY(Matricola),
  FOREIGN KEY (Idazienda) REFERENCES 191126Azienda(id),
  FOREIGN KEY (Idtutor) REFERENCES 191126Tutor(id)
);
