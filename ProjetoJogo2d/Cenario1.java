package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario1 extends Cenario {
	private Window janela;//criar classe janela
	private Scene cena;//criar a classe cena 
	private Jogador jogador;
	private Keyboard teclado;
	private Zumbi zumbi[];
	
	public Cenario1 (Window window) {//construtor com o parâmetro Window da classe main
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Cenario1.scn"));//carrega o arquivo de cenário1
		jogador = new Jogador(230, 225);//TENTAR UM IF PARA RETORNO DE MULTIPLAS TELAS
		teclado = janela.getKeyboard();
		zumbi = new Zumbi[5];//array de 5 zumbis no cenário
		
		//Som.play("obscuro.wav");
		run();//o método run contém o loop infinito como na classe main
	}
	public void run() {
		 for(int i = 0; i < zumbi.length; i ++) {
			 zumbi[i] = new Zumbi(300 * i, 200 * i);
		 }
		while (true) {
			//cena.draw();
			mudarCenario();
			janela.update();
			jogador.mover(janela,teclado);//mover jogador no cenario através do mover da classe Jogador
			jogador.caminho(cena);
			cena.moveScene(jogador);//câmera segue o jogadeor  
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
			jogador.draw();//pintando o jogador
			jogador.energia(janela);//referente ao life do jogador
		}
	}
	private void mudarCenario() {
		if (tileCollision(05, jogador, cena)== true) {//05 é o número do tile que colide para outro cenário
			new Cenario2(janela);//Abre a janela do cenario 2
		}
	
	if (tileCollision(06, jogador, cena)== true) {//05 é o número do tile que colide para outro cenário
		new Cenario3(janela);//Abre a janela do cenario 2
	}
}
}
