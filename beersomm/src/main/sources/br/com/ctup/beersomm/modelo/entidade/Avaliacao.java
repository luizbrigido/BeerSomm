package br.com.ctup.beersomm.modelo.entidade;



public class Avaliacao{
	
	 private  String data;
	 private Avaliador avaliador;
	 
	 private Gustativo gustativo;
	 private ImpressaoGeral impressaoGeral;
	 private Olfativo olfativo;
	 private Palativo palativo;
	 private Visual visual;
	 
	    
	    
		
	 private int pontuacaoVisual;
	 private int pontuacaoOlfativa;
	 private int pontuacaoGustativa;
	 private int pontuacaoPalativa;
	 private int pontuacaoImpressaoGeral;
	 
	 private double pontuacaoTotal;
	
	 

	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Avaliador getAvaliador() {
		return avaliador;
	}
	public void setAvaliador(Avaliador avaliador) {
		this.avaliador = avaliador;
	}
	public Gustativo getGustativo() {
		return gustativo;
	}
	public void setGustativo(Gustativo gustativo) {
		this.gustativo = gustativo;
	}
	public ImpressaoGeral getImpressaoGeral() {
		return impressaoGeral;
	}
	public void setImpressaoGeral(ImpressaoGeral impressaoGeral) {
		this.impressaoGeral = impressaoGeral;
	}
	public Olfativo getOlfativo() {
		return olfativo;
	}
	public void setOlfativo(Olfativo olfativo) {
		this.olfativo = olfativo;
	}
	public Palativo getPalativo() {
		return palativo;
	}
	public void setPalativo(Palativo palativo) {
		this.palativo = palativo;
	}
	public Visual getVisual() {
		return visual;
	}
	public void setVisual(Visual visual) {
		this.visual = visual;
	}
	public int getPontuacaoVisual() {
		return pontuacaoVisual;
	}
	public void setPontuacaoVisual(int pontuacaoVisual) {
		this.pontuacaoVisual = pontuacaoVisual;
	}
	public int getPontuacaoOlfativa() {
		return pontuacaoOlfativa;
	}
	public void setPontuacaoOlfativa(int pontuacaoOlfativa) {
		this.pontuacaoOlfativa = pontuacaoOlfativa;
	}
	public int getPontuacaoGustativa() {
		return pontuacaoGustativa;
	}
	public void setPontuacaoGustativa(int pontuacaoGustativa) {
		this.pontuacaoGustativa = pontuacaoGustativa;
	}
	public int getPontuacaoPalativa() {
		return pontuacaoPalativa;
	}
	public void setPontuacaoPalativa(int pontuacaoPalativa) {
		this.pontuacaoPalativa = pontuacaoPalativa;
	}
	public int getPontuacaoImpressaoGeral() {
		return pontuacaoImpressaoGeral;
	}
	public void setPontuacaoImpressaoGeral(int pontuacaoImpressaoGeral) {
		this.pontuacaoImpressaoGeral = pontuacaoImpressaoGeral;
	}
	public double getPontuacaoTotal() {
		return pontuacaoTotal;
	}
	public void setPontuacaoTotal(double pontuacaoTotal) {
		this.pontuacaoTotal = pontuacaoTotal;
	}
	
	
}

