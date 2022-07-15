package jogo;

import javax.swing.event.MenuKeyEvent;
import java.awt.*;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;	
import jplay.Window;

public class Jogador extends Ator {
	 //acrescentei a linha de baixo
	 static int energia = 3000;
	public Jogador(int x, int y) {
		super(URL.sprite("jogador.png"), 20);//distância de um sprite do outro
		this.x = x;
		this.y = y;
		this.setTotalDuration(2000);
	}
	ControleTiros tiros = new ControleTiros();
	public void atirar(Window janela, Scene cena, Keyboard teclado, Ator inimigo ) {
		if ( teclado.keyDown(MenuKeyEvent.VK_A)) {
			tiros.adicionaTiro(x + 5, y + 8, direcao, cena);
		}
		tiros.run(inimigo);
	}
	public void mover(Window janela, Keyboard teclado) { 	
		//acrescentei == true
		if(teclado.keyDown(Keyboard.LEFT_KEY)==true) {
			if(this.x > 0)
				this.x -= velocidade;
			if(direcao != 1) {
				setSequence(4, 8);
				direcao = 1;
			}movendo = true;
		}else if(teclado.keyDown(Keyboard.RIGHT_KEY)) {
			if(this.x < janela.getWidth() - 60)
				this.x += velocidade;
			if(direcao != 2) {
				setSequence(8, 12);
				direcao = 2;
			}movendo = true;
		}else if(teclado.keyDown(Keyboard.UP_KEY)) {
			if(this.y > 0)
				this.y -= velocidade;
			if(direcao != 4) {
				setSequence(12, 16);
				direcao = 4;
			}movendo = true;
		}else if(teclado.keyDown(Keyboard.DOWN_KEY)==true) {
			if(this.y < janela.getHeight() - 60)
				this.y += velocidade;
			if(direcao != 5) {
				setSequence(0, 4);
				direcao = 5;
			}movendo = true;
		}
		if (movendo) {
			update();//vc atualiza ...
			movendo = false;//... e para
		}
	}
	 Font f = new Font("arial", Font.BOLD, 30);//import java.awt.*;
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
