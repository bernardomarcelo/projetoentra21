package projetoentra21;
import java.util.List;
public interface ConquistaDesbloqueadaDAO {
	
	void inserirConquista(ConquistaDesbloqueada conquista);
	ConquistaDesbloqueada recuperarConquista(Long id);
	List<ConquistaDesbloqueada> recuperarConquistas();

}
