package br.edu.ifpb.padroes.facade;

import br.edu.ifpb.padroes.facade.sistemas.SistemaAudio;
import br.edu.ifpb.padroes.facade.sistemas.SistemaInput;
import br.edu.ifpb.padroes.facade.sistemas.SistemaVideo;

public class SistemasFacade {
	
	protected SistemaAudio audio;
	protected SistemaInput input;
	protected SistemaVideo video;

	public void inicializarSubsistemas() {
		video = new SistemaVideo();
		video.configurarCores();
		video.configurarResolucao();

		input = new SistemaInput();
		input.configurarJoystick();
		input.configurarTeclado();

		audio = new SistemaAudio();
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();
	}

	public void reproduzirAudio(String arquivo) {
		audio.reproduzirAudio(arquivo);
	}

	public void renderizarImagem(String imagem) {
		video.renderizarImagem(imagem);
	}

	public void lerInput() {
		input.lerInput();
	}

}
