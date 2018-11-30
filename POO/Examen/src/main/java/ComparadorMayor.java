import java.util.InputMismatchException;
import java.util.Scanner;

public class ComparadorMayor {
    private static Scanner leerTeclado = new Scanner(System.in);

    static float comparar(float numeroA, float numeroB){
        return (numeroA >= numeroB) ? numeroA : numeroB; //Operador ternario
    }

    static float leerFloat(){
        boolean seguir;
        float input=0;
        do {
            try {
                input = leerTeclado.nextFloat();
                seguir = false;
            } catch (InputMismatchException e){
                System.out.println("El número no es válido, intente nuevamente:");
                seguir = true;
            }
            finally{
                leerTeclado.nextLine();
            }
        }
        while (seguir);
        return input;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese tres números");
        System.out.println("Primer número:");
        float num1 = leerFloat();
        System.out.println("Segundo número:");
        float num2 = leerFloat();
        System.out.println("Tercer número:");
        float num3 = leerFloat();
        float mayor = comparar(num1,num2);
        mayor = comparar(mayor,num3);
        System.out.println("El número mayor es " + mayor);
    }
}