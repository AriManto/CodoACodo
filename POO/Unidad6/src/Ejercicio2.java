public class Ejercicio2 {
    public static void main(String[] args) {
        try{
            int n= Integer.parseInt("M");
            System.out.println("El número ingresado es: "+n);
        }
        catch(NumberFormatException e){
            System.out.println("No se ingresó un número válido");
        }
        finally {
            System.out.println("Fin del programa");
        }
    }
}
