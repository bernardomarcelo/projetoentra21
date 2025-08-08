package projetoentra21;

import java.time.LocalDate;

public class Depoimento {
	
	private Long id;
	private Usuario usuario;
	private String conteudoDepoimento;
	private Avaliacao avaliacao;
	private LocalDate dataDepoimento;
	
	public Depoimento () {}
	
	public Depoimento(Long id, Usuario usuario, String conteudoDepoimento, Avaliacao avaliacao, LocalDate dataDepoimento) {
		setId(id);
		setUsuario(usuario);
		setConteudoDepoimento(conteudoDepoimento);
		setAvaliacao(avaliacao);
		setDataDepoimento(dataDepoimento);
	}
	
	public Depoimento( Usuario usuario, String conteudoDepoimento, Avaliacao avaliacao, LocalDate dataDepoimento) {
		setUsuario(usuario);
		setConteudoDepoimento(conteudoDepoimento);
		setAvaliacao(avaliacao);
		setDataDepoimento(dataDepoimento);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getConteudoDepoimento() {
		return conteudoDepoimento;
	}
	public void setConteudoDepoimento(String conteudoDepoimento) {
		this.conteudoDepoimento = conteudoDepoimento;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	public LocalDate getDataDepoimento() {
		return dataDepoimento;
	}
	public void setDataDepoimento(LocalDate dataDepoimento) {
		this.dataDepoimento = dataDepoimento;
	}
	
	
	

}
