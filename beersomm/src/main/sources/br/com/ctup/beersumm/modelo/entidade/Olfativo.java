package br.com.ctup.beersumm.modelo.entidade;

import java.util.List;

public class Olfativo {

	 String impressoesGeraisOlfativas;
	 List<String> reconhecimentodeAromas;
	 int pontuacaoOlfativa;


	public List<String> getReconhecimentodeAromas() {
		return reconhecimentodeAromas;
	}
	public void setReconhecimentodeAromas(List<String> reconhecimentodeAromas) {
		this.reconhecimentodeAromas = reconhecimentodeAromas;
	}
	public String getImpressoesGeraisOlfativas() {
		return impressoesGeraisOlfativas;
	}
	public void setImpressoesGeraisOlfativas(String impressoesGeraisOlfativas) {
		this.impressoesGeraisOlfativas = impressoesGeraisOlfativas;
	}
	public int getPontuacaoOlfativa() {
		return pontuacaoOlfativa;
	}
	public void setPontuacaoOlfativa(int pontuacaoOlfativa) {
		this.pontuacaoOlfativa = pontuacaoOlfativa;
	}

	
	
	 
}
