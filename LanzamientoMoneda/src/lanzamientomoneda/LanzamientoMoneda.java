package lanzamientomoneda;

import java.util.Random;


public class LanzamientoMoneda {
private CrearMoneda moneda;
    public static void main(String[] args) {
     Random aleatorio=new Random();
     
     CrearMoneda moneda=new CrearMoneda(aleatorio.nextBoolean());
     boolean resultado=moneda.getMoneda();
     if(resultado==true)
        System.out.println("cara");
else
            System.out.println("cruz");
    }
    
}
