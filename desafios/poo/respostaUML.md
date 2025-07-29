# Desafio POO - Modelagem iPhone DIO

Este repositório contém a solução para o desafio de modelagem de um iPhone utilizando conceitos de Programação Orientada a Objetos.

## Diagrama UML

Abaixo está a representação UML das funcionalidades do iPhone, modelada com Interfaces para cada papel (Reprodutor Musical, Aparelho Telefônico e Navegador de Internet) e uma classe `Iphone` que implementa todas elas.

```mermaid
classDiagram
direction BT
    class ReprodutorMusical {
	    +tocar()
	    +pausar()
	    +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
	    +ligar(String numero)
	    +atender()
	    +iniciarCorreioVoz()
    }

    class NavegadorInternet {
	    +exibirPagina(String url)
	    +adicionarNovaAba()
	    +atualizarPagina()
    }

    class Iphone {
	    +tocar()
	    +pausar()
	    +selecionarMusica(String musica)
	    +ligar(String numero)
	    +atender()
	    +iniciarCorreioVoz()
	    +exibirPagina(String url)
	    +adicionarNovaAba()
	    +atualizarPagina()
    }

	<<interface>> ReprodutorMusical
	<<interface>> AparelhoTelefonico
	<<interface>> NavegadorInternet
  <<classe>> Iphone

    ReprodutorMusical <|.. Iphone
    AparelhoTelefonico <|.. Iphone
    NavegadorInternet <|.. Iphone


    AparelhoTelefonico <|.. Iphone
    NavegadorInternet <|.. Iphone
