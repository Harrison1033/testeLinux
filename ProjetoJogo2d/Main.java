package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Main {

	public static void main(String[] args) {
		Window janela = new Window(800, 600);//janela da biblioteca JPlay.jar(800,600) é o tamanho
		GameImage plano = new GameImage(URL.sprite("menu.png"));//menu do jogo(MELHORAR ISSO DEPOIS)
		Keyboard teclado = janela.getKeyboard();//para reconhecer o teclado(enter)para entrar na tela do jogo
		
		while(true) {
			plano.draw();//pinta a tela
			janela.update();//fica atualizando enquanto percorre o loop
			
			if(teclado.keyDown(Keyboard.ENTER_KEY)) {//reconhece o enter com a tecla para entrar no jogo
				new Cenario1(janela);//diz em qual cenário entrar após digitar o enter
			}
		}
	}
}
