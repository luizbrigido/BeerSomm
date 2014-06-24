package br.com.ctup.beersumm.modelo.entidadepersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersumm.modelo.entidade.Olfativo;

public class OlfativoPersistencia {
	
	static List<Olfativo> olfativos = new ArrayList<Olfativo>();
	
	 public static void IncluirOlfativo(Olfativo olfativo)
    {
		 olfativos.add(olfativo);
    }

}
