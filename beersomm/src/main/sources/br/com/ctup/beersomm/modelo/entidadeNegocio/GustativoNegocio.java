package br.com.ctup.beersomm.modelo.entidadeNegocio;

import br.com.ctup.beersomm.modelo.entidade.Gustativo;

public class GustativoNegocio {
	

	public static String imprimirDadosGustativo(Gustativo gustativo) {
	
			
			return "\nAVALIA��O GUSTATIVA"+
					"\n - Sabor  = " + gustativo.getSabor() +
					"\n - Intesidade = "+gustativo.getIntensidade() +
					"\n - Dura��o = "+gustativo.getDuracao()+ 
					"\n - Defeitos = "+gustativo.getDefeitos() + 
					"\n - Pontua��o Gustativa = "+gustativo.getPontuacaoGustativo();
	}

}