package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersomm.modelo.entidade.Bairro;



public class BairroPersistencia {

	static List<Bairro> bairros = new ArrayList<Bairro>();
	
	 public static void IncluirBairro(Bairro bairro)
    {
		 bairros.add(bairro);
        
    }
}
