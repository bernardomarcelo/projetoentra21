package projetoentra21;



public class Avaliacao {
	
	 private Long id;
	 private int nota;
	 private String descricao;
	 private Usuario usuario;
	
	 private Estabelecimento estabelecimento;
	 
	 public Avaliacao() {}
	 
	 public Avaliacao(long id, int nota, String descricao, Usuario usuario, Estabelecimento estabelecimento) {
		 setId(id);
		 setNota(nota);
		 setDescricao(descricao);
		 setUsuario(usuario);
		 setEstabelecimento(estabelecimento);
		 
		 
	 }
	 
	 

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	 
	 

}
