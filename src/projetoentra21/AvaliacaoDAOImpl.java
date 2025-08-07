package projetoentra21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoDAOImpl implements AvaliacaoDAO {

	private Connection conexao;

	public AvaliacaoDAOImpl() {

		try {
			this.conexao = ConexaoFactory.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void inserirAvaliacao(Avaliacao avaliacao) {
		PreparedStatement stmt = null;

		if (avaliacao.getId() == null) {
			throw new IllegalArgumentException("ID não encontrado");
		}
		
		String sql = "INSERT INTO avaliacao(nota_avaliacao, descricao_avaliacao, id_usuario, id_estabelecimento) VALUES (?, ?, ?, ?)";

		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, avaliacao.getNota());
			stmt.setString(2, avaliacao.getDescricao());
			stmt.setLong(3, avaliacao.getUsuario().getId());
			stmt.setLong(4, avaliacao.getEstabelecimento().getId());
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (stmt != null)
					stmt.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void editarAvaliacao(Avaliacao avaliacao) {
			PreparedStatement stmt = null;
			
			if (avaliacao.getId() == null) {
				throw new IllegalArgumentException("ID não encontrado");
			}
			
			String sql = "UPDATE avaliacao SET nota_avaliacao = ?, descricao_avaliacao = ? WHERE id_avaliacao = ?";
			
			try {
				stmt = conexao.prepareStatement(sql);
				stmt.setInt(1, avaliacao.getNota());
				stmt.setString(2, avaliacao.getDescricao());
				stmt.setLong(3, avaliacao.getId());
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
	public void deletarAvaliacao(Avaliacao avaliacao) {
		PreparedStatement stmt = null;
		
		if (avaliacao.getId() == null) {
			throw new IllegalArgumentException("ID não encontrado");
		}
		
		String sql = "DELETE FROM avaliacao WHERE id_avaliacao = ?";
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, avaliacao.getId());
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
	public Avaliacao recuperarAvaliacao(long id) {
		Avaliacao avaliacao = new Avaliacao();

		return avaliacao;
	}

	@Override
	public List<Avaliacao> recuperarAvaliacoes() {
		List<Avaliacao> avaliacoes = new ArrayList<>();

		return avaliacoes;
	}

}
