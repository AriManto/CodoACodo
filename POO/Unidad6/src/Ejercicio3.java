public class Ejercicio3 {
    public static void main(String[] args) {
        try{
            throw new Exception("Excepcion de prueba");

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fin del bloque try-catch");
        }
    }
}
