/*
 * Libreria per il calcolo del codice fiscale
 */ 
using System;

class LibCodiceFiscale
{
	/* 
	 * pesi da attribuire ai caratteri del codice fiscale
	 * di posto pari e di posto dispari, per il calcolo 
	 * del sedicesimo carattere di controllo
	 */
	static int[] pari =
		{0,1,2,3,4,5,6,7,8,9,0,0,0,0,0,0,0,
		0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
	static int[] dispari =
		{1,0,5,7,9,13,15,17,19,21,0,0,0,0,0,0,0,
		1,0,5,7,9,13,15,17,19,21,2,4,18,20,11,3,6,8,12,14,16,10,22,25,24,23};
	
    /*
     * Ricava tutte le vocali e le consonanti presenti
     * nella stringa passata come parametro.
     * Utilizzata nei metodi per ricavare i caratteri indicativi
     * di cognome e nome
     */
    static void ricavaVocaliConsonanti(string s, out string vocali, out string consonanti)
    {
        int i;
    	
    	s = s.ToUpper();  // porta in maiuscolo la stringa

    	// rimuove gli spazi nella stringa (cognomi/nomi composti)    	
    	i = 0;
    	while (i < s.Length) {
    		if (s[i] == ' ')
    			s = s.Remove(i, 1);
    		else
    			i++;    		
    	}

    	// ricava tutte le vocali e le consonanti
    	vocali = "";
    	consonanti = "";
    	for(i = 0; i < s.Length; i++) {
    		if ("AUIEO".IndexOf(s[i]) >= 0)
    			vocali = vocali + s[i];
    		else
    			consonanti = consonanti + s[i];    		
    	}
    }
    
    /*
     * Ricava i caratteri indicativi del cognome
     */
    static string ricavaCarCognome(string cognome)
    {
    	string v, c, car;
    	ricavaVocaliConsonanti(cognome, out v, out c);
    	
    	car = "XXX";
    	if (c.Length >= 3)
    		car = c.Substring(0,2)+c[2];    	
    	else 
    		if (c.Length == 2 && v.Length > 0)
    			car = c.Substring(0,2)+v[0];
    		else
    			if (c.Length == 1 && v.Length == 2)
    				car = c[0]+v.Substring(0,2);
    			else
    				if (c.Length == 1 && v.Length == 1)
    					car = c[0]+v[0]+"X";
    				else 
    					if (v.Length == 2)
    						car = v.Substring(0,2)+"X";
    	return car;
    }
    
    /*
     * Ricava i caratteri indicativi del nome
     */
    static string ricavaCarNome(string nome)
    {
    	string v, c, car;
    	ricavaVocaliConsonanti(nome, out v, out c);
    	
    	car = "XXX";
    	if (c.Length >= 4)
    		car = c[0]+c.Substring(2,2);
    	else 
    		if (c.Length == 3)
    		car = c.Substring(0,3);
    		else
    			if (c.Length == 2 && v.Length > 0)
    				car = c.Substring(0,2)+v[0];
    			else
    				if (c.Length == 1 && v.Length == 2)
    					car = c[0]+v.Substring(0,2);
    				else 
    					if (c.Length == 1 && v.Length == 1)
    						car = c[0]+v[0]+"X";
    					else
	    					if (v.Length == 2)
	    						car = v.Substring(0,2)+"X";
    	return car;
    }
    

    /*
     * Ricava i caratteri che rappresentano la data di nascita
     * data è nel formato gg/mm/aaaa
     * sessoM è true se maschio, false se femmina
     */
    static string ricavaCarData(string data, bool sessoM)
    {
    	const string MESI = "_ABCDEHLMPRST";
    	int giorno, mese, anno, pos;
    	string car;

    	pos = data.IndexOf('/');
    	giorno = Convert.ToInt32(data.Substring(0,pos));
    	data = data.Remove(0, pos+1);
    	pos = data.IndexOf('/');    	
    	mese = Convert.ToInt32(data.Substring(0,pos));    	    	
    	data = data.Remove(0, pos+1);
    	anno = Convert.ToInt32(data);
    	if (anno >= 2000)
    		anno = anno-2000;
    	else
    		if (anno >= 1900)
    			anno = anno-1900;
    	
    	if (sessoM == false) // nel caso di femmina, il giorno va aumentato di 40
    		giorno = giorno + 40;
    	
    	car = anno.ToString().PadLeft(2,'0') + MESI[mese] +
    		giorno.ToString().PadLeft(2,'0');
    	return car;
    }
       
    /*
     * Ricava il sedicesimo carattere del codice fiscale 
     * che è un carattere di controllo.
     */
    public static char ricavaCarControllo(string codice)
    {
    	int i, controllo, ascii;
    	
    	controllo = 0;
    	for (i=0; i<codice.Length; i++) {
    		ascii = Convert.ToInt32(codice[i]) - Convert.ToInt32('0');
    		if (i % 2 == 0)  // posizione dispari
    			controllo = controllo + dispari[ascii];
    		else             // posizione pari
    			controllo = controllo + pari[ascii];
    	}    	
    	controllo = controllo % 26;
    	
    	return Convert.ToChar(controllo + Convert.ToInt32('A'));
    }
    


    /*
     * Ricava il codice fiscale di una persona
     */
    public static string ricavaCodice(string cognome, string nome,
                                      bool sessoM, string data,
                                      string comuneNascita)
    {
    	string codice;
    	
    	codice = ricavaCarCognome(cognome) + ricavaCarNome(nome) +
    	        ricavaCarData(data, sessoM) + comuneNascita;
    	
    	return codice+ricavaCarControllo(codice);    	
    }
}
