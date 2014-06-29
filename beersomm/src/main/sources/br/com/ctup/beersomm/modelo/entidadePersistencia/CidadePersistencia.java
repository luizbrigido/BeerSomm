package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;



import br.com.ctup.beersomm.modelo.entidade.Cidade;

public class CidadePersistencia {

	static List<Cidade> cidades = new ArrayList<Cidade>();
	
	 public static void IncluirCidade(Cidade cidade)
    {
		 cidades.add(cidade);
        
    }
}
