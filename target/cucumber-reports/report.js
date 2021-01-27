$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login/loginInit.feature");
formatter.feature({
  "name": "Criação de logins e acessos",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "name": "Login cenario \u003cId\u003e",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@teste"
    }
  ]
});
formatter.step({
  "name": "clico no campo \"e-mail log\" e escrevo \"\u003cE-Mail\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "clico no campo \"senha log\" e escrevo \"\u003cSenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "name": "seleciono o botao \"Login\"",
  "keyword": "E "
});
formatter.step({
  "name": "o sistema \u003cId\u003e apresenta \"\u003cRetorno\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "Id",
        "E-Mail",
        "Senha",
        "Retorno"
      ]
    },
    {
      "cells": [
        "9",
        "testplandia_tester@testei.com",
        "teste123",
        "Erro - Usuario não existe"
      ]
    },
    {
      "cells": [
        "10",
        "",
        "teste123",
        "Erro - campo obrigatorio vazio"
      ]
    },
    {
      "cells": [
        "11",
        "brunoleitemesquita@gmail.com",
        "",
        "Erro - campo obrigatorio vazio"
      ]
    },
    {
      "cells": [
        "12",
        "brunoleitemesquita@gmail.com",
        "teste456",
        "Erro - Senha incorreta"
      ]
    },
    {
      "cells": [
        "13",
        "brunoleitemesquita@gmail.com",
        "teste123",
        "Sucess - Login efetuado"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse a plataforma de cursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscaVisualizacaoSteps.queEuAcesseAPlataformaDeCursos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em \"Login\" e \"Cadastre-se\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoEmE(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login cenario 9",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@teste"
    }
  ]
});
formatter.step({
  "name": "clico no campo \"e-mail log\" e escrevo \"testplandia_tester@testei.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no campo \"senha log\" e escrevo \"teste123\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.selecionoOBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema 9 apresenta \"Erro - Usuario não existe\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginInitSteps.oSistemaApresenta(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse a plataforma de cursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscaVisualizacaoSteps.queEuAcesseAPlataformaDeCursos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em \"Login\" e \"Cadastre-se\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoEmE(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login cenario 10",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@teste"
    }
  ]
});
formatter.step({
  "name": "clico no campo \"e-mail log\" e escrevo \"\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no campo \"senha log\" e escrevo \"teste123\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.selecionoOBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema 10 apresenta \"Erro - campo obrigatorio vazio\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginInitSteps.oSistemaApresenta(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse a plataforma de cursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscaVisualizacaoSteps.queEuAcesseAPlataformaDeCursos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em \"Login\" e \"Cadastre-se\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoEmE(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login cenario 11",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@teste"
    }
  ]
});
formatter.step({
  "name": "clico no campo \"e-mail log\" e escrevo \"brunoleitemesquita@gmail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no campo \"senha log\" e escrevo \"\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.selecionoOBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema 11 apresenta \"Erro - campo obrigatorio vazio\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginInitSteps.oSistemaApresenta(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse a plataforma de cursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscaVisualizacaoSteps.queEuAcesseAPlataformaDeCursos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em \"Login\" e \"Cadastre-se\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoEmE(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login cenario 12",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@teste"
    }
  ]
});
formatter.step({
  "name": "clico no campo \"e-mail log\" e escrevo \"brunoleitemesquita@gmail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no campo \"senha log\" e escrevo \"teste456\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.selecionoOBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema 12 apresenta \"Erro - Senha incorreta\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginInitSteps.oSistemaApresenta(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse a plataforma de cursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscaVisualizacaoSteps.queEuAcesseAPlataformaDeCursos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em \"Login\" e \"Cadastre-se\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoEmE(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login cenario 13",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@teste"
    }
  ]
});
formatter.step({
  "name": "clico no campo \"e-mail log\" e escrevo \"brunoleitemesquita@gmail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no campo \"senha log\" e escrevo \"teste123\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.clicoNoCampoEEscrevo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginInitSteps.selecionoOBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema 13 apresenta \"Sucess - Login efetuado\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginInitSteps.oSistemaApresenta(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
});