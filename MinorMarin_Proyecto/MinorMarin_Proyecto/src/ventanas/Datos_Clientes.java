
package ventanas;

import clases.Leer_Escribir_Archivos;
import clases.Prestamo;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Minor
 */
public class Datos_Clientes extends javax.swing.JFrame {
    //Variables que se van a utiizar en toda la clase
    boolean Validacion = false;
    String LineaModificar = "";
    public Datos_Clientes() {
        initComponents();
        this.setTitle("Proyecto Final Minor Marin Obando");
        this.setLocationRelativeTo(null);
        //para desactivar botones
        this.jButton_Actualizar.setEnabled(false);
        this.jButton_Eliminar.setEnabled(false);
        this.jButton_Nuevo_Cliente.setEnabled(false);
        // Para darle color a los paneles
        this.Panel_Botones.setBackground(new Color(246, 235, 241, 140));
        this.Panel_Datos_Cliente.setBackground(new Color(246, 235, 241, 140));
        this.Panel_Titulo.setBackground(new Color(246, 235, 241, 140));

    }

    
    
//public List <Prestamo>  ListaCliente = new <Prestamo> ArrayList();  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Datos_Cliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextF_Nombre = new javax.swing.JTextField();
        jTextF_Edad = new javax.swing.JTextField();
        jTextF_Ingreso_Mensual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextF_Primer_Apellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextF_Segundo_Apellido = new javax.swing.JTextField();
        jButton_Verificar_ID = new javax.swing.JButton();
        jTextF_Identificacion = new javax.swing.JTextField();
        jButton_Nuevo_Cliente = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        Panel_Botones = new javax.swing.JPanel();
        jButton_Menu = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        Panel_Titulo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Datos_Cliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Datos_Cliente.setPreferredSize(new java.awt.Dimension(410, 275));
        Panel_Datos_Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Identificación");
        Panel_Datos_Cliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        Panel_Datos_Cliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 81, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Edad");
        Panel_Datos_Cliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 181, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ingreso Mensual");
        Panel_Datos_Cliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 219, -1, -1));

        jTextF_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_NombreKeyTyped(evt);
            }
        });
        Panel_Datos_Cliente.add(jTextF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 81, 237, -1));

        jTextF_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_EdadKeyTyped(evt);
            }
        });
        Panel_Datos_Cliente.add(jTextF_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 181, 31, -1));

        jTextF_Ingreso_Mensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Ingreso_MensualKeyTyped(evt);
            }
        });
        Panel_Datos_Cliente.add(jTextF_Ingreso_Mensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 219, 136, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Primer Apellido");
        Panel_Datos_Cliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 119, -1, -1));

        jTextF_Primer_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Primer_ApellidoKeyTyped(evt);
            }
        });
        Panel_Datos_Cliente.add(jTextF_Primer_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 119, 237, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Segundo Apellido");
        Panel_Datos_Cliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, -1, -1));

        jTextF_Segundo_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Segundo_ApellidoKeyTyped(evt);
            }
        });
        Panel_Datos_Cliente.add(jTextF_Segundo_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 150, 237, -1));

        jButton_Verificar_ID.setText("Verificar ID");
        jButton_Verificar_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Verificar_IDActionPerformed(evt);
            }
        });
        Panel_Datos_Cliente.add(jButton_Verificar_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 42, -1, -1));

        jTextF_Identificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_IdentificacionKeyTyped(evt);
            }
        });
        Panel_Datos_Cliente.add(jTextF_Identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 16, 182, -1));

        jButton_Nuevo_Cliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_Nuevo_Cliente.setText("Nuevo Cliente");
        jButton_Nuevo_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Nuevo_ClienteActionPerformed(evt);
            }
        });
        Panel_Datos_Cliente.add(jButton_Nuevo_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jButton_Actualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_Actualizar.setText("Actualizar Datos");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        Panel_Datos_Cliente.add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jButton_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_Eliminar.setText("Eliminar Cliente");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        Panel_Datos_Cliente.add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        getContentPane().add(Panel_Datos_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 73, 406, 310));

        Panel_Botones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Menu.setText("Menu Principal");
        jButton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MenuActionPerformed(evt);
            }
        });
        Panel_Botones.add(jButton_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        Panel_Botones.add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        getContentPane().add(Panel_Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 350, 50));

        Panel_Titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DATOS DEL CLIENTE");

        javax.swing.GroupLayout Panel_TituloLayout = new javax.swing.GroupLayout(Panel_Titulo);
        Panel_Titulo.setLayout(Panel_TituloLayout);
        Panel_TituloLayout.setHorizontalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TituloLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(109, 109, 109))
        );
        Panel_TituloLayout.setVerticalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 11, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/datos.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Para verificar en los archivos si el ID del cliente existe en el registro
    private void jButton_Verificar_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Verificar_IDActionPerformed

        //Vector donde se guardarán los datos extraídos de la linea del archivo
        String[] datos;
        // se crea un objeto de la clase Leer_Escribir_archivos
        Leer_Escribir_Archivos archivo = new Leer_Escribir_Archivos();
        //se le asigna a Linea Modificar lo que retorna el método que verifica el ID y extrae la línea con dicho ID
        LineaModificar = archivo.Verificar_ID(jTextF_Identificacion.getText(), false);
        // se crea un objeto de la clase file el cual representa un archivo.
        File file = new File("clientes_prestamos.txt"); // para verificar si el archivo existe
        // si el archivo existe entra en el if  
        if (file.exists()) {
            // sí linea modificar es igual a la cédula que le envié en el método anterior significa que no encontro ningun cliente 
            //registrado con esa cedula, porque cuando si encuentra a un cliente, retorna toda la información del cliente y no solo la cedula

            if (LineaModificar.equals(jTextF_Identificacion.getText())) {
                JOptionPane.showMessageDialog(null, "Error, El Cliente aun no se Encuentra Registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.jButton_Nuevo_Cliente.setEnabled(true);
            } else { 
                // si encontró un cliente entonces la información que se encontró de dicho cliente 
                // se le asigna al vector de datos, donde cada casilla tendrá información hasta el split"/" el cual es el separador de los datos del archivo
                datos = LineaModificar.split("/");
                 // se toma la información almacenada en el vector y se le carga a los JtextField donde van esos datos para mostrarlos
                jTextF_Identificacion.setText(datos[0]);
                jTextF_Nombre.setText(datos[1]);
                jTextF_Primer_Apellido.setText(datos[2]);
                jTextF_Segundo_Apellido.setText(datos[3]);
                jTextF_Edad.setText(datos[4]);
                jTextF_Ingreso_Mensual.setText(datos[5]);
                jTextF_Identificacion.setEnabled(false);

                // como se encontro un cliente registrado se habilita el botón de actualizar y eliminar
                this.jButton_Actualizar.setEnabled(true);
                this.jButton_Eliminar.setEnabled(true);

            }

        } else {  // si el archivo no existe es porque aún no se ha registrado ningún cliente por lo cual no se ha creado el archivo correspondiente
            JOptionPane.showMessageDialog(null, "Error, El Cliente aun no se Encuentra Registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.jButton_Nuevo_Cliente.setEnabled(true);
        }


    }//GEN-LAST:event_jButton_Verificar_IDActionPerformed
    //Método que verifica si los datos ingresados en los JtextField cuando se agrega un nuevo cliente o se actualiza son válidos
    public void Verificar_JTextFilds() {
        

        this.Validacion = false;
        try {
            //Validación de identificación para que no quede el campo vacío y que los datos no sean menores a 10.
            if (jTextF_Identificacion.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe Ingresar una Identificación", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (jTextF_Identificacion.getText().length() < 10) {
                JOptionPane.showMessageDialog(null, "Error, Debe Ingresar los 10 numeros de la Identificación", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validación de nombre para que no quede el campo vacío.
            if (jTextF_Nombre.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //validación de edad para que no quede el campo vacío y que la edad ingresada esté en el rango establecido.
            if (jTextF_Edad.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en la Edad", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Integer.parseInt(jTextF_Edad.getText()) < 18 || (Integer.parseInt(jTextF_Edad.getText()) >= 100)) {
                JOptionPane.showMessageDialog(null, " La edad ingresada debe estar entre 18 y 100 años ", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validación de Ingreso Mensual para que no quede el campo vacío y que el ingreso sea mayor a 0.
            if (jTextF_Ingreso_Mensual.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Ingreso Mensual", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Double.parseDouble(jTextF_Ingreso_Mensual.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, " El Ingreso debe ser mayor que 0 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException er) {

            JOptionPane.showMessageDialog(null, " Solo se puede Ingresar Valores Numericos en la Cantidad de Empleados ", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // si los datos son validos entonces la validacion es True
        this.Validacion = true;
    }

    //Boton para Agregar un Nuevo Cliente
    private void jButton_Nuevo_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Nuevo_ClienteActionPerformed
        //llama al método que verifica si los jtextfield contienen información válida
        Verificar_JTextFilds();
        // si la validacion es correcta entra en el if
        if (this.Validacion == true) {
              // por convención se guardan los datos en la clase padre a través de un objeto de la clase padre con su constructor sobrecargado  // por convención se guardan los datos en la clase padre a través de un objeto de la clase padre con su constructor sobrecargado
            Prestamo datos_cliente = new Prestamo(jTextF_Identificacion.getText(), jTextF_Nombre.getText(), jTextF_Primer_Apellido.getText(), jTextF_Segundo_Apellido.getText(), Integer.parseInt(jTextF_Edad.getText()), Double.parseDouble(jTextF_Ingreso_Mensual.getText()));
            // en esta variable almaceno los datos que voy a guardar en el archivo cuando es un nuevo cliente
            String Mensaje = datos_cliente.getIdentificacion() + "/" + datos_cliente.getNombre() + "/" + datos_cliente.getPrimer_Apellido() + "/" + datos_cliente.getSegundo_Apellido() + "/" + datos_cliente.getEdad() + "/" + datos_cliente.getIngreso_mensual();
            // creo un objeto de la clase Leer_Escribir_Archivos
            Leer_Escribir_Archivos Manejo_Archivos = new Leer_Escribir_Archivos();
            //llamo al metodo que me escribe la información en el archivo correspondiente
            // y le mando por parámetro lo que quiero guardar y un booleano que me permite 
            // identificar si voy a escribir en un archivo u otro

            Manejo_Archivos.Escribir(Mensaje, false);
            JOptionPane.showMessageDialog(null, " Datos del Cliente Agregados ", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);

            //limpio los datos de los jtextfields
            jTextF_Identificacion.setText("");
            jTextF_Nombre.setText("");
            jTextF_Primer_Apellido.setText("");
            jTextF_Segundo_Apellido.setText("");
            jTextF_Edad.setText("");
            jTextF_Ingreso_Mensual.setText("");
            jButton_Nuevo_Cliente.setEnabled(false);

        }

    }//GEN-LAST:event_jButton_Nuevo_ClienteActionPerformed

    //Botón para actulizar los datos del cliente
    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
          //llama al método que verifica si los jtextfield contienen información válida
        Verificar_JTextFilds();
        // si la validacion es correcta entra en el if
        if (this.Validacion == true) {
            // creo un objeto de la clase Leer_Escribir_Archivos
            Leer_Escribir_Archivos archivo = new Leer_Escribir_Archivos();

            //llama al método que busca escribe en un archivo temporal todas las líneas que sean diferentes a la línea con los datos del cliente que voy a actualizar
            // para ello le mando los datos del cliente sin actualizar por parámetro

            archivo.ActualizarDatos(LineaModificar);
            // por convención se guardan los datos en la clase padre a través de un objeto de la clase padre con su constructor sobrecargado
            Prestamo datos_cliente = new Prestamo(jTextF_Identificacion.getText(), jTextF_Nombre.getText(), jTextF_Primer_Apellido.getText(), jTextF_Segundo_Apellido.getText(), Integer.parseInt(jTextF_Edad.getText()), Double.parseDouble(jTextF_Ingreso_Mensual.getText()));
            // en esta variable almaceno los datos que voy a guardar en el archivo cuando es un nuevo cliente
            String Mensaje = datos_cliente.getIdentificacion() + "/" + datos_cliente.getNombre() + "/" + datos_cliente.getPrimer_Apellido() + "/" + datos_cliente.getSegundo_Apellido() + "/" + datos_cliente.getEdad() + "/" + datos_cliente.getIngreso_mensual();
           
            //Llamo al metodo que escribe los datos actualizados en el archivo
            archivo.Escribir(Mensaje, false);

            
            // Luego se prosigue a verificar si la cédula también tiene préstamos aprobados, para actualizar esos datos también 
            String Cedula = archivo.Verificar_ID(jTextF_Identificacion.getText(), true);

            //si la cédula fue encontra entonces entra en el if
            if (!Cedula.trim().equals("")) {
               
                // se crean 3 objetos de la clase file los cuales representa 3 archivos.
                //estos para abrir los datos del cliente, los préstamos aprobados y un archivo temporal
                File file = new File("clientes_prestamos.txt");
                File file2 = new File("prestamos_aprobados.txt");
                File file3 = new File("Temporal.txt");

                try {
                    // se abren los 2 registros en modo lectura 
                    BufferedReader clientes = new BufferedReader(new FileReader("clientes_prestamos.txt"));
                    BufferedReader prestamos = new BufferedReader(new FileReader("prestamos_aprobados.txt"));
                     // el archivo temporal en modo de escritura 
                    PrintWriter temporal = new PrintWriter(new FileWriter("Temporal.txt"));

                    // llamo al método que verifica el ID del archivo clientes préstamos y extraigo los datos actualizados y los guardó en una variable
                    String Datos_nuevos = archivo.Verificar_ID(jTextF_Identificacion.getText(), false);

                    // creo variables y vectores para almacenar los datos 
                    String datos_prestamo;
                    String[] datos_clientes;
                    String[] datos_p;
                    // en el vector de datos clientes, guardo los datos actualizados del cliente por medio del split de separacion
                    datos_clientes = Datos_nuevos.split("/");
                    String Linea_Actualizada = "";

                    // empiezo a recorrer el archivo que contiene el registro de los prestamos aprobados linea a linea
                    while (((datos_prestamo = prestamos.readLine()) != null)) {

                         // si la línea no contiene la cédula del cliente que actualice los datos entonces se copia tal cual en el archivo temporal
                        if (!datos_prestamo.contains(jTextF_Identificacion.getText())) {
                            temporal.println(datos_prestamo);
                            temporal.flush();

                        } else {
                            // si la línea contiene la cédula del cliente que actualice los datos entonces se guarda esa información en el vector de datos préstamo con el split de separación "/"
                            datos_p = datos_prestamo.split("/"); // se guarda en el vector los datos de la línea donde se encontró el cliente con el préstamo

                             // se copia la nueva línea con los datos del cliente actualizados que extrajimos previamente el archivo de clientes préstamo
                            // pero conservando los datos relacionados al préstamo 

                            Linea_Actualizada = datos_clientes[0] + "/" + datos_clientes[1] + "/" + datos_clientes[2] + "/" + datos_clientes[3] + "/" + datos_p[4] + "/" + datos_p[5];
                            temporal.println(Linea_Actualizada);
                            temporal.flush();

                        }
                    }
                    // se cierra los 3 archivos
                    clientes.close();
                    prestamos.close();
                    temporal.close();

                    // se borra el archivo con los datos de los préstamos registrados 
                    file2.delete();
                    // se renombra el archivo temporal al nombre del archivo con los datos de los prestamos registrados
                    // esto porque aqui se encuentra ya los datos actualizados
                    file3.renameTo(new File("prestamos_aprobados.txt"));
                    //limpio los datos de los jtextfields
                    jTextF_Identificacion.setText("");
                    jTextF_Nombre.setText("");
                    jTextF_Primer_Apellido.setText("");
                    jTextF_Segundo_Apellido.setText("");
                    jTextF_Edad.setText("");
                    jTextF_Ingreso_Mensual.setText("");
                    jButton_Actualizar.setEnabled(false);
                    jButton_Eliminar.setEnabled(false);
                    jTextF_Identificacion.setEnabled(true);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, " Archivo No Encontrado ", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            }

        }
        //
        //Leer_Escribir_Archivos archivo = new Leer_Escribir_Archivos();
       // LineaModificar = archivo.Verificar_ID(jTextF_Identificacion.getText(), false);
        JOptionPane.showMessageDialog(null, " Datos del Cliente Actualizados ", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        jTextF_Identificacion.setEnabled(true);


    }//GEN-LAST:event_jButton_ActualizarActionPerformed
    //Boton que muesta la ventana del menu principal
    private void jButton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuActionPerformed
        
        Menu_Principal ventana = new Menu_Principal();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_MenuActionPerformed

    private void jTextF_IdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_IdentificacionKeyTyped
        // llama al método que restringe los caracteres especiales.
        RestringirCaracteres(evt);
        if (jTextF_Identificacion.getText().length() >= 10) {
            // si el rango se excede cuando se ingresa la identificación se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
            JOptionPane.showMessageDialog(null, " Ha excedido el limite de numeros de la Identificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_jTextF_IdentificacionKeyTyped

    private void jTextF_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_NombreKeyTyped
        // Llama al método que restringe los caracteres especiales.
        RestringirCaracteres(evt);
        //Si se ingresan valores numéricos en en el nombre se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
        char validar = evt.getKeyChar();
        if (!(validar < '0' || validar > '9') & (validar != '\b')) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo letras");
            evt.consume();
        }

        // Si el rango de caracteres excede el rango establecido se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
        if (jTextF_Nombre.getText().length() >= 50) {
            JOptionPane.showMessageDialog(null, " Solo se permiten 50 Caracteres en el Nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_jTextF_NombreKeyTyped

    private void jTextF_Primer_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Primer_ApellidoKeyTyped
        // Llama al método que restringe los caracteres especiales.
        RestringirCaracteres(evt);
        //Si se ingresan valores numéricos en en el nombre se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
        char validar = evt.getKeyChar();
        if (!(validar < '0' || validar > '9') & (validar != '\b')) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo letras");
            evt.consume();
        }

        // Si el rango de caracteres excede el rango establecido se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
        if (jTextF_Primer_Apellido.getText().length() >= 50) {
            JOptionPane.showMessageDialog(null, " Solo se permiten 50 Caracteres en el Primer Apellido", "ERROR", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_jTextF_Primer_ApellidoKeyTyped

    private void jTextF_Segundo_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Segundo_ApellidoKeyTyped
        // Llama al método que restringe los caracteres especiales.
        RestringirCaracteres(evt);
        //Si se ingresan valores numéricos en en el nombre se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
        char validar = evt.getKeyChar();
        if (!(validar < '0' || validar > '9') & (validar != '\b')) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo letras");
            evt.consume();
        }

        // Si el rango de caracteres excede el rango establecido se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
        if (jTextF_Segundo_Apellido.getText().length() >= 50) {
            JOptionPane.showMessageDialog(null, " Solo se permiten 50 Caracteres en el Segundo Apellido", "ERROR", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_jTextF_Segundo_ApellidoKeyTyped

    private void jTextF_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_EdadKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero.
        Validar_Solo_Numeros_Enteros(evt);
    }//GEN-LAST:event_jTextF_EdadKeyTyped

    private void jTextF_Ingreso_MensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Ingreso_MensualKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero o con decimales.
        Validar_Solo_Numeros_y_Decimales(evt);
    }//GEN-LAST:event_jTextF_Ingreso_MensualKeyTyped

        //Boton Para Eliminar Clientes
    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed

        // se crean 3 objetos de la clase file los cuales representa 3 archivos.
        //estos para abrir los datos del cliente, los préstamos aprobados y un archivo temporal
        File file = new File("prestamos_aprobados.txt");
        File file2 = new File("clientes_prestamos.txt");
        File inFile = new File("Temporal.txt");

        boolean Prestamo_Activo = false;
        try {
            // se abre el archivo de los datos de los préstamos en modo lectura 
            BufferedReader Arch_Prestamos = new BufferedReader(new FileReader(file));

            String linea;
                // se empieza a recorrer el archivo linea a linea
            while ((linea = Arch_Prestamos.readLine()) != null && Prestamo_Activo == false) {
               
                // si la linea contiene la cedula del cliente que se quiere borrar entonces entra en el if y se habilita que no se pueda borrar el cliente
                // porque no se puede borrar un cliente con prestamo activo 
                if (linea.contains(jTextF_Identificacion.getText())) {
                    JOptionPane.showMessageDialog(null, " No se puede eliminar al cliente porque tiene un prestamo aprobado ", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    Prestamo_Activo = true;
                    //limpio los datos de los jtextfields
                    jTextF_Identificacion.setText("");
                    jTextF_Nombre.setText("");
                    jTextF_Primer_Apellido.setText("");
                    jTextF_Segundo_Apellido.setText("");
                    jTextF_Edad.setText("");
                    jTextF_Ingreso_Mensual.setText("");
                    jButton_Actualizar.setEnabled(false);
                    jButton_Eliminar.setEnabled(false);
                    jTextF_Identificacion.setEnabled(true);

                }

            }
            // se cierra el archivo
            Arch_Prestamos.close();
            
            
            ///////////////////////////////////////////////////////
            // linea Modificar al ser una variable global, entonces cada vez que el se verifica el ID del cliente si ese cliente está registrado
            // entonces guarda los datos en esa variable
            // luego los copio en otra variable solo para tener un nombre más significativo

            String LineaBorrar = LineaModificar;
            // si el archivo de clientes prestamo existe y el cliente no tiene un préstamo activo entra en el if  
            if (file2.exists() && Prestamo_Activo == false) {
                // se abre el archivo de los datos de los clientes en modo lectura
                BufferedReader Arch_Clientes = new BufferedReader(new FileReader(file2));
                // se abre el archivo temporal en modo de escritura
                PrintWriter Arch_Temporal = new PrintWriter(new FileWriter(inFile));

                String line = "";
                // se recorre el archivo de los datos de los clientes linea a linea
                while ((line = Arch_Clientes.readLine()) != null) {
                    // si la línea es diferente a linea borrar, los cuales son los datos del cliente a eliminar entonces entra en el if
                    if (!line.trim().equals(LineaBorrar)) {
                        // se copian todas las lineas diferentes de la linea que se va a borrar en el archivo temporal
                        Arch_Temporal.println(line);
                        Arch_Temporal.flush();
                    }
                }

                // se cierran los archivos
                Arch_Temporal.close();
                Arch_Clientes.close();

                // se borra el archivo con los datos de los clientes registrados
                file2.delete();
                // se renombra el archivo temporal con el nombre del archivo de los clientes registrados
                // esto porque en dicho archivo ya estan los datos del cliente eliminados
                inFile.renameTo(new File("clientes_prestamos.txt"));
                JOptionPane.showMessageDialog(null, " Datos del Cliente Eliminados ", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                //limpio los datos de los jtextfields
                jTextF_Identificacion.setText("");
                jTextF_Nombre.setText("");
                jTextF_Primer_Apellido.setText("");
                jTextF_Segundo_Apellido.setText("");
                jTextF_Edad.setText("");
                jTextF_Ingreso_Mensual.setText("");
                jButton_Actualizar.setEnabled(false);
                jButton_Eliminar.setEnabled(false);
                jTextF_Identificacion.setEnabled(true);

            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, " Archivo sin datos ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        //boton para cerrar la ventana
        this.dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    //Método que Restringe los caracteres especiales basado en su representación en código ASCII
    public void RestringirCaracteres(java.awt.event.KeyEvent caracter) {
        if (caracter.getKeyChar() >= 33 && caracter.getKeyChar() <= 47
                || caracter.getKeyChar() >= 58 && caracter.getKeyChar() <= 64
                || caracter.getKeyChar() >= 91 && caracter.getKeyChar() <= 96
                || caracter.getKeyChar() >= 123 && caracter.getKeyChar() <= 208
                || caracter.getKeyChar() >= 210 && caracter.getKeyChar() <= 240
                || caracter.getKeyChar() >= 242 && caracter.getKeyChar() <= 8482) {

            // si esta el rango establecido, entonces, se desecha el dato ingresado por el usuario y se muestra el mensaje del JPotionPane.
            caracter.consume();
            JOptionPane.showMessageDialog(null, "No se permiten caracteres especiales ");
        }
    }

    //Método que que valida que solo se ingresen números enteros. 
    public void Validar_Solo_Numeros_Enteros(java.awt.event.KeyEvent caracter2) {
        // Sino esta el rango establecido, entonces, se desecha el dato ingresado por el usuario y se muestra el mensaje del JPotionPane.
        if ((caracter2.getKeyChar() < '0' || caracter2.getKeyChar() > '9') & (caracter2.getKeyChar() != '\b')) {
            caracter2.consume();
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo Numeros");
        }
    }

    //Método que que valida que solo se ingresen Números ya sea enteros o con decimales.
    public void Validar_Solo_Numeros_y_Decimales(java.awt.event.KeyEvent caracter3) {
        // Sino esta el rango establecido, entonces, se desecha el dato ingresado por el usuario y se muestra el mensaje del JPotionPane.
        if ((caracter3.getKeyChar() < '0' || caracter3.getKeyChar() > '9') && (caracter3.getKeyChar() != '\b') && caracter3.getKeyChar() != '.') {
            caracter3.consume();
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo Numeros");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Botones;
    private javax.swing.JPanel Panel_Datos_Cliente;
    private javax.swing.JPanel Panel_Titulo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Menu;
    private javax.swing.JButton jButton_Nuevo_Cliente;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_Verificar_ID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextF_Edad;
    private javax.swing.JTextField jTextF_Identificacion;
    private javax.swing.JTextField jTextF_Ingreso_Mensual;
    private javax.swing.JTextField jTextF_Nombre;
    private javax.swing.JTextField jTextF_Primer_Apellido;
    private javax.swing.JTextField jTextF_Segundo_Apellido;
    // End of variables declaration//GEN-END:variables
}
