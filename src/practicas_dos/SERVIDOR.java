
package practicas_dos;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class SERVIDOR extends javax.swing.JFrame implements Runnable {
      private static final int SERVER_PORT = 9876; 
      private String nombre;
      private String apellido;
      private String codigo;
      
    public SERVIDOR(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        initComponents();
        
        nameProfe1.setText("Profesor: " + nombre + " " + apellido);
        codigo_profe.setText(codigo);
        Thread miHilo = new Thread(this);
        miHilo.start();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1_vocabu = new javax.swing.JButton();
        jButton2_convertir_excel = new javax.swing.JButton();
        codigo_profe = new javax.swing.JLabel();
        nameProfe1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 102, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 279, -1, 355));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 279, 242, 355));

        jButton1_vocabu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/pala.png"))); // NOI18N
        jButton1_vocabu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_vocabuActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_vocabu, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 22, -1, -1));

        jButton2_convertir_excel.setText("Exportar calificaciones");
        jButton2_convertir_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_convertir_excelActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2_convertir_excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 179, -1, -1));

        codigo_profe.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        codigo_profe.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(codigo_profe, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 85, 210, 34));

        nameProfe1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        nameProfe1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nameProfe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 34, 446, 45));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Listado de notas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 251, 243, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listado de estudiantes:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 255, 243, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/conceptos/Fondo_Servi.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_vocabuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_vocabuActionPerformed
        // TODO add your handling code here:
        TABLAS palabrasFrame = new TABLAS();
        palabrasFrame.setVisible(true);
    
    // Cerrar la interfaz actual
        
    }//GEN-LAST:event_jButton1_vocabuActionPerformed

    private void jButton2_convertir_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_convertir_excelActionPerformed
        
        Formulario palabrasFrame = new Formulario();
        palabrasFrame.setVisible(true);
        
    }//GEN-LAST:event_jButton2_convertir_excelActionPerformed

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
            java.util.logging.Logger.getLogger(SERVIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SERVIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SERVIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SERVIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SERVIDOR("", "", "").setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigo_profe;
    private javax.swing.JButton jButton1_vocabu;
    private javax.swing.JButton jButton2_convertir_excel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel nameProfe1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
         try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
        while (true) {
            try (Socket clientSocket = serverSocket.accept()) {
                DataInputStream entrada = new DataInputStream(clientSocket.getInputStream());
                String mensaje = entrada.readUTF(); // Lee el primer mensaje
                
                // Verifica el tipo de mensaje y actúa en consecuencia
                if (mensaje.startsWith("Resultado de")) {
                    // Si el mensaje comienza con "Resultado de", se asume que es enviado desde QUIZZ
                    jTextArea2.setText(mensaje); // Muestra el resultado completo en jTextArea2
                } else {
                    // Si no comienza con "Resultado de", se asume que es enviado desde INGRESO
                    jTextArea1.setText(mensaje); // Muestra solo el nombre de usuario en jTextArea1
                }

                // Mantener el comportamiento anterior en jTextArea1

            }
        }
    } catch (IOException ex) {
        Logger.getLogger(SERVIDOR.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
