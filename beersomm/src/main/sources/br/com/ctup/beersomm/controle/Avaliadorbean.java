package br.com.ctup.beersomm.controle;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import org.primefaces.context.PrimeFacesContext;

import br.com.ctup.beersomm.modelo.entidade.Avaliador;
import br.com.ctup.beersomm.modelo.entidade.Bairro;
import br.com.ctup.beersomm.modelo.entidade.Cidade;
import br.com.ctup.beersomm.modelo.entidade.Estado;
import br.com.ctup.beersomm.modelo.entidadeNegocio.AvaliadorNegocio;
import br.com.ctup.beersomm.modelo.entidadePersistencia.AvaliadorPersistencia;

@ManagedBean
public class Avaliadorbean {

	private String nome;
	private String sexo;
	private String endereco;
	private Date dataNasc;
	private String nomeBairro;
	private Bairro bairro;
	private Cidade cidade;
	private String nomeCidade;
	private Estado estado;
	private String nomeEstado;
	private String cep;
	private String telefone;
	private String login;
	private String senha;
	private String email;
	private AvaliadorPersistencia avaliadorPersistencia;
	
	

	
	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		
		
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public Avaliadorbean() {
		this.avaliadorPersistencia = new AvaliadorPersistencia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public AvaliadorPersistencia getAvaliadorPersistencia() {
		return avaliadorPersistencia;
	}

	public void setAvaliadorPersistencia(AvaliadorPersistencia avaliadorPersistencia) {
		this.avaliadorPersistencia = avaliadorPersistencia;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	

	public void addAvaliador() {
		
		this.bairro.setNomeBairro(nomeBairro);
		this.cidade.setNomeCidade(nomeCidade);
		this.estado.setNomeEstado(nomeEstado);

		Avaliador avaliador = new Avaliador(this.nome, this.sexo,
				this.endereco, this.dataNasc,this.bairro, this.cidade, this.estado, this.cep,
				this.telefone, this.login, this.senha, this.email

		);

		try {

			this.avaliadorPersistencia.IncluirAvaliador(avaliador);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Cadastro realizado com sucesso",
					"Cadastro realizado com sucesso");
			PrimeFacesContext.getCurrentInstance().addMessage(null, message);

		} catch (Exception e) {

			FacesMessage message = new FacesMessage(
					FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getMessage());
			PrimeFacesContext.getCurrentInstance().addMessage(null, message);

		}
	}
	
	 /**
    Metodo que lista a Avaliadores
    */
      public List<Avaliador> buscarListaAvaliadores(){
    	
    	return this.avaliadorPersistencia.buscarAvaliadores();
	
	 }
		

}
