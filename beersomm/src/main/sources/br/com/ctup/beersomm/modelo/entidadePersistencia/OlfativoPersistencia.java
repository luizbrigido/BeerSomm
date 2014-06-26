package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersomm.modelo.entidade.Olfativo;

public class OlfativoPersistencia {
	
	static List<Olfativo> olfativos = new ArrayList<Olfativo>();
	
	 public static void IncluirOlfativo(Olfativo olfativo)
    {
		 olfativos.add(olfativo);
    }

}
