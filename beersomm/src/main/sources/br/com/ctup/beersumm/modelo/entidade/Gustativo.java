package br.com.ctup.beersumm.modelo.entidade;

public class Gustativo  {
	
	String sabor;
	String intensidade;
	String duracao;
	String defeitos;
	int pontuacaoGustativo;
	
	
	public int getPontuacaoGustativo() {
		return pontuacaoGustativo;
	}
	public void setPontuacaoGustativo(int pontuacaoGustativo) {
		this.pontuacaoGustativo = pontuacaoGustativo;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getIntensidade() {
		return intensidade;
	}
	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getDefeitos() {
		return defeitos;
	}
	public void setDefeitos(String defeitos) {
		this.defeitos = defeitos;
	}

	public String imprimirRelatorioGeral(Avaliacao avaliacao) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	

}
