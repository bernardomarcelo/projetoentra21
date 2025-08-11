package projetoentra21;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/depoimento")
public class DepoimentoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private DepoimentoDAO dao;

	public void init() {
		dao = new DepoimentoDAOImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {

			case "/depoimento/novo":
				cadastrarDepoimento(request, response);
				break;

			case "/depoimento/editar":
				editarDepoimento(request, response);
				break;

			case "/depoimento/excluir":
				excluirDepoimento(request, response);
				break;
			default:
				listarDepoimentos(request, response);
				break;
			}

		} catch (SQLException e) {
			throw new ServletException(e);
		}
	}

	private void cadastrarDepoimento(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
		
		Long usuarioId = (Long) request.getSession().getAttribute("usuarioId");
		Usuario usuario = new Usuario();
		usuario.setId(usuarioId);
		
		Long avaliacaoId = Long.parseLong(request.getParameter("avaliacaoId"));
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setId(avaliacaoId);
		
		String conteudo = request.getParameter("conteudo");
		
		LocalDateTime data =  LocalDateTime.now();
		
		dao.inserirDepoimento(new Depoimento(usuario, conteudo, avaliacao, data));
		response.sendRedirect("/depoimento");

	}

	private void editarDepoimento(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{

	}

	private void excluirDepoimento(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{

	}

	private void listarDepoimentos(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{

	}

}
