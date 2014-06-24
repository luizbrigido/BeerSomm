package br.com.ctup.beersumm.modelo.entidadepersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersumm.modelo.entidade.Palativo;

public class PalativoPersistencia {
	
	static List<Palativo> palativos = new ArrayList<Palativo>();
	
	 public static void IncluirCerveja(Palativo palativo)
    {
		 palativos.add(palativo);
    }

}
