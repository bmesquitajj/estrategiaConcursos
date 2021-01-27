package pages;

import static utils.Utils.Na;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;


public class BuscaVisualizacaoPages {
	
	@FindBy(xpath = "//*[@id=\"b_cursos\"]/div[1]/div/div/section[1]/header/h1")
	private WebElement scroll;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/form")
	private WebElement scrollCurso;
	
	@FindBy(xpath = "//*[@id=\"getsitecontrol44266\"]/div/button")
	private WebElement botaoFecharPolitica;
	
	@FindBy(xpath = "//*[@id=\"onesignal-slidedown-cancel-button\"]")
	private WebElement botaoFecharNotificacoes;
	
	@FindBy(xpath = "//*[@id=\"b_home\"]/header/nav/div/div/div[1]/a[3]")
	private WebElement pesquisaPorProfessor;
	
	@FindBy(xpath = "/html/body/header/nav/div/div/div[1]/a[4]")
	private WebElement pesquisaPorMateria;
	
	@FindBy(xpath = "/html/body/header/nav/div/div/div[1]/a[2]")
	private WebElement pesquisaPorConcurso;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/section[1]/header/div/div/form/input")
	private WebElement CampoFiltrar;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/section[2]/div[2]/section/h1/a")
	private WebElement ResultadoFiltro;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/section[1]/a")
	private WebElement BotaoDetalheCurso;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/section[1]/div")
	private static WebElement ValorCurso;
	
	@FindBy(xpath = "/html/body/div[1]/section/div[2]/div[1]/div[2]")
	private static WebElement ValorCursoParcelado;
	
	@FindBy(xpath = "/html/body/div[1]/section/div[2]/div[1]/div[1]/div")
	private static WebElement ValorCursoDetalhe;
	
	static String getValueCurso;
	
	public void clickFecharAbas() throws Exception{
		botaoFecharNotificacoes.click();
//		botaoFecharPolitica.click();
		
	}
	
	public void selecionaMenuOpcao(String tipo) throws Exception{
		
		switch (tipo) {
			case "Por professor":
				pesquisaPorProfessor.click();
//				Thread.sleep(5000);
				Na(Utils.class);
				Utils.movimentarScroll("300");
				break;
				
			case "Detalhes":
				BotaoDetalheCurso.click();
				break;
				
			case "Por concurso":
				pesquisaPorConcurso.click();
				break;

		}
	}
	
	public void filtroSelecao(String nome, String tipo) throws Exception{
		switch (tipo) {
			case "Por professor":
				CampoFiltrar.click();
				Thread.sleep(4000);
				
				CampoFiltrar.sendKeys(nome);
				
				ResultadoFiltro.click();
				break;
		}
	}
	
	public static String valorCurso() throws Exception{
		Na(Utils.class);
		Utils.movimentarScroll("200");
		String textoValor = ValorCurso.getText();
		getValueCurso = textoValor.replaceAll("cursos em até 12x de R$ ", "");
		
		return getValueCurso;
	}
	
	public void verificaValorCurso(String tipo) throws Exception{
		switch (tipo) {
			case "a vista":
				
				Float valorCursoSeparado        = Float.parseFloat(getValueCurso.replace("cursos em até 12x de R$", "").replace(" ", "").replace(",", "."));
				Float valorCursoSeparadoDetalhe = Float.parseFloat(ValorCursoParcelado.getText().replace("ou 12x de R$", "").replace(" ", "").replace(",", "."));
				Float valueT                    = Float.parseFloat(ValorCursoDetalhe.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
				int valorMult = Integer.parseInt(ValorCursoParcelado.getText().replace("ou", "").replace("x de R$"+ValorCursoParcelado.getText().replace("ou 12x de R$", ""), "").replace(" ", "").replace(",", "."));
				
				if(Float.compare(valorCursoSeparado, valorCursoSeparadoDetalhe) < 0) {
					throw new Error("Valores diferentes!");
				}else {
					Float valueDefaut = valorCursoSeparadoDetalhe * valorMult;
					if(Float.compare(valueT, valueDefaut) < 0) {
						throw new Error("Valores diferentes!");
					}
				}
				
				break;
				
			case "parcelado":
				
				Float valorCursoSeparadoparc        = Float.parseFloat(getValueCurso.replace("cursos em até 12x de R$", "").replace(" ", "").replace(",", "."));
				Float valorCursoSeparadoDetalheparc = Float.parseFloat(ValorCursoParcelado.getText().replace("ou 12x de R$", "").replace(" ", "").replace(",", "."));
				Float valueTparc                    = Float.parseFloat(ValorCursoDetalhe.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
				int valorMultparc = Integer.parseInt(ValorCursoParcelado.getText().replace("ou", "").replace("x de R$"+ValorCursoParcelado.getText().replace("ou 12x de R$", ""), "").replace(" ", "").replace(",", "."));
				
				System.out.println(valorCursoSeparadoparc);
				System.out.println(valorCursoSeparadoDetalheparc);
				System.out.println(valorMultparc);
				
				if(Float.compare(valorCursoSeparadoparc, valorCursoSeparadoDetalheparc) < 0) {
					throw new Error("Valores diferentes!");
				}else {
					Float valueDefaut = valueTparc / valorMultparc;
					if(Float.compare(valorCursoSeparadoDetalheparc, valueDefaut) < 0) {
						throw new Error("Valores diferentes!");
					}
				}
				
				break;
		}
	}
		
}
