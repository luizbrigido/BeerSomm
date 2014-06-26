package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersomm.modelo.entidade.Cerveja;

public class CervejaPersistencia {
	
	static List<Cerveja> cervejas = new ArrayList<Cerveja>();
	
	 public static void IncluirCerveja(Cerveja cerveja)
     {
		 cervejas.add(cerveja);
         
     }

}
