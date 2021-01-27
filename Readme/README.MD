/*Ferramentas Utilizadas
	Cucumber
	Selenium WebDriver
	Java
	Eclipse
	Allure Reports

/* Preparação e execução do projeto

	- Clonar projeto do GitHub
	- Abrir o Eclipse e importar o projeto descompactado como Projeto Maven 
	- Baixar o ChromeDriver e colocar o executével (exe) no mesmo caminho descrito em "srs/test/java/utils/Utils.java", 
		ou mude para a pasta que desejar, lembrando de alterar o arquivo.

		  *	public static void acessarSistema() {
				System.setProperty("webdriver.chrome.driver", ===>>>> "D:\\Estudo Testes Java\\Driver\\chromedriver.exe");
			}
	- O projeto foi divido em duas Runners para melhor organização e apresentação das features
	- O projeto está configurado para registrar as evidências tanto em Cucumber Reports, quanto em Allure Reports
		* Cucumber reports não precisa de instalação ou linhas de comando.
		- Os arquivos ficam salvos em target\cucumber-reports, onde tem um arquivo index que abre o browser e mostra as execuções das features

		* Allure Reports necessita de instalação
			- Criar uma pasta chamada scoop em c:\users\<user> (ou onde for de sua preferência); 
			- Iniciar o Powershell como admin local: Menu iniciar > Digitar "powershell" > clicar com o botão direito > executar como administrador;
			- Navegar (cd.. e cd) até a pasta do scoop criada
			- instalar o Scoop pelo comando: Invoke-Expression (New-Object System.Net.WebClient).DownloadString('https://get.scoop.sh') 
			- Caso seja necessária alguma configuração de proxy seguir os seguintes passos: 
				- Setar o proxy: netsh winhttp set proxy "localhost:40080" 
				- setar as credenciais pelo comando a seguir (Digitar o comando completo as 3 linhas de uma vez) 
					$Wcl=New-Object System.Net.WebClient 
					$Creds=Get-Credential 
					$Wcl.Proxy.Credentials=$Creds 
			- Na mesma janela do powershell instalar o allure pelo comando: scoop install allure 
			- Após a instalação do Allure, verificar se está corretamente instalado pelo comando "Allure --version"
			- Após executar o projeto, digite o comando para criar o allure 
				* allure serve <caminho configurado no allure properties em POM.xml> ou <Compiar arquivos allure-reports e colar onde desejar>