import java.sql.Connection;
import java.sql.DriverManager;

public class DdFunctions {
    public Connection connectionToDb(String dbNamae, String user, String pass){
        Connection conn= null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbs:postgresql://localhost:5438/"+ dbNamae, user, pass);
            if (conn != null){
                System.out.println("Соединение установлнно");
            }
            else{
                System.out.println("Соединение не установленно");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;

    }
}
