import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        String estadoTransaccion;
        try {
            System.out.println("Ingrese un número:");
            int n = Integer.parseInt(leerTeclado.nextLine());
            estadoTransaccion = "exitosa";
        } catch(NumberFormatException e){
            System.out.println("Debe ingresar un número entero");
            estadoTransaccion = "fallida";
        }
        finally {
            System.out.println("Comprobando transacción...");
        }
        System.out.println("La transacción fue " + estadoTransaccion);
    }

}