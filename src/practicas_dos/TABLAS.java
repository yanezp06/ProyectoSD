
package practicas_dos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

public class TABLAS extends javax.swing.JFrame {

  
    public TABLAS() {
        initComponents();
        cargarDatosPalabras();
         setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }
    private void cargarDatosPalabras() {
        try {
            Connection connection = CONEX.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT ID_palabra, WORD, TIPO FROM palabras");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Palabra");
            model.addColumn("Tipo");

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getString("ID_palabra"),
                    resultSet.getString("WORD"),
                    resultSet.getString("TIPO")
                });
            }

            tabla.setModel(model);

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound4 = new practicas_dos.PanelRound();
        panelRound1 = new practicas_dos.PanelRound();
        jTextField2_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2_buscar = new javax.swing.JButton();
        mensaje_buscar1 = new javax.swing.JLabel();
        panelRound2 = new practicas_dos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        agregar_palabra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3_agregar = new javax.swing.JButton();
        mensaje_agregar1 = new javax.swing.JLabel();
        agregar_tipo_lista = new javax.swing.JComboBox<>();
        panelRound3 = new practicas_dos.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_elimniar = new javax.swing.JTextField();
        jButton1_eliminar = new javax.swing.JButton();
        mensaje_eliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound4.setBackground(new java.awt.Color(31, 102, 149));
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_buscarActionPerformed(evt);
            }
        });
        panelRound1.add(jTextField2_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 200, -1));

        jLabel1.setText("Buscar:");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jButton2_buscar.setText("Buscar");
        jButton2_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_buscarActionPerformed(evt);
            }
        });
        panelRound1.add(jButton2_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 30));
        panelRound1.add(mensaje_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 290, 30));

        panelRound4.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 180));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Agregar:");
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        agregar_palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_palabraActionPerformed(evt);
            }
        });
        panelRound2.add(agregar_palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 200, -1));

        jLabel4.setText("Palabra:");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setText("Tipo:");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jButton3_agregar.setText("Agregar");
        jButton3_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_agregarActionPerformed(evt);
            }
        });
        panelRound2.add(jButton3_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 30));
        panelRound2.add(mensaje_agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 290, 30));

        agregar_tipo_lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agudas", "Graves", "Esdrújula", "Sobresdrújula" }));
        agregar_tipo_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_tipo_listaActionPerformed(evt);
            }
        });
        panelRound2.add(agregar_tipo_lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 200, -1));

        panelRound4.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 250));

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Eliminar:");
        panelRound3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jTextField1_elimniar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_elimniarActionPerformed(evt);
            }
        });
        panelRound3.add(jTextField1_elimniar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 200, -1));

        jButton1_eliminar.setText("Eliminar");
        jButton1_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_eliminarActionPerformed(evt);
            }
        });
        panelRound3.add(jButton1_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 30));
        panelRound3.add(mensaje_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 290, 30));

        panelRound4.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 300, 170));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        panelRound4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 720, 626));

        getContentPane().add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_buscarActionPerformed
        // TODO add your handling code here:
        String palabraBuscada = jTextField2_buscar.getText();
        buscarPalabra(palabraBuscada);
    }//GEN-LAST:event_jTextField2_buscarActionPerformed

    private void jButton2_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_buscarActionPerformed
     String palabraBuscada = jTextField2_buscar.getText();
        buscarPalabra(palabraBuscada);

    }//GEN-LAST:event_jButton2_buscarActionPerformed

    private void agregar_palabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_palabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_palabraActionPerformed

    private void jButton3_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_agregarActionPerformed
        
        agregarPalabra();  
    }//GEN-LAST:event_jButton3_agregarActionPerformed

    
    
    
    private void jTextField1_elimniarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_elimniarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_elimniarActionPerformed

    private void jButton1_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_eliminarActionPerformed
      eliminarPalabra();
    }//GEN-LAST:event_jButton1_eliminarActionPerformed

    private void agregar_tipo_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_tipo_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_tipo_listaActionPerformed
    
    private void buscarPalabra(String palabraBuscada) {
        try {
            Connection connection = CONEX.getConnection();
            String query = "SELECT ID_palabra, WORD, TIPO FROM palabras WHERE WORD LIKE ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + palabraBuscada + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Palabra");
            model.addColumn("Tipo");

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getString("ID_palabra"),
                    resultSet.getString("WORD"),
                    resultSet.getString("TIPO")
                });
            }

            tabla.setModel(model);

            if (model.getRowCount() == 0) {
                mensaje_buscar1.setText("No se encontraron resultados para: " + palabraBuscada);
            } else {
                mensaje_buscar1.setText("");
            }

            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void agregarPalabra() {
        try {
            Connection connection = CONEX.getConnection();
            String query = "INSERT INTO palabras (WORD, TIPO) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, agregar_palabra.getText());
            preparedStatement.setString(2, (String) agregar_tipo_lista.getSelectedItem());
            preparedStatement.executeUpdate();

            cargarDatosPalabras();
            mensaje_agregar1.setText("Palabra agregada exitosamente.");
            agregar_palabra.setText("");
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void eliminarPalabra() {
        try {
        String palabraAEliminar = jTextField1_elimniar.getText().trim();
        if (palabraAEliminar.isEmpty()) {
            mensaje_eliminar.setText("Por favor, ingrese una palabra.");
            return;
        }

        Connection connection = CONEX.getConnection();
        String query = "DELETE FROM palabras WHERE WORD = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, palabraAEliminar);
        int rowsAffected = preparedStatement.executeUpdate();

        cargarDatosPalabras();

        if (rowsAffected > 0) {
            mensaje_eliminar.setText("Palabra eliminada exitosamente.");
        } else {
            mensaje_eliminar.setText("No se encontró ninguna palabra con el texto proporcionado.");
        }

        jTextField1_elimniar.setText("");
        preparedStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
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
            java.util.logging.Logger.getLogger(TABLAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TABLAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TABLAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TABLAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABLAS().setVisible(true);
            }
        });
    }
    private void agregarPalabra(String palabra, String tipo) {
        // Conectar a la base de datos y agregar la palabra con el tipo
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiantes", "root", "");
            Statement statement = connection.createStatement();
            String query = "INSERT INTO palabras (WORD, TIPO) VALUES ('" + palabra + "', '" + tipo + "')";
            statement.executeUpdate(query);
            mensaje_agregar1.setText("Palabra agregada exitosamente");

            // Actualiza la tabla con los nuevos datos
            cargarDatosPalabras();

            // Limpia los campos de texto

            agregar_tipo_lista.setSelectedIndex(0); // Vuelve a seleccionar el primer tipo en el JComboBox

            // Cierra la conexión a la base de datos
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            mensaje_agregar1.setText("Error al agregar la palabra");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agregar_palabra;
    private javax.swing.JComboBox<String> agregar_tipo_lista;
    private javax.swing.JButton jButton1_eliminar;
    private javax.swing.JButton jButton2_buscar;
    private javax.swing.JButton jButton3_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1_elimniar;
    private javax.swing.JTextField jTextField2_buscar;
    private javax.swing.JLabel mensaje_agregar1;
    private javax.swing.JLabel mensaje_buscar1;
    private javax.swing.JLabel mensaje_eliminar;
    private practicas_dos.PanelRound panelRound1;
    private practicas_dos.PanelRound panelRound2;
    private practicas_dos.PanelRound panelRound3;
    private practicas_dos.PanelRound panelRound4;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
