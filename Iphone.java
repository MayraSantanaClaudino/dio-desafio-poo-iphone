package classes.iphone.poo.desafio;

import internet.navegador.funcionalidades.NavegadorInternet;
import musical.reprodutor.funcionalidades.ReprodutorMusical;
import telefonico.aparelho.funcionalidades.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		//TESTES 
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.tocarMusica();
		iphone.pausarMusica();
		iphone.selecionarMusica();
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
	}
	
	// APARELHO TELEFONICO
	
	@Override
	public void ligar() {
		System.out.println("Chamando...");
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Você tem chamadas não atendidas!");
	}
	
	// REPRODUTOR MUSICAL
	
	@Override
	public void tocarMusica() {
		System.out.println("Tocando música...");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Música pausada!");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música...");
	}
	
	//NAVEGADOR INTERNET
	
	@Override
	public void exibirPagina() {
		System.out.println("Página aberta!");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada!");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada!");
	}
}

