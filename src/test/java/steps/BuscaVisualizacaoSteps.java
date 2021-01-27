package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BuscaVisualizacaoPages;
import static utils.Utils.Na;

public class BuscaVisualizacaoSteps {
	
	BuscaVisualizacaoPages BV = new BuscaVisualizacaoPages();
	
	@Dado("que eu acesse a plataforma de cursos")
	public void queEuAcesseAPlataformaDeCursos() throws Exception {
		Na(BuscaVisualizacaoPages.class).clickFecharAbas();
	}

	@Quando("seleciono a opcao {string}")
	public void selecionoAOpcao(String tipo) throws Exception {
		Na(BuscaVisualizacaoPages.class).selecionaMenuOpcao(tipo);
	}

	@Quando("filtro por {string} e seleciono a opcao do filtro {string}")
	public void filtroPorESelecionoAOpcaoDoFiltro(String nome, String tipo) throws Exception {
	    Na(BuscaVisualizacaoPages.class).filtroSelecao(nome,tipo);
	}

	@Quando("verifico o valor do curso")
	public void verificoOValorDoCurso() throws Exception {
		Na(BuscaVisualizacaoPages.class);
		BuscaVisualizacaoPages.valorCurso();
	}

	@Quando("clico em {string}")
	public void clicoEm(String tipo) throws Exception {
		Na(BuscaVisualizacaoPages.class).selecionaMenuOpcao(tipo);
	}

	@Entao("o valor {string} na pagina de cursos deve ser igual ao valor descrito na aba detalhes")
	public void oValorNaPaginaDeCursosDeveSerIgualAoValorDescritoNaAbaDetalhes(String tipo) throws Exception {
		Na(BuscaVisualizacaoPages.class).verificaValorCurso(tipo);
	}
	
	@Entao("o sistema nao permite acessar nova aba")
	public void oSistemaNaoPermiteAcessarNovaAba() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
