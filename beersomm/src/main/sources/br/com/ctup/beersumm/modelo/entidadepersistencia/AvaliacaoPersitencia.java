package br.com.ctup.beersumm.modelo.entidadepersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersumm.modelo.entidade.Avaliacao;

public class AvaliacaoPersitencia {
	
	static List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	 public static void IncluirAvaliacao(Avaliacao avaliacao)
     {
		 avaliacoes.add(avaliacao);
         
     }
	

}
