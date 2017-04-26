package br.edu.ifpb.padroes.facade;

public class Loader {

	public static void main(String[] args) {
		System.out.println("##### Configurando subsistemas #####");
		SistemasFacade facade = new SistemasFacade();
		facade.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		facade.reproduzirAudio("teste.mp3");
		facade.lerInput();
		facade.renderizarImagem("imagem.png");
	}

}
