package br.com.ctup.beersumm.visao;

import java.util.ArrayList;
import java.util.List;

import br.com.ctup.beersumm.modelo.entidade.Avaliacao;
import br.com.ctup.beersumm.modelo.entidade.Avaliador;
import br.com.ctup.beersumm.modelo.entidade.Cerveja;
import br.com.ctup.beersumm.modelo.entidade.Gustativo;
import br.com.ctup.beersumm.modelo.entidade.ImpressaoGeral;
import br.com.ctup.beersumm.modelo.entidade.Olfativo;
import br.com.ctup.beersumm.modelo.entidade.Palativo;
import br.com.ctup.beersumm.modelo.entidade.Visual;
import br.com.ctup.beersumm.modelo.entidadeNegocio.AvaliacaoNegocio;
import br.com.ctup.beersumm.modelo.entidadeNegocio.AvaliadorNegocio;
import br.com.ctup.beersumm.modelo.entidadeNegocio.CervejaNegocio;
import br.com.ctup.beersumm.modelo.entidadeNegocio.GustativoNegocio;
import br.com.ctup.beersumm.modelo.entidadeNegocio.ImpressaoGeralNegocio;
import br.com.ctup.beersumm.modelo.entidadeNegocio.OlfativoNegocio;
import br.com.ctup.beersumm.modelo.entidadeNegocio.PalativoNegocio;
import br.com.ctup.beersumm.modelo.entidadeNegocio.VisualNegocio;
import br.com.ctup.beersumm.modelo.entidadepersistencia.AvaliacaoPersitencia;
import br.com.ctup.beersumm.modelo.entidadepersistencia.AvaliadorPersistencia;
import br.com.ctup.beersumm.modelo.entidadepersistencia.CervejaPersistencia;
import br.com.ctup.beersumm.modelo.entidadepersistencia.GustativoPersistencia;
import br.com.ctup.beersumm.modelo.entidadepersistencia.ImpressaoGeralPersistencia;
import br.com.ctup.beersumm.modelo.entidadepersistencia.OlfativoPersistencia;
import br.com.ctup.beersumm.modelo.entidadepersistencia.PalativoPersistencia;



public class Principal {

	private static List<String> aromas = new ArrayList<String>();
	
	
	public static void main(String[] args) throws Exception {
		
		Cerveja beer = new Cerveja();
		Avaliador avaliador = new Avaliador();
		Avaliacao avaliacao = new Avaliacao();
		/*
		 * Inicio da avaliacao 
		 * 
		  * Dados Avaliador
		  */
		 avaliador.setNome("Henrique");
		 avaliador.setMatricula(123556667);
		 AvaliadorPersistencia.IncluirAvaliador(avaliador);
		 /*
		  * Dados da Cerveja
		  */
		 beer.setMarca("SKOL");
		 beer.setFabricante("AMBEV");
		 beer.setRegiao("Paraná");
		 beer.setPais("Brasil");
		 beer.setTeorAlcoolico(8.8);
		 beer.setTemperatura(23.9);
		 beer.setEscolaCervejeira("Alemã");
		 CervejaPersistencia.IncluirCerveja(beer);
		/*
		 * Visual
		 */
	    Visual visual= new Visual();
		visual.setColoracaoEspuma("Amarelo Creme");
		visual.setLimpidez("Cristalina");
		visual.setCarbonatacao("Razoavél");
		visual.setQualidadeVisual("Boa");
		visual.setDuracaoEspuma("Baixa");
		visual.setColoracaoCerveja("Rosé");
	    visual.setPontuacaoVisual(10);
	    avaliacao.setPontuacaoVisual(visual.getPontuacaoVisual());
		/*
		 * Olfativo
		 */
		Olfativo olfativo= new Olfativo();
		olfativo.setImpressoesGeraisOlfativas("Fresca(Herbácea)");
		aromas.add("banana");
		aromas.add("amendoa");
		olfativo.setReconhecimentodeAromas(aromas);
		olfativo.setPontuacaoOlfativa(9);
		avaliacao.setPontuacaoOlfativa(olfativo.getPontuacaoOlfativa());
		OlfativoPersistencia.IncluirOlfativo(olfativo);
		/*
		 * Gustativo
		 */
		Gustativo gustativo = new Gustativo();
		gustativo.setSabor("Amargo Fugaz");
		gustativo.setIntensidade("Moderado");
		gustativo.setDuracao("Medio");
		gustativo.setDefeitos("Choca");
		gustativo.setPontuacaoGustativo(5);
		avaliacao.setPontuacaoGustativa(gustativo.getPontuacaoGustativo());
		GustativoPersistencia.IncluirGustativo(gustativo);
		/*
		 * Palativo
		 */
		Palativo palativo = new Palativo();
		palativo.setAlcool("Razoável");
		palativo.setAcidez("Adequado");
		palativo.setTextura("Áspero/Rascante");
		palativo.setAdstringencia("Moderada");
		palativo.setCorpo("Robusto");
		palativo.setRetrogosto("Fugaz");
		palativo.setDrinkability("Médio");
		palativo.setPontuacaoPalativa(9);
		avaliacao.setPontuacaoPalativa(palativo.getPontuacaoPalativa());
		PalativoPersistencia.IncluirCerveja(palativo);
		/*
		 * Impressao Geral
		 */
		ImpressaoGeral impressaoGeral = new ImpressaoGeral();
		impressaoGeral.setDescricao("A cerveja Skol é uma cerveja clara, com aroma refinado e sabor leve e suave. "
				+ "Cerveja Skol é jovem, ousada, irreverente, é a marca referência em eventos e a mais inovadora: foi a primeira cerveja em lata e"
				+ " lata de alumínio do país, a pioneira em garrafa long neck, lata com boca redondona, garrafa big neck e lata de 473 ml. "
				+ "Por tudo isso é a líder em preferência e vendas no Brasil. Skol, a cerveja que desce redondo. ");
		impressaoGeral.setPontuacaoImpressao(9);
		avaliacao.setPontuacaoImpressaoGeral(impressaoGeral.getPontuacaoImpressao());
		ImpressaoGeralPersistencia.IncluirImpressaoGeral(impressaoGeral);
		/*
		  * Inserir dados para avaliação Final
		  */
		 avaliacao.setAvaliador(avaliador);
		 avaliacao.setData("13/04/2014");
		 avaliacao.setGustativo(gustativo);
		 avaliacao.setVisual(visual);
		 avaliacao.setOlfativo(olfativo);
		 avaliacao.setPalativo(palativo);
		 avaliacao.setImpressaoGeral(impressaoGeral);
		 avaliacao.setPontuacaoTotal(AvaliacaoNegocio.gerarPontuacaoTotal(avaliacao));
		 AvaliacaoPersitencia.IncluirAvaliacao(avaliacao);
		/*
		 * Imprimir Relatorio Geral;
		 * 
		 * */
		 System.out.println(CervejaNegocio.imprimirDadosCerveja(beer)); 
		 System.out.println(AvaliadorNegocio.imprimirDadosAvaliador(avaliador));
		 System.out.println(VisualNegocio.imprimirDadosVisual(visual));
		 System.out.println(OlfativoNegocio.imprimirDadosOlfativo(olfativo));
		 System.out.println(GustativoNegocio.imprimirDadosGustativo(gustativo));
		 System.out.println(PalativoNegocio.imprimirDadosPalativo(palativo));
		 System.out.println(ImpressaoGeralNegocio.imprimirDadosImpressaoGeral(impressaoGeral));
		 System.out.println(AvaliacaoNegocio.imprimirPontuacaoTotal(avaliacao));
		 System.out.println("Nota final = " +avaliacao.getPontuacaoTotal());

	}

}
