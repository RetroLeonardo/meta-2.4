package dado;
import java.util.Random;
public class Dado {
  private CrearDado dadoPrincipal;   
 public static void main(String[] args) {
     CrearDado dadoPrincipal = new CrearDado();  
System.out.println("lado: "+ dadoPrincipal.lanzarDado());
System.out.println("prueba");
 }
}
