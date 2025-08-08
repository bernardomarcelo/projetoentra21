package projetoentra21;

public class TesteConexao {
	
	    public static void main(String[] args) {
	       
	    	Usuario usuario = new Usuario("33", null, null, null, null, 2L);
	    	
	    	
	    	Estabelecimento estabelecimento = new Estabelecimento(2L, "fdfd", null, null, null, null);
	    	
	    	
	    	
	    	Avaliacao avaliacao = new Avaliacao( 5, "sss", usuario, estabelecimento);
	    	AvaliacaoDAOImpl dao = new AvaliacaoDAOImpl();
	    	dao.inserirAvaliacao(avaliacao);
	    	
	    	
	    	
	    	
	    	
	    	
	    } 	
	}


