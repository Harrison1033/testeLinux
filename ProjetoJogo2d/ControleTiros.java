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
	public void run() {
		for (int i = 0; i < tiros.size(); i++) {
			Tiro tiro = tiros.removeFirst();
			tiro.mover();
			tiros.addLast(tiro);
		}
	}
	private void somDisparo() {
		new Sound(URL.audio("tiro.wav")).play();
	}

}
