package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlServerConnection {
    public static Connection conectar() {
        String config = "jdbc:sqlserver://localhost:1433;database=matriculasSis2;user=sa;password=1234;loginTimeout=10";
        Connection ans = null;
        try {
            ans = DriverManager.getConnection(config);
        } catch (SQLException ex) {
            Logger.getLogger(SqlServerConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ans;
    }
}