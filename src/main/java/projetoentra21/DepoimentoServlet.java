package projetoentra21;
import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/depoimento")
public class DepoimentoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private DepoimentoDAO dao;
	
	public void init() {
		dao = new DepoimentoDAOImpl();
	}
	
	protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException IOException {
		
	}
	
	
	
	
	
	
	

}
