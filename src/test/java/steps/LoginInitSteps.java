package steps;

import static utils.Utils.Na;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginInitPages;

public class LoginInitSteps {
	@Quando("clico em {string} e {string}")
	public void clicoEmE(String tipo, String tipo2) throws Exception {
		Na(LoginInitPages.class).clickLogin(tipo, tipo2);
	}


	@Quando("clico no campo {string} e escrevo {string}")
	public void clicoNoCampoEEscrevo(String tipo, String valor) throws Exception {
		Na(LoginInitPages.class).preencher(tipo, valor);
	}

	@Quando("seleciono o botao {string}")
	public void selecionoOBotao(String tipo) throws Exception {
		Na(LoginInitPages.class).selecionaBotao(tipo);
	}

	@Entao("o sistema {int} apresenta {string}")
	public void oSistemaApresenta(Integer tipo, String valor) throws Exception {
		Na(LoginInitPages.class).verificaRetorno(tipo, valor);
	}
}
