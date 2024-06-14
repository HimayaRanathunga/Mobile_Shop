package user;
import business.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
        setLocationRelativeTo(this);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdateProduct = new javax.swing.JButton();
        txtproductNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpqnty = new javax.swing.JTextField();
        btnAddProduct = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        AddUs = new javax.swing.JButton();
        txtproductNO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btAll1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnUpdateProduct1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdateProduct.setBackground(new java.awt.Color(255, 255, 153));
        btnUpdateProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdateProduct.setText("Update");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 346, -1, -1));

        txtproductNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtproductNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtproductNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 127, 167, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 173, 140, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Product No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 129, 140, -1));

        cmbCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "iPhone", "Apple Watch", "iPad", "AirPods", "Mac", "Other" }));
        cmbCategory.setBorder(null);
        getContentPane().add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 170, 167, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 219, 153, -1));

        txtpname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 217, 167, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 262, 140, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 260, 167, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 305, 140, -1));

        txtpqnty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpqnty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtpqnty, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 303, 167, -1));

        btnAddProduct.setBackground(new java.awt.Color(255, 255, 153));
        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddProduct.setText("Add");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 346, 82, -1));

        jPanel1.setBackground(new java.awt.Color(148, 194, 194));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 27, -1, -1));

        AddUs.setBackground(new java.awt.Color(204, 204, 255));
        AddUs.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        AddUs.setText("ADD USER");
        AddUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUsActionPerformed(evt);
            }
        });
        jPanel1.add(AddUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, -1));

        txtproductNO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtproductNO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtproductNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductNOActionPerformed(evt);
            }
        });
        jPanel1.add(txtproductNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Product No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btAll1.setBackground(new java.awt.Color(204, 204, 255));
        btAll1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btAll1.setText("ALL PRODUCT");
        btAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAll1ActionPerformed(evt);
            }
        });
        jPanel1.add(btAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 127, -1, 203));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel8.setText("WELCOME HOME PAGE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 33, 503, -1));

        btnUpdateProduct1.setBackground(new java.awt.Color(255, 255, 153));
        btnUpdateProduct1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdateProduct1.setText("Log in menu");
        btnUpdateProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProduct1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateProduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 346, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/Background Image.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 390));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        if(checkNO())add();
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void AddUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUsActionPerformed
            Adduser mui=new Adduser();           
            mui.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_AddUsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        { String productNo =txtproductNO.getText();
        delete( productNo);}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtproductNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductNOActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        {
            String productNo =txtproductNo.getText();
            delete(productNo);
            add();
        }
 
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void btAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAll1ActionPerformed
            ViewAllPRODUCT mui=new ViewAllPRODUCT();           
            mui.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btAll1ActionPerformed

    private void btnUpdateProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProduct1ActionPerformed
           LoginUI mui=new LoginUI();           
            mui.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnUpdateProduct1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUs;
    private javax.swing.JButton btAll1;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JButton btnUpdateProduct1;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtpqnty;
    private javax.swing.JTextField txtproductNO;
    private javax.swing.JTextField txtproductNo;
    // End of variables declaration//GEN-END:variables


public void add(){
        int productNo = Integer.valueOf(txtproductNo.getText());
        String deviceName = txtpname.getText();
        String price = txtPrice.getText();
        int qnty = Integer.valueOf(txtpqnty.getText());
        String Category = cmbCategory.getSelectedItem().toString();
        
        Product pg = new Product(productNo,deviceName,price,qnty,Category);
     
        try{
            BufferedWriter df = new BufferedWriter(new FileWriter("Product.txt",true));
            df.append("\n"+pg.Print());
            JOptionPane.showMessageDialog(rootPane, "Product Updated/ADD Successfuly!");
            df.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }



public static void delete(String productNo){
        String data;
        boolean deleted = false;
        ArrayList arr=new ArrayList<>();
        try{

            BufferedReader p = new BufferedReader(new FileReader("Product.txt"));
            while((data = p.readLine())!=null){
                if(data.equals("")){
                    continue;
                }
                else{
                    String[] sData = data.split(",");

                    if(sData[0].equals(productNo)){
                        deleted = true;
                        continue;
                    }
                    else{
                        int productNom = Integer.valueOf(sData[0]);
                        String deviceName = sData[1];
                        String price = sData[2];
                        int qnty = Integer.valueOf(sData[3]);
                        String Category = sData[4];

                        Product pg =new Product(productNom,deviceName,price,qnty,Category);
                        arr.add(pg.Print());

                    }
                }
            }
            if(deleted){
                BufferedWriter dev;
                dev =new BufferedWriter(new FileWriter("Product.txt"));
                dev.write("");
                dev.close();
                int i = 0;
                while(i<arr.size()){
                    String line =String.valueOf(arr.get(i));
                    dev =new BufferedWriter(new FileWriter("Product.txt",true));
                    dev.append("\n"+line);
                    dev.close();
                    i++;
                }
                JOptionPane.showMessageDialog(null, "Deleted Sucessfully!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Deleted!");
            }
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
    }



public boolean checkNO(){
        try{
            BufferedReader pr = new BufferedReader(new FileReader("Product.txt"));
            String data;
            String deviceID = txtproductNo.getText();
            while((data = pr.readLine())!=null){
                String[] line = data.split(",");
                if(line[0].equals(deviceID)){
                    JOptionPane.showMessageDialog(rootPane, "Product ID Use");
                    return false;
                }     
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        return true;
    }

    
    
}
