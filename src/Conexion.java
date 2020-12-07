import java.sql.*;

public class Conexion {
        Connection cn;
    public Connection conexion(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/veterinaria_duoc?useSSL=false","root","duoc2020");
            System.out.println("Conecta");
           
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        return cn;
    
    }
    
}
