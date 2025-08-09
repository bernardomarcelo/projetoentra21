package projetoentra21;

public class ConquistaDesbloqueada {
	
	private Long id;
	private String nomeConquista;
	private String descricaoConquista;
	//private Foto iconeConquista;
	
	public ConquistaDesbloqueada() {}
	
	public ConquistaDesbloqueada(Long id, String nomeConquista, String descricaoConquista) {
		setId(id);
		setNomeConquista(nomeConquista);
		setDescricaoConquista(descricaoConquista);
	}
	
	/*public ConquistaDesbloqueada() {}
	
	public ConquistaDesbloqueada(Long id, String nomeConquista, String descricaoConquista, Foto iconeConquista) {
		setId(id);
		setNomeConquista(nomeConquista);
		setDescricaoConquista(descricaoConquista);
		setIconeConquista(iconeConquista);
	}
	*/
	
	public ConquistaDesbloqueada(String nomeConquista, String descricaoConquista) {
		setNomeConquista(nomeConquista);
		setDescricaoConquista(descricaoConquista);
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeConquista() {
		return nomeConquista;
	}
	public void setNomeConquista(String nomeConquista) {
		this.nomeConquista = nomeConquista;
	}
	public String getDescricaoConquista() {
		return descricaoConquista;
	}
	public void setDescricaoConquista(String descricaoConquista) {
		this.descricaoConquista = descricaoConquista;
	}
	
	/*public Foto getIconeConquista() {
		return iconeConquista;
	}

	public void setFoto(Foto iconeConquista) {
		this.foto = iconeConquista;
	}
	*/
}
