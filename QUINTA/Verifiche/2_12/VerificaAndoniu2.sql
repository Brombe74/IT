
-- CREATEDATABASE PATENTI;
-- USE PATENTI


CREATE TABLE 19122CategoriaMezzo
(
  Codice int(10) NOT NULL,
  Descrizione varchar(25),
  Posti int(2),
  PRIMARY KEY (Codice)
);

CREATE TABLE 19122Autista
(
  Codice int(10) NOT NULL,
  Cognome varchar(10),
  Nome varchar(10),
  Patente varchar(15),
  PRIMARY KEY (Codice,Cognome),
  FOREIGN KEY (Codice) REFERENCES 19122CategoriaMezzo(Codice)
);


INSERT INTO 19122CategoriaMezzo (Codice,Descrizione,Posti) VALUES ('115', 'Automobile', '5');
INSERT INTO 19122CategoriaMezzo (Codice,Descrizione,Posti) VALUES ('265', 'Autobus', '25');
INSERT INTO 19122CategoriaMezzo (Codice,Descrizione,Posti) VALUES ('187', 'Automobile', '6');
INSERT INTO 19122CategoriaMezzo (Codice,Descrizione,Posti) VALUES ('125', 'Automobile', '5');

INSERT INTO 19122Autista (Codice,Cognome,Nome,Patente) VALUES ('115', 'Andoniu', 'Daniel', 'B');
INSERT INTO 19122Autista (Codice,Cognome,Nome,Patente) VALUES ('265', 'Rossi', 'Mario', 'DE' );
INSERT INTO 19122Autista (Codice,Cognome,Nome,Patente) VALUES ('187', 'Verdi', 'Luigi', 'C');
INSERT INTO 19122Autista (Codice,Cognome,Nome,Patente) VALUES ('125', 'Bianchi', 'Alessandro', 'B');

SELECT * FROM 19122Autista WHERE Patente='C';
SELECT * FROM 19122Autista WHERE Patente='D1' OR Patente='DE';
-- SELECT * FROM 19122Autista WHERE Patente='DE';
SELECT * FROM 19122CategoriaMezzo WHERE Descrizione='Autobus' AND Posti>'19';
