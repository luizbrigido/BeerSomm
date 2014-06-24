package br.com.ctup.beersumm.modelo.entidadeNegocio;

import br.com.ctup.beersumm.modelo.entidade.Palativo;

public class PalativoNegocio{

	public static String imprimirDadosPalativo(Palativo palativo) {
		    	
				return "\nAVALIAÇÃO PALATIVO"+
				
                        "\n - Alcool  = " + palativo.getAlcool() +
						"\n - Acidez  = " + palativo.getAcidez() +
						"\n - Textura = " + palativo.getTextura()+
						"\n - Adstrigência = "+ palativo.getAdstringencia() +
						"\n - Corpo = "   + palativo.getCorpo()  +
						"\n - Retrogosto = "+ palativo.getRetrogosto() +
						"\n - Drinkability = "+ palativo.getDrinkability() +
						"\n - Pontuacao Palativa = "   + palativo.getPontuacaoPalativa();
			
		}

	}

	

