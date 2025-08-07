package projetoentra21;

import java.util.List;

public interface AvaliacaoDAO {

	void publicarAvaliacao(Avaliacao avaliacao);
	void editarAvaliacao(Avaliacao avaliacao);
	void excluirAvaliacao(long id);
	Avaliacao recuperarAvaliacao(long id);
	List<Avaliacao> recuperarAvaliacoes();
}
