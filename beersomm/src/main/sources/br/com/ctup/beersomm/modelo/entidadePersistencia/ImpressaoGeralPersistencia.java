package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersomm.modelo.entidade.ImpressaoGeral;

public class ImpressaoGeralPersistencia {
	
	static List<ImpressaoGeral> impressoesGerais = new ArrayList<ImpressaoGeral>();
	
	 public static void IncluirImpressaoGeral(ImpressaoGeral impressaoGeral)
    {
		 impressoesGerais.add(impressaoGeral);
    }

}
