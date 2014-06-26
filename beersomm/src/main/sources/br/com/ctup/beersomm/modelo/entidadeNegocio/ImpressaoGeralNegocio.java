package br.com.ctup.beersomm.modelo.entidadeNegocio;

import br.com.ctup.beersomm.modelo.entidade.ImpressaoGeral;

public class ImpressaoGeralNegocio {

	
	public static String imprimirDadosImpressaoGeral(ImpressaoGeral impressaoGeral) {
		
		
			return "\nIMPRESSAO GERAL "+ 
					"\n - Descrição  = " + impressaoGeral.getDescricao() +
				    "\n - Pontuação Impressão = "+impressaoGeral.getPontuacaoImpressao() ;
					
		
	}
	
	

}
