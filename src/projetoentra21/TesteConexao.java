package projetoentra21;
import java.sql.Connection;
public class TesteConexao {
	
	    public static void main(String[] args) {
	        try {
	            Connection conn = ConexaoFactory.getConnection();
	            System.out.println("Conexão estabelecida com sucesso!");
	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


