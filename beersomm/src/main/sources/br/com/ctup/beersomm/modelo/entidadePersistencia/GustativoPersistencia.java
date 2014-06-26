package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersomm.modelo.entidade.Gustativo;

public class GustativoPersistencia {
	
	static List<Gustativo> gustativos = new ArrayList<Gustativo>();
	
	 public static void IncluirGustativo(Gustativo gustativo)
    {
		 gustativos.add(gustativo);
        
    }

}
