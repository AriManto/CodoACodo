import java.util.Scanner;

public class testValidaciones {
    public static void main(String[] args) {
        //Si quiero que un número sea mayor a 0
        Scanner tecla = new Scanner(System.in);
        int a;
        do{
            System.out.println("Inserte un número positivo:");
            a = tecla.nextInt();
        }

        while (!(a>0)); //while !(cond) <- hasta que se cumpla esa condición!
                        //Es más simple
        System.out.println(a);


        //Otro ejemplo pero sin negar la condición, tengo que definir el intervalo opuesto
        int b;
        do {
            System.out.println("Inserte un número negativo:");
            b = tecla.nextInt();
        }
        while (b>=0); //Se va a ejecutar mientras se cumpla la condición contraria
                      //Es un poco más complicado ya que hay que pensar la condición
                      //contraria de la que queremos conseguir
    }
}