package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersomm.modelo.entidade.Visual;

public class VisualPersistencia {

	static List<Visual> visuais = new ArrayList<Visual>();
	
	 public static void IncluirVisual(Visual visual)
    {
		 visuais.add(visual);
    }
	
}
