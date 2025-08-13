

import java.time.LocalDateTime;

import modelo.dao.depoimento.DepoimentoDAOImpl;
import modelo.entidade.Avaliacao;
import modelo.entidade.Depoimento;
import modelo.entidade.Usuario;

public class TesteConexao {
	
	    public static void main(String[] args) {
	       
	    	Usuario usuario = new Usuario();
	    	usuario.setId(2L);
	    	
	    	
	    	Avaliacao avaliacao = new Avaliacao();
	    	avaliacao.setId(2L);
	    	
	    	LocalDateTime data = LocalDateTime.now();
	    	
	    	Depoimento depoimento = new Depoimento(usuario, "vhdjifhdijf", avaliacao, data);
	    	
	    	
	    	//public Depoimento( Usuario usuario, String conteudoDepoimento, Avaliacao avaliacao, LocalDateTime dataDepoimento) {
	    	
	    	
	    	DepoimentoDAOImpl dao = new DepoimentoDAOImpl();
	    	dao.inserirDepoimento(depoimento);
	    	
	    	
	    	
	    	
	    	
	    	
	    } 	
	}


