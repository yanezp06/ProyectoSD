
package practicas_dos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class COMPA extends javax.swing.JFrame {
    private CONEX conex;
  
    public COMPA() {
        conex = new CONEX();
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2_TIPO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1_buscar = new javax.swing.JTextField();
        panelRound1 = new practicas_dos.PanelRound();
        jButton1_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2_TIPO.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        getContentPane().add(jLabel2_TIPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 270, 70));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Escribe la palabra:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jTextField1_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 200, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1_buscar.setText("Buscar el tipo de acentuación");
        jButton1_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_buscarActionPerformed(evt);
            }
        });
        panelRound1.add(jButton1_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/conceptos/busquedaCO.jpg"))); // NOI18N
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 750));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_buscarActionPerformed

    private void jButton1_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_buscarActionPerformed
        // TODO add your handling code here:
        String palabraBuscar = jTextField1_buscar.getText().trim();
    
    // Paso 2: Realizar la consulta en la base de datos
    try {
            Connection connection = conex.getCx();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT TIPO FROM palabras WHERE WORD LIKE '%" + palabraBuscar + "%'");

            // Paso 3: Verificar si se encontró la palabra
            if (resultSet.next()) {
                // La palabra fue encontrada, obtenemos su tipo
                String tipoPalabra = resultSet.getString("TIPO");

                // Paso 4: Mostrar el tipo de palabra en el JLabel
                jLabel2_TIPO.setText("Tipo: " + tipoPalabra);
            } else {
                // La palabra no fue encontrada, mostramos un mensaje
                jLabel2_TIPO.setText("Palabra no encontrada");
            }

            // Cerrar la conexión a la base de datos
            resultSet.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(COMPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COMPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COMPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COMPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COMPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_TIPO;
    private javax.swing.JTextField jTextField1_buscar;
    private practicas_dos.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
