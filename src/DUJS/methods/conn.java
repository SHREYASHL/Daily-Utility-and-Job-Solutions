package DUJS.methods;

import java.sql.*;

public class conn {
    
    Statement s;
    public Connection connect;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect = DriverManager.getConnection("jdbc:mysql://duandjs.cu53dfzsb8ru.ap-south-1.rds.amazonaws.com:3306/users","AWScon","Askmyname");
            connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users","system","123456789");
            s = connect.createStatement();
        }catch(Exception e){
                e.printStackTrace();
        }
    }
}
