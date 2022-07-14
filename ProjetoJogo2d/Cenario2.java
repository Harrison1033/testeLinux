package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario2 extends Cenario {
	private Window janela;
	private Scene cena;
	private Jogador jogador;
	private Keyboard teclado;
	//private Zumbi zumbi;
	
	public Cenario2 (Window window) {
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("interno.scn"));
		jogador = new Jogador(140, 150);
		teclado = janela.getKeyboard();
		//zumbi = new Zumbi(300, 300);
		
		Som.play("cidade.wav");
		run();
	}
	public void run() {
		while (true) {
			//cena.draw();
			jogador.mover(janela,teclado);
			jogador.caminho(cena);
			//zumbi.caminho(cena);
			//zumbi.perseguir(jogador.x, jogador.y);
			cena.moveScene(jogador);//câmera segue o jogadeor  
			
			jogador.x += cena.getXOffset();
			jogador.y += cena.getXOffset();
			//jogador.atirar(janela, cena, teclado, zumbi);
			
			//zumbi.x += cena.getXOffset();
			//zumbi.y += cena.getXOffset();
			
			jogador.draw();
			//zumbi.draw();
			janela.update();
			mudarCenario();
		}
	}
	private void mudarCenario() {
		if (tileCollision(04, jogador, cena)== true) {
			new Cenario1(janela);
		}
	}

}
