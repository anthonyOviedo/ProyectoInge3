/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smart_msph.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author leiner
 */
public class RelDatabase { 
    public static final String PROPERTIES_FILE_NAME="Smart_msph.properties";        
    Connection cnx;
    public RelDatabase(){
        cnx=this.getConnection();            
    }
    public Connection getConnection(){
        try {
            Properties prop = new Properties();
            prop.load(this.getClass().getResourceAsStream(PROPERTIES_FILE_NAME));
            String driver = prop.getProperty("database_driver");
            String server = prop.getProperty("database_server");
            String port = prop.getProperty("database_port");
            String user = prop.getProperty("database_user");
            String password = prop.getProperty("database_password");
            String database = prop.getProperty("database_name");
            
            String URL_conexion="jdbc:mysql://"+ server+":"+port+"/"+database+"?user="+user+"&password="+password+"&useSSL=false";
            Class.forName(driver).newInstance();
            return DriverManager.getConnection(URL_conexion);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(-1);
        } 
        return null;
    }

    public int executeUpdate(String statement) {
        try {
            Statement stm = cnx.createStatement();
            stm.executeUpdate(statement);
            return stm.getUpdateCount();
        } catch (SQLException ex) {
            return 0;
        }
    }
    public ResultSet executeQuery(String statement){
        try {
            Statement stm = cnx.createStatement();
            return stm.executeQuery(statement);
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public int executeUpdateWithKeys(String statement) {
        try {
            Statement stm = cnx.createStatement();
            stm.executeUpdate(statement,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stm.getGeneratedKeys();
            keys.next();
            return keys.getInt(1);
        } catch (SQLException ex) {
            return -1;
        }
    }    
}