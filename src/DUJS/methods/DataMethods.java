package DUJS.methods;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class DataMethods {
        
     public void addPlaceHolder(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }
    public void removePlaceHolder(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.ORANGE);
    }
    public String reAdd(String resadd,String strtn,String area,String landmark,String city,String pin,String state){
        
       String fulladd = resadd +" "+strtn + "\n near "+landmark+", "+area+",\n"+city+"-"+pin+",\n"+state;
       return fulladd;
    }
    
}
