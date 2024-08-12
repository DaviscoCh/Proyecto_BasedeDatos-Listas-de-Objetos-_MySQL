/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Controlador.ClientesDAO;
import Controlador.Devolucion_RentasDAO;
import Controlador.Inventario_RentasDAO;
import Controlador.Inventario_VentasDAO;
import Controlador.PeliculaDAO;
import Controlador.ProveedoresDAO;
import Entidades.Clientes;
import Entidades.Devolucion_Rentas;
import Entidades.Inventario_Rentas;
import Entidades.Inventario_Ventas;
import Entidades.Pelicula;
import Entidades.Proveedores;
import PDF.InterfazFactura;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author C.D.C.A
 */
public class frm_Principal extends javax.swing.JFrame {

    /**
     * Creates new form frm_Principal
     */
    public String Funcion;

    public frm_Principal(String fun) {
        this.Funcion = fun;
        initComponents();
        setLocationRelativeTo(this);
        SetDate();
        MostrarTabla2();
        MostrarTabla3();
        MostrarTabla4();
        MostrarTabla5();
        MostrarTabla6();
        MostrarTabla7();
        HabilitarT2(false);
        HabilitarT1(false);
        HabilitarT3(false);
    }

    public static void MostrarTabla2() {
        PeliculaDAO pd = new PeliculaDAO();
        List<Pelicula> ListaPelicula = pd.ListarPeliculas();
        jTable2.setModel(pd.MostrarPelicula(ListaPelicula));
    }

    public static void MostrarTabla3() {
        ClientesDAO cd = new ClientesDAO();
        List<Clientes> ListaClientes = cd.ListarClientes();
        jTable1.setModel(cd.MostrarClientes(ListaClientes));
    }

    public static void MostrarTabla4() {
        ProveedoresDAO pd = new ProveedoresDAO();
        List<Proveedores> ListaProveedores = pd.ListarProveedores();
        jTable3.setModel(pd.MostrarProveedores(ListaProveedores));
    }

    public static void MostrarTabla5() {
        Inventario_VentasDAO iv = new Inventario_VentasDAO();
        List<Inventario_Ventas> ListaIV = iv.ListarIventarioV();
        jTable4.setModel(iv.MostrarIventarioV(ListaIV));
    }

    public static void MostrarTabla6() {
        Inventario_RentasDAO ir = new Inventario_RentasDAO();
        List<Inventario_Rentas> ListaIR = ir.ListarIventarioR();
        jTable5.setModel(ir.MostrarIventarioR(ListaIR));
    }

    public static void MostrarTabla7() {
        Devolucion_RentasDAO dr = new Devolucion_RentasDAO();
        List<Devolucion_Rentas> ListaDR = dr.ListarDevolucionR();
        jTable6.setModel(dr.MostrarDevolucionR(ListaDR));
    }

    public void Table1() {
        jTabbedPane1.setSelectedIndex(0);
    }

    public void Tabla2() {
        jTabbedPane1.setSelectedIndex(1);
    }

    public void Tabla3() {
        jTabbedPane1.setSelectedIndex(2);
    }

    public void Tabla4() {
        jTabbedPane1.setSelectedIndex(3);
    }

    public void Tabla5() {
        jTabbedPane1.setSelectedIndex(4);
    }

    public void Tabla6() {
        jTabbedPane1.setSelectedIndex(5);
    }

    public void Tabla7() {
        jTabbedPane1.setSelectedIndex(6);
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        jLabel2.setText(now.format(DateTimeFormatter.ofPattern(" EEEE dd ' de ' MMMM  ' de ' yyyy", spanishLocale)));
    }

    public void HabilitarT2(boolean bol) {
        jTextField1.setEnabled(bol);
        jTextField2.setEnabled(bol);
        jTextField3.setEnabled(bol);
        jTextField4.setEnabled(bol);
        jTextField5.setEnabled(bol);
        jTextField6.setEnabled(bol);
        jTextField7.setEnabled(bol);
        jButton11.setEnabled(bol);
        jButton12.setEnabled(bol);
    }

    public void HabilitarT1(boolean bol) {
        jTextField8.setEnabled(bol);
        jTextField9.setEnabled(bol);
        jTextField10.setEnabled(bol);
        jDateChooser1.setEnabled(bol);
        jTextField12.setEnabled(bol);
        jTextField13.setEnabled(bol);
        jTextField14.setEnabled(bol);
        jTextField15.setEnabled(bol);
        jButton16.setEnabled(bol);
        jButton17.setEnabled(bol);
    }

    public void HabilitarT3(boolean bol) {
        jTextField11.setEnabled(bol);
        jTextField16.setEnabled(bol);
        jTextField17.setEnabled(bol);
        jTextField18.setEnabled(bol);
        jTextField19.setEnabled(bol);
        jButton21.setEnabled(bol);
        jButton22.setEnabled(bol);
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton31 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Casa.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 80));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Peliculas.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 80));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Personas.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 80));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Proveedor.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 130, 80));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IV.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 130, 80));

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IR.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 130, 80));

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DR.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 130, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 910, -1));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuBarra.png"))); // NOI18N
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 60));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Martes 20 de Febrero del 2024");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_CM.png"))); // NOI18N
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 120, 100));

        jLabel32.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 255, 255));
        jLabel32.setText("CMovies");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_UP.png"))); // NOI18N
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 120));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 120));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Bienvenido estimado Usuario,\nNos complace darte la bienvenida a CMovies, tu destino para \nencontrar las mejores películas para comprar o alquilar. \n¡Explora, elige y disfruta de la magia del cine desde la \ncomodidad de tu hogar!");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 105));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 510, 28));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diagrama_B.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 230));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Imagenes para Netbeans 8.2\\I1.png")); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 160, 170));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Imagenes para Netbeans 8.2\\I2.png")); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 160, 150));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Imagenes para Netbeans 8.2\\I3.png")); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 160, 150));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/S1.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/S2.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 100, 90));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/S3.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 100, 110));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/S4.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 100, 110));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Informe a llenar por los trabajadores\nIngrese la hora en que inicia su turno:\nIngrese la hora en la que acaba su turno:\nComente si hubo alguna novedad en su turno:\nComente si hubo alguna novedad con la interfaz: ");
        jScrollPane8.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 270, 80));

        jLabel33.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel33.setText("Excel Ventas");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

        jLabel34.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel34.setText("Excel Rentas");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, -1, -1));

        jButton33.setBackground(new java.awt.Color(0, 0, 0));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Excel_Menu.png"))); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 110, 70));

        jButton35.setBackground(new java.awt.Color(153, 153, 153));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Excel_Menu.png"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 110, 70));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 885, 150));

        jLabel1.setText("IdPelicula:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jTextField1.setBorder(null);
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, 30));

        jLabel4.setText("Titulo:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jTextField2.setBorder(null);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 140, 30));

        jLabel5.setText("Costo.V:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jTextField3.setBorder(null);
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 140, 30));

        jButton8.setForeground(new java.awt.Color(204, 255, 255));
        jButton8.setText("Insertar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 110, 30));

        jButton9.setForeground(new java.awt.Color(204, 255, 255));
        jButton9.setText("Modificar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 110, 30));

        jButton10.setForeground(new java.awt.Color(204, 255, 255));
        jButton10.setText("Eliminar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 110, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 190, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 180, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 870, 20));

        jLabel6.setText("Costo.R:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));

        jTextField4.setBorder(null);
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 140, 30));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 190, 10));

        jLabel7.setText("Unidades:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextField5.setBorder(null);
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 140, 30));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 10));

        jLabel8.setText("Clsf:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jTextField6.setBorder(null);
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 140, 30));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 180, 10));

        jLabel9.setText("Genero:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jTextField7.setBorder(null);
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 140, 30));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 190, 10));

        jButton11.setForeground(new java.awt.Color(204, 255, 255));
        jButton11.setText("Registrar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 110, 30));

        jButton12.setForeground(new java.awt.Color(204, 255, 255));
        jButton12.setText("Cancelar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 110, 30));

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 885, 150));

        jButton13.setForeground(new java.awt.Color(204, 255, 255));
        jButton13.setText("Insertar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 110, 30));

        jButton14.setForeground(new java.awt.Color(204, 255, 255));
        jButton14.setText("Modificar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 110, 30));

        jButton15.setForeground(new java.awt.Color(204, 255, 255));
        jButton15.setText("Eliminar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 110, 30));

        jLabel18.setText("IdCliente:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jTextField8.setBorder(null);
        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, 30));

        jLabel19.setText("Nombre:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jTextField9.setBorder(null);
        jPanel4.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 140, 30));

        jLabel20.setText("Apellido:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jTextField10.setBorder(null);
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 140, 30));

        jLabel21.setText("Fecha.N:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 870, 20));

        jLabel22.setText("Correo.E:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextField12.setBorder(null);
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 140, 30));

        jLabel23.setText("Telefono:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jTextField13.setBorder(null);
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 140, 30));

        jLabel24.setText("Sexo:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jTextField14.setBorder(null);
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 140, 30));

        jLabel25.setText("Direccion:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, -1));

        jTextField15.setBorder(null);
        jPanel4.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 140, 30));

        jButton16.setForeground(new java.awt.Color(204, 255, 255));
        jButton16.setText("Registrar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 110, 30));

        jButton17.setForeground(new java.awt.Color(204, 255, 255));
        jButton17.setText("Cancelar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 110, 30));

        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 140, 30));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 10));
        jPanel4.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 190, 10));
        jPanel4.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 10));
        jPanel4.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 200, 10));
        jPanel4.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 190, 10));
        jPanel4.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 190, 10));
        jPanel4.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 190, 10));
        jPanel4.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 200, 10));

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 885, 150));

        jButton18.setForeground(new java.awt.Color(204, 255, 255));
        jButton18.setText("Insertar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 110, 30));

        jButton19.setForeground(new java.awt.Color(204, 255, 255));
        jButton19.setText("Modificar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 110, 30));

        jButton20.setForeground(new java.awt.Color(204, 255, 255));
        jButton20.setText("Eliminar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 110, 30));

        jLabel26.setText("IdProveedores:");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jTextField11.setBorder(null);
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 140, 30));

        jLabel27.setText("RUC:");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jTextField16.setBorder(null);
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 140, 30));

        jLabel28.setText("NombreProv:");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jTextField17.setBorder(null);
        jPanel5.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        jLabel29.setText("Telefono:");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));

        jTextField18.setBorder(null);
        jPanel5.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 140, 30));

        jLabel30.setText("Direccion:");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jTextField19.setBorder(null);
        jPanel5.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 140, 30));

        jButton21.setForeground(new java.awt.Color(204, 255, 255));
        jButton21.setText("Registrar");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 110, 30));

        jButton22.setForeground(new java.awt.Color(204, 255, 255));
        jButton22.setText("Cancelar");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 110, 30));
        jPanel5.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 190, 20));
        jPanel5.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 200, 10));
        jPanel5.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 220, 20));
        jPanel5.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 210, 20));
        jPanel5.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 170, 10));

        jTabbedPane1.addTab("tab4", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 885, 150));

        jButton23.setForeground(new java.awt.Color(204, 255, 255));
        jButton23.setText("Realizar Venta");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 50));

        jButton24.setForeground(new java.awt.Color(204, 255, 255));
        jButton24.setText("Modificar Venta");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 150, 50));

        jButton25.setForeground(new java.awt.Color(204, 255, 255));
        jButton25.setText("Eliminar Venta");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 150, 50));

        jButton26.setBackground(new java.awt.Color(204, 255, 255));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PDF_V.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 110, 70));

        jTabbedPane1.addTab("tab5", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 885, 150));

        jButton28.setForeground(new java.awt.Color(204, 255, 255));
        jButton28.setText("Generar Renta");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 50));

        jButton29.setForeground(new java.awt.Color(204, 255, 255));
        jButton29.setText("Modificar Renta");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 150, 50));

        jButton30.setForeground(new java.awt.Color(204, 255, 255));
        jButton30.setText("Eliminar Renta");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 150, 50));

        jButton27.setBackground(new java.awt.Color(204, 255, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PDF_V.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 110, 70));

        jTabbedPane1.addTab("tab6", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 885, 150));

        jButton31.setBackground(new java.awt.Color(204, 255, 255));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PDF_V.png"))); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 110, 70));

        jButton34.setForeground(new java.awt.Color(204, 255, 255));
        jButton34.setText("Devolucion Renta");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 50));

        jButton36.setForeground(new java.awt.Color(204, 255, 255));
        jButton36.setText("Modificar Renta");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 150, 50));

        jButton37.setForeground(new java.awt.Color(204, 255, 255));
        jButton37.setText("Eliminar Renta");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 150, 50));

        jTabbedPane1.addTab("tab7", jPanel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 910, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SetDatos(Pelicula peli) {
        jTextField1.setText(String.valueOf(peli.getIdPelicula()));
        jTextField2.setText(peli.getTitulo());
        jTextField3.setText(String.valueOf(peli.getCostoVenta()));
        jTextField4.setText(String.valueOf(peli.getCostoRenta()));
        jTextField5.setText(String.valueOf(peli.getUnidades()));
        jTextField6.setText(peli.getClasificacion());
        jTextField7.setText(peli.getGenero());
    }

    public void SetDatos2(Clientes clie) {
        jTextField8.setText(String.valueOf(clie.getIdCliente()));
        jTextField9.setText(clie.getNombre());
        jTextField10.setText(clie.getApellido());
        jDateChooser1.setDate(clie.getFecha_Nacimiento());
        jTextField12.setText(clie.getCorreo_Electronico());
        jTextField13.setText(clie.getTelefono());
        jTextField14.setText(clie.getSexo());
        jTextField15.setText(clie.getDireccion());
    }

    public void SetDatos3(Proveedores prov) {
        jTextField11.setText(String.valueOf(prov.getIdProveedores()));
        jTextField16.setText(prov.getRUC());
        jTextField17.setText(prov.getNombre());
        jTextField18.setText(prov.getTelefono());
        jTextField19.setText(prov.getDireccion());
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Table1();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MostrarTabla2();
        Tabla2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Tabla3();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Tabla4();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Tabla5();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Tabla6();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Tabla7();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if (jTable2.getSelectedRow() >= 0) {
            PeliculaDAO pel = new PeliculaDAO();
            int resp = JOptionPane.showConfirmDialog(null, "Desea Eliminar esta Pelicula", "Eliminar Pelicula", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                int IdPelicula = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
                String Titulo = jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString();
                double Costo_Venta = Double.parseDouble(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString());
                double Costo_Renta = Double.parseDouble(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString());
                int Unidades = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 4).toString());
                String Clasificacion = jTable2.getValueAt(jTable2.getSelectedRow(), 5).toString();
                String Genero = jTable2.getValueAt(jTable2.getSelectedRow(), 6).toString();
                Pelicula rep = new Pelicula(IdPelicula, Titulo, Costo_Venta, Costo_Renta, Unidades, Clasificacion, Genero);
                pel.EliminarPelicula(rep);
                MostrarTabla2();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        HabilitarT2(true);
        Funcion = "Insertar";
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        HabilitarT2(false);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        PeliculaDAO pe = new PeliculaDAO();
        if (!jTextField1.getText().equals("")
                && !jTextField2.getText().equals("")
                && !jTextField3.getText().equals("")
                && !jTextField4.getText().equals("")
                && !jTextField5.getText().equals("")
                && !jTextField6.getText().equals("")
                && !jTextField7.getText().equals("")) {
            try {
                int IdPelicula = Integer.parseInt(jTextField1.getText());
                String Titulo = jTextField2.getText();
                double CostoVenta = Double.parseDouble(jTextField3.getText());
                double CostoRenta = Double.parseDouble(jTextField4.getText());
                int Unidades = Integer.parseInt(jTextField5.getText());
                String Clasificacion = jTextField6.getText();
                String Genero = jTextField7.getText();
                Pelicula pel = new Pelicula(IdPelicula, Titulo, CostoVenta, CostoRenta, Unidades, Clasificacion, Genero);

                if (Funcion.equals("Insertar")) {
                    pe.InsertarPelicula(pel);
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                }

                if (Funcion.equals("Modificar")) {
                    pe.ModificarPelicula(pel);
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                }

                frm_Principal.MostrarTabla2();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Funcion = "";
        HabilitarT2(true);
        Funcion = "Modificar";
        if (jTable2.getSelectedRow() >= 0) {
            PeliculaDAO pel = new PeliculaDAO();
            int IdPelicula = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
            String Titulo = jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString();
            double Costo_Venta = Double.parseDouble(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString());
            double Costo_Renta = Double.parseDouble(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString());
            int Unidades = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 4).toString());
            String Clasificacion = jTable2.getValueAt(jTable2.getSelectedRow(), 5).toString();
            String Genero = jTable2.getValueAt(jTable2.getSelectedRow(), 6).toString();
            Pelicula rep = new Pelicula(IdPelicula, Titulo, Costo_Venta, Costo_Renta, Unidades, Clasificacion, Genero);
            pel.ModificarPelicula(rep);
            SetDatos(rep);
            MostrarTabla2();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a Modificar");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        HabilitarT1(false);
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jDateChooser1.setDate(null);
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        HabilitarT1(true);
        Funcion = "Insertar";
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        Funcion = "";
        HabilitarT1(true);
        Funcion = "Modificar";
        if (jTable1.getSelectedRow() >= 0) {
            ClientesDAO cli = new ClientesDAO();
            int IdCliente = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            String Nombre = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String Apellido = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String fechaString = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            java.util.Date utilDate;
            try {
                utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaString);
            } catch (ParseException e) {
                e.printStackTrace();
                return;
            }
            java.sql.Date FechaN = new java.sql.Date(utilDate.getTime());
            String CorreoE = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            String Telefono = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
            String Sexo = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
            String Direccion = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
            Clientes cl = new Clientes(IdCliente, Nombre, Apellido, FechaN, CorreoE, Telefono, Sexo, Direccion);
            cli.ModificarClientes(cl);
            SetDatos2(cl);
            MostrarTabla3();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a Modificar");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() >= 0) {
            ClientesDAO cli = new ClientesDAO();
            int resp = JOptionPane.showConfirmDialog(null, "Desea Eliminar este Cliente", "Eliminar Cliente", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                int IdCliente = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                String Nombre = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
                String Apellido = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();

                String fechaString = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
                java.util.Date utilDate;
                try {
                    utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaString);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return;
                }
                java.sql.Date FechaN = new java.sql.Date(utilDate.getTime());

                String CorreoE = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
                String Telefono = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
                String Sexo = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
                String Direccion = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
                Clientes cl = new Clientes(IdCliente, Nombre, Apellido, FechaN, CorreoE, Telefono, Sexo, Direccion);
                cli.EliminarClientes(cl);
                MostrarTabla3();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        ClientesDAO cli = new ClientesDAO();
        if (!jTextField8.getText().equals("")
                && !jTextField9.getText().equals("")
                && !jTextField10.getText().equals("")
                && !jTextField12.getText().equals("")
                && !jTextField13.getText().equals("")
                && !jTextField14.getText().equals("")
                && !jTextField15.getText().equals("")) {
            try {
                int IdCliente = Integer.parseInt(jTextField8.getText());
                String Nombre = jTextField9.getText();
                String Apellido = jTextField10.getText();
                Date FechaN = jDateChooser1.getDate();
                String CorreoE = jTextField12.getText();
                String Telefono = jTextField13.getText();
                String Sexo = jTextField14.getText();
                String Direccion = jTextField15.getText();
                Clientes ci = new Clientes(IdCliente, Nombre, Apellido, FechaN, CorreoE, Telefono, Sexo, Direccion);
                if (Funcion.equals("Insertar")) {
                    cli.InsertarClientes(ci);
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                }
                if (Funcion.equals("Modificar")) {
                    cli.ModificarClientes(ci);
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                }
                frm_Principal.MostrarTabla3();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        HabilitarT3(true);
        Funcion = "Insertar";
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        ProveedoresDAO cli = new ProveedoresDAO();
        if (!jTextField11.getText().equals("")
                && !jTextField16.getText().equals("")
                && !jTextField17.getText().equals("")
                && !jTextField18.getText().equals("")
                && !jTextField19.getText().equals("")) {
            try {
                int IdProveedores = Integer.parseInt(jTextField11.getText());
                String RUC = jTextField16.getText();
                String Nombre = jTextField17.getText();
                String Telefono = jTextField18.getText();
                String Direccion = jTextField19.getText();
                Proveedores pr = new Proveedores(IdProveedores, RUC, Nombre, Telefono, Direccion);
                if (Funcion.equals("Insertar")) {
                    cli.InsertarProveedores(pr);
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                }
                if (Funcion.equals("Modificar")) {
                    cli.ModificarProveedores(pr);
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                }
                frm_Principal.MostrarTabla4();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        Funcion = "";
        HabilitarT3(true);
        Funcion = "Modificar";
        if (jTable3.getSelectedRow() >= 0) {
            ProveedoresDAO pro = new ProveedoresDAO();
            int IdProveedor = Integer.parseInt(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
            String RUC = jTable3.getValueAt(jTable3.getSelectedRow(), 1).toString();
            String NombrePro = jTable3.getValueAt(jTable3.getSelectedRow(), 2).toString();
            String Telefono = jTable3.getValueAt(jTable3.getSelectedRow(), 3).toString();
            String Direccion = jTable3.getValueAt(jTable3.getSelectedRow(), 4).toString();
            Proveedores ps = new Proveedores(IdProveedor, RUC, NombrePro, Telefono, Direccion);
            pro.ModificarProveedores(ps);
            SetDatos3(ps);
            MostrarTabla4();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a Modificar");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        if (jTable3.getSelectedRow() >= 0) {
            ProveedoresDAO pro = new ProveedoresDAO();
            int resp = JOptionPane.showConfirmDialog(null, "Desea Eliminar este Proveedor", "Eliminar Proveedor", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                int IdProveedor = Integer.parseInt(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
                String RUC = jTable3.getValueAt(jTable3.getSelectedRow(), 1).toString();
                String NombrePro = jTable3.getValueAt(jTable3.getSelectedRow(), 2).toString();
                String Telefono = jTable3.getValueAt(jTable3.getSelectedRow(), 3).toString();
                String Direccion = jTable3.getValueAt(jTable3.getSelectedRow(), 4).toString();
                Proveedores ps = new Proveedores(IdProveedor, RUC, NombrePro, Telefono, Direccion);
                pro.EliminarProveedores(ps);
                MostrarTabla4();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        HabilitarT3(false);
        jTextField11.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        frmIVentas frm = new frmIVentas("Insertar");
        frm.setVisible(true);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if (jTable4.getSelectedRow() >= 0) {
            Inventario_VentasDAO iv = new Inventario_VentasDAO();

            int CodigoPV = Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
            int IdCliente = Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString());
            String Pelicula = jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString();
            String Proveedor = jTable4.getValueAt(jTable4.getSelectedRow(), 3).toString();
            int Unidades = Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 4).toString());
            double Precio = Double.parseDouble(jTable4.getValueAt(jTable4.getSelectedRow(), 5).toString());

            String fechaString = jTable4.getValueAt(jTable4.getSelectedRow(), 6).toString();
            java.util.Date utilDate;
            try {
                utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaString);
            } catch (ParseException e) {
                e.printStackTrace();
                return;
            }
            java.sql.Date FechaV = new java.sql.Date(utilDate.getTime());

            Inventario_Ventas inv = new Inventario_Ventas(CodigoPV, IdCliente, Pelicula, Proveedor, Unidades, Precio, utilDate);
            frmIVentas ven = new frmIVentas("Modificar");
            ven.SetDatos(inv);
            ven.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a Modificar");
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if (jTable4.getSelectedRow() >= 0) {
            Inventario_VentasDAO iv = new Inventario_VentasDAO();
            int resp = JOptionPane.showConfirmDialog(null, "Desea Eliminar este Registro", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                int CodigoPV = Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
                int IdCliente = Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString());
                String Pelicula = jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString();
                String Proveedor = jTable4.getValueAt(jTable4.getSelectedRow(), 3).toString();
                int Unidades = Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 4).toString());
                double Precio = Double.parseDouble(jTable4.getValueAt(jTable4.getSelectedRow(), 5).toString());

                String fechaString = jTable4.getValueAt(jTable4.getSelectedRow(), 6).toString();
                java.util.Date utilDate;
                try {
                    utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaString);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return;
                }
                java.sql.Date FechaV = new java.sql.Date(utilDate.getTime());

                Inventario_Ventas inv = new Inventario_Ventas(CodigoPV, IdCliente, Pelicula, Proveedor, Unidades, Precio, utilDate);
                iv.EliminarIventarioV(inv);
                MostrarTabla5();
                JOptionPane.showMessageDialog(null, "Registro Eliminado con Exito");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        if (jTable4.getSelectedRow() >= 0) {
            frmInterfazFacturaV frm = new frmInterfazFacturaV();
            frm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se selecciono ningun registro");
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        ExportarExcel obj;
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(jTable4);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        if (jTable5.getSelectedRow() >= 0) {
            frmInterfazFacturaR frm = new frmInterfazFacturaR();
            frm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se selecciono ningun registro");
        }

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        frmIRentas frm = new frmIRentas("Insertar");
        frm.setVisible(true);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        if (jTable5.getSelectedRow() >= 0) {
            Inventario_RentasDAO iv = new Inventario_RentasDAO();
            int CodigoPR = Integer.parseInt(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString());
            int IdCliente = Integer.parseInt(jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString());
            String Pelicula = jTable5.getValueAt(jTable5.getSelectedRow(), 2).toString();
            String Proveedor = jTable5.getValueAt(jTable5.getSelectedRow(), 3).toString();
            int Unidades = Integer.parseInt(jTable5.getValueAt(jTable5.getSelectedRow(), 4).toString());
            double Precio = Double.parseDouble(jTable5.getValueAt(jTable5.getSelectedRow(), 5).toString());

            //FechaAdquision
            String FechaA = jTable5.getValueAt(jTable5.getSelectedRow(), 6).toString();
            java.util.Date utilDate;
            try {
                utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(FechaA);
            } catch (ParseException e) {
                e.printStackTrace();
                return;
            }
            java.sql.Date FechaAd = new java.sql.Date(utilDate.getTime());

            //FechaDevolucion
            String fechaD = jTable5.getValueAt(jTable5.getSelectedRow(), 7).toString();
            java.util.Date utilDate_;
            try {
                utilDate_ = new SimpleDateFormat("yyyy-MM-dd").parse(fechaD);
            } catch (ParseException e) {
                e.printStackTrace();
                return;
            }
            java.sql.Date FechaDe = new java.sql.Date(utilDate_.getTime());

            Inventario_Rentas inv = new Inventario_Rentas(CodigoPR, IdCliente, Pelicula, Proveedor, Unidades, Precio, utilDate, utilDate_);
            frmIRentas ven = new frmIRentas("Modificar");
            ven.SetDatos(inv);
            ven.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a Modificar");
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        if (jTable5.getSelectedRow() >= 0) {
            Inventario_RentasDAO iv = new Inventario_RentasDAO();
            int resp = JOptionPane.showConfirmDialog(null, "Desea Eliminar este Registro", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                int CodigoPR = Integer.parseInt(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString());
                int IdCliente = Integer.parseInt(jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString());
                String Pelicula = jTable5.getValueAt(jTable5.getSelectedRow(), 2).toString();
                String Proveedor = jTable5.getValueAt(jTable5.getSelectedRow(), 3).toString();
                int Unidades = Integer.parseInt(jTable5.getValueAt(jTable5.getSelectedRow(), 4).toString());
                double Precio = Double.parseDouble(jTable5.getValueAt(jTable5.getSelectedRow(), 5).toString());

                //FechaAdquision
                String FechaA = jTable5.getValueAt(jTable5.getSelectedRow(), 6).toString();
                java.util.Date utilDate;
                try {
                    utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(FechaA);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return;
                }
                java.sql.Date FechaAd = new java.sql.Date(utilDate.getTime());

                //FechaDevolucion
                String fechaD = jTable5.getValueAt(jTable5.getSelectedRow(), 7).toString();
                java.util.Date utilDate_;
                try {
                    utilDate_ = new SimpleDateFormat("yyyy-MM-dd").parse(fechaD);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return;
                }
                java.sql.Date FechaDe = new java.sql.Date(utilDate_.getTime());

                Inventario_Rentas inv = new Inventario_Rentas(CodigoPR, IdCliente, Pelicula, Proveedor, Unidades, Precio, utilDate, utilDate_);
                iv.EliminarIventarioR(inv);
                MostrarTabla6();
                JOptionPane.showMessageDialog(null, "Registro Eliminado con Exito");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        frmDRentas frm = new frmDRentas("Insertar");
        frm.setVisible(true);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        if (jTable6.getSelectedRow() >= 0) {
            Devolucion_RentasDAO iv = new Devolucion_RentasDAO();
            int IDR = Integer.parseInt(jTable6.getValueAt(jTable6.getSelectedRow(), 0).toString());
            int CodigoPr = Integer.parseInt(jTable6.getValueAt(jTable6.getSelectedRow(), 1).toString());
            String Pelicula = jTable6.getValueAt(jTable6.getSelectedRow(), 2).toString();
            int Unidades = Integer.parseInt(jTable6.getValueAt(jTable6.getSelectedRow(), 3).toString());
            double Precio = Double.parseDouble(jTable6.getValueAt(jTable6.getSelectedRow(), 4).toString());
            double PagoI = Double.parseDouble(jTable6.getValueAt(jTable6.getSelectedRow(), 5).toString());
            //FechaEntrega
            String FechaA = jTable6.getValueAt(jTable6.getSelectedRow(), 6).toString();
            java.util.Date utilDate;
            try {
                utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(FechaA);
            } catch (ParseException e) {
                e.printStackTrace();
                return;
            }
            java.sql.Date FechaAd = new java.sql.Date(utilDate.getTime());

            //FechaDevolucion
            String fechaD = jTable6.getValueAt(jTable6.getSelectedRow(), 7).toString();
            java.util.Date utilDate_;
            try {
                utilDate_ = new SimpleDateFormat("yyyy-MM-dd").parse(fechaD);
            } catch (ParseException e) {
                e.printStackTrace();
                return;
            }
            java.sql.Date FechaDe = new java.sql.Date(utilDate_.getTime());
            Devolucion_Rentas inv = new Devolucion_Rentas(IDR, CodigoPr, Pelicula, Unidades, Precio, PagoI, utilDate, utilDate);
            frmDRentas ven = new frmDRentas("Modificar");
            ven.SetDatos(inv);
            ven.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a Modificar");
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        if (jTable6.getSelectedRow() >= 0) {
            Devolucion_RentasDAO iv = new Devolucion_RentasDAO();
            int resp = JOptionPane.showConfirmDialog(null, "Desea Eliminar este Registro", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                int IDR = Integer.parseInt(jTable6.getValueAt(jTable6.getSelectedRow(), 0).toString());
                int CodigoPr = Integer.parseInt(jTable6.getValueAt(jTable6.getSelectedRow(), 1).toString());
                String Pelicula = jTable6.getValueAt(jTable6.getSelectedRow(), 2).toString();
                int Unidades = Integer.parseInt(jTable6.getValueAt(jTable6.getSelectedRow(), 3).toString());
                double Precio = Double.parseDouble(jTable6.getValueAt(jTable6.getSelectedRow(), 4).toString());
                double PagoI = Double.parseDouble(jTable6.getValueAt(jTable6.getSelectedRow(), 5).toString());
                //FechaEntrega
                String FechaA = jTable6.getValueAt(jTable6.getSelectedRow(), 6).toString();
                java.util.Date utilDate;
                try {
                    utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(FechaA);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return;
                }
                java.sql.Date FechaAd = new java.sql.Date(utilDate.getTime());

                //FechaDevolucion
                String fechaD = jTable6.getValueAt(jTable6.getSelectedRow(), 7).toString();
                java.util.Date utilDate_;
                try {
                    utilDate_ = new SimpleDateFormat("yyyy-MM-dd").parse(fechaD);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return;
                }
                java.sql.Date FechaDe = new java.sql.Date(utilDate_.getTime());
                Devolucion_Rentas inv = new Devolucion_Rentas(IDR, CodigoPr, Pelicula, Unidades, Precio, PagoI, utilDate, utilDate);
                iv.EliminarDevolucionR(inv);
                MostrarTabla7();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        ExportarExcel obj;
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(jTable6);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        if (jTable6.getSelectedRow() >= 0) {
            frmInterfazFacturaD frm = new frmInterfazFacturaD();
            frm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se selecciono ningun registro");
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

//FlatArcDarkIJTheme()
//FlatCarbonIJTheme()
//FlatMaterialDeepOceanIJTheme()
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
                new frm_Principal("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable3;
    public static javax.swing.JTable jTable4;
    public static javax.swing.JTable jTable5;
    public static javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
