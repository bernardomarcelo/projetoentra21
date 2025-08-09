package projetoentra21;

import java.time.LocalDateTime;

public class TesteConexao {
	
	    public static void main(String[] args) {
	       
	    	Usuario usuario = new Usuario("33", null, null, null, null, 2L);
	    	
	    	
	    	Avaliacao avaliacao = new Avaliacao(6L, 0, null, usuario, null);
	    	
	    	
	    	
	    	Depoimento depoimento = new Depoimento(usuario, "djeje", avaliacao, LocalDateTime.now());
	    	DepoimentoDAOImpl dao = new DepoimentoDAOImpl();
	    	dao.inserirDepoimento(depoimento);
	    	
	    	
	    	
	    	
	    	
	    	
	    } 	
	}


