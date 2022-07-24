package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario2 extends Cenario {//COLOCAR ÍTENS PARA RECUPERAÇÃO DA VIDA DO PERSONAGEM
	private Window janela;
	private Scene cena;
	private Jogador jogador;
	private Keyboard teclado;
	//private Zumbi zumbi;
	
	public Cenario2 (Window window) {//APÓS CONTATO COM O ÍTME, JOGAR LONGE COMO O ZUMBI
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("interno.scn"));
		jogador = new Jogador(340, 500);
		teclado = janela.getKeyboard();
		//zumbi = new Zumbi(300, 300);
		
		//Som.play("cidade.wav");
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
			jogador.y += cena.getYOffset();
			//jogador.atirar(janela, cena, teclado, zumbi);
			
			//zumbi.x += cena.getXOffset();
			//zumbi.y += cena.getXOffset();
			
			jogador.draw();
			jogador.energia(janela);
			//zumbi.draw();
			janela.update();
			mudarCenario();
		}
	}
	private void mudarCenario() {
		if (tileCollision(05, jogador, cena)== true) {
			new Cenario1(janela);
		}
	}

}
