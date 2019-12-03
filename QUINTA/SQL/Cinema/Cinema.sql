CREATE TABLE if not exists 19123Attori
(
  Codattore int (5) NOT NULL,
  Nome varchar (15),
  Annonascita int (4),
  Nazionalita varchar(20),
  PRIMARY KEY (Codattore)
);

CREATE TABLE if not exists 19123Film
(
  Codfilm int (5) NOT NULL,
  Titolo varchar (15),
  AnnoProduzione int (4),
  Regista varchar (20),
  Genere varchar (10),
  PRIMARY KEY (Codfilm)
);

CREATE TABLE if not exists 19123Recita
(
  Attore int (5) NOT NULL,
  Film int (5) NOT NULL,
  FOREIGN KEY (Attore) REFERENCES 19123Attori (CodAttore),
  FOREIGN KEY (Film) REFERENCES 19123Film (Codfilm),
  PRIMARY KEY (Attore,Film)
);

CREATE TABLE if not exists 19123Sale
(
  CodSala int (5) NOT NULL,
  Posti int (3),
  Nome varchar (10),
  Citta varchar (10),
  PRIMARY KEY (CodSala)
);

CREATE TABLE if not exists 19123Proiezioni
(
  CodProiezione int (5) NOT NULL,
  Film int (5) NOT NULL,
  Sala int (5) NOT NULL,
  Incasso float (10),
  DataProiezione TIMESTAMP NOT NULL,
  FOREIGN KEY (Film) REFERENCES 19123Film (Codfilm),
  FOREIGN KEY (Sala) REFERENCES 19123Sale (CodSala),
  PRIMARY KEY (CodProiezione)
);

INSERT INTO 19123Attori (CodAttore,Nome,Annonascita,Nazionalita) values
('123',NULL,NULL,NULL);
INSERT INTO 19123Film (Codfilm,Titolo,AnnoProduzione,Regista,Genere) values
('987',NULL,NULL,NULL,NULL);
INSERT INTO 19123Sale (CodSala,Posti,Nome,Citta) values
('111',NULL,NULL,NULL);
INSERT INTO 19123Proiezioni (CodProiezione,Film,Sala,Incasso,DataProiezione) values
('555','987','111',NULL);
