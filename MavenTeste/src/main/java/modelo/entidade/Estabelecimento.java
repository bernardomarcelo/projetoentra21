package modelo.entidade;


//import br.senac.modelo.entidade.TipoEstabelecimento;
//import br.senac.modelo.entidade.Endereco;
//import br.senac.modelo.entidade.Foto;

public class Estabelecimento {

    private Long id;
    private String nome;
    //private TipoEstabelecimento tipoEstabelecimento;
   // private Endereco endereco;
    private String cnpj;
    private String email;
    private String telefone;
    private String horarioFuncionamento;
   // private Foto foto;


   /* public Estabelecimento(Long id, String nome, TipoEstabelecimento tipoEstabelecimento, Endereco endereco, String cnpj, String email, String telefone, String horarioFuncionamento, Foto foto) {
        setId(id);
        setNome(nome);
        setTipoEstabelecimento(tipoEstabelecimento);
        setEndereco(endereco);
        setCnpj(cnpj);
        setEmail(email);
        setTelefone(telefone);
        setHorarioFuncionamento(horarioFuncionamento);
        setFoto(foto);
    }*/

    
     public Estabelecimento(Long id, String nome, String cnpj, String email, String telefone, String horarioFuncionamento) {
    setId(id);
    setNome(nome);
    
    setCnpj(cnpj);
    setEmail(email);
    setTelefone(telefone);
    setHorarioFuncionamento(horarioFuncionamento);
    
     }
    
    
    
    public Estabelecimento() {
		
	}



	public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public TipoEstabelecimento getTipoEstabelecimento() {
        return tipoEstabelecimento;
    }

    public void setTipoEstabelecimento(TipoEstabelecimento tipoEstabelecimento) {
        this.tipoEstabelecimento = tipoEstabelecimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }*/

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

   /*/ public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }
*/}