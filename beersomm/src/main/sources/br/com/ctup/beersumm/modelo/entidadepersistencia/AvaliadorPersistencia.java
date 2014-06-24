package br.com.ctup.beersumm.modelo.entidadepersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersumm.modelo.entidade.Avaliador;

public class AvaliadorPersistencia {
	
	 public static void IncluirAvaliador(Avaliador avaliador)
     {
		 List<Avaliador> avaliadores = new ArrayList<Avaliador>();
		 
		 avaliadores.add(avaliador);
         
     }

}
