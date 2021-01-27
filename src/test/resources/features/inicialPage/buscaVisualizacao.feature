#language: pt
#encoding: utf-8
#autor: Bruno Mesquita

Funcionalidade: Busca e visualização página inicial
		Contexto:
			Dado que eu acesse a plataforma de cursos
		
		Cenario: Verificando valores de cursos a vista
			Quando seleciono a opcao "Por professor"
			E filtro por "Ena Loiola" e seleciono a opcao do filtro "Por professor"
			E verifico o valor do curso
			E clico em "Detalhes"
			Entao o valor "a vista" na pagina de cursos deve ser igual ao valor descrito na aba detalhes
			
		Cenario: Verificando valores de cursos parcelado
			Quando seleciono a opcao "Por professor"
			E filtro por "Ena Loiola" e seleciono a opcao do filtro "Por professor"
			E verifico o valor do curso
			E clico em "Detalhes"
			Entao o valor "parcelado" na pagina de cursos deve ser igual ao valor descrito na aba detalhes
			
		
