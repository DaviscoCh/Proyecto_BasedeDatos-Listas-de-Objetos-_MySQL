/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Controlador.Inventario_RentasDAO;
import Controlador.PeliculaDAO;
import Entidades.Inventario_Rentas;
import static Formularios.frmIVentas.jComboBox1;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author C.D.C.A
 */
public class frmIRentas extends javax.swing.JFrame {

    /**
     * Creates new form frmIRentas
     */
    public String Funcion;
    
    public frmIRentas(String fun) {
        this.Funcion = fun;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        
        PeliculaDAO pe = new PeliculaDAO();
        pe.actualizarComboBoxTipoR();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Generar Renta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setText("CodigoPr:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setText("IdCliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 130, 30));

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 30, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, 30));

        jLabel4.setText("Pelicula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, 30));

        jLabel5.setText("Proveedor:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 130, 30));

        jLabel6.setText("Unidades:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 130, 30));

        jLabel7.setText("Precio:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 130, 30));

        jLabel8.setText("FechaA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel9.setText("FechaD:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 130, 30));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 130, 30));

        jButton2.setForeground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, 30));

        jButton3.setForeground(new java.awt.Color(204, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void SetDatos(Inventario_Rentas iv) {
        jTextField1.setText(String.valueOf(iv.getCodigoPR()));
        jTextField2.setText(String.valueOf(iv.getIdCliente()));
        jComboBox2.setSelectedItem(String.valueOf(iv.getPelicula()));
        jTextField3.setText(iv.getProveedor());
        jTextField4.setText(String.valueOf(iv.getUnidades()));
        jTextField5.setText(String.valueOf(iv.getPrecio()));
        jDateChooser1.setDate(iv.getFechaA());
        jDateChooser2.setDate(iv.getFechaD());
    } 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Inventario_RentasDAO id = new Inventario_RentasDAO();
        if (!jTextField2.getText().equals("")
                && !jTextField1.getText().equals("")
                && !jTextField3.getText().equals("")
                && !jTextField4.getText().equals("")
                && !jTextField5.getText().equals("")) {
            try {
                int CodigoPr = Integer.parseInt(jTextField1.getText());
                int IdCliente = Integer.parseInt(jTextField2.getText());
                String Pelicula = jComboBox2.getSelectedItem().toString();
                String Proveedor = jTextField3.getText();
                int Unidades = Integer.parseInt(jTextField4.getText());
                double Precio = Double.parseDouble(jTextField5.getText());
                Date FechaA = jDateChooser1.getDate();
                Date FechaD = jDateChooser2.getDate();
                Inventario_Rentas ir = new Inventario_Rentas(CodigoPr, IdCliente, Pelicula, Proveedor, Unidades, Precio, FechaA, FechaD);
                Funcion = "Insertar";
                if (Funcion.equals("Insertar")) {
                    id.InsertarIventarioR(ir);
                }
                Funcion = "Modificar";
                if (Funcion.equals("Modificar")) {
                    id.ModificarIventarioR(ir);
                }
                frm_Principal.MostrarTabla6();
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmListaClientesRe frm = new frmListaClientesRe();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        if (jComboBox2.getSelectedIndex() >= 0) {
            jTextField3.setText("DisneyPlus");
            jTextField5.setText(String.valueOf(8));
        }
        if (jComboBox2.getSelectedIndex() >= 1) {
            jTextField3.setText("Studio Ghilbi");
            jTextField5.setText(String.valueOf(10));
        }
        if (jComboBox2.getSelectedIndex() >= 2) {
            jTextField3.setText("Paramount");
            jTextField5.setText(String.valueOf(12));
        }
        if (jComboBox2.getSelectedIndex() >= 3) {
            jTextField3.setText("Netflix");
            jTextField5.setText(String.valueOf(8));
        }
        if (jComboBox2.getSelectedIndex() >= 4) {
            jTextField3.setText("Atres Player");
            jTextField5.setText(String.valueOf(10));
        }
        if (jComboBox2.getSelectedIndex() >= 5) {
            jTextField3.setText("PlutoTV");
            jTextField5.setText(String.valueOf(12));
        }
        if (jComboBox2.getSelectedIndex() >= 6) {
            jTextField3.setText("HBOmax");
            jTextField5.setText(String.valueOf(13));
        }
        if (jComboBox2.getSelectedIndex() >= 7) {
            jTextField3.setText("Fanatiz");
            jTextField5.setText(String.valueOf(12));
        }
        if (jComboBox2.getSelectedIndex() >= 8) {
            jTextField3.setText("Canela Media");
            jTextField5.setText(String.valueOf(10));
        }
        if (jComboBox2.getSelectedIndex() >= 9) {
            jTextField3.setText("BlimTv");
            jTextField5.setText(String.valueOf(12));
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmIRentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmIRentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmIRentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmIRentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        
        try {
            UIManager.setLookAndFeel(new FlatMaterialDeepOceanIJTheme());
//            FlatDarkLaf.setup();
//            IntelliJTheme.setup(frm_Principal.class.getResourceAsStream("/solarized_light_theme.theme.json"));
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIRentas("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
