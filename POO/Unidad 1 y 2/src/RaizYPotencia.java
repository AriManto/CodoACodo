import java.util.Scanner;

//Realizar un algoritmo que lea un número por teclado.
// En caso de que ese número sea 0 o menor que 0,
// terminar el programa mostrando antes un mensaje de error.
// Si es mayor que 0, se deberá calcular su cuadrado y la
// raíz cuadrada del mismo, visualizando el número que ha tecleado
// el usuario y su resultado: (“Del número X, su potencia es X y su raíz X” ).
public class RaizYPotencia {
    private double raiz(double a){
        return Math.sqrt(a);
    }
    private double potencia(double a){
        return Math.pow(a,2);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        RaizYPotencia potenciador = new RaizYPotencia();
        System.out.println("Ingrese un número:");
        double numero = teclado.nextDouble();
        if (numero>0){
            System.out.println("Del número "+numero+", su potencia es "
            +potenciador.potencia(numero)+" y su raíz es "+potenciador.raiz(numero));
        }
        else {
            System.out.println("Error. El número debe ser mayor o igual a 0.");
        }
    }
}
