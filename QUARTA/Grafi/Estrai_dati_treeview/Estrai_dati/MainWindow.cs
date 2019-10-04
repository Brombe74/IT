/*/
	ANDONIU DANIEL 4AI
	Problemi conosciuti con questa versione:
	al momento della stampa da file il programma va in crash

*/

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
	Gtk.ListStore listatree = new Gtk.ListStore (typeof(string), typeof(string), typeof(string), typeof(string), typeof(string));

	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();


		tree_view.Model = listatree;

		//creazione del tree View
		Gtk.CellRendererText cellcog=new Gtk.CellRendererText ();
		Gtk.CellRendererText cellnome=new Gtk.CellRendererText ();
		Gtk.CellRendererText cellnumero=new Gtk.CellRendererText ();
		Gtk.CellRendererText cellclasse=new Gtk.CellRendererText ();
		Gtk.CellRendererText cellindirizzo=new Gtk.CellRendererText ();

		Gtk.TreeViewColumn Cognomecolumn = new Gtk.TreeViewColumn ();
		Cognomecolumn.Title = "Cognome";
		Cognomecolumn.PackStart(cellcog,true);

		Gtk.TreeViewColumn Nomecolumn = new Gtk.TreeViewColumn ();
		Nomecolumn.Title = "Nome";
		Nomecolumn.PackStart (cellnome, true);

		Gtk.TreeViewColumn Numerocolumn = new Gtk.TreeViewColumn ();
		Numerocolumn.Title = "Numero";
		Numerocolumn.PackStart (cellnumero, true);

		Gtk.TreeViewColumn Classecolumn = new Gtk.TreeViewColumn ();
		Classecolumn.Title = "Classe";
		Classecolumn.PackStart (cellclasse, true);

		Gtk.TreeViewColumn Indirizzocolumn = new Gtk.TreeViewColumn ();
		Indirizzocolumn.Title = "Indirizzo";
		Indirizzocolumn.PackStart (cellindirizzo, true);

		tree_view.AppendColumn (Cognomecolumn);
		tree_view.AppendColumn (Nomecolumn);
		tree_view.AppendColumn (Numerocolumn);
		tree_view.AppendColumn (Classecolumn);
		tree_view.AppendColumn (Indirizzocolumn);

		Cognomecolumn.AddAttribute (cellcog, "text", 0);
		Nomecolumn.AddAttribute (cellnome, "text", 1);
		Numerocolumn.AddAttribute (cellnumero, "text", 2);
		Classecolumn.AddAttribute (cellclasse, "text", 3);
		Indirizzocolumn.AddAttribute (cellindirizzo, "text", 4);


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
		listatree.AppendValues (txt_cog.Text, txt_nome.Text, txt_num.Text, txt_clas.Text, txt_Ind.Text);

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

		string[] lines = File.ReadAllLines (nomefile);
		String temp;

		listatree = null;

		foreach (string line in lines) 
		{
			int pos=0;

			for (int i=0; i<line.Length; i++)
			{
				if (line [i] == '-'|| i==line.Length-1) 
				{
					temp = line.Substring (pos,i-1);
					if (i < line.Length - 1) 
					{
						pos = i - 1;
					}
					else 
					{
						pos = i;
					}

					listatree.AppendValues (temp);
				}
			}
		}

		/*System.Collections.Generic.IEnumerable<String> readtext = File.ReadLines (nomefile);
		listatree.AppendValues(readtext);
		*/
	}
}

