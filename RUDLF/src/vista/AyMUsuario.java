/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.BDSentencias;
import controlador.ControladorGeneral;
import controlador.ControladorUsuario;
import controlador.ControladorVistaAyML;
import controlador.ControladorVistaAyMU;
import controlador.ControladorVistaMUsu;
import controlador.ControladorVistaPrincipal;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jeron
 */
//AGREGAR Y MODIFICAR USUARIOS
public class AyMUsuario extends javax.swing.JFrame implements BDSentencias {

    //DECLARACION DE CONTROLADORES
    private ControladorUsuario ConU;
    private ControladorGeneral ConG;
    private ControladorVistaAyMU ConV;
    private ControladorVistaPrincipal ConVP;
    private ControladorVistaMUsu ConMUsu;
    private ControladorVistaAyML ConAYML;
    //DECLARACION DE OBJETOS
    private MUsu refMU;
    private AyMLibro refAYML;
    //DECLARACION DE VARIABLES
    private boolean bandera;
    private int aux = 0;
    private Long id;
    private Long idU;
    private String Contraseña, Usuario;

    //CONSTRUCTORES
    public AyMUsuario() {
        initComponents();
        //SE DECLARA EL TAMAÑO DE LA VENTANA Y SE CARGA EL ICONO
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());

    }

    //CONSTRUCTOR CUANDO ES LLAMADO DESDE AGREGAR Y MODIFICAR LIBRO
    public AyMUsuario(AyMLibro refAYML, boolean bandera, Long id, Long idU) {
        initComponents();
        //SE ASIGNAN LOS DATOS A LAS VARIABLES
        this.refAYML = refAYML;
        this.bandera = bandera;
        this.id = id;
        this.idU = idU;
        //SE DECLARA EL TAMAÑO DE LA VENTANA Y SE CARGA EL ICONO
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //SE ASIGNA EL VALOR A LA VARIABLE AUX SIRVE DE MARCA
        this.aux = 1;
        //SE DECLARAN VARIABLES NECESARIAS PARA PASAR LOS DATOS A LOS TXT
        String[] resultado2 = new String[6];
        String[] Id2 = {idU.toString()};
        //SE INICIALIZA EL CONTROLADOR GENERAL
        ConG = new ControladorGeneral();
        //SE LLAMA AL METODO PARA MOSTRAR EL USUARIO POR ID
        resultado2 = ConG.mostrarFormulario(mostrarUXId, Id2);
        txtUsuario.setText(resultado2[1]);
        txtConfirmacion.setVisible(false);
        txtContraseña.setVisible(false);
        lblContraseña.setVisible(false);
        lblConfirmacion.setVisible(false);
        SepConf.setVisible(false);
        SepCont.setVisible(false);
        txtUsuario.setEditable(false);
    }

    //CONSTRUCTOR CUANDO ES LLAMADO DESDE AGREGAR Y MOSTRAR LIBRO
    public AyMUsuario(MUsu refMU, boolean bandera, Long id, Long idU) {
        initComponents();
        //SE ASIGNAN LOS DATOS A LAS VARIABLES
        this.refMU = refMU;
        this.bandera = bandera;
        this.id = id;
        this.idU = idU;
        //SE DECLARA EL TAMAÑO DE LA VENTANA Y SE CARGA EL ICONO
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //SE VERIFICA SI LA BANDERA ES VERDADERA O FALSA
        if (bandera == true) {//SE VA A LA VENTANA DE MODIFICACIONES DEL USUARIO QUE INGRESO AL PROGRAMA
            if (id.equals(idU)) {
                String[] resultado = new String[6];
                String[] Id = {id.toString()};
                ConG = new ControladorGeneral();
                resultado = ConG.mostrarFormulario(mostrarUXId, Id);
                txtNombre.setText(resultado[2]);
                txtApellido.setText(resultado[3]);
                txtDomicilio.setText(resultado[5]);
                txtTelefono.setText(resultado[4]);
                txtUsuario.setText(resultado[1]);
                Contraseña = (resultado[6]);
                txtContraseña.setText("");
                txtUsuario.setEditable(false); // NO SE PUEDE MODIFICAR EL USUARIO

            } else {// SE VA A LA VENTANA DE MODIFICACIONES DEL USUARIO QUE FIGURA COMO PROPIETARIO O UBICACION DEL LIBRO
                String[] resultado = new String[6];
                String[] Id = {id.toString()};
                ConG = new ControladorGeneral();
                resultado = ConG.mostrarFormulario(mostrarUXId, Id);
                txtNombre.setText(resultado[2]);
                txtApellido.setText(resultado[3]);
                txtDomicilio.setText(resultado[5]);
                txtTelefono.setText(resultado[4]);
                Usuario = (resultado[1]);
                Contraseña = (resultado[6]);
                String[] resultado2 = new String[6];
                String[] Id2 = {idU.toString()};
                resultado2 = ConG.mostrarFormulario(mostrarUXId, Id2);
                txtUsuario.setText(resultado2[1]);
                txtConfirmacion.setVisible(false);
                txtContraseña.setVisible(false);
                lblContraseña.setVisible(false);
                lblConfirmacion.setVisible(false);
                SepConf.setVisible(false);
                SepCont.setVisible(false);
                txtUsuario.setEditable(false);//NO SE PUEDE MODIFICAR EL USUARIO

            }
        }

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
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblConfirmacion = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        SepCont = new javax.swing.JSeparator();
        SepConf = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Unico de Libros Familiares");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 1, 24))); // NOI18N
        jPanel1.setOpaque(false);

        txtApellido.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtApellido.setBorder(null);
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
        txtDomicilio.setOpaque(false);

        txtTelefono.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtNombre.setBorder(null);
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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 1, 24))); // NOI18N
        jPanel2.setOpaque(false);

        txtUsuario.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtUsuario.setBorder(null);
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
        txtConfirmacion.setOpaque(false);

        txtContraseña.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtContraseña.setBorder(null);
        txtContraseña.setOpaque(false);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Guardar.png"))); // NOI18N
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Volver1.png"))); // NOI18N
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
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
                        .addComponent(btnGuardar)
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
                            .addComponent(jSeparator5)
                            .addComponent(txtUsuario)
                            .addComponent(txtConfirmacion)
                            .addComponent(SepConf, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(108, 108, 108)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.aux == 1) {//SI LA MARCA ES 1 SE VA A CREAR UN NUEVO USUARIO

            ConU = new ControladorUsuario();
            ConVP = new ControladorVistaPrincipal();
            ConV = new ControladorVistaAyMU();
            boolean respuesta;

            String nombre, apellido, usuario, domicilio, contraseña, comparacion, telefono;
            nombre = txtNombre.getText();
            apellido = txtApellido.getText();
            //METODO PARA VERIFICAR QUE EL NOMBRE Y EL APELLIDO SE HAYAN COMPLETADO
            respuesta = ConV.SeCompletoNombreYApellido(nombre, apellido);
            if (respuesta == true) {//SI ESTAN COMPLETADOS
                //SE CARGAN LAS DEMAS VARIABLES CON LOS DATOSO NECESARIOS
                usuario = txtUsuario.getText();
                domicilio = txtDomicilio.getText();
                contraseña = String.valueOf(txtContraseña.getPassword());
                comparacion = String.valueOf(txtConfirmacion.getPassword());
                telefono = txtTelefono.getText();
                //SE CREA UN NUEVO USUARIO
                ConU.CargarUsuario(null, "", nombre, apellido, telefono, domicilio, "");
                //SE INFORMA QUE SE HA CREADO UN USUARIO EXITOSAMENTE
                JOptionPane.showMessageDialog(this, "SE CREO USUARIO CORRECTAMENTE", "EXITO", 1);
                //SE LLAMA AL METODO PARA ELIMINAR LOS ITEMS DE LOS BOX
                refAYML.eliminarItems();
                //SE LLAMA AL METODO PARA CARGAR NUEVAMENTE LOS BOX
                refAYML.llamarPyU();
                //SE VISIALIZA LA PANTALLA AGREGAR Y MODIFICAR LIBRO
                refAYML.setVisible(true);
                //SE CIERRA PANTALLA AGREGAR Y MODIFICAR USUARIO
                this.setVisible(false);

            }

        } else {//SI AUX(LA MARCA NO ES 1)
            if (bandera == true) {//SI LA BANDERA ES VERDADERA SE INGRESA A MODIFICAR EL USUARIO QUE INGRESO AL PROGRAMA
                // SE INICIALIZA EL CONTROLADOR VISTA AGREGAR Y MODIFICAR USUARIO
                ConV = new ControladorVistaAyMU();
                //SE DECLARAN VARIABLES NECESARIAS PARA LA MODIFICACION
                String nombre, apellido, usuario, domicilio, contraseña, comparacion, telefono;
                int marca;
                boolean respuesta;
                //SE INICIALIZAN LAS VARIABLES STRING
                nombre = txtNombre.getText();
                apellido = txtApellido.getText();
                usuario = txtUsuario.getText();
                domicilio = txtDomicilio.getText();
                contraseña = String.valueOf(txtContraseña.getPassword());
                comparacion = String.valueOf(txtConfirmacion.getPassword());
                telefono = txtTelefono.getText();
                //SE LLAMA AL METODO PARA VER QUE SI SE HA MODIFICADO NOMBRE Y APELLIDO NO SE DEJE VACIO
                respuesta = ConV.SeCompletoNombreYApellido(nombre, apellido);
                if (respuesta == true) {//SI NO QUEDARON VACIOS
                    //SE VERIFICA SI EL ID DEL QUE INGRESO AL PROGRAMA ES IGUAL QUE EL ID DEL USUARIO EN LA VENTANA DE MODIFICACIONES
                    if (id.equals(idU)) {
                        if ((contraseña.equals(""))) {//SI LA CONTRASEÑA QUEDA VACIA DESPUES DE LA MODIFICACION 
                            //SE INFORMA QUE NO PUEDE QUEDAR LA CONTRASEÑA SIN ESCRIBIR
                            JOptionPane.showMessageDialog(this, "COLOQUE SU CONTRASEÑA PARA CONTINUAR, O UNA NUEVA CONTRASEÑA SI DESEA MODIFICARLA", "ERROR", 2);
                        } else {
                            //SE VERIFICA SI SE HA MODIFICADO LA CONTRASEÑA O NO
                            marca = ConV.ModificacionContraseña(Contraseña, contraseña);
                            if ((marca == 2) || (marca == 0)) {//SI EL METODO DEVUELVE UN 2 O UN 0 (CERO) SOGNIFICA QUE SE A MODIFICADO
                                //SE LLAMA AL METODO PARA VERIFICAR QUE LA NUEVA CONTRASEÑA COINSIDA CON LA COMFRIMACION
                                respuesta = ConV.ComparacionContraseñas(contraseña, comparacion);
                                if (respuesta == true) {//SI SE DEVUELVE QUE ES CORRECTA LA COMPARACION
                                    //SE INICIALIZA EL CONTROLADOR DE USUARIO
                                    ConU = new ControladorUsuario();
                                    //SE LLAMA AL METODO PARA MODIFICAR UN USUARIO
                                    ConU.ModificarUsuario(id, usuario, nombre, apellido, telefono, domicilio, contraseña);
                                    //SE INICIALIZA EL CONTROLADOR MOSTRAR USUARIO
                                    ConMUsu = new ControladorVistaMUsu();
                                    //SE INFORMA QUE SE HA MODIFICADO EL USUARIO CORRECTAMENTE
                                    JOptionPane.showMessageDialog(this, "SE MODIFICO USUARIO CORRECTAMENTE", "EXITO", 0);
                                    //SE LLAMA AL METODO PARA MOSTRAR LA PANTALLA USUARIO CON EL ID CORRESPONDIENTE
                                    ConMUsu.Start(this, true, id, idU);
                                    //SE CIERRA LA PANTALLA AGREGAR Y MODIFICAR USUARIO
                                    this.setVisible(false);

                                }
                            }
                        }
                    } else {//SI EL ID DEL USUARIO DE LA PANTALLA NO ES EL MISMO QUE EL ID DEL USUARIO QUE INGRESO AL PROGRAMA
                        //SE INICIALIZA EL CONTROLADOR DE USUARIO
                        ConU = new ControladorUsuario();
                        //SE LLAMA AL METODO PARA MODIFICAR USUARIO
                        ConU.ModificarUsuario(id, Usuario, nombre, apellido, telefono, domicilio, Contraseña);
                        //SE LLAMA AL CONTROLADOR DE MOSTRAR USUARIO
                        ConMUsu = new ControladorVistaMUsu();
                        //SE INFORMA QUE EL USUARIO SE MODIFICO CORRECTAMENTE
                        JOptionPane.showMessageDialog(this, "SE MODIFICO USUARIO CORRECTAMENTE", "EXITO", 1);
                        //SE MUESTRA LA PANTALLA DE MOSTRAR USUARIO
                        ConMUsu.Start(this, true, id, idU);
                        //SE CIERRA LA PANTALLA AGREGAR Y MODIFICAR USUARIO
                        this.setVisible(false);
                    }
                }
            } else {//SI LA VANDERA ES FALSSA
                //SE INICIALIZA EL CONTROLADOR DE USUARIO
                ConU = new ControladorUsuario();
                //SE INICIALIZA EL CONTROLADOR DE VISTA PRINCIPAL
                ConVP = new ControladorVistaPrincipal();
                //SE INICIALIZA EL CONTROLADOR DE AGREGAR Y MODIFICAR USUARIO
                ConV = new ControladorVistaAyMU();
                //SE ASIGNA VARIABLES NECESARIAS
                boolean respuesta;

                String nombre, apellido, usuario, domicilio, contraseña, comparacion, telefono;
                //SE INICIALIZAN LAS VARIABLES
                nombre = txtNombre.getText();
                apellido = txtApellido.getText();
                //SE VERIFICA QUE EL NOMBRE Y EL APELLIDO NO ESTEN VACIOS
                respuesta = ConV.SeCompletoNombreYApellido(nombre, apellido);
                //SI NO ESTAN VACIOS SE ENVIA VERDADERO
                if (respuesta == true) {
                    //SE INICIALIZAN LAS VARIABLES FALTANTES
                    usuario = txtUsuario.getText();
                    domicilio = txtDomicilio.getText();
                    contraseña = String.valueOf(txtContraseña.getPassword());
                    comparacion = String.valueOf(txtConfirmacion.getPassword());
                    telefono = txtTelefono.getText();
                    //SE LLAMA EL METODO PARA COMPROBAR QUE LA CONTRASEÑA Y LA CONFIRMACION SEAN LAS CORRECTAS
                    respuesta = ConV.ComparacionContraseñas(contraseña, comparacion);
                    if (respuesta == true) {//SI SON CORRECTAS
                        //SE LLAMA AL METODO PARA VERIFICAR QUE EL USUARIO ELEGIDO NO SEA ADMIN 
                        respuesta = ConV.NombreReservado(usuario);
                        if (respuesta == true) {//SI NO ES ADMIN ENVIA VERDADERO
                            //SE CREA UNA VARIABLE PARA CARGAR LOS DATOS DEL USUARIO COLOCADO
                            String[] dato = {usuario};
                            //SE VERIFICA QUE EL USUSUARIO COLOCADO NO SE REPITA
                            respuesta = ConV.ComparacionU(dato);
                            if (respuesta == true) {//SI NO SE REPITE ENVIA VERDADERO
                                //SE LLAMA EL METODO PARA CRERA UN USUARIO NUEVO
                                ConU.CargarUsuario(null, usuario, nombre, apellido, telefono, domicilio, contraseña);
                                //SE INFORMA QUE SE A CREADO UN USUARIO NUEVO
                                JOptionPane.showMessageDialog(this, "SE CREO USUARIO CORRECTAMENTE", "EXITO", 1);
                                //SE INICIALIZA LA PANTALLA PRINCIPAL NUEVAMENTE
                                ConVP.Start();
                                //SE CIERRA LA PANTALLA AGREGAR Y MODIFICAR USUARIO
                                this.setVisible(false);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //SI LA BANDERA ES VERDADERA
        if (bandera == true) {
            //SI EL AXU (MARCA) NO ES 1, OSEA ES 0 (cero)
            if (aux == 0) {
                //SE ABRE LA PANTALLA MODIFICAR USUARIO
                refMU.setVisible(true);
                //SE CIERRA LA PANTALLA AGREGAR Y MODIFICAR USUARIO
                this.setVisible(false);
            } else {//SI EL AUX(MARCA ES 1)
                //SE LLAMA LA PANTALLA AGREGAR Y MODIFICAR USUARIO
                refAYML.setVisible(true);
                //SE CIERRA LA PANTALLA AGREGAR Y MODIFICAR USUARIO
                this.setVisible(false);

            }
        } else {//SI LA BANDERA ES FALSA
            if (aux == 0) {//SI EL AUX ES 0 (cero)
                //INICIALIZA EL CONTROLADOR DE PANTALLA PRINCIPAL
                ConVP = new ControladorVistaPrincipal();
                //SE LLAMA A LA PANTALLA PRINCIPAL
                ConVP.Start();
                //SE CIERRA LA PANTALLA AGREGAR Y MODIFICAR USUARIO
                this.setVisible(false);
            } else {//SI EL AUX ES 1
                //SE ABRE LA PANTALLA AGREGAR Y MODIFICAR LIBRO
                refAYML.setVisible(true);
                //SE CIERRA LA PANTALLA AGREGAR Y MODIFICAR USUARIO
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnVolverActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SepConf;
    private javax.swing.JSeparator SepCont;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
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
