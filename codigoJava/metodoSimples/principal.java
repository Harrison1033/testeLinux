package aleatorio.principais;

import aleatorio.classe.Amarelo;
import aleatorio.classe.Azul;
import aleatorio.classe.Cinza;
import aleatorio.classe.Verde;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal vaca = new Vaca();
        Animal gato = new Gato();
        falar (cachorro);
        falar(vaca);
        falar(gato);
    }
    protected static void falar(Animal azul){
        cachorro.falar();

    }
}
