/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicas_dos;

import Interfaces_Preguntas.BIBLIO;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.*;

public class REGIS extends javax.swing.JFrame {

    private CONEX conex;
    
    public REGIS() {
        initComponents();
        conex = new CONEX();
        
        String codigoAleatorio = generarCodigoAleatorio();
        jTextField1_codigo.setText(codigoAleatorio);
        jTextField1_codigo.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new practicas_dos.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jTextField1_name = new javax.swing.JTextField();
        panelRound3 = new practicas_dos.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jTextField3_Ape = new javax.swing.JTextField();
        panelRound4 = new practicas_dos.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_correo = new javax.swing.JTextField();
        panelRound5 = new practicas_dos.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jTextField2_pass = new javax.swing.JTextField();
        panelRound6 = new practicas_dos.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jTextField1_codigo = new javax.swing.JTextField();
        jButton1_guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(31, 102, 149));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 102, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jLabel1.setText("Nombre:");

        jTextField1_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_name.setBorder(null);
        jTextField1_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1_name, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1_name)
                .addContainerGap())
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 511, -1));

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);

        jLabel3.setText("Apellido:");

        jTextField3_Ape.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_Ape.setBorder(null);
        jTextField3_Ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_ApeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField3_Ape, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3_Ape)
                .addContainerGap())
        );

        jPanel1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 511, -1));

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);

        jLabel4.setText("correo:");

        jTextField1_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_correo.setBorder(null);
        jTextField1_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_correoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jTextField1_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1_correo)
                .addContainerGap())
        );

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 511, -1));

        panelRound5.setBackground(new java.awt.Color(255, 255, 255));
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);

        jLabel5.setText("Contraseña:");

        jTextField2_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_pass.setBorder(null);
        jTextField2_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextField2_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2_pass)
                .addContainerGap())
        );

        jPanel1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setRoundBottomLeft(50);
        panelRound6.setRoundBottomRight(50);
        panelRound6.setRoundTopLeft(50);
        panelRound6.setRoundTopRight(50);

        jLabel6.setText("Codigo generado:");

        jTextField1_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_codigo.setBorder(null);
        jTextField1_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_codigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextField1_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1_codigo)
                .addContainerGap())
        );

        jPanel1.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 511, -1));

        jButton1_guardar.setText("Guardar datos");
        jButton1_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 126, 37));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/anim/flecha_necha.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicas_dos/conceptos/fondo_REGIS.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login regis = new Login();
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3_ApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_ApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_ApeActionPerformed

    private void jTextField1_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_correoActionPerformed

    private void jTextField2_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_passActionPerformed

    private void jTextField1_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_codigoActionPerformed

    private void jButton1_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_guardarActionPerformed
        String nombre = jTextField1_name.getText();
        String apellido = jTextField3_Ape.getText();
        String correo = jTextField1_correo.getText();
        String contraseña = jTextField2_pass.getText();
        String codigo = jTextField1_codigo.getText();
        
        try {
            // Crea la sentencia SQL para insertar en la tabla profe
            String sql = "INSERT INTO profe (id_numclases, NOMBRE, APELLIDO, CORREO, PASS) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conex.getCx().prepareStatement(sql);
            statement.setString(1, codigo);
            statement.setString(2, nombre);
            statement.setString(3, apellido);
            statement.setString(4, correo);
            statement.setString(5, contraseña);
            

            // Ejecuta la sentencia SQL
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Se insertó correctamente en la tabla profe.");
                // Puedes mostrar un mensaje de éxito aquí si lo deseas
                jTextField1_name.setText("");
                jTextField3_Ape.setText("");
                jTextField1_correo.setText("");
                jTextField2_pass.setText("");
                jTextField1_codigo.setText(generarCodigoAleatorio());
                
                // Redirigir a BIBLIO pasando el id_numclases
                BIBLIO biblio = new BIBLIO(codigo);
                biblio.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println("Error al insertar en la tabla profe: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(REGIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                REGIS regis = new REGIS();
                regis.setVisible(true);
            }
        });
    }
    private String generarCodigoAleatorio() {
        Random random = new Random();
        // Caracteres válidos para las letras
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Se eligen dos letras aleatorias
        String letra1 = String.valueOf(letras.charAt(random.nextInt(letras.length())));
        String letra2 = String.valueOf(letras.charAt(random.nextInt(letras.length())));
        // Se eligen tres números aleatorios entre 100 y 999
        int numero1 = 1 + random.nextInt(9);
        int numero2 = 1 + random.nextInt(9);
        int numero3 = 1 + random.nextInt(9);
        // Se crea el código combinando las letras y los números
        return letra1 + letra2 + numero1 + numero2 + numero3;
    }

// Método para establecer el código en el jTextField1_codigo
public void setCodigo(String codigo) {
    jTextField1_codigo.setText(codigo);
    jTextField1_codigo.setEditable(false); // Para que no se pueda modificar
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_codigo;
    private javax.swing.JTextField jTextField1_correo;
    private javax.swing.JTextField jTextField1_name;
    private javax.swing.JTextField jTextField2_pass;
    private javax.swing.JTextField jTextField3_Ape;
    private practicas_dos.PanelRound panelRound1;
    private practicas_dos.PanelRound panelRound3;
    private practicas_dos.PanelRound panelRound4;
    private practicas_dos.PanelRound panelRound5;
    private practicas_dos.PanelRound panelRound6;
    // End of variables declaration//GEN-END:variables
}
