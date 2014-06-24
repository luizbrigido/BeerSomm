package br.com.ctup.beersumm.modelo.entidadeNegocio;

import br.com.ctup.beersumm.modelo.entidade.Avaliacao;

public class AvaliacaoNegocio {
	
	
	 public static String imprimirPontuacaoTotal(Avaliacao avaliacao)
	{
		int total;
		
		total = avaliacao.getPontuacaoGustativa() 
				+ avaliacao.getPontuacaoOlfativa()
				+ avaliacao.getPontuacaoPalativa()
				+ avaliacao.getPontuacaoVisual()
		        + avaliacao.getPontuacaoImpressaoGeral();
		        
		total = total / 10;
		
		return "\n\nAvaliacao Geral da Cerveja: " + total;
	}
	
	 public static double gerarPontuacaoTotal(Avaliacao avaliacao)
		{
			int total;
			
			total = avaliacao.getPontuacaoGustativa() 
					+ avaliacao.getPontuacaoOlfativa()
					+ avaliacao.getPontuacaoPalativa()
					+ avaliacao.getPontuacaoVisual()
			        + avaliacao.getPontuacaoImpressaoGeral();
			        
			total = total / 10;
		
			return  total;
		}
		
	
	
	

	
	
	
}
