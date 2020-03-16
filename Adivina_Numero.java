import java.util.*;
public class Adivina_Numero{

    public static void main(String[] args) {
        
        int aleatorio=(int)(Math.random()*100);//nos genera números aleatorios de tipo "double" para que nos genere numeros de 1 a 100 debemos multiplicarlo
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int intentos=0;
        
        while (numero!=aleatorio){//mientras numero sea verdad(numero diferente al numero en aleatorio) seguira repitiendose en bucle.
                intentos= intentos +1;
            System.out.println("introduce un número, please");
            numero=entrada.nextInt();
            if(aleatorio<numero){
                System.out.println(aleatorio + " "+numero);
                System.out.println("Más Bajo");
            } else if(aleatorio>numero){
                System.out.println(aleatorio + " "+numero);
                System.out.println("Más alto");
            }
        }
        System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos");
    //provemos de nuevo??
    }
}