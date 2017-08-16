/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static conexion.BDSentencias.mostrarUXId;
import controlador.ControladorGeneral;
import controlador.ControladorVistaAyMU;
import controlador.ControladorVistaIngreso;
import controlador.ControladorVistaMLib;
import controlador.ControladorVistaPrincipal;
//import controlador.ControladorVista;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author jeron
 */
public class MUsu extends javax.swing.JFrame {

    //SE DECLARAN LOS CONTROLADORES NECESARIOS
    private ControladorGeneral ConG;
    private ControladorVistaAyMU ConAYMU;
    private ControladorVistaIngreso ConIn;
    //SE DECLARAN LOS OBJETOS
    private AyMUsuario AYMU;
    private MLib MLib;
    private Ingreso Ing;
    //SE DECLARAN LAS VARIABLES
    private boolean bandera;
    private Long id;
    private Long idU;
    private int aux = 0;

    //CONSTRUCTOR VACIO
    public MUsu() {
        initComponents();

    }

    //CONSTRUCTOR UTILIZADO PARA ABRIR MOSTRAR USUARIO DESDE AGREGAR Y MODIFICAR USUARIO
    public MUsu(AyMUsuario AYMU, boolean bandera, Long id, Long idU) {
        initComponents();
        //SE INICIALIZAN LAS VARIABLES CON LOS DATOS RECIBIDOS
        this.AYMU = AYMU;
        this.bandera = bandera;
        this.id = id;
        this.idU = idU;
        //SE DIMENSIONA LA PANTALLA Y SE CARGA EL ICONO
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //SE DECLARAN VARIABLES PARA RECIBIR LOS DATOS 
        String[] resultado = new String[6];
        String[] Id = {id.toString()};
        //SE INICIALIZA EL CONTROLADOR GENERAL
        ConG = new ControladorGeneral();
        //SE LLAMA AL METODO PARA CARGAR LOS DATOS ENCONTRADOS CON ESE ID
        resultado = ConG.mostrarFormulario(mostrarUXId, Id);
        //SE INICIALIZAN LAS VARIABLES
        txtNombre.setText(resultado[2]);
        txtApellido.setText(resultado[3]);
        txtDomicilio.setText(resultado[5]);
        txtTelefono.setText(resultado[4]);
        //SE PONEN INVICIBLES LOS TXT DE CONTRASEÑA Y DE CONFIRMACION ADEMAS DE LOS SEPARADORES
        txtConfirmacion.setVisible(false);
        txtContraseña.setVisible(false);
        lblContraseña.setVisible(false);
        lblConfirmacion.setVisible(false);
        SepConf.setVisible(false);
        SepCont.setVisible(false);
        //SE DECLARAN VARIABLES PARA SACAR EL NOMBRE DEL USUARIO QUE INGRESO AL PROGRAMA POR MEDIO DEL ID
        String[] resultado2 = new String[6];
        String[] Id2 = {idU.toString()};
        //SE LLAMA AL METODO PARA MOSTRAR LOS DATOS RECIBIDOS
        resultado2 = ConG.mostrarFormulario(mostrarUXId, Id2);
        //SE CARGA EL TXT DEL USUARIO CON SU NOMBRE DE USUARIO
        txtUsuario.setText(resultado2[1]);

    }

    //CONSTRUCTOR QUE ABRE LA PANTALLA MOSTRAR USUARIO DESDE MOSTRAR LIBRO
    public MUsu(MLib MLib, boolean bandera, Long id, Long idU) {
        initComponents();
        //SE INICIALIZAN LAS VARIABLES CON LOS DATOS RECIBIDOS
        this.MLib = MLib;
        this.bandera = bandera;
        this.id = id;
        this.idU = idU;
        //SE DIMENSIONA LA PANTALLA Y SE AGREGA EL ICONO
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //SE ASIGNA EL VALOR 1 A LA VARIABLE AUX (SIRVE DE MARCA)
        aux = 1;
        //SE DECLARAN VARIABLES NECESARIAS PARA RECIBIR LOS DATOS A CARGAR EN LOS TXT
        String[] resultado = new String[6];
        String[] Id = {id.toString()};
        //SE INICIALIZA EL CONTROLADOR GENERAL
        ConG = new ControladorGeneral();
        //SE LLAMA AL METODO PARA RECIBIR LOS DATOS DEL ID DEL USUARIO QUE INGRESO AL PROGRAMA
        resultado = ConG.mostrarFormulario(mostrarUXId, Id);
        //SE CARGAN LOS TXT CON LOS DATOS RECIBIDOS
        txtNombre.setText(resultado[2]);
        txtApellido.setText(resultado[3]);
        txtDomicilio.setText(resultado[5]);
        txtTelefono.setText(resultado[4]);
        //SE ESCONDEN LOS TXT Y LOS LBL DE CONTRASEÑA Y CONFIRMACION ADEMAS DE  LOS SEPARADORES
        txtConfirmacion.setVisible(false);
        txtContraseña.setVisible(false);
        lblContraseña.setVisible(false);
        lblConfirmacion.setVisible(false);
        SepConf.setVisible(false);
        SepCont.setVisible(false);
        //SE CREAN VARIABLES NECESARIAS PARA RECIBIR LOS DATOS DEL USUARIO QUE INGRESO AL PROGRAMA
        String[] resultado2 = new String[6];
        String[] Id2 = {idU.toString()};
        //SE LLAMA AL METODO PARA TRAER EL NOMBRE DEL USUARIO CON EL ID DE LA PERSONA QUE INGRESO AL PROGRAMA
        resultado2 = ConG.mostrarFormulario(mostrarUXId, Id2);
        //SE CARGA LOS DATOS RECIBIDOS EN EL TXT USUARIO
        txtUsuario.setText(resultado2[1]);

    }

    //CONSTRUCTOR PARA ABRIR LA PANTALLA MOSTRAR USUARIO DESDE PANTALLA INGRESO
    public MUsu(Ingreso Ing, boolean bandera, Long id, Long idU) {
        initComponents();
        //SE INICIALIZAN LAS VARIABLES CON LOS DATOS RECIBIDOS
        this.Ing = Ing;
        this.bandera = bandera;
        this.id = id;
        this.idU = idU;
        //SE DIMENSIONA LA PANTALLA Y SE CARGA EL ICONO
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //SE DECLARAN VARIABLES NECESARIAS PARA BUSCAR LOS DATOS DEL USUARIO PARA CARGARLOS EN LOS TXT
        String[] resultado = new String[6];
        String[] Id = {id.toString()};
        //SE INICIALIZA EL CONTROLADOR GENERAL
        ConG = new ControladorGeneral();
        //SE LLAMA AL METODO PARA RECIBIR LOS DATOS DEL USUARIO
        resultado = ConG.mostrarFormulario(mostrarUXId, Id);
        //SE CARGAN LOS TXT CON LOS DATOS RECIBIDOS
        txtNombre.setText(resultado[2]);
        txtApellido.setText(resultado[3]);
        txtDomicilio.setText(resultado[5]);
        txtTelefono.setText(resultado[4]);
        txtUsuario.setText(resultado[1]);
        //SE ESCONDEN LOS TXT DE CONFIRMACION Y CONTRASEÑAS MAS SUS LBL Y LOS SEPARADORES
        txtConfirmacion.setVisible(false);
        txtContraseña.setVisible(false);
        lblContraseña.setVisible(false);
        lblConfirmacion.setVisible(false);
        SepConf.setVisible(false);
        SepCont.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblConfirmacion = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        txtContraseña = new javax.swing.JPasswordField();
        SeparadorUsuario = new javax.swing.JSeparator();
        SepCont = new javax.swing.JSeparator();
        SepConf = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Unico de Libros Familiares");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 1, 24))); // NOI18N
        jPanel2.setOpaque(false);

        txtUsuario.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUsuario.setEnabled(false);
        txtUsuario.setOpaque(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        lblUsuario.setText("Usuario : ");

        lblContraseña.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        lblContraseña.setText("Contraseña : ");

        lblConfirmacion.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        lblConfirmacion.setText("Confirmacion : ");

        txtConfirmacion.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtConfirmacion.setBorder(null);
        txtConfirmacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtConfirmacion.setEnabled(false);
        txtConfirmacion.setOpaque(false);

        txtContraseña.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtContraseña.setBorder(null);
        txtContraseña.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtContraseña.setEnabled(false);
        txtContraseña.setOpaque(false);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Volver1.png"))); // NOI18N
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Modificar1.png"))); // NOI18N
        btnModificar.setContentAreaFilled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(72, 72, 72)
                        .addComponent(btnVolver))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContraseña)
                            .addComponent(lblConfirmacion)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SepCont)
                            .addComponent(txtContraseña)
                            .addComponent(SeparadorUsuario)
                            .addComponent(txtUsuario)
                            .addComponent(txtConfirmacion)
                            .addComponent(SepConf, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(SepCont, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmacion)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SepConf, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 1, 24))); // NOI18N
        jPanel1.setOpaque(false);

        txtApellido.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtApellido.setBorder(null);
        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellido.setEnabled(false);
        txtApellido.setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        lblNombre.setText("Nombre : ");

        lblApellido.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        lblApellido.setText("Apellido : ");

        lblDomicilio.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        lblDomicilio.setText("Domicilio : ");

        lblTelefono.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        lblTelefono.setText("Telefono : ");

        txtDomicilio.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtDomicilio.setBorder(null);
        txtDomicilio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDomicilio.setEnabled(false);
        txtDomicilio.setOpaque(false);

        txtTelefono.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.setEnabled(false);
        txtTelefono.setOpaque(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setEnabled(false);
        txtNombre.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDomicilio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(5, 5, 5)
                                .addComponent(txtNombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDomicilio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(lblDomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleParent(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //CUANDO SE CLICKEA EL BOTON MODIFICAR
        //SE INICIALIZA EL CONTROLADOR DE AGREGAR Y MODIFICAR USUARIO
        ConAYMU = new ControladorVistaAyMU();
        //SE LLAMA AL METODO PARA ABRIR LA PANTALLA AGREGAR Y MODIFICAR USUARIO
        ConAYMU.Start(this, true, id, idU);
        //SE CIERRA LA PANTALLA MOSTRAR USUARIO
        this.setVisible(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //SE CLICKEA EL BOTON VOLVER
        if (aux == 1) {//SI LA MARCA ES 1
            //SE ABRE LA PANTALLA MOSTRAR LIBRO
            MLib.setVisible(true);
            //SE CIERRALA PANTALLA MOSTRAR USUARIO
            this.setVisible(false);
        } else {//SI LA MARCA NO ES UNO
            //SE INICIALIZA EL CONTROLADOR DE PANTALLA INGRESO
            ConIn = new ControladorVistaIngreso();
            //SE LLAMA AL METODO PARA ABRIR LA PANTALLA INGRESO
            ConIn.Start(idU);
            //SE CIERRA LA PANTALLA MOSTRAR USUARIO
            this.setVisible(false);
        }


    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SepConf;
    private javax.swing.JSeparator SepCont;
    private javax.swing.JSeparator SeparadorUsuario;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblConfirmacion;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
