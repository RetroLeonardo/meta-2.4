
package baraja;

import java.util.Random;


public class Baraja {
   
    public static void main(String[] args) {
       Random aleatorio=new Random();
       int numero;
       Deck carta;
       carta=new Deck();
        numero=aleatorio.nextInt(53);
        System.out.println(carta.mostrarCarta(numero));
        carta.sacarCarta(numero);
    }
}
