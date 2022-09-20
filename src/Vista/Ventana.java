
package Vista;
import Conecction.Conectar;
import Modelo.CuerposDeAgua;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Ventana extends javax.swing.JFrame {
    ArrayList <CuerposDeAgua> Lista= new ArrayList();
    String Vec [];
    int contNivel;
    String nombre;
    int ID;
    String municipio;
    String tipoCuerpo;
    String tipoAgua;
    float IRCA;
    String mensaje;
    Connection con;  
    Statement st = null;
    Conectar C =new Conectar();
        public Ventana() {
        initComponents();  
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTipoCuerpo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        result1 = new javax.swing.JLabel();
        txtTipoAgua = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtIrca = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnProcesarDatos = new javax.swing.JButton();
        btnObtenerDatos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Entrada = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtIdBuscar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buttonCrearCurso = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        result3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreB = new javax.swing.JTextField();
        txtIdB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMunicipioB = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTipoCuerpoB = new javax.swing.JTextField();
        txtTipoAguaB = new javax.swing.JTextField();
        txtIrcaB = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("CUERPOS DE AGUA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 6, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(30000, 30000));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(400, 451));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 418));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Municipio");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de cuerpo de agua");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tipo de agua");

        jLabel15.setText("IRCA");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(result1))
                            .addComponent(btnIngresar)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtTipoCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtNombre)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel2))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIrca, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(381, 381, 381))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIrca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnIngresar)
                .addGap(87, 87, 87)
                .addComponent(result1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresar", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(600, 418));

        btnProcesarDatos.setText("Procesar datos");
        btnProcesarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarDatosActionPerformed(evt);
            }
        });

        btnObtenerDatos.setText("Obtener datos");
        btnObtenerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerDatosActionPerformed(evt);
            }
        });

        Entrada.setColumns(20);
        Entrada.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        Entrada.setRows(5);
        jScrollPane2.setViewportView(Entrada);

        Salida.setColumns(20);
        Salida.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        Salida.setRows(5);
        jScrollPane1.setViewportView(Salida);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnObtenerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcesarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnObtenerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProcesarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("Procesar datos", jPanel2);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("ID");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Resultado de busqueda");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Nombre");

        buttonCrearCurso.setText("Buscar");
        buttonCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearCursoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        jLabel8.setText("Municipio");

        jLabel9.setText("Tipo de cuerpo de agua");

        jLabel10.setText("Tipo de agua");

        jLabel11.setText("IRCA");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(42, 42, 42)
                                .addComponent(txtIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCrearCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(708, 708, 708))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtTipoAguaB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)
                                    .addComponent(txtMunicipioB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIrcaB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreB)
                            .addComponent(jLabel9)
                            .addComponent(txtTipoCuerpoB)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(buttonCrearCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoCuerpoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoAguaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIrcaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(90, 90, 90)
                .addComponent(result3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar/Eliminar", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 580, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerDatosActionPerformed
        String query = "SELECT * from Identificacion";
        Entrada.setText("");
        Entrada.setEditable(false);
        try (Connection conn = Conectar.AbrirConexion();Statement stmt = conn.createStatement()) {
            ResultSet resultado = stmt.executeQuery(query);
            ResultSetMetaData rsmd = resultado.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            String datos = "";
            while(resultado.next()){
                int id = resultado.getInt(1);
                nombre = resultado.getString(2);
                municipio = resultado.getString(3);
                tipoCuerpo = resultado.getString(4);
                tipoAgua = resultado.getString(5);
                float Irca = resultado.getFloat(6);
                datos = id+"  "+nombre+"\t"+municipio+"\t"+tipoCuerpo+"\t"+tipoAgua+"    "+Irca;
                Entrada.append(datos+"\n");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        
    }                                                 
     {                                                                      
    }//GEN-LAST:event_btnObtenerDatosActionPerformed

    private void btnProcesarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarDatosActionPerformed
        // TODO add your handling code here:
        CuerposDeAgua cuerpo = new CuerposDeAgua();
        String query = "SELECT * from Identificacion";
        Salida.setText(null);
        Salida.setEditable(false);
        String datos = "";
        contNivel = 0;
        try (Connection conn = Conectar.AbrirConexion();Statement stmt = conn.createStatement()) {
            ResultSet resultado = stmt.executeQuery(query);
            ResultSetMetaData rsmd = resultado.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while(resultado.next()){
                int id = resultado.getInt(1);
                nombre = resultado.getString(2);
                municipio = resultado.getString(3);
                tipoCuerpo = resultado.getString(4);
                tipoAgua = resultado.getString(5);
                float Irca = resultado.getFloat(6);
                if (Irca <= 35)
                    contNivel +=1;
                cuerpo = new CuerposDeAgua(id,nombre,municipio,tipoCuerpo,tipoAgua,Irca);
                Lista.add(cuerpo);
                datos = id+" "+ nombre+" "+municipio+" "+tipoCuerpo+" "+tipoAgua+" "+Irca;
                Salida.append(cuerpo.NivelR(Irca)+"\n");
            }
            Salida.append(contNivel+"\n");
            Salida.append(NombreRiesgoMedio()+"\n");
            Salida.append(NivelMasBajo()+"\n");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        
    }//GEN-LAST:event_btnProcesarDatosActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtIdB.getText());
        nombre = txtNombreB.getText();
        municipio = txtMunicipioB.getText();
        tipoCuerpo = txtTipoCuerpoB.getText();
        tipoAgua = txtTipoAguaB.getText();
        float Irca = Float.parseFloat(txtIrcaB.getText());
        Connection conn = Conectar.AbrirConexion();
        try {
            st = conn.createStatement();
            String Editar = "UPDATE Identificacion "
               + "SET " + " Nombre='"+nombre+"', Municipio='"+municipio+"',TipoCuerpo='"+tipoCuerpo+"',TipoAgua='"+tipoAgua+"',IRCA="+Irca
               + " WHERE  ID=" + id + ";";
            st.executeUpdate(Editar);
            String mensaje = "DATOS ACTUALIZADOS";
            C.CerrarConexion(conn);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar_Campo_Edicion();
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void buttonCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearCursoActionPerformed
        // TODO add your handling code here:
        String buscar = txtIdBuscar.getText();
        String query = "SELECT * from Identificacion where id=" + buscar;
        
        try (Connection conn = Conectar.AbrirConexion(); Statement stmt = conn.createStatement()) {
            ResultSet resultado = stmt.executeQuery(query);
            ResultSetMetaData rsmd = resultado.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            nombre = resultado.getString(2);
            String id = resultado.getString(1);
            municipio = resultado.getString(3);
            tipoCuerpo = resultado.getString(4);
            tipoAgua = resultado.getString(5);
            String Irca = resultado.getString(6);
            txtIdB.setText(id);
            txtNombreB.setText(nombre);
            txtMunicipioB.setText(municipio);
            txtTipoCuerpoB.setText(tipoCuerpo);
            txtTipoAguaB.setText(tipoAgua);
            txtIrcaB.setText(Irca);
            
               
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "EL REGISTRO NO SE ENCUENTRA EN LA BASE DE DATOS");
            txtIdBuscar.setText(" ");
        } 
        
    }//GEN-LAST:event_buttonCrearCursoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        //String sql = "Delete from tercero where id = "+cedula;
        Connection conn = Conectar.AbrirConexion();
        int id = Integer.parseInt(txtIdB.getText());
        try {
            st = conn.createStatement();
            String sql = "Delete from IDENTIFICACION where ID = "+id;
            st.executeUpdate(sql);
            String mensaje = "REGISTRO ELIMINADO";
            txtIdBuscar.setText(" ");
            C.CerrarConexion(conn);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar_Campo_Edicion();
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        nombre = txtNombre.getText();
         ID = Integer.parseInt(txtId.getText());
         municipio = txtMunicipio.getText();
         IRCA = Float.parseFloat(txtIrca.getText());
         tipoCuerpo = txtTipoCuerpo.getText();
         tipoAgua = txtTipoAgua.getText();   
        CuerposDeAgua cuerpo = new CuerposDeAgua(ID,nombre,municipio,tipoCuerpo,tipoAgua,IRCA);
        
        Lista.add(cuerpo);
        Connection conn = Conectar.AbrirConexion();
        try{
            Statement st = conn.createStatement();
            String sql = "INSERT INTO IDENTIFICACION (id,nombre,municipio,tipoCuerpo,tipoAgua,irca) VALUES ("
                + ID + ", " +"'"+ nombre +"'" +", " + "'"+ municipio+"'" +", "+ "'"+tipoCuerpo +"'" +"," +"'" +tipoAgua +"'" +", " + IRCA + ");";
            st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "REGISTRO INGRESADO");
        }
        catch(Exception x){
            //JOptionPane.showMessageDialog(null, x.getMessage().toString());
            JOptionPane.showMessageDialog(null, "ERROR DE INGRESO");
        }
        txtIrca.setText(null);
        txtMunicipio.setText(null);
        txtNombre.setText(null);
        txtId.setText(null);
        txtTipoAgua.setText(null);
        txtTipoCuerpo.setText(null);
        
    }//GEN-LAST:event_btnIngresarActionPerformed
    
    public static void main(String args[]) {
        Conectar.AbrirConexion();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    public void limpiar_Campo(){
        txtNombre.setText("");
        txtId.setText("");
        txtMunicipio.setText("");
        txtTipoCuerpo.setText("");
        txtTipoAgua.setText("");
        txtIrca.setText("");
        txtNombre.requestFocus();
    }
    
    public void limpiar_Campo_Edicion(){
        txtNombreB.setText("");
        txtIdB.setText("");
        txtMunicipioB.setText("");
        txtTipoCuerpoB.setText("");
        txtTipoAguaB.setText("");
        txtIrcaB.setText("");
        txtNombreB.requestFocus();
    }
    public void CrearLista(CuerposDeAgua cuerpo){
        Lista.add(cuerpo);
    }
    
    public void Ingresar_Cuerpo() {
        ID = Integer.parseInt(txtId.getText());
        nombre = txtNombre.getText();
        municipio = txtMunicipio.getText();
        tipoCuerpo = txtTipoCuerpo.getText();
        tipoAgua = txtTipoAgua.getText();
        IRCA = Float.parseFloat(txtIrca.getText());
     
        CuerposDeAgua  Cuerpo = new CuerposDeAgua(ID,nombre, municipio, tipoCuerpo, tipoAgua,IRCA);
        CrearLista(Cuerpo);
        Connection conn = Conectar.AbrirConexion();
            try{
                st = conn.createStatement();
                String sql = "INSERT INTO Identificacion (ID,Nombre,Municipio,TipoCuerpo,TipoAgua,IRCA) VALUES ("
                    + ID + ", " +"'"+ nombre +"'" +", " + "'"+ municipio+"'" +", "+ "'"+tipoCuerpo +"'" +"," +"'" +tipoAgua +"'" +", " + IRCA + ");";
                st.executeUpdate(sql);
                C.CerrarConexion(conn);
                JOptionPane.showMessageDialog(null, "DATOS INGRESADOS");
            }
            catch(Exception x){
                //JOptionPane.showMessageDialog(null, x.getMessage().toString());
                JOptionPane.showMessageDialog(null, "FALLA AL INGRESAR LOS DATOS");
            }
    }
        public void Niveles(){
        for(int i = 0; i<Lista.size();i++)
            Salida.append(""+NivelR(Lista.get(i).getIrca())+"\n");
    }
    public String NivelR(float val)// NIVEL DE RIESGO DE CADA CUERPO
    {
        String nivelRiesgo;
         if (val >= 0 && val <= 5)
            nivelRiesgo = "SIN RIESGO";
        else if (val >5 && val <= 14)
            nivelRiesgo = "BAJO";
        else if (val >14 && val <= 35)
            nivelRiesgo = "MEDIO";
        else if (val > 35 && val <= 80)
            nivelRiesgo = "ALTO";
        else 
            nivelRiesgo = "INVIABLE SANITARIAMENTE";  
        return nivelRiesgo;
    }
    public String NombreRiesgoMedio()//NOMBRES DE CUERPOS CON NIVEL RIEGO MEDIO 
    {
        mensaje="";
        int contador = 0;
        for (int k=0;k<Lista.size();k++) 
        {
            if (Lista.get(k).getIrca() > 14 && Lista.get(k).getIrca() <= 35) 
            {   
                mensaje = Lista.get(k).getNombre()+"  " + mensaje ;
                contador +=1;
            }    
        }
        if (contador == 0)
            mensaje = "NA";   
        return mensaje;
        
    }
    public  String NivelMasBajo () // NOMBRE Y POSICION DEL CUERPO CON VIVEL MAS BAJO
    {
        
        int pos =0;
        float mayor = 1000;
        for (int k=0;k<Lista.size();k++) 
        {
            if (Lista.get(k).getIrca() <= mayor) 
            {
                mayor = Lista.get(k).getIrca();
                pos = k;
            }    
        }
        mensaje = Lista.get(pos).getNombre()+ "  "+ Lista.get(pos).getId();
        return mensaje;
        //Salida.append(Lista.get(pos).getNombre()+ "  "+ Lista.get(pos).getId());
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Entrada;
    private javax.swing.JTextArea Salida;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JButton btnObtenerDatos;
    public javax.swing.JButton btnProcesarDatos;
    public javax.swing.JButton buttonCrearCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel result1;
    private javax.swing.JLabel result3;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdB;
    private javax.swing.JTextField txtIdBuscar;
    private javax.swing.JTextField txtIrca;
    private javax.swing.JTextField txtIrcaB;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtMunicipioB;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtTipoAgua;
    private javax.swing.JTextField txtTipoAguaB;
    private javax.swing.JTextField txtTipoCuerpo;
    private javax.swing.JTextField txtTipoCuerpoB;
    // End of variables declaration//GEN-END:variables

    
}
