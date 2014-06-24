package br.com.ctup.beersumm.modelo.entidadeNegocio;

import br.com.ctup.beersumm.modelo.entidade.Gustativo;

public class GustativoNegocio {
	

	public static String imprimirDadosGustativo(Gustativo gustativo) {
	
			
			return "\nAVALIAÇÃO GUSTATIVA"+
					"\n - Sabor  = " + gustativo.getSabor() +
					"\n - Intesidade = "+gustativo.getIntensidade() +
					"\n - Duração = "+gustativo.getDuracao()+ 
					"\n - Defeitos = "+gustativo.getDefeitos() + 
					"\n - Pontuação Gustativa = "+gustativo.getPontuacaoGustativo();
	}

}