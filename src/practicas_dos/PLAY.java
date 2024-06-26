
package practicas_dos;

public class PLAY extends javax.swing.JFrame {
    
    public static boolean nivel1Completado = false;
    public static boolean nivel2Completado = false;
    public static boolean nivel3Completado = false;
     private String newusuario;
     
    public PLAY(String newusuario) {
        this.newusuario = newusuario;
        initComponents();
        transparencia();
        inicializarEstadoBotones();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nivel1 = new javax.swing.JButton();
        nivel2 = new javax.swing.JButton();
        nivel4 = new javax.swing.JButton();
        nivel3 = new javax.swing.JButton();
        onli = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        lupa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel2.setText("jLabel2");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/UNO.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/UNO.png"))); // NOI18N
        nivel1.setToolTipText("AGUDAS");
        nivel1.setBorder(null);
        nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel1ActionPerformed(evt);
            }
        });
        jPanel1.add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        nivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/DOS.png"))); // NOI18N
        nivel2.setToolTipText("GRAVES");
        nivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel2ActionPerformed(evt);
            }
        });
        jPanel1.add(nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        nivel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/cuatro.png"))); // NOI18N
        nivel4.setToolTipText("SOBREESDRUJULA");
        nivel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel4ActionPerformed(evt);
            }
        });
        jPanel1.add(nivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        nivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/tres.png"))); // NOI18N
        nivel3.setToolTipText("ESDRUJULAS");
        nivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel3ActionPerformed(evt);
            }
        });
        jPanel1.add(nivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        onli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/peq.png"))); // NOI18N
        onli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onliActionPerformed(evt);
            }
        });
        jPanel1.add(onli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 240, -1, -1));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/anim/left-arrow-1487_128.gif"))); // NOI18N
        atras.setToolTipText("");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, -1, -1));

        lupa.setText("jButton3");
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });
        jPanel1.add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/fondoofiDOS.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel1ActionPerformed
        AGUDAS agudas =new AGUDAS(newusuario);
        agudas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nivel1ActionPerformed

    private void onliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onliActionPerformed
       // Pasa el nombre de usuario a QUIZZ
       Codigo_TEST qui = new Codigo_TEST(newusuario);
        qui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onliActionPerformed

    private void nivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel2ActionPerformed
        // TODO add your handling code here:
        GRAVES graves = new GRAVES(newusuario);
        graves.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nivel2ActionPerformed

    private void nivel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel3ActionPerformed
        // TODO add your handling code here:
        ESDRU esdru = new ESDRU(newusuario);
        esdru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nivel3ActionPerformed

    private void nivel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel4ActionPerformed
        // TODO add your handling code here:
        SOBRE sobre = new SOBRE(newusuario);
        sobre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nivel4ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        INDEX sobre = new INDEX();
        sobre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        COMPA sobre = new COMPA();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_lupaActionPerformed
    
    public void transparencia(){
        nivel1.setOpaque(false);
        nivel1.setContentAreaFilled(false);
        nivel1.setBorderPainted(false);
        nivel2.setOpaque(false);
        nivel2.setContentAreaFilled(false);
        nivel2.setBorderPainted(false);
        nivel3.setOpaque(false);
        nivel3.setContentAreaFilled(false);
        nivel3.setBorderPainted(false);
        nivel4.setOpaque(false);
        nivel4.setContentAreaFilled(false);
        nivel4.setBorderPainted(false);
        atras.setOpaque(false);
        atras.setContentAreaFilled(false);
        atras.setBorderPainted(false);
    }
    private void inicializarEstadoBotones() {
        nivel1.setEnabled(true);
        nivel2.setEnabled(nivel1Completado);
        nivel3.setEnabled(nivel2Completado);
        nivel4.setEnabled(nivel3Completado);
    }
   
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
            java.util.logging.Logger.getLogger(PLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lupa;
    private javax.swing.JButton nivel1;
    private javax.swing.JButton nivel2;
    private javax.swing.JButton nivel3;
    private javax.swing.JButton nivel4;
    private javax.swing.JButton onli;
    // End of variables declaration//GEN-END:variables
}
