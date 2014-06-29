package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersomm.modelo.entidade.Estado;


public class EstadoPersistencia {
	
	static List<Estado> estados = new ArrayList<Estado>();
	
	 public static void IncluirEstado(Estado estado)
    {
		 estados.add(estado);
        
    }

}
