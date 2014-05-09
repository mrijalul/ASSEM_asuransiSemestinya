/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author BUNTORO
 */
import java.sql.*;
public class pegawai {
    private String username;
    private String pass;
    
    public pegawai(){}
    public pegawai(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getQuote(String masuk)
    {
        return "'"+masuk+"'";
    }
    public ResultSet LoginPegawai(String u,String p){
        Database db = new Database();
        String SQLString = "SELECT * from pegawai where username= "+getQuote(u)+" AND password = "+getQuote(p)+";";
        return db.getData(SQLString);
    }
    
    
    
    
}
