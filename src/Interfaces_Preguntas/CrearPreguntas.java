/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces_Preguntas;

import practicas_dos.CONEX;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class CrearPreguntas extends javax.swing.JFrame {
    
    private CONEX conexion;
    private Connection cx;
    private int testId;
    private JRadioButton previousSelected = null;
    /**
     * Creates new form CrearPreguntas
     */
    public CrearPreguntas(int testId) {
        initComponents();
        conexion = new CONEX();
        cx = conexion.getCx();
        this.testId = testId;
        addPlaceholderListener(jTextField1_pregunta, "Escriba aquí la pregunta....");
        addPlaceholderListener(jTextField2_opcionA, "Escriba la opción de respuesta aquí");
        addPlaceholderListener(jTextField3_opcionB, "Escriba la opción de respuesta aquí");
        addPlaceholderListener(jTextField4_opcionC, "Escriba la opción de respuesta aquí");
        addPlaceholderListener(jTextField5_opcionD, "Escriba la opción de respuesta aquí");
        
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1_A);
        group.add(jRadioButton2_B);
        group.add(jRadioButton3_C);
        group.add(jRadioButton4_D);

        addToggleBehavior(jRadioButton1_A, group);
        addToggleBehavior(jRadioButton2_B, group);
        addToggleBehavior(jRadioButton3_C, group);
        addToggleBehavior(jRadioButton4_D, group);
    }
    
    private void addPlaceholderListener(JTextField textField, String placeholder) {
        textField.setForeground(Color.GRAY);
        textField.setText(placeholder);
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
        });
    }
    private void addToggleBehavior(JRadioButton radioButton, ButtonGroup group) {
        radioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton == previousSelected) {
                    group.clearSelection();
                    previousSelected = null;
                } else {
                    previousSelected = radioButton;
                }
            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new practicas_dos.PanelRound();
        panelRound2 = new practicas_dos.PanelRound();
        jTextField1_pregunta = new javax.swing.JTextField();
        jTextField3_opcionB = new javax.swing.JTextField();
        jTextField2_opcionA = new javax.swing.JTextField();
        jTextField5_opcionD = new javax.swing.JTextField();
        jTextField4_opcionC = new javax.swing.JTextField();
        jRadioButton1_A = new javax.swing.JRadioButton();
        jRadioButton4_D = new javax.swing.JRadioButton();
        jRadioButton2_B = new javax.swing.JRadioButton();
        jRadioButton3_C = new javax.swing.JRadioButton();
        jButton1_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2_subir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1_pregunta.setText("Escriba aqui la pregunta....");
        jTextField1_pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_preguntaActionPerformed(evt);
            }
        });

        jTextField3_opcionB.setText("Escriba la opción de respuesta aqui");
        jTextField3_opcionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_opcionBActionPerformed(evt);
            }
        });

        jTextField2_opcionA.setText("Escriba la opción de respuesta aqui");
        jTextField2_opcionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_opcionAActionPerformed(evt);
            }
        });

        jTextField5_opcionD.setText("Escriba la opción de respuesta aqui");
        jTextField5_opcionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_opcionDActionPerformed(evt);
            }
        });

        jTextField4_opcionC.setText("Escriba la opción de respuesta aqui");
        jTextField4_opcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_opcionCActionPerformed(evt);
            }
        });

        jRadioButton1_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_AActionPerformed(evt);
            }
        });

        jRadioButton2_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton1_A)
                            .addComponent(jTextField2_opcionA, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jTextField3_opcionB, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField4_opcionC, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jTextField5_opcionD, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2_B)
                                .addGap(280, 280, 280)
                                .addComponent(jRadioButton3_C)
                                .addGap(253, 253, 253)
                                .addComponent(jRadioButton4_D)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTextField1_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1_A)
                    .addComponent(jRadioButton4_D)
                    .addComponent(jRadioButton3_C)
                    .addComponent(jRadioButton2_B))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_opcionB, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_opcionC, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5_opcionD, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_opcionA, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1170, 570));

        jButton1_Guardar.setText("Guardar preguntas");
        jButton1_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_GuardarActionPerformed(evt);
            }
        });
        panelRound1.add(jButton1_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        jLabel1.setText("Nota: seleccione en el circulo cual es la respuesta correcta.");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        jButton2_subir.setText("Terminar y publicar preguntas");
        jButton2_subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_subirActionPerformed(evt);
            }
        });
        panelRound1.add(jButton2_subir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_preguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_preguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_preguntaActionPerformed

    private void jTextField2_opcionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_opcionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_opcionAActionPerformed

    private void jTextField3_opcionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_opcionBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_opcionBActionPerformed

    private void jTextField4_opcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_opcionCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_opcionCActionPerformed

    private void jTextField5_opcionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_opcionDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_opcionDActionPerformed

    private void jButton1_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_GuardarActionPerformed
         String pregunta = jTextField1_pregunta.getText();
        String opcionA = jTextField2_opcionA.getText();
        String opcionB = jTextField3_opcionB.getText();
        String opcionC = jTextField4_opcionC.getText();
        String opcionD = jTextField5_opcionD.getText();
        
        if (pregunta.isEmpty() || opcionA.isEmpty() || opcionB.isEmpty() || opcionC.isEmpty() || opcionD.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todas las preguntas y opciones.");
            return;
        }

        // Guardar la pregunta en la base de datos
        int questionId = guardarPreguntaEnBD(pregunta);

        if (questionId > 0) {
            // Guardar las opciones en la base de datos
            guardarOpcionEnBD(opcionA, questionId, jRadioButton1_A.isSelected());
            guardarOpcionEnBD(opcionB, questionId, jRadioButton2_B.isSelected());
            guardarOpcionEnBD(opcionC, questionId, jRadioButton3_C.isSelected());
            guardarOpcionEnBD(opcionD, questionId, jRadioButton4_D.isSelected());

            JOptionPane.showMessageDialog(this, "Pregunta y opciones guardadas con éxito.");
            // Limpiar los campos de texto y los botones de opción
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar la pregunta en la base de datos.");
            
        }
    }//GEN-LAST:event_jButton1_GuardarActionPerformed
    
    private void limpiarCampos() {
        jTextField1_pregunta.setText("");
        jTextField2_opcionA.setText("");
        jTextField3_opcionB.setText("");
        jTextField4_opcionC.setText("");
        jTextField5_opcionD.setText("");

        // Desseleccionar todos los botones de opción
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1_A);
        group.add(jRadioButton2_B);
        group.add(jRadioButton3_C);
        group.add(jRadioButton4_D);
        group.clearSelection();
}
    
    private int guardarPreguntaEnBD(String pregunta) {
        String query = "INSERT INTO question (test_id, question_text) VALUES (?, ?)";
        try (PreparedStatement ps = cx.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, testId);
            ps.setString(2, pregunta);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    private void guardarOpcionEnBD(String opcion, int questionId, boolean isCorrect) {
        String query = "INSERT INTO option (question_id, option_text, is_correct) VALUES (?, ?, ?)";
        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setInt(1, questionId);
            ps.setString(2, opcion);
            ps.setBoolean(3, isCorrect);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void jButton2_subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_subirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Preguntas publicadas con éxito.");
        // Crear y mostrar la interfaz BIBLIO
    BIBLIO biblio = new BIBLIO(Integer.toString(testId)); // Pasa el id_numclases al constructor
    biblio.setVisible(true);
    
    // Cerrar la ventana actual
    this.dispose();
    }//GEN-LAST:event_jButton2_subirActionPerformed

    private void jRadioButton1_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1_AActionPerformed

    private void jRadioButton2_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2_BActionPerformed

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
            java.util.logging.Logger.getLogger(CrearPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPreguntas(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Guardar;
    private javax.swing.JButton jButton2_subir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1_A;
    private javax.swing.JRadioButton jRadioButton2_B;
    private javax.swing.JRadioButton jRadioButton3_C;
    private javax.swing.JRadioButton jRadioButton4_D;
    private javax.swing.JTextField jTextField1_pregunta;
    private javax.swing.JTextField jTextField2_opcionA;
    private javax.swing.JTextField jTextField3_opcionB;
    private javax.swing.JTextField jTextField4_opcionC;
    private javax.swing.JTextField jTextField5_opcionD;
    private practicas_dos.PanelRound panelRound1;
    private practicas_dos.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
