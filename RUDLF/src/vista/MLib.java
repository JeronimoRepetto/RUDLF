/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.BDSentencias;
import controlador.ControladorGeneral;
import controlador.ControladorVistaAyML;
import controlador.ControladorVistaMLib;
import controlador.ControladorVistaMUsu;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author jeron
 */
public class MLib extends javax.swing.JFrame implements BDSentencias {

    //SE CREAN LOS CONTROLADORES
    private ControladorGeneral ConG;
    private ControladorVistaMUsu ConMUsu;
    private ControladorVistaAyML ConAYML;
    private ControladorVistaMLib ConMLib;
    //SE CREAN LOS OBJETOS
    private Ingreso refIn;
    //SE CREAN LAS VARIABLES
    private boolean bandera;
    private Long id;
    private Long idU;

    //CONSTRUCTOR
    public MLib() {
        initComponents();
        //SE ASIGNA EL TAMAÑO DE LA PANTALLA Y SE CARGA EL ICONO
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
    }

    //CONTROLADOR PARA ABRIR LA PANTALLA MOSTRAR LIBRO DESDE INGRESO
    public MLib(Ingreso refIn, boolean bandera, Long id, Long idU) {
        //SE INICIALIZAN LAS VARIABLES CON LOS DANTOS RECIBIDOS
        this.refIn = refIn;
        this.bandera = bandera;
        this.id = id;
        this.idU = idU;
        initComponents();
        //SE ASIGNA EL TAMAÑO DE LA PANTALLA Y SE CARGA EL ICONO
        this.setSize(790, 540);
        this.setLocationRelativeTo(this);
        URL url = getClass().getResource("/imagen/IconoRULF2.png");
        ImageIcon imag = new ImageIcon(url);
        setIconImage(imag.getImage());
        //SE CREAN VARIABLES PARA BUSCAR LOS DATOS
        String[] resultado = new String[18];
        String[] arregloCampos = {id.toString()};
        //SE INICIALIZA EL CONTROLADOR GENERAL
        ConG = new ControladorGeneral();
        //SE LLAMA AL METODO PARA RECIBIR LOS DATOS DEL LIBRO
        resultado = ConG.mostrarFormulario(mostrarXId, arregloCampos);
        //SE CARGAN LOS LBL Y LOS TXT CON LOS DATOS RECIBIDOS 
        lblTituloR.setText(resultado[1]);
        lblTituloOR.setText(resultado[2]);
        lblAutorR.setText(resultado[3]);
        lblAñoR.setText(resultado[4]);
        lblOrigenR.setText(resultado[5]);
        lblGeneroR.setText(resultado[6]);
        lblTemaR.setText(resultado[7]);
        lblVMR.setText(resultado[9]);
        lblCalificacionR.setText(resultado[8]);
        txtComentarioR.setText(resultado[10]);
        lblISBNR.setText(resultado[11]);
        lblEditorialR.setText(resultado[12]);
        lblNumeroR.setText(resultado[13]);
        lblAñoER.setText(resultado[14]);
        lblLugarR.setText(resultado[15]);
        lblTraduccionR.setText(resultado[16]);
        lblUbicacionR.setText(resultado[17]);
        lblPropietarioR.setText(resultado[18]);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUbicacion = new javax.swing.JLabel();
        lblPropietario = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarioR = new javax.swing.JTextArea();
        lblTituloR = new javax.swing.JLabel();
        lblTituloOR = new javax.swing.JLabel();
        lblAutorR = new javax.swing.JLabel();
        lblAñoR = new javax.swing.JLabel();
        lblOrigenR = new javax.swing.JLabel();
        lblGeneroR = new javax.swing.JLabel();
        lblTemaR = new javax.swing.JLabel();
        lblCalificacionR = new javax.swing.JLabel();
        lblVMR = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblISBN = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblAñoE = new javax.swing.JLabel();
        lblLugar = new javax.swing.JLabel();
        lblTraduccion = new javax.swing.JLabel();
        lblISBNR = new javax.swing.JLabel();
        lblEditorialR = new javax.swing.JLabel();
        lblNumeroR = new javax.swing.JLabel();
        lblAñoER = new javax.swing.JLabel();
        lblLugarR = new javax.swing.JLabel();
        lblTraduccionR = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblUbicacionR = new javax.swing.JButton();
        lblPropietarioR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Unico de Libros Familiares");
        setResizable(false);

        lblUbicacion.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        lblUbicacion.setText("Ubicacion : ");

        lblPropietario.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        lblPropietario.setText("Propietario : ");

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

        txtComentarioR.setColumns(20);
        txtComentarioR.setRows(5);
        txtComentarioR.setBorder(null);
        txtComentarioR.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtComentarioR.setEnabled(false);
        txtComentarioR.setOpaque(false);
        jScrollPane1.setViewportView(txtComentarioR);

        lblTituloR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblTituloOR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblAutorR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblAñoR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblOrigenR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblGeneroR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblTemaR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblCalificacionR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblVMR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTituloOR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTituloR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAutorR, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAñoR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblTemaR, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblOrigenR, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(lblGeneroR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblVMR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(lblCalificacionR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(1, 1, 1)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblTituloR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloO)
                    .addComponent(lblTituloOR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(lblAutorR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño)
                    .addComponent(lblAñoR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(lblOrigenR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(lblGeneroR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTema)
                    .addComponent(lblTemaR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalificacion)
                    .addComponent(lblCalificacionR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVM)
                    .addComponent(lblVMR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lblISBNR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblEditorialR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblNumeroR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblAñoER.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblLugarR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

        lblTraduccionR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

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
                    .addComponent(lblISBNR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEditorialR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumeroR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAñoER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLugarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTraduccionR, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblISBN)
                    .addComponent(lblISBNR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditorial)
                    .addComponent(lblEditorialR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(lblNumeroR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAñoE)
                    .addComponent(lblAñoER, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLugar)
                    .addComponent(lblLugarR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTraduccion)
                    .addComponent(lblTraduccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

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

        lblUbicacionR.setBackground(null);
        lblUbicacionR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        lblUbicacionR.setForeground(new java.awt.Color(0, 102, 255));
        lblUbicacionR.setBorder(null);
        lblUbicacionR.setContentAreaFilled(false);
        lblUbicacionR.setOpaque(false);
        lblUbicacionR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblUbicacionRActionPerformed(evt);
            }
        });

        lblPropietarioR.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        lblPropietarioR.setForeground(new java.awt.Color(0, 102, 255));
        lblPropietarioR.setBorder(null);
        lblPropietarioR.setContentAreaFilled(false);
        lblPropietarioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPropietarioRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUbicacion)
                            .addComponent(lblPropietario)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUbicacionR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPropietarioR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(878, 878, 878))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUbicacionR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropietarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //CUANDO SE CLICKEA MODIFICAR
        //SE INICIALIZA EL CONTROLADOR DE AGREGAR Y MODIFICAR LIBRO
        ConAYML = new ControladorVistaAyML();
        ConAYML.Start(this, false, id, idU);
        this.setVisible(false);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //CUANDO SE CLICKEA VOLVER
        //SE MUESTRA LA PANTALLA INGRESAR
        refIn.setVisible(true);
        //SE CIERRA LA PANTALLA MOSTRAR LIBRO
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void lblUbicacionRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblUbicacionRActionPerformed
        //CUANDO SE CLICKEA EL LBL UBICACION (CONTIENE EL NOMBRE Y APELLIDO DE UN USUARIO)
        //SE CREA UNA VARIABLE Q VA A CAPTAR LO QUE DICE EL  LBL UBICACION
        String aux = lblUbicacionR.getText();
        //SE INICIALIZA EL CONTROLADOR MOSTRAR LIBRO
        ConMLib = new ControladorVistaMLib();
        //SE CREA UNA VARIABLE DE TIPO ARRAY STRING QUE VA A RECIBIR LOS DATOS DEL METODO QUE SEPARA EL NOMBRE DEL APELLIDO
        String[] dato = ConMLib.SepararNombreDeApellido(aux);
        //SE CREA UNA NUEVA VARIABLE CON LOS DATOS RECIBIDO
        String[] respuesta = new String[1];
        //SE LLAMA AL METODO PARA TRAER EL ID DEL USUARIO SELECCIONADO
        respuesta = ConG.mostrarFormulario(IDNs, dato);
        //SE CREA UNA VARIABLE QUE CONTIENE EL ID CAPTURADO POR EL METODO ATERIOR
        String id22 = (respuesta[0]);
        //SE CREA UNA VARIABLE QUE VA A PASAR EL DATO CAPTURADO DE TIPO STRING A LONG
        Long id2 = Long.parseLong(id22);
        //SE INICIALIZA EL CONTROLADOR MOSTRAR USUARIO
        ConMUsu = new ControladorVistaMUsu();
        //SE LLAMA AL METODO QUE ABRIRA LA PANTALLA DE MOSTRAR USUARIO Y SE ENVIA EL ID DEL USUARIO DEL LBL SELECCIONADO PARA CARGARLO
        ConMUsu.Start(this, true, id2, idU);
        //SE CIERRA LA PANTALLA MOSTRAR LIBRO
        this.setVisible(false);
    }//GEN-LAST:event_lblUbicacionRActionPerformed

    private void lblPropietarioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPropietarioRActionPerformed
        //CUANDO SE CLICKEA EL LBL PROPIETARIO (CONTIENE NOMBRE Y APELLIDO DE USUARIO)
        //SE CREA UNA VARIABLE QUE VA A CAPTAR LO QUE DICE EL LBL PROPIETARIO
        String aux = lblPropietarioR.getText();
        //SE INICIALIZA EL CONTROLADOR MOSTRAR LIBRO
        ConMLib = new ControladorVistaMLib();
        //SE CREA UNA VARIABLE DE TIPO ARRAY STRING QUE VA A RECIBIR LOS DATOS DEL METODO QUE SEPARA EL NOMBRE DEL APELLIDO
        String[] dato = ConMLib.SepararNombreDeApellido(aux);
        //SE CREA UNA NUEVA VARIABLE CON LOS DATOS RECIBIDO
        String[] respuesta = new String[1];
        //SE LLAMA AL METODO PARA TRAER EL ID DEL USUARIO SELECCIONADO
        respuesta = ConG.mostrarFormulario(IDNs, dato);
        //SE CREA UNA VARIABLE QUE CONTIENE EL ID CAPTURADO POR EL METODO ATERIOR
        String id22 = (respuesta[0]);
        //SE CREA UNA VARIABLE QUE VA A PASAR EL DATO CAPTURADO DE TIPO STRING A LONG
        Long id2 = Long.parseLong(id22);
        //SE INICIALIZA EL CONTROLADOR MOSTRAR USUARIO
        ConMUsu = new ControladorVistaMUsu();
        //SE LLAMA AL METODO QUE ABRIRA LA PANTALLA DE MOSTRAR USUARIO Y SE ENVIA EL ID DEL USUARIO DEL LBL SELECCIONADO PARA CARGARLO
        ConMUsu.Start(this, true, id2, idU);
        //SE CIERRA LA PANTALLA MOSTRAR LIBRO
        this.setVisible(false);
    }//GEN-LAST:event_lblPropietarioRActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAutorR;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblAñoE;
    private javax.swing.JLabel lblAñoER;
    private javax.swing.JLabel lblAñoR;
    private javax.swing.JLabel lblCalificacion;
    private javax.swing.JLabel lblCalificacionR;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblEditorialR;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGeneroR;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblISBNR;
    private javax.swing.JLabel lblLugar;
    private javax.swing.JLabel lblLugarR;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroR;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblOrigenR;
    private javax.swing.JLabel lblPropietario;
    private javax.swing.JButton lblPropietarioR;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTemaR;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloO;
    private javax.swing.JLabel lblTituloOR;
    private javax.swing.JLabel lblTituloR;
    private javax.swing.JLabel lblTraduccion;
    private javax.swing.JLabel lblTraduccionR;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JButton lblUbicacionR;
    private javax.swing.JLabel lblVM;
    private javax.swing.JLabel lblVMR;
    private javax.swing.JTextArea txtComentarioR;
    // End of variables declaration//GEN-END:variables
}
