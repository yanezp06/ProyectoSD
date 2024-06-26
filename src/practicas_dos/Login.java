
package practicas_dos;


import Interfaces_Preguntas.BIBLIO;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Login extends javax.swing.JFrame {
    CONEX cn; 
    public Login() {
        
        initComponents();
        cn = new CONEX();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_USER = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_PASS = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1_login = new javax.swing.JButton();
        jButton1_REGIS = new javax.swing.JButton();
        user_contra_incorrecta = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 102, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acceso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/Sin título-3.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 200, 190));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jTextField1_USER.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextField1_USER.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_USER.setBorder(null);
        jTextField1_USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_USERActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 267, 26));

        jSeparator1.setBackground(new java.awt.Color(31, 102, 149));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 267, 17));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/profile-icon-login-head-icon-vector.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jTextField1_PASS.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextField1_PASS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_PASS.setBorder(null);
        jTextField1_PASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_PASSActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 267, 26));

        jSeparator2.setBackground(new java.awt.Color(31, 102, 149));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 267, 17));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/gifTU/pass.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        jButton1_login.setBackground(new java.awt.Color(0, 115, 239));
        jButton1_login.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_login.setText("Ingreso");
        jButton1_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_loginActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 143, -1));

        jButton1_REGIS.setBackground(new java.awt.Color(0, 115, 239));
        jButton1_REGIS.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1_REGIS.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_REGIS.setText("Registrarse");
        jButton1_REGIS.setToolTipText("");
        jButton1_REGIS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1_REGIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_REGISActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_REGIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 143, -1));

        user_contra_incorrecta.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        user_contra_incorrecta.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(user_contra_incorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 230, 30));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/anim/flecha_necha.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/conceptos/fonfo_cuadra.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_loginActionPerformed
        // TODO add your handling code here:
        String correo = jTextField1_USER.getText().trim();
        String contraseña = jTextField1_PASS.getText().trim();
        
        String consulta = "SELECT * FROM profe WHERE CORREO = '" + correo + "' AND PASS = '" + contraseña + "'";
        
        try {
    // Crear una declaración y ejecutar la consulta
        Statement stmt = cn.getCx().createStatement();
        ResultSet rs = stmt.executeQuery(consulta);

    // Verificar si la consulta devuelve algún resultado
        if (rs.next()) {
             String nombre = rs.getString("NOMBRE");
             String apellido = rs.getString("APELLIDO");
             String codigo = rs.getString("id_numclases");
            // Las credenciales son correctas, permitir el acceso
            //SERVIDOR servi = new SERVIDOR(nombre, apellido, codigo);
            //servi.setVisible(true);
            BIBLIO biblio = new BIBLIO(codigo);
            biblio.setVisible(true);
        this.dispose();
    } else {
        // Mostrar mensaje de error en el PanelRound user_pass_Incorrecto
        user_contra_incorrecta.setText("Correo o contraseña equivocada");
    }

    // Cerrar la conexión y el resultado
    rs.close();
    stmt.close();
} catch (Exception e) {
    // Manejar cualquier otra excepción
    e.printStackTrace();
}
        
        
    }//GEN-LAST:event_jButton1_loginActionPerformed
    
    
    private void jButton1_REGISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_REGISActionPerformed
        // TODO add your handling code here:
        REGIS regis = new REGIS();
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1_REGISActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        INDEX regis = new INDEX();
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void jTextField1_USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_USERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_USERActionPerformed

    private void jTextField1_PASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_PASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_PASSActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton jButton1_REGIS;
    private javax.swing.JButton jButton1_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1_PASS;
    private javax.swing.JTextField jTextField1_USER;
    private javax.swing.JLabel user_contra_incorrecta;
    // End of variables declaration//GEN-END:variables
}
