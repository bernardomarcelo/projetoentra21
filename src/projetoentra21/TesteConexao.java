package projetoentra21;

public class TesteConexao {
	
	    public static void main(String[] args) {
	       
	    	Usuario usuario = new Usuario("joao", "silva", "jojo", "joao@gmail", "ff");
	    	Usuario usuario3 = new Usuario("joggo", "silggva", "jggojo", "joaogg@gmail", "fggf");
	    	UsuarioDAOImpl dao = new UsuarioDAOImpl();
	    	dao.inserirUsuario(usuario3);
	    	
	    	
	    	
	    	
	    	
	    	
	    } 	
	}


