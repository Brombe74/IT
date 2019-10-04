using System;
using Gtk;
using System.Collections.Generic;
using System.ComponentModel;
using System.Text;
using System.Collections;
using System.IO;


public partial class MainWindow: Gtk.Window
{	
	ArrayList Dati = new ArrayList();
	const int Max = 20;
	const string Percorso = "rubrica.dat";
	string nomefile;
	string temp;

	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	//salva i dati in memoria
	protected void OnBtn1Clicked (object sender, EventArgs e)
	{
		//salvataggio dei dati in memoria
		temp = txt_cog.Text + "-" + txt_nome.Text + "-" + txt_num.Text + "-" + txt_clas.Text + "-" + txt_Ind.Text;
		Dati.Add(temp);


		//pulisce l'input
		txt_nome.Text = "";
		txt_cog.Text = "";
		txt_num.Text = "";
		txt_clas.Text = "";
		txt_Ind.Text = "";


		temp = null;
	}

	//salva i dati nel file
	protected void OnBtn2Clicked (object sender, EventArgs e)
	{
		//conversione dell'arraylist in stringa  
		string[] nomi = (string[])Dati.ToArray(typeof(string));
		//salvataggio del nome del file
		nomefile = txt_file.Text;
		nomefile=nomefile+".txt";

		File.WriteAllLines (nomefile, nomi);
	}

	//stampa i dati
	protected void OnBtn3Clicked (object sender, EventArgs e)
	{
		string readText = File.ReadAllText(nomefile);
		stamp.Buffer.Text = readText;
	}
}

