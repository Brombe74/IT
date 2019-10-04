
public class NewJFrame extends javax.swing.JFrame {

    String Valori;
    int []Vettore;
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_val_iniz = new javax.swing.JLabel();
        btn_val_iniz = new javax.swing.JButton();
        btn_selection = new javax.swing.JButton();
        btn_Bubble = new javax.swing.JButton();
        btn_insertion = new javax.swing.JButton();
        lbl_valord = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbxValoriOrdinati = new javax.swing.JTextArea();
        txt_Area = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_val_iniz.setText("Valori iniziali");

        btn_val_iniz.setText("Genera Vettore");
        btn_val_iniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_val_inizActionPerformed(evt);
            }
        });

        btn_selection.setText("Selection Sort");
        btn_selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectionActionPerformed(evt);
            }
        });

        btn_Bubble.setText("Bubble Sort");
        btn_Bubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BubbleActionPerformed(evt);
            }
        });

        btn_insertion.setText("Insertion Sort");
        btn_insertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertionActionPerformed(evt);
            }
        });

        lbl_valord.setText("Valori ordinati");

        tbxValoriOrdinati.setColumns(20);
        tbxValoriOrdinati.setRows(5);
        jScrollPane2.setViewportView(tbxValoriOrdinati);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        txt_Area.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_selection)
                .addGap(48, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Bubble)
                    .addComponent(lbl_valord))
                .addGap(76, 76, 76)
                .addComponent(btn_insertion))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(lbl_val_iniz))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btn_val_iniz)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(txt_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_val_iniz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_val_iniz)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selection)
                    .addComponent(btn_Bubble)
                    .addComponent(btn_insertion))
                .addGap(37, 37, 37)
                .addComponent(lbl_valord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_val_inizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_val_inizActionPerformed
       Vettore=utility.vettore();
       Valori=utility.valIniziali(Vettore);
       jTextArea2.setText(Valori);
    }//GEN-LAST:event_btn_val_inizActionPerformed

    private void btn_BubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BubbleActionPerformed
     
      Vettore=utility.BubbleSort(Vettore);
      
      Valori=utility.trasformavettore(Vettore);
      tbxValoriOrdinati.setText(Valori);
    }//GEN-LAST:event_btn_BubbleActionPerformed

    private void btn_selectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectionActionPerformed
    
      Vettore=utility.SelectionSort(Vettore);
      
      Valori=utility.trasformavettore(Vettore);
      tbxValoriOrdinati.setText(Valori);
    }//GEN-LAST:event_btn_selectionActionPerformed

    private void btn_insertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertionActionPerformed

      Vettore=utility.InsertionSort(Vettore);
      
      Valori=utility.trasformavettore(Vettore);
      tbxValoriOrdinati.setText(Valori);
    }//GEN-LAST:event_btn_insertionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Bubble;
    private javax.swing.JButton btn_insertion;
    private javax.swing.JButton btn_selection;
    private javax.swing.JButton btn_val_iniz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lbl_val_iniz;
    private javax.swing.JLabel lbl_valord;
    private javax.swing.JTextArea tbxValoriOrdinati;
    private javax.swing.JScrollPane txt_Area;
    // End of variables declaration//GEN-END:variables
}
