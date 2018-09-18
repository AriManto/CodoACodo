import java.util.Scanner;

// Realizar un algoritmo que lea tres números distintos y nos diga cuál de ellos
// es el mayor (recordá usar la estructura condicional y los operadores lógicos).
// Usar la clase Scanner para leer desde teclado.

public class NumeroMayor {
    public double mayor(double a, double b){
        //Operador ternario
      return a>=b?a:b;
        //If-Else
       /* if (a>=b){
        return a;
        }
        else {return b;}*/
    }
    public double leerNumero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        return teclado.nextDouble();
    }
    public double compararTres(double a, double b, double c){
        double maximo;
        double resultado;
        maximo = mayor(a,b);
        resultado = mayor(maximo,c);
        return resultado;
    }

    public static void main(String[] args) {
        NumeroMayor comparador = new NumeroMayor();
        double num1 = comparador.leerNumero();
        double num2 = comparador.leerNumero();
        double num3 = comparador.leerNumero();
        double resultado = comparador.compararTres(num1, num2, num3);
        //Formato de numeros
        System.out.printf("Los números ingresados fueron:\n%4.2f\n%4.2f\n%4.2f\n", num1, num2, num3);
        System.out.println("El mayor es " + resultado);
    }
}
