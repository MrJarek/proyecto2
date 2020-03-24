import java.util.*;

public class UserInterface {

  Scanner entrada=new Scanner(System.in);

 public int pideNumero() {
   System.out.println("introduce un número, please");
   int numero = entrada.nextInt();
   return numero;
 }

 public void masAlto() {
   System.out.println("Más alto");
 }

 public void masBajo() {
   System.out.println("Más Bajo");
 }

 // A - alto
 // B - bajo
 public void masAB(char c) {
   if (c == 'A') masAlto();
   else masBajo();
 }

}
