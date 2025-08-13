package modelo.dao.depoimento;

import java.util.List;

import modelo.entidade.Depoimento;

public interface DepoimentoDAO {
	
	void inserirDepoimento(Depoimento depoimento);
	void deletarDepoimento(Depoimento depoimento);
	void editarDepoimento(Depoimento depoimento);
	Depoimento recuperarDepoimento(Long id);
	List<Depoimento> recuperarDepoimentos();

}
