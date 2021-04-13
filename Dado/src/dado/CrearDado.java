package dado;

import java.util.Random;

public class CrearDado {
 private int lado ;   
 
public CrearDado(){
this.lado=lado;
}
public void setLado(int lado){
this.lado=lado;
}
public int getLado(){
return lado;
}
public int lanzarDado(){
Random aleatorio=new Random();
int resultado=aleatorio.nextInt(7);
return resultado;
}
}

