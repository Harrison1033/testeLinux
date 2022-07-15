package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario1 extends Cenario {
	private Window janela;
	private Scene cena;
	private Jogador jogador;
	private Keyboard teclado;
	private Zumbi zumbi[];
	
	public Cenario1 (Window window) {
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Cenario1.scn"));
		jogador = new Jogador(220, 225);
		teclado = janela.getKeyboard();
		zumbi = new Zumbi[5];//array de 5 zumbis no cen�rio
		
		Som.play("obscuro.wav");
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
			cena.moveScene(jogador);//c�mera segue o jogadeor  
			jogador.x += cena.getXOffset();
			jogador.y += cena.getXOffset();
			for(int i = 0; i < zumbi.length; i ++) {
			zumbi[i].caminho(cena);
			zumbi[i].perseguir(jogador.x, jogador.y);
			jogador.atirar(janela, cena, teclado,zumbi[i]);
			zumbi[i].morrer();
			zumbi[i].ataque(jogador);
			zumbi[i].x += cena.getXOffset();
			zumbi[i].y += cena.getXOffset();
			zumbi[i].draw();
			}
			jogador.draw();
			jogador.energia(janela);//referente ao life do jogador
		}
	}
	private void mudarCenario() {
		if (tileCollision(05, jogador, cena)== true) {//05 � o n�mero do tile que colide para outro cen�rio
			new Cenario2(janela);//Abre a janela do cenario 2
		}
	}
}
