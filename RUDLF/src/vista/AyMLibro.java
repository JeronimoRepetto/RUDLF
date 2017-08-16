/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.BDSentencias;
import static conexion.BDSentencias.mostrarXId;
import controlador.ControladorGeneral;
import controlador.ControladorLibro;
import controlador.ControladorVistaAyML;
import controlador.ControladorVistaAyMU;
import controlador.ControladorVistaIngreso;
import java.awt.Dimension;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeron
 */
public class AyMLibro extends javax.swing.JFrame implements BDSentencias {

    //CONTROLADORES USADOS
    private ControladorGeneral ConG;
    private ControladorVistaAyMU ConAYMU;
    private ControladorVistaIngreso ConIn;
    private ControladorVistaAyML ConAYML;
    private ControladorLibro ConL;
    //VISTAS USADAS
    private Ingreso refI;
    private AyMUsuario refAYMU;
    private MLib refMLib;
    //VARIABLES
    private boolean bandera = true;
    private Long id;
    private Long idU;

    //CONSTRUCTORES
    public AyMLibro() {
        initComponents();
        //SE COLOCA EL ICONO EN LA VENTANA
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //METODO LLAMADO PARA ELMINAR ITEMS DE LOS BOX
        eliminarItems();
        //METODO PARA CARGAR LOS BOX
        llamarPyU();

    }

    //CONSTRUCTOR QUE SE CREA CUANDO ES LLAMDO DESDE LA VISTA INGRESO
    public AyMLibro(Ingreso refI, boolean bandera, Long id, Long idU) { //ENVIA VERDADERO
        initComponents();
        //SE PASAN LOS DATOS A LAS VARIABLES DECLARADAS
        this.refI = refI;
        this.bandera = bandera;
        this.id = id;
        this.idU = idU;
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        //SE COLOCA EL ICONO EN LA VENTANA
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //METODO LLAMADO PARA ELMINAR ITEMS DE LOS BOX
        eliminarItems();
        //METODO PARA CARGAR LOS BOX
        llamarPyU();
        //SI LA BANDERA ES VERDADERA
        if (bandera == false) {
            //SE CREAN VARIABLES NECESARIAS PARA CARGAR LOS DATOS EN LOS TXT
            String[] resultado = new String[18];
            String[] Id = {id.toString()};
            //SE INICIALIZA EL CONTROLADOR GENERAL
            ConG = new ControladorGeneral();
            //SE LLAMA AL METODO PARA MOSTRAR LOS DATOS
            resultado = ConG.mostrarFormulario(mostrarXId, Id);
            //SE CARGAN LOS DATOS
            txtTitulo.setText(resultado[1]);
            txtTituloO.setText(resultado[2]);
            txtAutor.setText(resultado[3]);
            txtAño.setText(resultado[4]);
            txtOrigen.setText(resultado[5]);
            txtGenero.setText(resultado[6]);
            txtTema.setText(resultado[7]);
            boxVM.setSelectedItem(resultado[8]);
            boxCalificacion.setSelectedItem(resultado[9]);
            txtComentario.setText(resultado[10]);
            txtISBN.setText(resultado[11]);
            txtEditorial.setText(resultado[12]);
            txtNumero.setText(resultado[13]);
            txtAñoE.setText(resultado[14]);
            txtLugar.setText(resultado[15]);
            txtTraduccion.setText(resultado[16]);
            txtUbicacion.setSelectedItem(resultado[17]);
            txtPropietario.setSelectedItem(resultado[18]);
        } else {

        }

    }

    //CONSTRUCTOR QUE SE CREA CUANDO ES LLAMADO DESDE LA VISTA MLib (MOSTRAR LIBRO)
    public AyMLibro(MLib refMLib, boolean bandera, Long id, Long idU) {// envia falso
        initComponents();
        //SE PASAN LOS DATOS A LAS VARIABLES DECLARADAS
        this.refMLib = refMLib;
        this.bandera = bandera;
        this.id = id;
        this.idU = idU;
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        //SE COLOCA EL ICONO EN LA VENTANA
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //METODO LLAMADO PARA ELMINAR ITEMS DE LOS BOX
        eliminarItems();
        //SE LLAMA AL METODO PARA RELLENAR LOS BOX
        llamarPyU();
        //SE DECLARAN VARIABLES NECESARIAS PARA CARGAR LOS DATOS EN LOS TXT
        String[] resultado = new String[18];
        String[] Id = {id.toString()};
        //SE INICIALIZA EL CONTROLADOR GENERAL
        ConG = new ControladorGeneral();
        //SE LLAMA AL METODO PARA MOSTRAR LOS DATOS
        resultado = ConG.mostrarFormulario(mostrarXId, Id);
        //SE CARGAN LOS DATOS
        txtTitulo.setText(resultado[1]);
        txtTituloO.setText(resultado[2]);
        txtAutor.setText(resultado[3]);
        txtAño.setText(resultado[4]);
        txtOrigen.setText(resultado[5]);
        txtGenero.setText(resultado[6]);
        txtTema.setText(resultado[7]);
        boxVM.setSelectedItem(resultado[8]);
        boxCalificacion.setSelectedItem(resultado[9]);
        txtComentario.setText(resultado[10]);
        txtISBN.setText(resultado[11]);
        txtEditorial.setText(resultado[12]);
        txtNumero.setText(resultado[13]);
        txtAñoE.setText(resultado[14]);
        txtLugar.setText(resultado[15]);
        txtTraduccion.setText(resultado[16]);
        txtUbicacion.setSelectedItem(resultado[17]);
        txtPropietario.setSelectedItem(resultado[18]);

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
        lblTitulo = new javax.swing.JLabel();
        lblTituloO = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblTema = new javax.swing.JLabel();
        lblVM = new javax.swing.JLabel();
        lblCalificacion = new javax.swing.JLabel();
        lblComentario = new javax.swing.JLabel();
        txtTituloO = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtTema = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        boxVM = new javax.swing.JComboBox<>();
        boxCalificacion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblISBN = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblAñoE = new javax.swing.JLabel();
        lblLugar = new javax.swing.JLabel();
        lblTraduccion = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtAñoE = new javax.swing.JTextField();
        txtTraduccion = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtPropietario = new javax.swing.JComboBox<>();
        txtUbicacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Unico de Libros Familiares");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Obra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblTitulo.setText("Titulo : ");

        lblTituloO.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloO.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblTituloO.setText("Titulo O: ");

        lblAutor.setBackground(new java.awt.Color(255, 255, 255));
        lblAutor.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblAutor.setText("Autor: ");

        lblAño.setBackground(new java.awt.Color(255, 255, 255));
        lblAño.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblAño.setText("Año : ");

        lblOrigen.setBackground(new java.awt.Color(255, 255, 255));
        lblOrigen.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblOrigen.setText("Origen : ");

        lblGenero.setBackground(new java.awt.Color(255, 255, 255));
        lblGenero.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblGenero.setText("Genero : ");

        lblTema.setBackground(new java.awt.Color(255, 255, 255));
        lblTema.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblTema.setText("Tema : ");

        lblVM.setBackground(new java.awt.Color(255, 255, 255));
        lblVM.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblVM.setText("VM : ");

        lblCalificacion.setBackground(new java.awt.Color(255, 255, 255));
        lblCalificacion.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblCalificacion.setText("Calificacion : ");

        lblComentario.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblComentario.setText("Comentario : ");

        txtTituloO.setBackground(new java.awt.Color(0, 0, 0));
        txtTituloO.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtTituloO.setBorder(null);
        txtTituloO.setOpaque(false);
        txtTituloO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloOActionPerformed(evt);
            }
        });

        txtAutor.setBackground(new java.awt.Color(0, 0, 0));
        txtAutor.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtAutor.setBorder(null);
        txtAutor.setOpaque(false);
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        txtTitulo.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtTitulo.setBorder(null);
        txtTitulo.setOpaque(false);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtAño.setBackground(new java.awt.Color(0, 0, 0));
        txtAño.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtAño.setBorder(null);
        txtAño.setOpaque(false);
        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });

        txtOrigen.setBackground(new java.awt.Color(0, 0, 0));
        txtOrigen.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtOrigen.setBorder(null);
        txtOrigen.setOpaque(false);
        txtOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigenActionPerformed(evt);
            }
        });

        txtGenero.setBackground(new java.awt.Color(0, 0, 0));
        txtGenero.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtGenero.setBorder(null);
        txtGenero.setOpaque(false);
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        txtTema.setBackground(new java.awt.Color(0, 0, 0));
        txtTema.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtTema.setBorder(null);
        txtTema.setOpaque(false);
        txtTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemaActionPerformed(evt);
            }
        });

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        txtComentario.setBorder(null);
        txtComentario.setOpaque(false);
        jScrollPane1.setViewportView(txtComentario);

        boxVM.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        boxVM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "LA1", "LA2", "LA3", "LB1", "LB2", "LB3", "LC1", "LC2", "LC3", "PA1", "PA2", "PA3", "PB1", "PB2", "PB3", "PC1", "PC2", "PC3" }));
        boxVM.setBorder(null);
        boxVM.setOpaque(false);

        boxCalificacion.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        boxCalificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "No recomendable", "Bueno", "Recomendable", "Muy recomendable" }));
        boxCalificacion.setBorder(null);
        boxCalificacion.setOpaque(false);
        boxCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCalificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lblAutor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTituloO, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTituloO, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblComentario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCalificacion)
                            .addComponent(lblVM)
                            .addComponent(lblTema)
                            .addComponent(lblGenero)
                            .addComponent(lblOrigen)
                            .addComponent(lblAño))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(boxCalificacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addComponent(boxVM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloO)
                    .addComponent(txtTituloO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVM)
                    .addComponent(boxVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblComentario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edicion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);

        lblISBN.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblISBN.setText("ISBN :");

        lblEditorial.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblEditorial.setText("Editorial :");

        lblNumero.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblNumero.setText("Numero :");

        lblAñoE.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblAñoE.setText("Año :");

        lblLugar.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblLugar.setText("Lugar :");

        lblTraduccion.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        lblTraduccion.setText("Traduccion :");

        txtISBN.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtISBN.setBorder(null);
        txtISBN.setOpaque(false);

        txtNumero.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtNumero.setBorder(null);
        txtNumero.setOpaque(false);

        txtEditorial.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtEditorial.setBorder(null);
        txtEditorial.setOpaque(false);

        txtAñoE.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtAñoE.setBorder(null);
        txtAñoE.setOpaque(false);

        txtTraduccion.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtTraduccion.setBorder(null);
        txtTraduccion.setOpaque(false);

        txtLugar.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtLugar.setBorder(null);
        txtLugar.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTraduccion)
                    .addComponent(lblLugar)
                    .addComponent(lblAñoE)
                    .addComponent(lblNumero)
                    .addComponent(lblEditorial)
                    .addComponent(lblISBN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditorial)
                    .addComponent(txtTraduccion)
                    .addComponent(txtAñoE)
                    .addComponent(txtNumero)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtISBN))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditorial)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAñoE)
                    .addComponent(txtAñoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLugar)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTraduccion)
                    .addComponent(txtTraduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        jLabel1.setText("Ubicacion : ");

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        jLabel2.setText("Propietario : ");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Volver1.png"))); // NOI18N
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Guardar.png"))); // NOI18N
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtPropietario.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtPropietario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo" }));

        txtUbicacion.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPropietario, 0, 230, Short.MAX_VALUE)
                            .addComponent(txtUbicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(836, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemaActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigenActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtTituloOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloOActionPerformed

    private void boxCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCalificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCalificacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //SE DECLARAN LAS VARIABLES NECESARIAS PARA REVISAR LOS DATOS
        String propietarioRef;
        String UbicacionRef;
        //SE CARGAN LAS VARIABLES CON LOS NOMBRES DEL PROPIETARIO Y DE LA UBICACION
        propietarioRef = String.valueOf(txtPropietario.getSelectedItem());
        UbicacionRef = String.valueOf(txtUbicacion.getSelectedItem());
        //SI SE LLEGARA A DETECTAR QUE EN EL txtPropietario , O EN EL txtUbicacion LA PALABRA NUEVO SE LLAMA A CARGAR NUEVO USUARIO 
        if (propietarioRef.equals("Nuevo")) {
            //SE INICIALIZA EL CONTROLADOR
            ConAYMU = new ControladorVistaAyMU();
            //SE LLAMA AL METODO NECESARIO PARA ACTIVAR LA PANTALLA AGREGAR USUARIO
            ConAYMU.Start(this, bandera, id, idU);
            //SE CIERRA ESTA VISTA
            this.setVisible(false);
        } else {
            if (UbicacionRef.equals("Nuevo")) {
                ConAYMU = new ControladorVistaAyMU();
                //SE LLAMA AL METODO NECESARIO PARA ACTIVAR LA PANTALLA AGREGAR USUARIO
                ConAYMU.Start(this, bandera, id, idU);
                //SE CIERRA ESTA VISTA
                this.setVisible(false);
            } else {
                //SI NO SE DETECTO NUEVO EN NINGUN TXT PROPIETARIO NI UBICACION
                //SE GENERAN VARIABLES QUE SE VAN A UTILIZAR PARA GUARDAR EL LIBRO
                String Id, titulo, tituloO, autor, año, origen, genero, tema, VM, calificacion, comentario, ISBN, editorial, numero, añoE, lugarE, traduccion, ubicacion, propietario;
                //SE CARGAN LAS VARIABLES
                Id = String.valueOf(id);
                titulo = txtTitulo.getText();
                tituloO = txtTituloO.getText();
                autor = txtAutor.getText();
                año = txtAño.getText();
                origen = txtOrigen.getText();
                genero = txtGenero.getText();
                tema = txtTema.getText();
                VM = String.valueOf(boxVM.getSelectedItem());
                calificacion = String.valueOf(boxCalificacion.getSelectedItem());
                comentario = txtComentario.getText();
                ISBN = txtISBN.getText();
                editorial = txtEditorial.getText();
                numero = txtNumero.getText();
                añoE = txtAñoE.getText();
                lugarE = txtLugar.getText();
                traduccion = txtTraduccion.getText();
                ubicacion = String.valueOf(txtUbicacion.getSelectedItem());
                propietario = String.valueOf(txtPropietario.getSelectedItem());
                //SE INICIALIZA EL CONTROLADOR DE AGREGAR Y MODIFICAR LIBRO
                ConAYML = new ControladorVistaAyML();
                //SE RELLENAN LOS DATOS VACIOS CON 0 (CERO)
                ConAYML.revicionDatos(numero, ISBN, año, añoE);
                //SI LA BANDERA ES FALSA
                if (bandera == false) {
                    //SE INICIALIZA EL CONTROLADOR NECESARIO
                    ConL = new ControladorLibro();
                    //SE LLAMA AL METODO NECESARIO PARA MODIFICAR LOS DATOS
                    ConL.CargarLibro(false, id, titulo, tituloO, autor, Integer.parseInt(año), origen, genero, tema, VM, calificacion,
                            comentario, Integer.parseInt(ISBN), editorial, Integer.parseInt(numero), Integer.parseInt(añoE), lugarE, traduccion, ubicacion, propietario);

                    //SE MUESTRA EL MENSAJE DE QUE SE A MODIFICADO CORRECTAMENTE
                    JOptionPane.showMessageDialog(null, "SE HA MODIFICADO CON EXITO!", "EXITO", 1);
                    //SE INICIALIZA EL CONTROLADOR NECESARIO
                    ConIn = new ControladorVistaIngreso();
                    //SE EJECUTA EL METODO PARA MOSTRAR LA PANTALLA
                    ConIn.Start(idU);
                    //SE CIERRA LA PANTALLA AGREGAR O MODIFICAR LIBRO
                    this.setVisible(false);
                } else {//SI LA BANDERA ES VERDADERA
                    //SE INICIALIZA EL CONTROLADOR NECESARIO
                    ConL = new ControladorLibro();
                    //SE LLAMA AL METODO NECESARIO PARA GUARDAR LOS DATOS

                    ConL.CargarLibro(true, id, titulo, tituloO, autor, Integer.parseInt(año), origen, genero, tema, VM, calificacion,
                            comentario, Integer.parseInt(ISBN), editorial, Integer.parseInt(numero), Integer.parseInt(añoE), lugarE, traduccion, ubicacion, propietario);
                    //SE MUESTRA MENSAJE DE QUE SE A GUARDADO CORRECTAMENTE
                    JOptionPane.showMessageDialog(null, "SE HA GUARDADO CON EXITO!", "EXITO", 1);
                    //SE INICIALIZA EL CONTROLADOR NECESARIO
                    ConIn = new ControladorVistaIngreso();
                    //SE LLAMA AL METODO PARA MOSTRAR LA PANTALLA
                    ConIn.Start(idU);
                    //SE CIERRA LA PANTALLA AGREGAR O MODIFICAR LIBRO
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (bandera == true) {//SI LA BANDERA ES VERDADERA
            //SE INICIALIZA EL CONTROLADOR NECESARIO
            ConIn = new ControladorVistaIngreso();
            //SE LLAMA AL METODO PARA MOSTRAR LA PANTALLA
            ConIn.Start(idU);
            //SE CIERRA LA PANTALLA AGREGAR O MODIFICAR LIBRO
            this.setVisible(false);
        } else {//SI LA BANDERA ES FALSA
            //SE INICIALIZA EL CONTROLADOR NECESARIO
            ConIn = new ControladorVistaIngreso();
            //SE LLAMA AL METODO PARA MOSTRAR LA PANTALLA
            ConIn.Start(idU);
            //SE CIERRA LA PANTALLA AGREGAR O MODIFICAR LIBRO
            this.setVisible(false);

        }

    }//GEN-LAST:event_btnVolverActionPerformed
    //METODO PARA CARGAR LOS BOX
    public void llamarPyU() {
        ConAYML = new ControladorVistaAyML();
        ArrayList<String> datos;
        datos = ConAYML.CargarPropYUbic(mostrarU);
        for (int i = 0; i < datos.size(); i++) {
            this.txtPropietario.addItem(datos.get(i));
            this.txtUbicacion.addItem(datos.get(i));
        }
    }

    //METODO PARA ELIMINAR ITEMS DE LOS BOX
    public void eliminarItems() {
        txtUbicacion.removeAllItems();
        txtPropietario.removeAllItems();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCalificacion;
    private javax.swing.JComboBox<String> boxVM;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblAñoE;
    private javax.swing.JLabel lblCalificacion;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblLugar;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloO;
    private javax.swing.JLabel lblTraduccion;
    private javax.swing.JLabel lblVM;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtAñoE;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JComboBox<String> txtPropietario;
    private javax.swing.JTextField txtTema;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTituloO;
    private javax.swing.JTextField txtTraduccion;
    private javax.swing.JComboBox<String> txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
