package projetoentra21;

import java.util.List;

public interface DepoimentoDAO {
	
	void inserirDepoimento();
	void deletarDepoimento();
	void editarDepoimento();
	Depoimento recuperarDepoimento();
	List<Depoimento> recuperarDepoimentos();

}
