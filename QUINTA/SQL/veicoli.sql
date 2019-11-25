
-- CREATE DATABASE Veicoli;
-- USE Veicoli;

CREATE TABLE 191125Veicolo
(
  targa CHAR(7) NOT NULL,
  descrizione VARCHAR(64),
  PRIMARY KEY (targa)
);

INSERT INTO 191125Veicolo (targa, descrizione) VALUES ('AB123XY', 'Cisterna per trasporto carburante natanti');
INSERT INTO 191125Veicolo (targa, descrizione) VALUES ('XY123AB', 'Gru per rimessaggio imbarcazioni');
INSERT INTO 191125Veicolo (targa,descrizione) VALUES ('QW345TY', 'Automobile a 4 posti');
INSERT INTO 191125Veicolo (targa,descrizione) VALUES ('ZC270ZM', 'Motorino 125CC');

CREATE TABLE 191125Posizione
 (
  veicolo CHAR(7) NOT NULL,
  data_ora TIMESTAMP NOT NULL,
  latitudine DOUBLE,
  longitudine DOUBLE,
  PRIMARY KEY (veicolo, data_ora),
  FOREIGN KEY (veicolo) REFERENCES 191125Veicolo(targa) ON DELETE CASCADE
);

INSERT INTO 191125Posizione (veicolo,data_ora,latitudine,longitudine) VALUES ('AB123XY','2019-11-25 12:55:05','250.12','260');
INSERT INTO 191125Posizione (veicolo,data_ora,latitudine,longitudine) VALUES ('XY123AB', '2019-11-24 22:35:24', '250.14', '158');
INSERT INTO 191125Posizione (veicolo,data_ora,latitudine,longitudine) VALUES ('QW345TY', '2019-11-24 06:25:14', '250.13', '128.9');
INSERT INTO 191125Posizione (veicolo,data_ora,latitudine,longitudine) VALUES ('ZC270ZM', '2019-11-25 10:11:18', '250.13', '120.9');

DELETE FROM 191125Posizione WHERE veicolo='XY123AB';

UPDATE 191125Veicolo
SET descrizione='Cisterna per trasporto latte'
WHERE targa='AB123XY';

UPDATE 191125Veicolo
SET descrizione='Automobile a 5 posti'
WHERE targa='QW345TY';

UPDATE 191125Veicolo
SET descrizione='Motorino 150CC'
WHERE targa='ZC270ZM';

INSERT INTO 191125Posizione (veicolo,data_ora,latitudine,longitudine) VALUES ('QW345TY', '2019-11-26 6:26:28', '250.14', '128.8');

SELECT * FROM 191125Posizione  WHERE veicolo='QW345TY';
