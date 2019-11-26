
-- CREATE DATABASE Veicoli;
-- USE Veicoli;

CREATE TABLE 191125Veicolo
(
  targa CHAR(7) NOT NULL,
  descrizione VARCHAR(64),
  PRIMARY KEY (targa)
);


CREATE TABLE 191125Posizione
 (
  veicolo CHAR(7) NOT NULL,
  data_ora TIMESTAMP NOT NULL,
  latitudine DOUBLE,
  longitudine DOUBLE,
  PRIMARY KEY (veicolo, data_ora),
  FOREIGN KEY (veicolo) REFERENCES 191125Veicolo(targa) ON DELETE CASCADE
);
