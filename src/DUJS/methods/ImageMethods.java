package DUJS.methods;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageMethods {
    
    public int insertImage(File image,String userid,String username,int status){
        conn con = new conn();
        FileInputStream inputstream = null;
        PreparedStatement ps = null;
        
        try{
            inputstream = new FileInputStream(image);
            ps = con.connect.prepareStatement("insert into userimg values(?,?,?)");
            ps.setString(1, userid);
            ps.setString(2, username);
            ps.setBinaryStream(3, inputstream,(int)(image.length()));
            status = ps.executeUpdate();
            
          
        }catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
    
    public Icon getImage(JLabel label,String userid){
        conn con = new conn();
        Icon rimg = null;
        try{
            Statement s = con.connect.createStatement();
            String sql = "select * from userimg where userid= '"+userid+"' ";
            ResultSet rs = s.executeQuery(sql);
             
            if(rs.next()){
                byte[] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                
               rimg = new  ImageIcon(myimg);
              
            }
        }catch(Exception e){
            e.printStackTrace();}
        return rimg;      
 }
    
    public Icon reSize(String path,JLabel label){
        ImageIcon img = new ImageIcon(path);
        Image image  = img.getImage();
        Image imgScale = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        Icon icon = new ImageIcon(imgScale);
        
        return icon;
        
    }
    
    public void updateImage(File image,String userid,String username){
        conn con = new conn();
        FileInputStream inputstream = null;
        PreparedStatement ps = null;
        
        try{
            inputstream = new FileInputStream(image);
            ps = con.connect.prepareStatement("insert into userimg values(?) where userid = "+userid);
            ps.setBinaryStream(1, inputstream,(int) image.length());
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
}

    