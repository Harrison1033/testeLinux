package jogo;

import java.awt.Point;
import java.util.Vector;
import jplay.GameObject;
import jplay.Scene;
import jplay.Sprite;
import jplay.TileInfo;

public class Ator extends Sprite {
	protected int direcao = 3;
	double velocidade = 1.0;//abaixo disso estava dando bug
	 boolean movendo = false;
	Controle controle = new Controle();
	public double energia = 1000;
	
	public Ator(String fileName, int numFrames) {
		super(fileName, numFrames);
	}
	//controle do que não se pode atravessar
		public void caminho(Scene cena) {
			Point min = new Point((int)this.x, (int)this.y);//definir o tamanho do personagem
			Point max = new Point((int)this.x + this.width, (int)this.y + this.height);
			
			Vector<?>tiles = cena.getTilesFromPosition(min, max);
			
			for (int i = 0; i < tiles.size(); i++) {//for para interar todos os tiles
				TileInfo tile = (TileInfo) tiles.elementAt(i);//no caso o (TileInfo) é um cast
				
				if(controle.Colisao(this, tile)== true) {
				   if(colisaoVertical(this, tile)) {	
					if(tile.y + tile.height - 2 < this.y){//o -2 é a margem de segurança
						this.y = tile.y + tile.height;//verifica obatáculo que tiver acima do pesonagem
					}
					else if(tile.y > this.y + this.height -2) {//verifica obstáculo que tiver abaixo do personagem
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
