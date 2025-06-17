
package Frutaria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class FrutaConexaoDB {
    
    public static Connection conexaoDB() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/frutaria"; // Verifique se o MySQL está rodando na porta 3306
        String usuario = "root"; // Altere se seu usuário for diferente
        String senha = ""; // Altere se sua senha for diferente
        
        return DriverManager.getConnection(url, usuario, senha);
    }
}
    

