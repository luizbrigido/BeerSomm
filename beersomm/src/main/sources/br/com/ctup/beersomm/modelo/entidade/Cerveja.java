package br.com.ctup.beersomm.modelo.entidade;

public class Cerveja {
	
	String marca;
	String fabricante;
	String regiao;
	String pais;
	double teorAlcoolico;
	double temperatura;
	String escolaCervejeira;
	Avaliacao avaliacao;
   
	public String getEscolaCervejeira() {
		return escolaCervejeira;
	}
	public void setEscolaCervejeira(String escolaCervejeira) {
		this.escolaCervejeira = escolaCervejeira;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}
	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	

}
