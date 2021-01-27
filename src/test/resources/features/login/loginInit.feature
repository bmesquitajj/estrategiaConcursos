#language: pt
#encoding: utf-8
#autor: Bruno Mesquita

Funcionalidade: Criação de logins e acessos

		Contexto:
			Dado que eu acesse a plataforma de cursos
			Quando clico em "Login" e "Cadastre-se"
		
		Esquema do Cenario: Criando usuario cenario <Id>
			Quando clico no campo "Nome" e escrevo "<Nome>"
			E clico no campo "e-mail" e escrevo "<E-Mail>"
			E clico no campo "senha" e escrevo "<Senha>"
			E clico no campo "c_senha" e escrevo "<C_Senha>"
			E seleciono o botao "captcha"
			E seleciono o botao "Cadastrar"
			Entao o sistema <Id> apresenta "<Retorno>"
			
		Exemplos:
		|Id|Nome                          |E-Mail                            |Senha   |C_Senha |Retorno                       |
		|1 |Tester Malicius Testequalovisk|tester.malicius@testolandia.com.br|teste123|teste123|Erro - Email não valido       |
		|2 |                              |brunoleitemesquita@gmail.com      |teste123|teste123|Erro - campo obrigatorio vazio|
		|3 |Bruno                         |                                  |teste123|teste123|Erro - campo obrigatorio vazio|
		|4 |Bruno                         |brunoleitemesquita@gmail.com      |teste123|teste456|Erro - Senhas diferentes      |
		|5 |Bruno@!                       |brunoleitemesquita@gmail.com      |teste123|teste123|Erro - Caracteres especiais   |
		|6 |Bruno                         |brunoleitemesquita@gmail.com      |test    |test    |Erro - Senhas incompleta      |
		|7 |Bruno                         |brunoleitemesquita@gmail.com      |test123 |test123 |Sucess - Cadastro criado      |
		|8 |Bruno                         |brunoleitemesquita@gmail.com      |test123 |test123 |Erro - Email existente        |
		
		@teste
		Esquema do Cenario: Login cenario <Id>
			Quando clico no campo "e-mail log" e escrevo "<E-Mail>"
			E clico no campo "senha log" e escrevo "<Senha>"
			E seleciono o botao "Login"
			Entao o sistema <Id> apresenta "<Retorno>"
			
		Exemplos:
		|Id|E-Mail                       |Senha   |Retorno                         |
		|9 |testplandia_tester@testei.com|teste123|Erro - Usuario não existe       |
		|10|                             |teste123|Erro - campo obrigatorio vazio  |
		|11|brunoleitemesquita@gmail.com |        |Erro - campo obrigatorio vazio  |
		|12|brunoleitemesquita@gmail.com |teste456|Erro - Senha incorreta          |
		|13|brunoleitemesquita@gmail.com |teste123|Sucess - Login efetuado         |