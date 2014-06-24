package br.com.ctup.beersumm.modelo.entidadepersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersumm.modelo.entidade.ImpressaoGeral;

public class ImpressaoGeralPersistencia {
	
	static List<ImpressaoGeral> impressoesGerais = new ArrayList<ImpressaoGeral>();
	
	 public static void IncluirImpressaoGeral(ImpressaoGeral impressaoGeral)
    {
		 impressoesGerais.add(impressaoGeral);
    }

}
