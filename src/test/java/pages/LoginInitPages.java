package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Utils;
import static utils.Utils.Na;


public class LoginInitPages {
	
	Utils u = new Utils();
	
	@FindBy(xpath = "/html/body/header[1]/div/div/div/div[1]/a")
	private WebElement IconeLogin;
	
	@FindBy(xpath = "/html/body/header[1]/div/div/div/div[1]/div/form/a")
	private WebElement botaoCadastrar;
	
	@FindBy(xpath = "//*[@id=\"cadastro_nome\"]")
	private WebElement CampoNomeCadastro;
	
	@FindBy(xpath = "//*[@id=\"cadastro_email\"]")
	private WebElement CampoEmailCadastro;
	
	@FindBy(xpath = "//*[@id=\"cadastro_senha\"]")
	private WebElement CampoSenhaCadastro;
	
	@FindBy(xpath = "//*[@id=\"cadastro_senha_confirma\"]")
	private WebElement CampoCSenhaCadastro;
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/section[1]/form/div[1]/input")
	private WebElement CampoEmailLogin;
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/section[1]/form/div[2]/input")
	private WebElement CampoSenhaLogin;
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/section[1]/form/div[3]/a")
	private WebElement CampoEsqueciSenha;
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/section[1]/form/div[4]/button")
	private WebElement BotaoLoginPagina;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")
	private WebElement AceiteCaptcha;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/section/form/div[7]/button")
	private WebElement BotaoContinuarCadastro;
	
	
	@FindBy(xpath = "/html/body/div[1]/div/div/ul/li")
	private WebElement msgErro;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/section/form/div[2]/span")
	private WebElement msgEmail;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/section/form/div[3]/span")
	private WebElement msgSenha;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/section/form/div[4]/span")
	private WebElement msgConfSenha;
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/section[1]/form/div[1]/span")
	private WebElement msgEmailLogin;
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/section[1]/form/div[2]/span")
	private WebElement msgSenhaLogin;
	
	public void clickLogin(String tipo, String tipo2) {
		IconeLogin.click();
		botaoCadastrar.click();
	}
	
	public void selecionaBotao(String tipo) throws Exception {
		switch (tipo) {
			case "captcha":
				Na(Utils.class).clickCaptcha();

				break;
				
			case "Cadastrar":
				BotaoContinuarCadastro.click();
				break;
				
			case "Login":
				BotaoLoginPagina.click();
				break;
		}
	}
	
	public void preencher(String tipo, String valor) throws Exception{
		switch (tipo) {
			case "Nome":
				CampoNomeCadastro.sendKeys(valor);
				break;
				
			case "e-mail":
				CampoEmailCadastro.sendKeys(valor);
				break;
				
			case "senha":
				CampoSenhaCadastro.sendKeys(valor);
				break;
				
			case "c_senha":
				CampoCSenhaCadastro.sendKeys(valor);
				break;
				
			case "e-mail log":
				CampoEmailLogin.sendKeys(valor);
				break;
				
			case "senha log":
				CampoSenhaLogin.sendKeys(valor);
				Na(Utils.class);
				Utils.movimentarScroll("100");
				break;

		}
	}
	
	public void verificaRetorno(int tipo, String valor) throws Exception{
		switch (tipo) {
			case 1:
				if(msgEmail.isDisplayed()==false) {
					throw new Error("E-mail não existe");
				}
				break;
				
			case 2:
				if(msgErro.isDisplayed()==false) {
					throw new Error("Nome não pode ser vazio");
				}
				break;
				
			case 3:
				if(msgSenha.isDisplayed()==false) {
					throw new Error("Senha não pode ser vazio");
				}
				break;
				
			case 4:
				if(msgConfSenha.isDisplayed()==false) {
					throw new Error("Senha não pode ser diferente");
				}
				break;
				
			case 5:
				if(msgErro.isDisplayed()==false) {
					throw new Error("Nome não pode ter caracteres especiais");
				}
				break;
				
			case 6:
				if(msgSenha.isDisplayed()==false) {
					throw new Error("Senha com menos de 5 caracteres");
				}
				break;
				
			case 7:
				if(CampoEmailLogin.getText().equals("")) {
					throw new Error("Erro ao cadastrar usuário");
				}
				break;
				
			case 8:
				if(CampoEmailLogin.getText().equals("")==false) {
					throw new Error("Usuário ja existe");
				}
				break;
				
			case 9:
				if(msgErro.isDisplayed()==false) {
					throw new Error("Usuário não existe");
				}
				break;
				
			case 10:
				if(msgEmailLogin.isDisplayed()==false) {
					throw new Error("Campo obrigatorio");
				}
				break;
				
			case 11:
				if(msgSenhaLogin.isDisplayed()==false) {
					throw new Error("Campo obrigatorio");
				}
				break;
				
			case 12:
				if(msgErro.isDisplayed()==false) {
					throw new Error("senha incorreta");
				}
				break;
				
			case 13:
				
				break;

		}
	}
	
}
