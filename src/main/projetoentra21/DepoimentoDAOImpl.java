package projetoentra21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DepoimentoDAOImpl implements DepoimentoDAO{

	
	private Connection conexao;

	public DepoimentoDAOImpl() {

		try {
			this.conexao = ConexaoFactory.getConnection();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	
	
	@Override
	public void inserirDepoimento(Depoimento depoimento) {
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO depoimento (conteudo_depoimento, data_depoimento, id_usuario, id_avaliacao) VALUES (?, ?, ?, ?)";
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, depoimento.getConteudoDepoimento());
			stmt.setDate(2, java.sql.Date.valueOf(depoimento.getDataDepoimento()));
			stmt.setLong(3, depoimento.getUsuario().getId());
			stmt.setLong(4,depoimento.getAvaliacao().getId());
			stmt.executeUpdate();
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(stmt != null) stmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void deletarDepoimento(Depoimento depoimento) {
		PreparedStatement stmt = null;
		
		if (depoimento.getId() == null) 
	        System.err.println("ID do depoimento não pode ser nulo para exclusão.");
	        
	        
		String sql = "DELETE FROM depoimento WHERE id_depoimento = ?";
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setLong(1,depoimento.getId());
			stmt.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(stmt != null) stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void editarDepoimento(Depoimento depoimento) {
		
		
	}

	@Override
	public Depoimento recuperarDepoimento(Long id) {
		
		return null;
	}

	@Override
	public List<Depoimento> recuperarDepoimentos() {
		
		return null;
	}

}
