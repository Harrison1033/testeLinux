package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario1 extends Cenario {
	private Window janela;//criar classe janela
	private Scene cena;//criar a classe cena 
	private Jogador jogador;
	private Keyboard teclado;//implementa o teclado no cenario
	private Zumbi zumbi[];//por serem multiplos zumbis, tem que ser um array
	
	public Cenario1 (Window window) {//construtor com o par?metro Window da classe main
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Cenario1.scn"));//carrega o arquivo de cen?rio1
		jogador = new Jogador(270, 530);//TENTAR UM IF PARA RETORNO DE MULTIPLAS TELAS
		teclado = janela.getKeyboard();//parte do Keyboard teclado
		zumbi = new Zumbi[5];//array de 5 zumbis no cen?rio
		
		//Som.play("obscuro.wav");
		run();//o m?todo run cont?m o loop infinito como na classe main
	}
	public void run() {
		 for(int i = 0; i < zumbi.length; i ++) {
			 zumbi[i] = new Zumbi(300 * i, 200 * i);
		 }
		while (true) {
			//cena.draw();
			mudarCenario();
			janela.update();
			jogador.mover(janela,teclado);//mover jogador no cenario atrav?s do mover da classe Jogador
			jogador.caminho(cena);
			cena.moveScene(jogador);//c?mera segue o jogadeor  
			jogador.x += cena.getXOffset();//adicionando o posicionamento para seguir mais suavemente
			jogador.y += cena.getYOffset();//adicionando o posicionamento
			for(int i = 0; i < zumbi.length; i ++) {
			zumbi[i].caminho(cena);
			zumbi[i].perseguir(jogador.x, jogador.y);
			jogador.atirar(janela, cena, teclado,zumbi[i]);
			zumbi[i].morrer();
			zumbi[i].ataque(jogador);
			zumbi[i].x += cena.getXOffset();//usado para o zumbi n?o ser arrastado quando o jogador andar na tela
			zumbi[i].y += cena.getYOffset();//o mesmo de cima
			zumbi[i].draw();
			}
			jogador.draw();//pintando o jogador
			jogador.energia(janela);//referente ao life do jogador
		}
	}
	private void mudarCenario() {
		if (tileCollision(05, jogador, cena)== true) {//05 ? o n?mero do tile que colide para outro cen?rio
			new Cenario2(janela);//Abre a janela do cenario 2
		}
	
	if (tileCollision(06, jogador, cena)== true) {//05 ? o n?mero do tile que colide para outro cen?rio
		new Cenario3(janela);//Abre a janela do cenario 2
	}
}
}
