/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gestion;

import dao.daoCliente;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Leoch
 */
public class vClientes extends javax.swing.JInternalFrame {

    daoCliente daoCli = new daoCliente();
    DefaultTableModel model = new DefaultTableModel();
    Cliente cli;
    int index = -1;
    ArrayList<Cliente> lista;

    public vClientes() {
        initComponents();
        this.setTitle("Gestión de Clientes");

        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("APELLIDO");
        model.addColumn("DIRECCION");
        model.addColumn("TELEFONO");
        model.addColumn("EMPRESA");

        tablaClientes.setModel(model);

        this.setResizable(false);
        this.setSize(new Dimension(1000, 800));
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnBorrar.setEnabled(true);
        refrescartabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setText("Dirección");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setText("Empresa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 170, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 170, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 170, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));
        jPanel1.add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        btnGuardar.setEnabled(true);
        borrar();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Cliente cli = new Cliente();
        cli.setNombre(txtNombre.getText());
        cli.setApellido(txtApellido.getText());
        cli.setDireccion(txtDireccion.getText());
        cli.setTelefono(txtTelefono.getText());
        cli.setEmpresa(txtEmpresa.getText());

        if (daoCli.create(cli)) {
            JOptionPane.showMessageDialog(this, "Se creó correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al insertar");
        }
        refrescartabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        /*index = tablaClientes.getSelectedRow();
        cli = daoCli.read(lista.get(index).getID());
        txtNombre.setText(cli.getNombre());
        txtApellido.setText(cli.getApellido());
        txtDireccion.setText(cli.getDireccion());
        txtTelefono.setText(cli.getTelefono());
        txtEmpresa.setText(cli.getEmpresa());

        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnBorrar.setEnabled(true);*/
        // Obtener el índice de la fila seleccionada
        index = tablaClientes.getSelectedRow();

        // Verificar que se haya seleccionado una fila válida
        if (index != -1) {
            // Obtener los datos del cliente seleccionado
            cli = daoCli.read(lista.get(index).getID());

            if (cli != null) {
                // Asignar los datos del cliente a los JTextFields
                txtNombre.setText(cli.getNombre());
                txtApellido.setText(cli.getApellido());
                txtDireccion.setText(cli.getDireccion());
                txtTelefono.setText(cli.getTelefono());
                txtEmpresa.setText(cli.getEmpresa());

                // Habilitar o deshabilitar los botones correspondientes
                btnNuevo.setEnabled(false);
                btnGuardar.setEnabled(false);
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnBorrar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Cliente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente de la lista.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        cli.setNombre(txtNombre.getText());
        cli.setApellido(txtApellido.getText());
        cli.setDireccion(txtDireccion.getText());
        cli.setTelefono(txtTelefono.getText());
        cli.setEmpresa(txtEmpresa.getText());

        if (daoCli.update(cli)) {
            JOptionPane.showMessageDialog(this, "Se Editó correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al Editar");
        }
        refrescartabla();
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnBorrar.setEnabled(true);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (index > -1) {
            int res = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar este registro?", "ELIMINAR", JOptionPane.YES_NO_OPTION);

            if (res == 0) {
                if (daoCli.delete(lista.get(index).getID())) {
                    JOptionPane.showMessageDialog(this, "Se Eliminó correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al Eliminar");
                }
                refrescartabla();
                btnNuevo.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnBorrar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
                refrescartabla();
                borrar();
                btnNuevo.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnBorrar.setEnabled(true);
    }//GEN-LAST:event_btnBorrarActionPerformed

    public void refrescartabla() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        lista = daoCli.read();
        for (Cliente cliente : lista) {
            Object fila[] = new Object[6];
            fila[0] = cliente.getID();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getApellido();
            fila[3] = cliente.getDireccion();
            fila[4] = cliente.getTelefono();
            fila[5] = cliente.getEmpresa();

            // Agregar cada fila al modelo
            model.addRow(fila);
        }
    }

    public void borrar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmpresa.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
