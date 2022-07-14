package jogo;

import java.util.LinkedList;

import jplay.Scene;
import jplay.Sound;
import jplay.URL;

public class ControleTiros {
	LinkedList<Tiro> tiros = new LinkedList<>();
	public void adicionaTiro(double x, double y, int caminho, Scene cena) {
		Tiro tiro = new Tiro(x, y, caminho);
		tiros.addFirst(tiro);
		cena.addOverlay(tiro);
		somDisparo();
	}
	public void run(Ator inimigo) {
		for (int i = 0; i < tiros.size(); i++) {
			Tiro tiro = tiros.removeFirst();
			tiro.mover();
			tiros.addLast(tiro);
			if(tiro.collided(inimigo)) {
				tiro.x = 10_000;
				inimigo.energia -= 250;
			}
		}
	}
	private void somDisparo() {
		new Sound(URL.audio("tiro.wav")).play();
	}

}
