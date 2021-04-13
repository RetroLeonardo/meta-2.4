
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class EnvoltorioEnteros {

    private ArrayList<Integer> numeros; //ArrayList de Enteros
    private int capacidadInicial = 10;  //Capacidad inicial para el ArrayList

    /**
     * Metodo constructor que crea un ArrayList de Enteros con una capacidad inicial
     * @param cantidad Capacidad inicial del ArrayList de Enteros
     */
    public EnvoltorioEnteros(int cantidad) {
        numeros = new ArrayList(cantidad);
        capacidadInicial = cantidad;
    }
    
    /**
     * Metodo que llena el ArrayList de enteros con numeros aleatorios
     * del 0 al 11
     */
    public void llenarValores() {
        Random rand = new Random();//Se crea un numero aleatorio
        //Ciclo for que va creando numeros aleatorios y los añade al ArrayList de enteros
        for (int i = 0; i < capacidadInicial; i++) {    
            int valor = rand.nextInt(12);//Se crea un numero aleatorio entero menor de 12
            numeros.add(valor); //Se añade el numero al ArrayList de enteros
        }
    }
    
    /**
     * Metodo para contar cuantas veces se repiten los numeros
     * Despues de contar, imprime el numero y su cantidad de veces
     * que se repite
     */
    public void contarRepeticiones() {
        //Ciclo que va desde 0 hasta la capacidad del ArrayList de enteros
        for (int i = 0; i < capacidadInicial; i++) {
            
            int vecesRepetidas = 0;//Contador para saber cuantas veces se repite un numero
            int num = numeros.get(i);//Se guarda el numero de la posicion i para evaluarlo
            
            /*Repetido es un booleano que nos indicara si el numero actual se repite anteriormente
                Con el ciclo se busca si hay el mismo numero anteriormene*/
            boolean repetido = false;
            for (int k = 0; k < i; k++) {
                if (num == numeros.get(k)) repetido = true;
            }
            
            /* Si el numero actual no esta repetido, se usa otro ciclo para 
                contar las veces que se repite */
            if (!repetido) {
                for (int j = 0; j < capacidadInicial; j++) {
                    if (num == numeros.get(j)) vecesRepetidas++;
                }
            }
            
            /* Si el contador es mayor que 0
            Se imprime el numero y la cantidad de veces que se repite */
            if(vecesRepetidas>0)
                System.out.println("El numero " + num + " se repite " + vecesRepetidas + " veces.");
        }
    }
    
    /**
     * Metodo que imprime todos los enteros en el ArrayList
     */
    public void mostrarEnteros() {
        for (Integer entero : numeros) {
            System.out.println(entero);
        }
    }
}
