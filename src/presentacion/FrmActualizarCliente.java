package presentacion;
import entidades.*;
import javax.swing.JOptionPane;
import operaciones.*;

public class FrmActualizarCliente extends javax.swing.JFrame {
    
    FrmRegistroEmpleados re = new FrmRegistroEmpleados(); 
    public static ListaClientes lc;
    ListaEmpleados le = re.getListaEmpleados();
    private int costoPasaje;
    
    public FrmActualizarCliente(ListaClientes lc) {
        FrmActualizarCliente.lc = lc;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public ListaClientes getListaClientes(){
        return lc;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDniCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbDestino = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNAsiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCostoPasaje = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreAvion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantidadMaletas = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnRecalcular = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 340, 40));

        btnAtras.setBackground(new java.awt.Color(255, 102, 102));
        btnAtras.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATOS DEL CLIENTE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 300, 40));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DNI: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 80, 30));

        txtDniCliente.setEditable(false);
        jPanel1.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 220, 30));

        jLabel6.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NOMBRE:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, 30));

        txtNombreCliente.setEditable(false);
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 220, 30));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DESTINO: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 110, 20));

        cbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EE.UU", "CANADA", "REINO UNIDO", "ESPAÑA", "BRASIL", "FRANCIA", "ALEMANIA", "ITALIA", "JAPON", "AUSTRALIA" }));
        cbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(cbDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 220, -1));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("N° ASIENTO: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 130, 30));
        jPanel1.add(txtNAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 220, 30));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("COSTO (PASAJE):");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 160, 30));

        txtCostoPasaje.setEditable(false);
        jPanel1.add(txtCostoPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 220, 30));

        jLabel10.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ID:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 90, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 220, 30));

        jLabel11.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("NOMBRE DEL AVIÓN:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 170, 30));

        txtNombreAvion.setEditable(false);
        jPanel1.add(txtNombreAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 220, 30));

        jLabel12.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CANTIDAD DE MALETAS: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 200, 30));

        txtCantidadMaletas.setEditable(false);
        jPanel1.add(txtCantidadMaletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 220, 30));

        btnActualizar.setBackground(new java.awt.Color(51, 255, 102));
        btnActualizar.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 190, 40));

        btnRecalcular.setBackground(new java.awt.Color(102, 153, 255));
        btnRecalcular.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 12)); // NOI18N
        btnRecalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnRecalcular.setText("RECALCULAR");
        btnRecalcular.setEnabled(false);
        btnRecalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 130, 30));

        btnConsultarCliente.setBackground(new java.awt.Color(204, 204, 255));
        btnConsultarCliente.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 12)); // NOI18N
        btnConsultarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultarCliente.setText("CONSULTAR");
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRecalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecalcularActionPerformed
        int indice = cbDestino.getSelectedIndex();
        switch (indice) {
            case 0 -> {
                //EEUU
                costoPasaje = 2800;
                txtNombreAvion.setText("Boeing 737");
            }
            case 1 -> {
                //CANADA
                costoPasaje = 3200;
                txtNombreAvion.setText("Airbus A320");
            }
            case 2 -> {
                //REINO UNIDO
                costoPasaje = 5700;
                txtNombreAvion.setText("Boeing 777");
            }
            case 3 -> {
                //ESPAÑA
                costoPasaje = 3000;
                txtNombreAvion.setText("Airbus A330");
            }
            case 4 -> {
                //BRASIL
                costoPasaje = 1500;
                txtNombreAvion.setText("Boeing 767");
            }
            case 5 -> {
                //FRANCIA
                costoPasaje = 3400;
                txtNombreAvion.setText("Airbus A350");
            }
            case 6 -> {
                //ALEMANIA
                costoPasaje = 4000;
                txtNombreAvion.setText("Embraer E-Jet");
            }
            case 7 -> {
                //ITALIA
                costoPasaje = 4200;
                txtNombreAvion.setText("Bombardier CRJ");
            }
            case 8 -> {
                //JAPON
                costoPasaje = 7000;
                txtNombreAvion.setText("McDonnell Douglas MD-80");
            }
            case 9 -> {
                //AUSTRALIA
                costoPasaje = 8000;
                txtNombreAvion.setText("Sukhoi Superjet 100");
            }   
        }
        txtCostoPasaje.setText(String.valueOf(costoPasaje));
        btnRecalcular.setEnabled(false);
        btnActualizar.setEnabled(true);
    }//GEN-LAST:event_btnRecalcularActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        lc.Modificar(txtId.getText(), Double.parseDouble(txtCostoPasaje.getText()) , Integer.parseInt(txtNAsiento.getText()), (String) cbDestino.getSelectedItem(), txtNombreAvion.getText());
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        String id = txtId.getText();
        if (id == null) return;
        Cliente cliente = lc.buscar(id);
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado al cliente");
            return;
        }
        JOptionPane.showMessageDialog(null, "Cliente encontrado");
        txtNombreCliente.setText(cliente.getNombres());
        txtDniCliente.setText(cliente.getDni());
        cbDestino.setSelectedItem(cliente.getDestino());
        txtNAsiento.setText(String.valueOf(cliente.getnAsiento()));
        txtCostoPasaje.setText(String.valueOf(cliente.getCostoPasaje() - 500 * cliente.getMaletas()));
        txtNombreAvion.setText(cliente.getNombreAvion());
        txtCantidadMaletas.setText(String.valueOf(cliente.getMaletas()));
        btnRecalcular.setEnabled(true);
        btnConsultarCliente.setEnabled(false);
        txtId.setEditable(false);
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        new FrmRegistroClientes().setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDestinoActionPerformed
        btnActualizar.setEnabled(false);
        btnRecalcular.setEnabled(true);
    }//GEN-LAST:event_cbDestinoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnRecalcular;
    private javax.swing.JComboBox<String> cbDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidadMaletas;
    private javax.swing.JTextField txtCostoPasaje;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNAsiento;
    private javax.swing.JTextField txtNombreAvion;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
