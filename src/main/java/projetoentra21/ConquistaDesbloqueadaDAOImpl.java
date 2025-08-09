package projetoentra21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConquistaDesbloqueadaDAOImpl  implements ConquistaDesbloqueadaDAO{
	
	private Connection conexao;
	
	public ConquistaDesbloqueadaDAOImpl() {

		try {
			this.conexao = ConexaoFactory.getConnection();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	@Override
	public void inserirConquista(ConquistaDesbloqueada conquista) {
		PreparedStatement stmt = null;
		
		String sql ="INSERT INTO conquistadesbloqueada (nome_conquista,descricao_conquista) VALUES (?, ?)";
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, conquista.getNomeConquista());
			stmt.setString(2, conquista.getDescricaoConquista());
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
	public ConquistaDesbloqueada recuperarConquista(Long id) {
		ConquistaDesbloqueada conquista = null;
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT id_conquista, nome_conquista, descricao_conquista FROM conquistadesbloqueada WHERE id_conquista = ?";
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setLong(1,id);
			rs = stmt.executeQuery();
			
			
			if(rs.next()) {
				
				conquista = new ConquistaDesbloqueada();
				 conquista.setId(rs.getLong("id_conquista"));
				conquista.setNomeConquista(rs.getString("nome_conquista"));
				conquista.setDescricaoConquista(rs.getString("descricao_conquista"));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return conquista;
	}

	@Override
	public List<ConquistaDesbloqueada> recuperarConquistas() {
		List <ConquistaDesbloqueada>  conquistas = new ArrayList<>();
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT  id_conquista, nome_conquista, descricao_conquista FROM conquistadesbloqueada";
		
		try {
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next() ) {
				ConquistaDesbloqueada conquista = new ConquistaDesbloqueada();
				 conquista.setId(rs.getLong("id_conquista"));
				conquista.setNomeConquista(rs.getString("nome_conquista"));
				conquista.setDescricaoConquista(rs.getString("descricao_conquista"));
				conquistas.add(conquista);
				
			}
			}catch(SQLException e) {
				e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return conquistas;
	}

}
