package br.com.ctup.beersumm.modelo.entidadepersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersumm.modelo.entidade.Cerveja;

public class CervejaPersistencia {
	
	static List<Cerveja> cervejas = new ArrayList<Cerveja>();
	
	 public static void IncluirCerveja(Cerveja cerveja)
     {
		 cervejas.add(cerveja);
         
     }

}
