package projetoentra21;

import java.util.List;

public interface AvaliacaoDAO {

	void inserirAvaliacao(Avaliacao avaliacao);
	void editarAvaliacao(Avaliacao avaliacao);
	void deletarAvaliacao(Avaliacao avaliacao);
	Avaliacao recuperarAvaliacao(long id);
	List<Avaliacao> recuperarAvaliacoes();
}
