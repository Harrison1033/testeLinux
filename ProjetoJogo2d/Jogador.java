package jogo;

//import java.util.Vector;
//import java.awt.Point;
//import jplay.GameObject;
import jplay.Keyboard;
//import jplay.Scene;
//import jplay.Sprite;
//import jplay.TileInfo;
import jplay.URL;
import jplay.Window;

public class Jogador extends Ator {
	
	 //acrescentei a linha de baixo
	 static double energia = 100;
	 
	public Jogador(int x, int y) {
		super(URL.sprite("jogador.png"), 20);
		this.x = x;
		this.y = y;
		
		this.setTotalDuration(2000);
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
	
	
}