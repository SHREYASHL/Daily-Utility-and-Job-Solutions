package DUJS.main;

import DUJS.methods.DataMethods;
import DUJS.methods.ImageMethods;
import DUJS.design.PassForg;
import DUJS.methods.conn;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {
  
    Signup1 sup = new Signup1();
    conn con = new conn(); 
    String path;
    DataMethods dm = new DataMethods();
    ImageMethods im = new ImageMethods();
    public String userName,userPass,userid,type;
 
    
    public LoginPage() {
        initComponents();
        this.lHidePass.setVisible(false);
        dm.addPlaceHolder(tfUser);
        dm.addPlaceHolder(tfPass);
        path = "src/DUJS/Images/logo.png";
        lLogo.setIcon(im.reSize(path, lLogo));
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
        jPanel2 = new javax.swing.JPanel();
        lLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        Loginbtn = new javax.swing.JButton();
        Signupbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        btnForget = new javax.swing.JButton();
        lShowPass = new javax.swing.JLabel();
        lHidePass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(24, 17, 68));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DUJS/Images/icons8_user_male_35px.png"))); // NOI18N

        tfUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfUser.setForeground(new java.awt.Color(255, 102, 51));
        tfUser.setText("Username");
        tfUser.setToolTipText("Enter Username");
        tfUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUserFocusLost(evt);
            }
        });
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DUJS/Images/icons8_password_35px.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(70, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(70, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 20));

        tfPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfPass.setForeground(new java.awt.Color(255, 102, 51));
        tfPass.setText("Password");
        tfPass.setToolTipText("Enter your Password");
        tfPass.setEchoChar('\u0000');
        tfPass.setPreferredSize(new java.awt.Dimension(64, 22));
        tfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPassFocusLost(evt);
            }
        });
        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });
        tfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPassKeyPressed(evt);
            }
        });

        Loginbtn.setBackground(new java.awt.Color(255, 255, 255));
        Loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Loginbtn.setForeground(new java.awt.Color(255, 102, 51));
        Loginbtn.setText("Login");
        Loginbtn.setBorderPainted(false);
        Loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });

        Signupbtn.setBackground(new java.awt.Color(255, 255, 255));
        Signupbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Signupbtn.setForeground(new java.awt.Color(255, 102, 51));
        Signupbtn.setText("SignUp");
        Signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 102, 51));
        exitbtn.setText("X");
        exitbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        exitbtn.setMaximumSize(new java.awt.Dimension(22, 25));
        exitbtn.setMinimumSize(new java.awt.Dimension(22, 25));
        exitbtn.setName(""); // NOI18N
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        btnForget.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnForget.setForeground(new java.awt.Color(255, 102, 51));
        btnForget.setText("Forget Password");
        btnForget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgetActionPerformed(evt);
            }
        });

        lShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DUJS/Images/icons8_eye_32px.png"))); // NOI18N
        lShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lShowPassMousePressed(evt);
            }
        });

        lHidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DUJS/Images/icons8_invisible_32px.png"))); // NOI18N
        lHidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lHidePassMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lHidePass)
                                    .addComponent(lShowPass)))
                            .addComponent(btnForget, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lHidePass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lShowPass))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Loginbtn))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnForget)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed

        String userName = tfUser.getText();
        String userPass = tfPass.getText();

        String q = "select * from login where username = '"+userName+"' and password = '"+userPass+"'";
        
        try{
            Statement s = con.connect.createStatement();
            ResultSet rs = s.executeQuery(q);
            
            if(rs.next()){
               type = rs.getString("Type");
               userid = rs.getString("userid");
               if(type.equals("Vendor")){
                    new appMainVen(userid).setVisible(true);
                    setVisible(false);
               }
               if(type.equals("NormalUser")){
                   new appMain(userid).setVisible(true);
                   setVisible(false);
               }
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
            }
            
        }catch(Exception e){
            e.printStackTrace();
          }
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
             if(evt.getSource()==exitbtn){
                 System.exit(0);
             }       
    }//GEN-LAST:event_exitbtnActionPerformed

    private void btnForgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgetActionPerformed

        new  PassForg().setVisible(true);
    }//GEN-LAST:event_btnForgetActionPerformed

    private void SignupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbtnActionPerformed

            setVisible(false);
            sup.setVisible(true);
    }//GEN-LAST:event_SignupbtnActionPerformed

    private void lHidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHidePassMousePressed
        
        lShowPass.setVisible(true);
        lHidePass.setVisible(false);
        tfPass.setEchoChar('*');
        
    }//GEN-LAST:event_lHidePassMousePressed

    private void lShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lShowPassMousePressed
        
        lHidePass.setVisible(true);
        lShowPass.setVisible(false);
        tfPass.setEchoChar((char)0);
    }//GEN-LAST:event_lShowPassMousePressed

    private void tfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPassKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            userName = tfUser.getText();
            userPass = tfPass.getText();
            String q = "select * from login where username = '"+userName+"' and password = '"+userPass+"'";
        
        
        try{
            Statement s = con.connect.createStatement();
            ResultSet rs = s.executeQuery(q);
            
            if(rs.next()){
               type = rs.getString("Type");
               userid = rs.getString("userid");
               if(type.equals("Vendor")){
                    new appMainVen(userid).setVisible(true);
                    setVisible(false);
               }
               if(type.equals("NormalUser")){
                   new appMain(userid).setVisible(true);
                   setVisible(false);
               }
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
            }
            
        }catch(Exception e){
            e.printStackTrace();
          }
        }
    }//GEN-LAST:event_tfPassKeyPressed

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        
    }//GEN-LAST:event_tfUserActionPerformed

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        
    }//GEN-LAST:event_tfPassActionPerformed

    private void tfUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusGained
        if(tfUser.getText().equals("Username")){
            tfUser.setText(null);
            tfUser.requestFocus();
            
            dm.removePlaceHolder(tfUser);
        }
    }//GEN-LAST:event_tfUserFocusGained

    private void tfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPassFocusGained
        if(tfPass.getText().equals("Password")){
            tfPass.setText(null);
            tfPass.requestFocus();
            tfPass.setEchoChar('*');
            
            dm.removePlaceHolder(tfPass);
        }
    }//GEN-LAST:event_tfPassFocusGained

    private void tfUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusLost
        if(tfUser.getText().length() == 0){
            dm.addPlaceHolder(tfUser);
            tfUser.setText("Username");
        }
    }//GEN-LAST:event_tfUserFocusLost

    private void tfPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPassFocusLost
        if(tfPass.getText().length() == 0){
            dm.addPlaceHolder(tfPass);
            tfPass.setEchoChar((char)0);
            tfPass.setText("Password");
            
        }
    }//GEN-LAST:event_tfPassFocusLost

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loginbtn;
    private javax.swing.JButton Signupbtn;
    private javax.swing.JButton btnForget;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lHidePass;
    private javax.swing.JLabel lLogo;
    private javax.swing.JLabel lShowPass;
    private javax.swing.JPasswordField tfPass;
    public javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}