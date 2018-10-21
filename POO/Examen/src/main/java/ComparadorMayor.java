import java.util.Scanner;
//TODO excepciones?

public class ComparadorMayor {
    private static Scanner leerTeclado = new Scanner(System.in);

    static float comparar(float numeroA, float numeroB){
        return (numeroA >= numeroB) ? numeroA : numeroB; //Operador ternario
    }

    public static void main(String[] args) {
        System.out.println("Ingrese tres números");
        System.out.println("Primer número:");
        float num1 = leerTeclado.nextFloat();
        System.out.println("Segundo número:");
        float num2 = leerTeclado.nextFloat();
        System.out.println("Tercer número:");
        float num3 = leerTeclado.nextFloat();
        float mayor = comparar(num1,num2);
        mayor = comparar(mayor,num3);
        System.out.println("El número mayor es " + mayor);
    }
}
