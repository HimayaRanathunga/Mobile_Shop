package user;
import business.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Homech extends javax.swing.JFrame {

    DefaultTableModel tblModel;
    public Homech() {
       
        initComponents();
        setLocationRelativeTo(this);
        
        tblModel = new DefaultTableModel();
        tbdeviceData.setModel(tblModel);
        
        tblModel.addColumn("Device ID");
        tblModel.addColumn("Category");
        tblModel.addColumn("Device Name");
        tblModel.addColumn("Price");
        tblModel.addColumn("Quintity");        
        tblModel.setRowCount(0);
        
        try{
            BufferedReader dr = new BufferedReader(new FileReader("Product.txt"));
            String line;
            while((line=dr.readLine())!=null){
                if(line.equals("")){
                    continue;
                }
                else{
                    String[] data =line.split(",");
                    tblModel.addRow(new Object[]{data[0],data[4],data[1],data[2],data[3]});
                }
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        txtproductNO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnUpdateProduct1 = new javax.swing.JButton();
        btAll1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdeviceData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        btnDelete.setBackground(new java.awt.Color(102, 102, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtproductNO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtproductNO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtproductNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductNOActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Product No");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtproductNO, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnDelete))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtproductNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 340, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setText("CASHIER HOME PAGE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 320, -1));

        btnUpdateProduct1.setBackground(new java.awt.Color(255, 255, 153));
        btnUpdateProduct1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdateProduct1.setText("Log in menu");
        btnUpdateProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProduct1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateProduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        btAll1.setBackground(new java.awt.Color(255, 204, 204));
        btAll1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btAll1.setText("PRODUCT CATAGORIZE");
        btAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAll1ActionPerformed(evt);
            }
        });
        getContentPane().add(btAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 340, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 204));

        tbdeviceData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbdeviceData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 520, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/Background Image.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        { String productNo =txtproductNO.getText();
        delete( productNo);}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtproductNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductNOActionPerformed

    private void btAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAll1ActionPerformed
            ViewAllPRODUCTch mui=new ViewAllPRODUCTch();           
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
            java.util.logging.Logger.getLogger(Homech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Homech().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAll1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdateProduct1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdeviceData;
    private javax.swing.JTextField txtproductNO;
    // End of variables declaration//GEN-END:variables
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





    
    
}
