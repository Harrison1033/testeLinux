package jogo;

import javax.swing.event.MenuKeyEvent;
import java.awt.*;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;	
import jplay.Window;

public class Jogador extends Ator {
	 //acrescentei a linha de baixo
	 static int energia = 3000;//energia do personagem
	public Jogador(int x, int y) {//localização do personagem
		super(URL.sprite("jogador.png"), 20);//(20)número de frames do personagem
		this.x = x;//adicionando a posição do personagem passada pelo construtor
		this.y = y;
		this.setTotalDuration(2000);//tempo de troca de frames em milisegundos
	}
	ControleTiros tiros = new ControleTiros();
	public void atirar(Window janela, Scene cena, Keyboard teclado, Ator inimigo) {
		if ( teclado.keyDown(MenuKeyEvent.VK_A)) {
			tiros.adicionaTiro(x + 5, y + 8, direcao, cena);//o 5 e o 8 são as posições de onde as balas estão saindo do personagem
		}
		tiros.run(inimigo);
	}
	public void mover(Window janela, Keyboard teclado) { 	
		//acrescentei == true
		if(teclado.keyDown(Keyboard.LEFT_KEY)==true) {
			if(this.x > 0)//se X for maior que 0, então personagem pode se mover para esquerda
				this.x -= velocidade;
			if(direcao != 1) {
				setSequence(4, 8);//sequencia de sprites do personagem a esquerda
				direcao = 1;
			}movendo = true;//enquanto apertar esquerda ele fica true
		}else if(teclado.keyDown(Keyboard.RIGHT_KEY)) {
			if(this.x < janela.getWidth() - 60)//para a direita x<que a largura da janela -60 é a margem de segurança
				this.x += velocidade;//- para esquerda e + para a direita
			if(direcao != 2) {
				setSequence(8, 12);
				direcao = 2;
			}movendo = true;//enquanto apertar direita, ele fica true
		}else if(teclado.keyDown(Keyboard.UP_KEY)) {
			if(this.y > 0)//para cima é o eixo y
				this.y -= velocidade;
			if(direcao != 4) {
				setSequence(12, 16);
				direcao = 4;
			}movendo = true;
		}else if(teclado.keyDown(Keyboard.DOWN_KEY)==true) {
			if(this.y < janela.getHeight() - 60)//y - a altura da janela com -60 de margem
				this.y += velocidade;
			if(direcao != 5) {
				setSequence(0, 4);
				direcao = 5;
			}movendo = true;
		}
		if (movendo) {
			update();//vc atualiza ...e faz a troca das imagens
			movendo = false;//... e para
		}
	}
	 Font f = new Font("arial", Font.BOLD, 15);//import java.awt.*;
	 public void energia(Window janela) {
		 if (Jogador.energia >= 500) {//muda a cor do life abaixo de 500
		 janela.drawText("HP:   " + Jogador.energia, 30, 30, Color.GREEN, f);
		 }
		 else if (Jogador.energia < 500 && Jogador.energia >= 100) {
			 janela.drawText("HP:   " + Jogador.energia, 30, 30, Color.BLUE, f);
		 }
		 else {
			 janela.drawText("HP:   " + Jogador.energia, 30, 30, Color.RED, f);
		 }
	 }
}
