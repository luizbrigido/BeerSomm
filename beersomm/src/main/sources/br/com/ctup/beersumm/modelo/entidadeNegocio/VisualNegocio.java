package br.com.ctup.beersumm.modelo.entidadeNegocio;

import br.com.ctup.beersumm.modelo.entidade.Visual;


public class VisualNegocio  {
	

	public static  String imprimirDadosVisual(Visual visual) {
		   
				return "\nAVALIAÇÃO VISUAL"+
						"\n - Coloração da Espuma  = " + visual.getColoracaoEspuma()+
						"\n - Limpidez = " + visual.getLimpidez()+
						"\n - Carbonatação = "   + visual.getCarbonatacao()+
						"\n - Qualidade Visual = "+ visual.getQualidadeVisual()+
						"\n - Duração da Espuma = "+ visual.getDuracaoEspuma()+
						"\n - Coloração da Cerveja = "+ visual.getColoracaoCerveja() +
						"\n - Pontuacao Visual = "+ visual.getPontuacaoVisual();
		}
	}


	


