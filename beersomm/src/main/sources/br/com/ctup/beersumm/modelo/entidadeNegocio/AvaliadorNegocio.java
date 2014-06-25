package br.com.ctup.beersumm.modelo.entidadeNegocio;

import java.util.List;

import br.com.ctup.beersumm.modelo.entidade.Avaliador;

public class AvaliadorNegocio {
	
	 public static String imprimirDadosAvaliador(Avaliador avaliador){
		   
		 return "\nAVALIADOR-DEGUSTADOR "+
		 		"\nAvaliador = " + avaliador.getNome() +
		 		"\n";
		 
			
		}

	public void cadastrarAvaliador(Avaliador avaliador) {
		// TODO Auto-generated method stub
		
	}

	public List<Avaliador> buscarAvaliadores() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	

}
