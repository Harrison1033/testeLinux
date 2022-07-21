package jogo;

import jplay.GameObject;
import jplay.TileInfo;

public class Controle {
	public boolean Colisao(GameObject obj, TileInfo tile) {//método boolean colisão
		if ((tile.id >= 20 )&& obj.collided(tile)) {//decide objetos que podem ou não serem atravessados
			return true;
		}
		return false;
	}

}
