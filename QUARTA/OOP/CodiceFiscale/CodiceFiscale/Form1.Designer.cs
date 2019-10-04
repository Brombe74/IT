namespace CodiceFiscale
{
    partial class Form1
    {
        /// <summary>
        /// Variabile di progettazione necessaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Liberare le risorse in uso.
        /// </summary>
        /// <param name="disposing">ha valore true se le risorse gestite devono essere eliminate, false in caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Codice generato da Progettazione Windows Form

        /// <summary>
        /// Metodo necessario per il supporto della finestra di progettazione. Non modificare
        /// il contenuto del metodo con l'editor di codice.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.gbAnagrafici = new System.Windows.Forms.GroupBox();
            this.cbComune = new System.Windows.Forms.ComboBox();
            this.lblComune = new System.Windows.Forms.Label();
            this.lblDataNascita = new System.Windows.Forms.Label();
            this.dtpDataNascita = new System.Windows.Forms.DateTimePicker();
            this.gbSex = new System.Windows.Forms.GroupBox();
            this.rbSexF = new System.Windows.Forms.RadioButton();
            this.rbSexM = new System.Windows.Forms.RadioButton();
            this.tbxNome = new System.Windows.Forms.TextBox();
            this.lblNome = new System.Windows.Forms.Label();
            this.tbxCognome = new System.Windows.Forms.TextBox();
            this.lblCognome = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.lblCodice = new System.Windows.Forms.Label();
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.lblStatus = new System.Windows.Forms.ToolStripStatusLabel();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.toolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem2 = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem3 = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            this.toolStripContainer1 = new System.Windows.Forms.ToolStripContainer();
            this.btnCalcola = new System.Windows.Forms.Button();
            this.toolStripMenuItem5 = new System.Windows.Forms.ToolStripMenuItem();
            this.informazioniSuCodificeFiscaleToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.gbAnagrafici.SuspendLayout();
            this.gbSex.SuspendLayout();
            this.panel1.SuspendLayout();
            this.statusStrip1.SuspendLayout();
            this.menuStrip1.SuspendLayout();
            this.toolStripContainer1.BottomToolStripPanel.SuspendLayout();
            this.toolStripContainer1.ContentPanel.SuspendLayout();
            this.toolStripContainer1.TopToolStripPanel.SuspendLayout();
            this.toolStripContainer1.SuspendLayout();
            this.SuspendLayout();
            // 
            // gbAnagrafici
            // 
            this.gbAnagrafici.Controls.Add(this.cbComune);
            this.gbAnagrafici.Controls.Add(this.lblComune);
            this.gbAnagrafici.Controls.Add(this.lblDataNascita);
            this.gbAnagrafici.Controls.Add(this.dtpDataNascita);
            this.gbAnagrafici.Controls.Add(this.gbSex);
            this.gbAnagrafici.Controls.Add(this.tbxNome);
            this.gbAnagrafici.Controls.Add(this.lblNome);
            this.gbAnagrafici.Controls.Add(this.tbxCognome);
            this.gbAnagrafici.Controls.Add(this.lblCognome);
            this.gbAnagrafici.Location = new System.Drawing.Point(0, 30);
            this.gbAnagrafici.Name = "gbAnagrafici";
            this.gbAnagrafici.Size = new System.Drawing.Size(340, 178);
            this.gbAnagrafici.TabIndex = 0;
            this.gbAnagrafici.TabStop = false;
            this.gbAnagrafici.Text = " Dati Anagrafici";
            // 
            // cbComune
            // 
            this.cbComune.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbComune.FormattingEnabled = true;
            this.cbComune.Items.AddRange(new object[] {
            "Schio",
            "Valdagno",
            "Montecchio"});
            this.cbComune.Location = new System.Drawing.Point(9, 140);
            this.cbComune.Name = "cbComune";
            this.cbComune.Size = new System.Drawing.Size(319, 21);
            this.cbComune.TabIndex = 8;
            // 
            // lblComune
            // 
            this.lblComune.AutoSize = true;
            this.lblComune.Location = new System.Drawing.Point(6, 124);
            this.lblComune.Name = "lblComune";
            this.lblComune.Size = new System.Drawing.Size(94, 13);
            this.lblComune.TabIndex = 7;
            this.lblComune.Text = "C&omune di nascita";
            // 
            // lblDataNascita
            // 
            this.lblDataNascita.AutoSize = true;
            this.lblDataNascita.Location = new System.Drawing.Point(185, 74);
            this.lblDataNascita.Name = "lblDataNascita";
            this.lblDataNascita.Size = new System.Drawing.Size(69, 13);
            this.lblDataNascita.TabIndex = 6;
            this.lblDataNascita.Text = "&Data Nascita";
            // 
            // dtpDataNascita
            // 
            this.dtpDataNascita.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.dtpDataNascita.Location = new System.Drawing.Point(188, 89);
            this.dtpDataNascita.Name = "dtpDataNascita";
            this.dtpDataNascita.Size = new System.Drawing.Size(140, 20);
            this.dtpDataNascita.TabIndex = 5;
            // 
            // gbSex
            // 
            this.gbSex.Controls.Add(this.rbSexF);
            this.gbSex.Controls.Add(this.rbSexM);
            this.gbSex.Location = new System.Drawing.Point(188, 19);
            this.gbSex.Name = "gbSex";
            this.gbSex.Size = new System.Drawing.Size(140, 47);
            this.gbSex.TabIndex = 4;
            this.gbSex.TabStop = false;
            this.gbSex.Text = " &Sesso ";
            // 
            // rbSexF
            // 
            this.rbSexF.AutoSize = true;
            this.rbSexF.Location = new System.Drawing.Point(65, 19);
            this.rbSexF.Name = "rbSexF";
            this.rbSexF.Size = new System.Drawing.Size(31, 17);
            this.rbSexF.TabIndex = 1;
            this.rbSexF.Text = "F";
            this.rbSexF.UseVisualStyleBackColor = true;
            // 
            // rbSexM
            // 
            this.rbSexM.AutoSize = true;
            this.rbSexM.Checked = true;
            this.rbSexM.Location = new System.Drawing.Point(25, 19);
            this.rbSexM.Name = "rbSexM";
            this.rbSexM.Size = new System.Drawing.Size(34, 17);
            this.rbSexM.TabIndex = 0;
            this.rbSexM.TabStop = true;
            this.rbSexM.Text = "M";
            this.rbSexM.UseVisualStyleBackColor = true;
            // 
            // tbxNome
            // 
            this.tbxNome.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.tbxNome.Location = new System.Drawing.Point(9, 90);
            this.tbxNome.Name = "tbxNome";
            this.tbxNome.Size = new System.Drawing.Size(173, 20);
            this.tbxNome.TabIndex = 3;
            // 
            // lblNome
            // 
            this.lblNome.AutoSize = true;
            this.lblNome.Location = new System.Drawing.Point(6, 74);
            this.lblNome.Name = "lblNome";
            this.lblNome.Size = new System.Drawing.Size(35, 13);
            this.lblNome.TabIndex = 2;
            this.lblNome.Text = "&Nome";
            // 
            // tbxCognome
            // 
            this.tbxCognome.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.tbxCognome.Location = new System.Drawing.Point(9, 42);
            this.tbxCognome.Name = "tbxCognome";
            this.tbxCognome.Size = new System.Drawing.Size(173, 20);
            this.tbxCognome.TabIndex = 1;
            // 
            // lblCognome
            // 
            this.lblCognome.AutoSize = true;
            this.lblCognome.Location = new System.Drawing.Point(6, 26);
            this.lblCognome.Name = "lblCognome";
            this.lblCognome.Size = new System.Drawing.Size(52, 13);
            this.lblCognome.TabIndex = 0;
            this.lblCognome.Text = "&Cognome";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.lblCodice);
            this.panel1.Controls.Add(this.btnCalcola);
            this.panel1.Location = new System.Drawing.Point(0, 214);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(340, 70);
            this.panel1.TabIndex = 1;
            // 
            // lblCodice
            // 
            this.lblCodice.BackColor = System.Drawing.Color.PeachPuff;
            this.lblCodice.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCodice.Location = new System.Drawing.Point(144, 15);
            this.lblCodice.Name = "lblCodice";
            this.lblCodice.Size = new System.Drawing.Size(184, 44);
            this.lblCodice.TabIndex = 1;
            this.lblCodice.Text = "- -";
            this.lblCodice.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // statusStrip1
            // 
            this.statusStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.statusStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.lblStatus});
            this.statusStrip1.Location = new System.Drawing.Point(0, 0);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(344, 22);
            this.statusStrip1.TabIndex = 2;
            this.statusStrip1.Text = "statusStrip1";
            // 
            // lblStatus
            // 
            this.lblStatus.Name = "lblStatus";
            this.lblStatus.Size = new System.Drawing.Size(109, 17);
            this.lblStatus.Text = "toolStripStatusLabel1";
            // 
            // menuStrip1
            // 
            this.menuStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripMenuItem1,
            this.toolStripMenuItem5});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(344, 24);
            this.menuStrip1.TabIndex = 10;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // toolStripMenuItem1
            // 
            this.toolStripMenuItem1.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripMenuItem2,
            this.toolStripSeparator1,
            this.toolStripMenuItem3});
            this.toolStripMenuItem1.Name = "toolStripMenuItem1";
            this.toolStripMenuItem1.Size = new System.Drawing.Size(35, 20);
            this.toolStripMenuItem1.Text = "File";
            // 
            // toolStripMenuItem2
            // 
            this.toolStripMenuItem2.Name = "toolStripMenuItem2";
            this.toolStripMenuItem2.Size = new System.Drawing.Size(161, 22);
            this.toolStripMenuItem2.Text = "Carica file codici";
            this.toolStripMenuItem2.Click += new System.EventHandler(this.toolStripMenuItem2_Click);
            // 
            // toolStripMenuItem3
            // 
            this.toolStripMenuItem3.Name = "toolStripMenuItem3";
            this.toolStripMenuItem3.Size = new System.Drawing.Size(161, 22);
            this.toolStripMenuItem3.Text = "Chiudi";
            this.toolStripMenuItem3.Click += new System.EventHandler(this.toolStripMenuItem3_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(158, 6);
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.Filter = "File testo CSV|*.csv|Tutti i file|*.*|File testo|*.txt";
            // 
            // toolStripContainer1
            // 
            // 
            // toolStripContainer1.BottomToolStripPanel
            // 
            this.toolStripContainer1.BottomToolStripPanel.Controls.Add(this.statusStrip1);
            // 
            // toolStripContainer1.ContentPanel
            // 
            this.toolStripContainer1.ContentPanel.AutoScroll = true;
            this.toolStripContainer1.ContentPanel.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.toolStripContainer1.ContentPanel.Controls.Add(this.panel1);
            this.toolStripContainer1.ContentPanel.Controls.Add(this.gbAnagrafici);
            this.toolStripContainer1.ContentPanel.Size = new System.Drawing.Size(344, 288);
            this.toolStripContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.toolStripContainer1.LeftToolStripPanelVisible = false;
            this.toolStripContainer1.Location = new System.Drawing.Point(0, 0);
            this.toolStripContainer1.Name = "toolStripContainer1";
            this.toolStripContainer1.RightToolStripPanelVisible = false;
            this.toolStripContainer1.Size = new System.Drawing.Size(344, 334);
            this.toolStripContainer1.TabIndex = 11;
            this.toolStripContainer1.Text = "toolStripContainer1";
            // 
            // toolStripContainer1.TopToolStripPanel
            // 
            this.toolStripContainer1.TopToolStripPanel.Controls.Add(this.menuStrip1);
            // 
            // btnCalcola
            // 
            this.btnCalcola.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcola.Image = global::CodiceFiscale.Properties.Resources.codfisc;
            this.btnCalcola.ImageAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.btnCalcola.Location = new System.Drawing.Point(12, 15);
            this.btnCalcola.Name = "btnCalcola";
            this.btnCalcola.Padding = new System.Windows.Forms.Padding(5);
            this.btnCalcola.Size = new System.Drawing.Size(126, 44);
            this.btnCalcola.TabIndex = 0;
            this.btnCalcola.Text = "Calcola";
            this.btnCalcola.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnCalcola.UseVisualStyleBackColor = true;
            this.btnCalcola.Click += new System.EventHandler(this.btnCalcola_Click);
            // 
            // toolStripMenuItem5
            // 
            this.toolStripMenuItem5.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.informazioniSuCodificeFiscaleToolStripMenuItem});
            this.toolStripMenuItem5.Name = "toolStripMenuItem5";
            this.toolStripMenuItem5.Size = new System.Drawing.Size(24, 20);
            this.toolStripMenuItem5.Text = "?";
            // 
            // informazioniSuCodificeFiscaleToolStripMenuItem
            // 
            this.informazioniSuCodificeFiscaleToolStripMenuItem.Name = "informazioniSuCodificeFiscaleToolStripMenuItem";
            this.informazioniSuCodificeFiscaleToolStripMenuItem.Size = new System.Drawing.Size(234, 22);
            this.informazioniSuCodificeFiscaleToolStripMenuItem.Text = "Informazioni su Codifice Fiscale";
            this.informazioniSuCodificeFiscaleToolStripMenuItem.Click += new System.EventHandler(this.informazioniSuCodificeFiscaleToolStripMenuItem_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(344, 334);
            this.Controls.Add(this.toolStripContainer1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Form1";
            this.Text = "Determinazione del codice fiscale";
            this.gbAnagrafici.ResumeLayout(false);
            this.gbAnagrafici.PerformLayout();
            this.gbSex.ResumeLayout(false);
            this.gbSex.PerformLayout();
            this.panel1.ResumeLayout(false);
            this.statusStrip1.ResumeLayout(false);
            this.statusStrip1.PerformLayout();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.toolStripContainer1.BottomToolStripPanel.ResumeLayout(false);
            this.toolStripContainer1.BottomToolStripPanel.PerformLayout();
            this.toolStripContainer1.ContentPanel.ResumeLayout(false);
            this.toolStripContainer1.TopToolStripPanel.ResumeLayout(false);
            this.toolStripContainer1.TopToolStripPanel.PerformLayout();
            this.toolStripContainer1.ResumeLayout(false);
            this.toolStripContainer1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gbAnagrafici;
        private System.Windows.Forms.TextBox tbxCognome;
        private System.Windows.Forms.Label lblCognome;
        private System.Windows.Forms.TextBox tbxNome;
        private System.Windows.Forms.Label lblNome;
        private System.Windows.Forms.GroupBox gbSex;
        private System.Windows.Forms.RadioButton rbSexF;
        private System.Windows.Forms.RadioButton rbSexM;
        private System.Windows.Forms.Label lblDataNascita;
        private System.Windows.Forms.DateTimePicker dtpDataNascita;
        private System.Windows.Forms.ComboBox cbComune;
        private System.Windows.Forms.Label lblComune;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.StatusStrip statusStrip1;
        private System.Windows.Forms.Label lblCodice;
        private System.Windows.Forms.Button btnCalcola;
        private System.Windows.Forms.ToolStripStatusLabel lblStatus;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem2;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem3;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
        private System.Windows.Forms.ToolStripContainer toolStripContainer1;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem5;
        private System.Windows.Forms.ToolStripMenuItem informazioniSuCodificeFiscaleToolStripMenuItem;
    }
}

