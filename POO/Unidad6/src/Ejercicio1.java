public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            String nombre = "Juan";
            int edad = 23;
            System.out.println(nombre + " tiene " + edad + " años");
        }
        catch (NullPointerException e){
            System.out.println("No se encontró un nombre");
        }
        finally {
            System.out.println("Fin del programa");
        }
    }
}
