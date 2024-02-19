package presentacion;

import entidades.Cliente;
import javax.swing.JOptionPane;
import operaciones.ListaClientes;

public class FrmCancelacionVuelos extends javax.swing.JFrame {
    
    private static ListaClientes lc;

    public FrmCancelacionVuelos(ListaClientes lc) {
        FrmCancelacionVuelos.lc = lc;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNroAsiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAvion = new javax.swing.JTextField();
        btnConfirmarCancelacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CANCELACIÓN DE VUELOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 370, 50));

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 110, 30));

        txtNombre.setEditable(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 180, 30));

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("INGRESAR ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 130, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 180, 30));

        btnBuscar.setBackground(new java.awt.Color(204, 204, 255));
        btnBuscar.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 100, 30));

        btnAtras.setBackground(new java.awt.Color(255, 102, 102));
        btnAtras.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 120, 40));

        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("DNI:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 110, 30));

        txtDni.setEditable(false);
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 180, 30));

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Destino:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 110, 30));

        txtDestino.setEditable(false);
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 180, 30));

        jLabel7.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nro Asiento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 110, 30));

        txtNroAsiento.setEditable(false);
        jPanel1.add(txtNroAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 180, 30));

        jLabel8.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Avión:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 110, 30));

        txtAvion.setEditable(false);
        jPanel1.add(txtAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 180, 30));

        btnConfirmarCancelacion.setBackground(new java.awt.Color(255, 102, 102));
        btnConfirmarCancelacion.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        btnConfirmarCancelacion.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmarCancelacion.setText("CONFIRMAR CANCELACIÓN");
        btnConfirmarCancelacion.setEnabled(false);
        btnConfirmarCancelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCancelacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmarCancelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String id = txtId.getText();
            Cliente cliente = lc.buscar(id);
            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                return;
            }
            JOptionPane.showMessageDialog(null, "Cliente encontrado");
            txtNombre.setText(cliente.getNombres());
            txtDni.setText(cliente.getDni());
            txtDestino.setText(cliente.getDestino());
            txtNroAsiento.setText(String.valueOf(cliente.getnAsiento()));
            txtAvion.setText(cliente.getNombreAvion());
            btnBuscar.setEnabled(false);
            btnConfirmarCancelacion.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Text no identificado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        new FrmRegistroClientes().setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnConfirmarCancelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCancelacionActionPerformed
        if (lc.Eliminar(lc.buscar(txtId.getText()))) {
            JOptionPane.showMessageDialog(null, "Vuelo cancelado con éxito");
            txtId.setText("");
            txtNombre.setText("");
            txtDni.setText("");
            txtDestino.setText("");
            txtNroAsiento.setText("");
            txtAvion.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido cancelar el vuelo");
        }

    }//GEN-LAST:event_btnConfirmarCancelacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfirmarCancelacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAvion;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroAsiento;
    // End of variables declaration//GEN-END:variables
}
