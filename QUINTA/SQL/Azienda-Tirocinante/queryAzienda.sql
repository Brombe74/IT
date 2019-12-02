-- Inserimento Aziende

INSERT INTO 191126Azienda ('id', 'Nome', 'Luogo', 'Settore', 'Tipologia') VALUES
(1, 'abc', 'Mi', 'informatica', 'z'),
(2, 'abc', 'Mi', 'informatica', 'z'),
(3, 'hjk', 'Mi', 'informatica', 'b'),
(4, 'bcz', 'Mi', 'informatica', 'z'),
(5, 'ppq', 'Mi', 'informatica', 'a'),
(6, 'frt', 'Mi', 'informatica', 'z'),

-- Inserimento Tutor
INSERT INTO 191126Tutor ('id', 'Nome', 'Cognome', 'Materia') VALUES
(100, 'ugo', 'rossi', 'inglese'),
(110, 'diva', 'bruni', 'reti'),
(120, 'stella', 'brunoni','reti'),
(200, 'anna', 'derossi', 'inglese'),
(210, 'ugo', 'pesti', 'reti'),

--Inserimento Tirocinante
INSERT INTO 191126Tirocinante ('Matricola', 'Nome', 'Cognome', 'Classe', 'Idazienda', 'Idtutor') VALUES
(1000, 'anna', 'rosa', '1d', 1, 100),
(2200, 'roberto', 'franco', '2a', 1, 200),
(3000, 'giovanni', 'rosalba', '1d', 1, 200),
(3300, 'dario', 'grumetti', '1a', 10, 200),
(4000, 'ugo', 'rosa', '1d', 2, 220),

SELECT 191126Tirocinante.Nome, 191126Tirocinante.Cognome FROM 191126Tirocinante, 191126Azienda WHERE 191126Tirocinante
