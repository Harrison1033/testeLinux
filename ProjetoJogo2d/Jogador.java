package jogo;

import java.util.Vector;
import java.awt.Point;
import jplay.GameObject;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Sprite;
import jplay.TileInfo;
import jplay.URL;
import jplay.Window;

public class Jogador extends Sprite {
	protected int direcao = 3;
	 
	double velocidade = 1;
	 boolean movendo = false;
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
	Controle controle = new Controle();
	//controle do que não se pode atravessar
	public void caminho(Scene cena) {
		Point min = new Point((int)this.x, (int)this.y);
		Point max = new Point((int)this.x + this.width, (int)this.y + this.height);
		
		Vector<?>tiles = cena.getTilesFromPosition(min, max);
		
		for (int i = 0; i < tiles.size(); i++) {
			TileInfo tile = (TileInfo) tiles.elementAt(i);
			
			if(controle.Colisao(this, tile)== true) {
			   if(colisaoVertical(this, tile)) {	
				if(tile.y + tile.height - 2 < this.y){
					this.y = tile.y + tile.height;
				}
				else if(tile.y > this.y + this.height -2) {
					this.y = tile.y - this.height;
				}
				}
			   if(colisaoHorizontal(this, tile)) {
				   if (tile.x > this.x + this.width - 2) {
					   this.x = tile.x - this.width;
				   }else {
					   this.x = tile.x + tile.width;
				   }
			   }
			}
		}
		
	}
	
	private boolean colisaoVertical(GameObject obj, GameObject obj2) {
		if(obj2.x + obj2.width <= obj.x)
			return false;
		if (obj.x + obj.width <= obj2.x)
			return false;
		return true;
	}
	private boolean colisaoHorizontal(GameObject obj, GameObject obj2) {
		if(obj2.y + obj2.height <= obj.y)
			return false;
		if (obj.y + obj.height <= obj2.y)
			return false;
		return true;

	}

}
