package projetoentra21;

public class TesteConexao {
	
	    public static void main(String[] args) {
	       
	    	Usuario usuario = new Usuario("joao", "silva", "jojo", "joao@gmail", "ff");
	    	UsuarioDAOImpl dao = new UsuarioDAOImpl();
	    	dao.inserirUsuario(usuario);
	    	
	    	
	    	
	    	
	    	
	    	
	    } 	
	}


