public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            throw new excepcion("Error 24898. Contacte al soporte técnico.");
        } catch(excepcion e){
            System.out.println(e.getError());
        }
        finally {
            System.out.println("Fin del bloque try-catch");
        }
    }

}
class excepcion extends Exception{
    String error;
    public excepcion(String error){
        this.error = error;
    }
    public String getError(){
        return this.error;
    }

}