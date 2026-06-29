
package View;


import Control.Ctrl_Cliente;
import Control.Ctrl_Medicamento;
import Modelo.Medicamentos;
import Modelo.Clientes;
import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Menu extends javax.swing.JFrame {

    int contador;
    DefaultTableModel tablaDatos, tablaInventario, tablaVentas;

    Ctrl_Cliente Cliente = new Ctrl_Cliente();
    Ctrl_Medicamento medicamento = new Ctrl_Medicamento();
 //private Ctrl_Medicamento medicamento;
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        transparenciaButton();
           tablaDatos = (DefaultTableModel) tbDatosCliente.getModel();
    Cliente.mostrarEnTabla(tablaDatos);
    //inventario
    tablaInventario = (DefaultTableModel) tbInventario.getModel();
    medicamento = new Ctrl_Medicamento();
    medicamento.mostrarEnTabla(tablaInventario);
    //Ventas
    tablaVentas = (DefaultTableModel) tbDatosVentas.getModel();
    contador = 1;

    }

    public void transparenciaButton() {

        //BOTONES USUARIO
        btnHome.setOpaque(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setBorderPainted(false);

        btnCliente.setOpaque(false);
        btnCliente.setContentAreaFilled(false);
        btnCliente.setBorderPainted(false);

        btnVentas.setOpaque(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setBorderPainted(false);

        btnInventario.setOpaque(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setBorderPainted(false);

        //BOTONES CLIENTE
        btnAgregarCliente.setOpaque(false);
        btnAgregarCliente.setContentAreaFilled(false);
        btnAgregarCliente.setBorderPainted(false);

        btnEliminarCliente.setOpaque(false);
        btnEliminarCliente.setContentAreaFilled(false);
        btnEliminarCliente.setBorderPainted(false);

        btnModificarCliente.setOpaque(false);
        btnModificarCliente.setContentAreaFilled(false);
        btnModificarCliente.setBorderPainted(false);

        btnBuscarCliente.setOpaque(false);

        btnBuscarCliente.setContentAreaFilled(false);
        btnBuscarCliente.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JP_Area = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatosCliente = new javax.swing.JTable();
        btnModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosVentas = new javax.swing.JTable();
        btnAgregarMedicmanto = new javax.swing.JButton();
        txtCantidadVentas = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnComprarVentas = new javax.swing.JButton();
        txtMedicinaVentas = new javax.swing.JTextField();
        btnBuscarVenta = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbInventario = new javax.swing.JTable();
        txtMedicamentos = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAgregarInventario = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnBorrar2 = new javax.swing.JButton();
        btnModificar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ClienteFormulario1.png"))); // NOI18N
        btnCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ClienteFormulario2.png"))); // NOI18N
        btnCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ClienteFormulario2.png"))); // NOI18N
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, 70));

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Compra1.png"))); // NOI18N
        btnVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Compra2.png"))); // NOI18N
        btnVentas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Compra2.png"))); // NOI18N
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 70));

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Inventario1.png"))); // NOI18N
        btnInventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Inventario2.png"))); // NOI18N
        btnInventario.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Inventario2.png"))); // NOI18N
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 110, 60));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        JP_Area.setToolTipText("");
        JP_Area.setMinimumSize(new java.awt.Dimension(720, 453));
        JP_Area.setPreferredSize(new java.awt.Dimension(720, 423));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JP_Area.addTab("INICIO", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(810, 450));
        jPanel2.setMinimumSize(new java.awt.Dimension(810, 450));
        jPanel2.setPreferredSize(new java.awt.Dimension(810, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDatosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombre", "Telefono", "DNI"
            }
        ));
        jScrollPane2.setViewportView(tbDatosCliente);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 470, 240));

        btnModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ModificarCliente1.png"))); // NOI18N
        btnModificarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ModificarCliente2.png"))); // NOI18N
        btnModificarCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ModificarCliente2.png"))); // NOI18N
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 110, 70));

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EliminarCliente1.png"))); // NOI18N
        btnEliminarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EliminarCliente2.png"))); // NOI18N
        btnEliminarCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EliminarCliente2.png"))); // NOI18N
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 110, 70));

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BuscarCLiente1.png"))); // NOI18N
        btnBuscarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BuscarCliente2.png"))); // NOI18N
        btnBuscarCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BuscarCliente2.png"))); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 110, 70));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, 40));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, 40));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 200, 40));

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cliente1.png"))); // NOI18N
        btnAgregarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cliente2.png"))); // NOI18N
        btnAgregarCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cliente2.png"))); // NOI18N
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 110, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoUsuario.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        JP_Area.addTab("REGISTRO CLIENTES", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDatosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Medicamento", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(tbDatosVentas);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 610, 180));

        btnAgregarMedicmanto.setText("AGREGAR");
        btnAgregarMedicmanto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicmantoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarMedicmanto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 130, 40));
        jPanel3.add(txtCantidadVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 130, 40));
        jPanel3.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 130, 40));

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 130, 40));

        btnComprarVentas.setText("COMPRAR");
        btnComprarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarVentasActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 120, 40));
        jPanel3.add(txtMedicinaVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 40));

        btnBuscarVenta.setText("BUSCAR");
        btnBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVentaActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 130, 40));
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoVentas.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        JP_Area.addTab("VENTAS", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Producto", "Stock", "Precio Unitario"
            }
        ));
        jScrollPane3.setViewportView(tbInventario);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 610, 310));
        jPanel4.add(txtMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 40));
        jPanel4.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 150, 40));
        jPanel4.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 180, 40));

        btnAgregarInventario.setText("AGREGAR");
        btnAgregarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInventarioActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 50));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 40));

        btnBorrar2.setText("BORRAR");
        btnBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 100, 50));

        btnModificar2.setText("MODIFICAR");
        btnModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 100, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInventario.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        JP_Area.addTab("INVENTARIO", jPanel4);

        getContentPane().add(JP_Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 800, 530));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Home1.png"))); // NOI18N
        btnHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Home2.png"))); // NOI18N
        btnHome.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Home2.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoCliente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed

        JP_Area.setSelectedIndex(1);


    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed

        JP_Area.setSelectedIndex(2);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        JP_Area.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        JP_Area.setSelectedIndex(3);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
 Clientes c = new Clientes();
    c.setNombre(txtNombre.getText());
    c.setTelefono(Integer.parseInt(txtTelefono.getText()));
    c.setDni(Integer.parseInt(txtDni.getText()));
    Cliente.agregar(c);
    Cliente.mostrarEnTabla(tablaDatos);

    txtNombre.setText("");
    txtTelefono.setText("");
    txtDni.setText("");
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // Obtener el DNI del cliente seleccionado en la tabla
    int dni = (int) tbDatosCliente.getValueAt(tbDatosCliente.getSelectedRow(), 3);

    // Eliminar el cliente de la lista
    Cliente.eliminar(dni);

    // Actualizar la tabla de clientes
    Cliente.mostrarEnTabla(tablaDatos);
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
     // Obtener el índice de la fila seleccionada en la tabla
    int filaSeleccionada = tbDatosCliente.getSelectedRow();

    if (filaSeleccionada != -1) {
        // Obtener los datos de la fila seleccionada
        String nombre = txtNombre.getText();
        String telefonoStr = txtTelefono.getText();
        String dniStr = txtDni.getText();

        // Verificar si los campos de texto están vacíos
        if (nombre.isEmpty() || telefonoStr.isEmpty() || dniStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos con los datos correctos.");
            return;
        }

        int telefono = Integer.parseInt(telefonoStr);
        int dni = Integer.parseInt(dniStr);

        // Obtener el objeto Clientes correspondiente a la fila seleccionada
        Clientes cliente = Cliente.getLista().get(filaSeleccionada);

        // Modificar los datos del cliente
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setDni(dni);

        // Actualizar la tabla de clientes
        Cliente.mostrarEnTabla(tablaDatos);

        // Limpiar los campos de texto
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDni.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para modificar");
    }
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
   // Obtener el DNI del cliente a buscar
    String dniStr = txtDni.getText();

    // Verificar si el campo de DNI está vacío
    if (dniStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el DNI del cliente a buscar.");
        return;
    }

    int dni = Integer.parseInt(dniStr);

    // Buscar el cliente en la lista
    Clientes cliente = Cliente.buscar(dni);

    if (cliente != null) {
        // Mostrar los datos del cliente en los campos de texto
        txtNombre.setText(cliente.getNombre());
        txtTelefono.setText(String.valueOf(cliente.getTelefono()));
        txtDni.setText(String.valueOf(cliente.getDni()));
    } else {
        JOptionPane.showMessageDialog(this, "Cliente no encontrado");
        txtDni.setText("");
    }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnAgregarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInventarioActionPerformed

       Medicamentos c = new Medicamentos();
    c.setMedicina(txtMedicamentos.getText());
    c.setCantidad(Integer.parseInt(txtCantidad.getText()));
    c.setPrecio(Float.parseFloat(txtPrecio.getText()));
    medicamento.agregar(c);
    medicamento.mostrarEnTabla(tablaInventario);
    txtMedicamentos.setText("");
    txtCantidad.setText("");
    txtPrecio.setText("");

    }//GEN-LAST:event_btnAgregarInventarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombreMedicamento = txtMedicamentos.getText();
        Medicamentos c = medicamento.buscar(nombreMedicamento);
        if (c != null) {
 
            JOptionPane.showMessageDialog(null, "Producto: " + c.getMedicina() + "\nStock: " + c.getCantidad() + "\nPrecio: " + c.getPrecio());
        } else {
            JOptionPane.showMessageDialog(this, "Medicamento no encontrado");
        }

        txtMedicamentos.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarMedicmantoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicmantoActionPerformed
 String cantidadStr = txtCantidadVentas.getText();
    String precioStr = txtPrecioVenta.getText();

    // Verificar si los campos de texto están vacíos
    if (cantidadStr.isEmpty() || precioStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos");
        return;
    }

    int cantidad = Integer.parseInt(cantidadStr);
    float precio = Float.parseFloat(precioStr);

    Medicamentos v = new Medicamentos();
    v.setMedicina(txtMedicinaVentas.getText());
    v.setCantidad(cantidad);
    v.setPrecio(precio);
    tablaVentas.addRow(new Object[]{contador, txtMedicinaVentas.getText(), cantidadStr, precioStr, v.ventas()});
    txtMedicinaVentas.setText("");
    txtCantidadVentas.setText("");
    txtPrecioVenta.setText("");
    contador++;

    // Recalcular el total
    double t = 0;
    double p = 0;
    if (tbDatosVentas.getRowCount() > 0) {
        for (int i = 0; i < tbDatosVentas.getRowCount(); i++) {
            p = Double.parseDouble(tbDatosVentas.getValueAt(i, 4).toString());
            t += p;
        }
        txtTotal.setText("S/. " + new DecimalFormat("#.00").format(t));
    } else {
        txtTotal.setText("S/. 0.00");
    }

    }//GEN-LAST:event_btnAgregarMedicmantoActionPerformed

    private void btnBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVentaActionPerformed
    String nombreMedicamento = txtMedicinaVentas.getText();
    Medicamentos c = medicamento.buscar(nombreMedicamento);
    if (c != null) {
        txtPrecioVenta.setText(String.valueOf(c.getPrecio()));
    } else {
        JOptionPane.showMessageDialog(this, "Medicamento no encontrado");
        txtPrecioVenta.setText("");
    }
    }//GEN-LAST:event_btnBuscarVentaActionPerformed
private int numeroCompra = 1;
private double totalCompras = 0.0;

    private void btnComprarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarVentasActionPerformed
 // Obtener los datos de la tabla tbDatosVentas
    int rowCount = tbDatosVentas.getRowCount();
    if (rowCount > 0) {
        // Generar la boleta de compra
        String boleta = "===== BOLETA DE COMPRA =====\n";
        boleta += "Compra #" + numeroCompra + "\n\n";
        double total = 0.0;
        for (int i = 0; i < rowCount; i++) {
            String medicamento = (String) tbDatosVentas.getValueAt(i, 1);
            int cantidad = Integer.parseInt((String) tbDatosVentas.getValueAt(i, 2));
            double precio = Double.parseDouble((String) tbDatosVentas.getValueAt(i, 3));
            double subtotal = cantidad * precio;
            total += subtotal;
            boleta += "Medicamento: " + medicamento + "\n";
            boleta += "Cantidad: " + cantidad + "\n";
            boleta += "Precio: S/. " + precio + "\n";
            boleta += "Subtotal: S/. " + subtotal + "\n\n";
        }
        boleta += "===========================\n";
        boleta += "Total a pagar: S/. " + total + "\n";

        // Guardar los datos de la tabla tbDatosVentas en un archivo de texto
        try {
            FileWriter fw = new FileWriter("ventas.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Compra #" + numeroCompra + ":");
            for (int i = 0; i < rowCount; i++) {
                pw.println(tbDatosVentas.getValueAt(i, 1) + ", Cantidad: " + tbDatosVentas.getValueAt(i, 2) + ", Precio: " + tbDatosVentas.getValueAt(i, 3));
            }
            pw.println("Total compra: S/. " + total);
            totalCompras += total;
            pw.println("-------------------------");
            pw.println("Total acumulado: S/. " + totalCompras);
            pw.println("---");
            pw.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("Error al guardar datos de ventas: " + e.getMessage());
        }

        // Mostrar la boleta en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, boleta, "Boleta de Compra", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar los campos
        txtMedicinaVentas.setText("");
        txtCantidadVentas.setText("");
        txtPrecioVenta.setText("");
        txtTotal.setText("S/.");

        // Eliminar todas las filas de la tabla
        DefaultTableModel model = (DefaultTableModel) tbDatosVentas.getModel();
        model.setRowCount(0);
        numeroCompra++;
    } else {
        JOptionPane.showMessageDialog(this, "No hay productos en la tabla de ventas");
    }
    }//GEN-LAST:event_btnComprarVentasActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
 // Obtener el índice de la fila seleccionada en la tabla de ventas
    int filaSeleccionada = tbDatosVentas.getSelectedRow();

    if (filaSeleccionada != -1) {
        // Eliminar la fila seleccionada de la tabla
        tablaVentas.removeRow(filaSeleccionada);

        // Actualizar el contador y la tabla
        contador--;
        for (int i = filaSeleccionada; i < tablaVentas.getRowCount(); i++) {
            tablaVentas.setValueAt(i + 1, i, 0);
        }

        // Recalcular el total
        double t = 0;
        double p = 0;
        if (tbDatosVentas.getRowCount() > 0) {
            for (int i = 0; i < tbDatosVentas.getRowCount(); i++) {
                p = Double.parseDouble(tbDatosVentas.getValueAt(i, 4).toString());
                t += p;
            }
            txtTotal.setText("S/. " + new DecimalFormat("#.00").format(t));
        } else {
            txtTotal.setText(" ");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar");
    }      
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar2ActionPerformed
   int selectedRow = tbInventario.getSelectedRow();
    if (selectedRow != -1) {
        String nombreMedicamento = (String) tbInventario.getValueAt(selectedRow, 1);
        Medicamentos m = medicamento.buscar(nombreMedicamento);
        if (m != null) {
            medicamento.eliminar(m);
            medicamento.mostrarEnTabla(tablaInventario);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el medicamento");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un medicamento de la tabla");
    }
    }//GEN-LAST:event_btnBorrar2ActionPerformed

    private void btnModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar2ActionPerformed
  
        int selectedRow = tbInventario.getSelectedRow();
    if (selectedRow != -1) {
        String nombreMedicamento = (String) tbInventario.getValueAt(selectedRow, 1);
        int cantidad = (int) tbInventario.getValueAt(selectedRow, 2);
        float precio = (float) tbInventario.getValueAt(selectedRow, 3);

        Medicamentos m = new Medicamentos();
        m.setMedicina(nombreMedicamento);
        m.setCantidad(cantidad);
        m.setPrecio(precio);

        medicamento.modificar(m);
        medicamento.mostrarEnTabla(tablaInventario);
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un medicamento de la tabla");
    }
    }//GEN-LAST:event_btnModificar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JP_Area;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarInventario;
    private javax.swing.JButton btnAgregarMedicmanto;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrar2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarVenta;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnComprarVentas;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnModificar2;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbDatosCliente;
    private javax.swing.JTable tbDatosVentas;
    private javax.swing.JTable tbInventario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadVentas;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMedicamentos;
    private javax.swing.JTextField txtMedicinaVentas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
