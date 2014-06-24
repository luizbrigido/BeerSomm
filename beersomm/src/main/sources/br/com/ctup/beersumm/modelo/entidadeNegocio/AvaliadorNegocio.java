package br.com.ctup.beersumm.modelo.entidadeNegocio;

import br.com.ctup.beersumm.modelo.entidade.Avaliador;

public class AvaliadorNegocio {
	
	 public static String imprimirDadosAvaliador(Avaliador avaliador){
		   
		 return "\nAVALIADOR-DEGUSTADOR "+
		 		"\nAvaliador = " + avaliador.getNome() +
		 		"\nMatricula = " + avaliador.getMatricula()+
		 		"\n";
		 
			
		}

}
