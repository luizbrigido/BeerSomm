package br.com.ctup.beersomm.modelo.entidadePersistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersomm.modelo.entidade.Avaliador;

public class AvaliadorPersistencia {

	List<Avaliador> avaliadores = new ArrayList<Avaliador>();

	public void IncluirAvaliador(Avaliador avaliador) throws Exception {

		int num = 0;
		
		if (num == 0) {
			
			avaliadores.add(avaliador);
			
		} else {
			throw new Exception("O Avaliador " + avaliador.getNome()
					+ " está  cadastrado");
		}
	}

	public List<Avaliador> buscarAvaliadores() {
		// TODO Auto-generated method stub
		return null;
	}

}
