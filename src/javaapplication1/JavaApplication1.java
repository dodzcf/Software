/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.sql.*;  
/**
 *
 * @author dodz
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/hms","root","12348765");
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from doctors");  
            while(rs.next())  
//            System.out.println(rs.getString(2));  
            con.close();  
            }catch(Exception e){ System.out.println(e);}  ;
                
    new NewJFrame().setVisible(true);
    }
    
}
