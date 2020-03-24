import java.util.*;
public class Adivina_Numero{

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        int aleatorio=(int)(Math.random()*100);//nos genera números aleatorios de tipo "double" para que nos genere numeros de 1 a 100 debemos multiplicarlo
        int numero=0;
        int intentos=0;

        while (numero!=aleatorio){//mientras numero sea verdad(numero diferente al numero en aleatorio) seguira repitiendose en bucle.
            intentos= intentos +1;
            numero = ui.pideNumero();
            if(aleatorio<numero){
                ui.masBajo();
            } else if(aleatorio>numero){
                ui.masAlto();
            }
        }
        System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos");
    //provemos de nuevo??
    }
}
