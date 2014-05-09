package code;
import java.sql.*;
public class Database {
    private Statement stat;
    private Connection conn;
    private ResultSet rs;
    
    public Database(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/assurance","root","");
            stat = conn.createStatement();
        }catch(Exception e){}                                                                                 
    }
    public ResultSet getData(String SQLString){
        try{
            rs = stat.executeQuery(SQLString);
        }catch(Exception e){}
        return rs;
    }
    public void query(String SQLString){
        try{
            stat.executeUpdate(SQLString);
        }catch(Exception e){}
    }
}

