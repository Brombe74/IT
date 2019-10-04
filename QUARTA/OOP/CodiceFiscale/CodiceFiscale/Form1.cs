using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Collections;
using System.IO;

namespace CodiceFiscale
{
    public partial class Form1 : Form
    {
        ArrayList listaCodiciCatasto;
        AboutBoxForm AboutBox = new AboutBoxForm();


        bool CaricaCodici(string nomeFile)
        {
            listaCodiciCatasto = new ArrayList();
            cbComune.Items.Clear();

            if (!File.Exists(nomeFile)) // verifico se il file esiste
            {
                MessageBox.Show("Il file " + nomeFile + " non esiste!",
                    "File non trovato", MessageBoxButtons.OK,
                    MessageBoxIcon.Stop);
                lblStatus.Text = "File codici non trovato";
                return false;
            }

            StreamReader sr = new StreamReader(nomeFile);
            string riga;
            string[] campi;
            while ((riga = sr.ReadLine()) != null)
            {
                campi = riga.Split(';');
                cbComune.Items.Add(campi[0] + " (" + campi[1] + ")");
                listaCodiciCatasto.Add(campi[2]);
            }
            sr.Close();

            cbComune.SelectedIndex = cbComune.FindString("VALDAGNO");
            lblStatus.Text = "File codici caricato con successo";
            this.Refresh();
            return true;
        }


        
        public Form1()
        {
            InitializeComponent();

            // qui mettiamo il codice da eseguire all'avvio
            CaricaCodici("codicicatasto.csv");

        }

        private void btnCalcola_Click(object sender, EventArgs e)
        {
            string codice, codiceComune;

            codiceComune = (string)listaCodiciCatasto[cbComune.SelectedIndex];

            codice = LibCodiceFiscale.ricavaCodice(
                tbxCognome.Text,
                tbxNome.Text, 
                rbSexM.Checked, 
                dtpDataNascita.Text,
                codiceComune);

            lblCodice.Text = codice;
        }

        private void toolStripMenuItem2_Click(object sender, EventArgs e)
        {
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
                CaricaCodici(openFileDialog1.FileName);

        }

        private void toolStripMenuItem3_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void informazioniSuCodificeFiscaleToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AboutBox.ShowDialog();
        }
    }
}