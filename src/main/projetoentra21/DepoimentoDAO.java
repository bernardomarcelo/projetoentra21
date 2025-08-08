package projetoentra21;

import java.util.List;

public interface DepoimentoDAO {
	
	void inserirDepoimento(Depoimento depoimento);
	void deletarDepoimento(Depoimento depoimento);
	void editarDepoimento(Depoimento depoimento);
	Depoimento recuperarDepoimento(Long id);
	List<Depoimento> recuperarDepoimentos();

}
