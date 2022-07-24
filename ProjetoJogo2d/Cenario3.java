package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario3 extends Cenario {
	private Window janela;
	private Scene cena;
	private Jogador jogador;
	private Keyboard teclado;
	private Zumbi zumbi[];
	
	public Cenario3 (Window window) {
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Cenario3.scn"));
		jogador = new Jogador(35, 680);
		teclado = janela.getKeyboard();
		zumbi = new Zumbi[5];//array de 5 zumbis no cenário
		
		//Som.play("obscuro.wav");
		run();
	}
	public void run() {
		 for(int i = 0; i < zumbi.length; i ++) {
			 zumbi[i] = new Zumbi(300 * i, 200 * i);
		 }
		while (true) {
			//cena.draw();
			mudarCenario();
			janela.update();
			jogador.mover(janela,teclado);
			jogador.caminho(cena);
			cena.moveScene(jogador);//câmera segue o jogadeor  
			jogador.x += cena.getXOffset();
			jogador.y += cena.getYOffset();
			for(int i = 0; i < zumbi.length; i ++) {
			zumbi[i].caminho(cena);
			zumbi[i].perseguir(jogador.x, jogador.y);
			jogador.atirar(janela, cena, teclado,zumbi[i]);
			zumbi[i].morrer();
			zumbi[i].ataque(jogador);
			zumbi[i].x += cena.getXOffset();
			zumbi[i].y += cena.getYOffset();
			zumbi[i].draw();
			}
			jogador.draw();
			jogador.energia(janela);//referente ao life do jogador
		}
	}
	private void mudarCenario() {
		if (tileCollision(05, jogador, cena)== true) {//05 é o número do tile que colide para outro cenário
			new Cenario1(janela);//Abre a janela do cenario 1
		}
	}
}

