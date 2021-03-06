/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.BDSentencias;
import controlador.ControladorGeneral;
import controlador.ControladorVistaAyML;
import controlador.ControladorVistaIngreso;
import controlador.ControladorVistaMLib;
import controlador.ControladorVistaMUsu;
import controlador.ControladorVistaPrincipal;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeron
 */
public class Ingreso extends javax.swing.JFrame implements BDSentencias {

    //SE CREA LA VARIABLE PARA LA TABLA
    private DefaultTableModel modelo;
    //SE CREAN LOS CONTROLADORES
    private ControladorGeneral ConG;
    private ControladorVistaPrincipal ConVp;
    private ControladorVistaAyML ConAyMLib;
    private ControladorVistaMLib ConMLib;
    private ControladorVistaIngreso ConVi;
    private ControladorVistaMUsu ConMUsu;
    //SE CREA UNA VARIABLE ID
    private Long id;

    //CONSTRUCTOR
    public Ingreso() {
        initComponents();
        //SE CREA LA DIMENSIONES DE LA PANTALLA Y SE COLOCA EL ICONO
        Dimension aux = getToolkit().getScreenSize();
        this.setSize((int) aux.getWidth(), 573);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
    }

    //CONSTRUCTOR CON ID DEL USUARIO QUE INGRESO
    public Ingreso(Long id) {
        //SE ASIGNA EL ID ENVIADO CON LA VARIABLE CREADA
        this.id = id;
        initComponents();
        //SE CREA LA DIMENSIONES DE LA PANTALLA Y SE LE COLOCA EL UNCONO
        Dimension aux = getToolkit().getScreenSize();
        this.setSize((int) aux.getWidth(), 573);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
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
        btnAgregarL = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificarL = new javax.swing.JButton();
        btnFichaL = new javax.swing.JButton();
        BoxSeleccion = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnMostrarU = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Unico de Libros Familiares");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setOpaque(false);

        btnAgregarL.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/AgregarL.png"))); // NOI18N
        btnAgregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificarL.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Modificar2 (3).png"))); // NOI18N
        btnModificarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLActionPerformed(evt);
            }
        });

        btnFichaL.setBackground(new java.awt.Color(153, 153, 153));
        btnFichaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Ver.png"))); // NOI18N
        btnFichaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaLActionPerformed(evt);
            }
        });

        BoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titulo", "Genero", "Año", "Calificacion", "VM", "Autor", "Editorial", "Ubicacion", "Propietario" }));

        btnMostrarU.setBackground(new java.awt.Color(153, 153, 153));
        btnMostrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Perfil.png"))); // NOI18N
        btnMostrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUActionPerformed(evt);
            }
        });

        TablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaLibros.setOpaque(false);
        jScrollPane1.setViewportView(TablaLibros);

        btnBuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Ingresar_2.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMostrarU, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFichaL, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(BoxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnModificarL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregarL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnMostrarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFichaL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLActionPerformed
        //SE PRECIONA EL BOTON PARA CREAR UN LIBRO
        //SE INICIALIZA EL CONTROLADOR AGREGAR Y MODIFICAR LIBRO
        ConAyMLib = new ControladorVistaAyML();
        //SE LLAMA AL METODO QUE ABRE LA PANTALLA AGREGAR Y MODIFICAR LIBRO
        ConAyMLib.Start(this, true, id, id);
        //SE CIERRA LA PANTALLA INGRESO
        this.setVisible(false);
        

    }//GEN-LAST:event_btnAgregarLActionPerformed

    private void btnModificarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLActionPerformed
        //SE CLICKEA EL BOTON MODIFICAR LIBRO
        //SE CLICKEA UNA FILA DE LA TABLA
        int filaSeleccionada = TablaLibros.getSelectedRow();
        try {
            //SE VERIFICA QUE SE HAYA CLICKEADO UNA FILA DE LA TABLA
            if (filaSeleccionada == -1) {//SI NO SE A CLICKEADO
                //SE INFORMA AL USUARIO QUE DEBE CLICKEAR UNA FILA PARA CONTINUAR
                javax.swing.JOptionPane.showMessageDialog(this, "SELECCIONE UN LIBRO DE LA LISTA", "ERROR", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {//SI SE HA CLICKEADO
                //SE TOMA EL NUMERO DEL ID DEL LIBRO PARA PODER LLAMARLO EN LA PANTALLA DE MODIFICACIONES
                Long valorId = (Long) modelo.getValueAt(filaSeleccionada, 0);

                // SE INICIALIZA EL CONTROLADOR DE AGREGAR Y MODIFICAR LIBRO
                ConAyMLib = new ControladorVistaAyML();
                //SE LLAMA AL METODO QUE ABRE LA PANTALLA AGREGAR Y MODIFICAR LIBRO
                ConAyMLib.Start(this, false, valorId, id);//SE ENVIA EL ID DEL LIBRO Y EL ID DEL USUARIO QUE INGRESO AL PROGRAMA PARA PODER VOLVER
                //SE CIERRA LA PANTALLA INGRESO
                this.setVisible(false);
            }
            
        } catch (HeadlessException e) {
            
            e.printStackTrace();
        }
        

    }//GEN-LAST:event_btnModificarLActionPerformed

    private void btnFichaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaLActionPerformed
        //SE CLICKEA EL BOTON PARA VER LA FICHA DEL LIBRO
        //SE CLICKEA UNA FILA DE LA TABLA
        int filaSeleccionada = TablaLibros.getSelectedRow();
        
        try {
            //SE VERIFICA QUE SE HAYA CLICKEADO UNA FILA DE LA TABLA
            if (filaSeleccionada == -1) {//SI NO SE A CLICKEADO
                //SE INFORMA AL USUARIO QUE DEBE CLICKEAR UNA FILA PARA CONTINUAR
                javax.swing.JOptionPane.showMessageDialog(this, "SELECCIONE UN LIBRO DE LA LISTA", "ERROR", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {//SI SE HA CLICKEADO
                //SE TOMA EL NUMERO DEL ID DEL LIBRO PARA PODER LLAMARLO EN LA PANTALLA DE MODIFICACIONES
                Long valorId = (Long) modelo.getValueAt(filaSeleccionada, 0);

                //SE INICIALIZA EL CONTROLADOR MOSTRAR LIBRO
                ConMLib = new ControladorVistaMLib();
                //SE LLAMA AL METODO PARA ABRIR PANTALLA MOSTRAR LIBRO
                ConMLib.Start(this, true, valorId, id);//SE ENVIA EL ID DEL LIBRO Y EL ID DEL USUARIO QUE INGRESO AL PROGRAMA
                //SE CIERRA LA PANTALLA INGRESO
                this.setVisible(false);
                
            }
            
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
        

    }//GEN-LAST:event_btnFichaLActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //SI SE CLICKEA EL BOTON SALIR
        //SE INICIALIZA EL CONTROLADOR DE LA PANTALLA PRINCIPAL
        ConVp = new ControladorVistaPrincipal();
        //SE LLAMA AL METODO PARA ABRIR LA PANTALLA PRINCIPAL
        ConVp.Start();
        //SE CIERRA AL PANTALLA INGRESO
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //CUANDO SE ACTIVA LA PANTALLA 
        try {
            //SE INICIALIZAN LOS CONTROLADORES
            ConG = new ControladorGeneral();
            ConVi = new ControladorVistaIngreso();
            modelo = new DefaultTableModel();
            //SE LLAMA AL METODO ACTUALIZAR TABLA PARA MOSTRARLA EN PANTALLA
            actualizarTabla(mostrarL, null);
            
        } catch (Exception ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //BOTON PARA ELMINAR UN LIBRO
        int filaSeleccionada = TablaLibros.getSelectedRow();
        
        try {
            if (filaSeleccionada == -1) {//SI NO SE SELECCIONO NINGUNA FILA DE  LA TABLA
                //SE INFORMA QUE DEBE SELECCIONAR UNA FILA ANTES DE ELIMINARLA
                javax.swing.JOptionPane.showMessageDialog(this, "SELECCIONE UN LIBRO DE LA LISTA", "ERROR", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {//SI SE SELECCIONO UNA FILA 
                //SE CREA UNA VARIABLE PARA USAR DE BOTONES
                String[] opciones = {"SI", "NO"};
                //SE PREGUNTA AL USUARIO SI REALMENTE QUIERE ELIMINAR EL LIBRO SELECCIONARDO
                int respuesta = JOptionPane.showOptionDialog(this, "Esta seguro que desea eliminar el libro?", "Seleccione una Opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Opcion1");
                if (respuesta == 0) {//SI LA RESPUESTA ES SI SE ENVIA EL 0(CERO)
                    //SE TOMA EL VALOR DEL ID DEL LIBRO SELECCIONADO
                    Long valorId = (Long) modelo.getValueAt(filaSeleccionada, 0);

                    //SE CREA UNA VARIABLE QUE VA A CONTENER EL ID DEL LIBRO SELECCIONADO
                    String[] arregloDatosCampo = {valorId.toString()};
                    //SE LLAMA AL METODO QUE ELIMINARA EL LIBRO
                    ConG.ejecutarSentencia(arregloDatosCampo, eliminarL);
                    //SE LLAMA AL METODO QUE ACTUALIZA LA TABLA 
                    actualizarTabla(mostrarL, null);
                } else {
                    //SE LLAMA AL METODO QUE ACTUALIZA LA TABLA
                    actualizarTabla(mostrarL, null);
                    
                }
                
            }
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUActionPerformed
        //SI SE CLICKEA EL BOTON MOSTRAR USUARIO
        //SE INICIALIZA EL CONTROLADORE DE MOSTRAR USUARIO
        ConMUsu = new ControladorVistaMUsu();
        //SE LLAMA AL METODO QUE ABRE LA PANTALLA DEL USUARIO Y SE ENVIA EL ID DEL USAURIO QUE INGRESO AL PROGRAMA
        ConMUsu.Start(this, true, id, id);
        //SE CIERRA LA PANTALLA INGRESO
        this.setVisible(false);
    }//GEN-LAST:event_btnMostrarUActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //CUANDO SE QUIERE BUSCAR ALGUN LIBRO DE LA LISTA
        //SE DELCARAN VARIABLES NECESARIAS
        String datoBox = String.valueOf(BoxSeleccion.getSelectedItem());
        String datoTXT = txtBuscar.getText();
        try {
            //SI EL TXT ESTA VACIO SE INFORMA QUE DEBE LLENARSE
            if (datoTXT.equals("")) {
                JOptionPane.showMessageDialog(this, "COLOQUE UN VALOR " + datoBox + " A BUSCAR", "ERROR", 2);
                
            } else {//SINO
                //SE INCIALIZA EL ARRAY DE STRING CON LO QUE SE HA ESCRITO
                String[] datoTxt = {datoTXT};
                //DEBE HABER UNA FORMA MAS OPTIMA PERO NO SE ME OCURRIO
                //DIFERENTES FORMAS DE BUSCAR
                if (datoBox.equals("Titulo")) {
                    actualizarTabla(Titulo, datoTxt);
                    
                } else {
                    if (datoBox.equals("Genero")) {
                        actualizarTabla(Genero, datoTxt);
                    } else {
                        if (datoBox.equals("Año")) {
                            actualizarTabla(Año, datoTxt);
                        } else {
                            if (datoBox.equals("Calificacion")) {
                                actualizarTabla(Calificacion, datoTxt);
                            } else {
                                if (datoBox.equals("VM")) {
                                    actualizarTabla(VM, datoTxt);
                                } else {
                                    if (datoBox.equals("Autor")) {
                                        actualizarTabla(Autor, datoTxt);
                                    } else {
                                        if (datoBox.equals("Editorial")) {
                                            actualizarTabla(Editorial, datoTxt);
                                        } else {
                                            if (datoBox.equals("Ubicacion")) {
                                                actualizarTabla(Ubicacion, datoTxt);
                                            } else {
                                                if (datoBox.equals("Propietario")) {
                                                    actualizarTabla(Propietario, datoTxt);
                                                } 
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                
            }
        } catch (Exception ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    //METODO PARA ACTUALIZAR LA TABLA
    public void actualizarTabla(String mostrarL, String[] arregloDatoCampo) {
        //SI LOS DATOS ENVIADOS ESTA VACIO
        if (arregloDatoCampo == null) {
            //SE LLAMA AL METODO NECESARIO PARA ACTUALIZAR LA TABALA
            modelo = ConVi.mostrar(mostrarL);
        } else {//SI LOS DATOS ENVIADOS NO ESTAN VACIOS
            //SE LLAMA AL METODO PARA ACTUALIZAR LA TABLA
            modelo = ConVi.mostrar(mostrarL, arregloDatoCampo);
        }
        //SE CREA LA TABLA Y SE SACAN LAS COLUMNAS DESEADAS
        TablaLibros.setModel(modelo);
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(0));
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(1));
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(3));
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(4));
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(6));
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(8));
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(8));
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(8));
        TablaLibros.getColumnModel().removeColumn(TablaLibros.getColumnModel().getColumn(8));
        //SE MODIFICA LA FUENTE DE LAS COLUMNAS
        TablaLibros.getTableHeader().setFont(new Font("Tahoma", 1, 10));
        TablaLibros.setAutoCreateRowSorter(true);
        //FALTA PONER EL FONDO TRANSPARENTE
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxSeleccion;
    private javax.swing.JTable TablaLibros;
    private javax.swing.JButton btnAgregarL;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFichaL;
    private javax.swing.JButton btnModificarL;
    private javax.swing.JButton btnMostrarU;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
