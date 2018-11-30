public class Ejercicio5 {
    public static void main(String[] args) {
        String estadoTransaccion="";
        System.out.println("Realizar transferencia bancaria");
        try {
            System.out.println("Ingrese CBU destinatario:");
            int n = Integer.parseInt("M");
            System.out.println("Enviando monto a CBU " + n);
            estadoTransaccion = "exitosa";
        } catch(NumberFormatException e){
            System.out.println("El CBU ingresado no es válido.");
            estadoTransaccion = "fallida";
        }
        finally {
            System.out.println("Confirmando transacción...");
            System.out.println("La transacción fue " + estadoTransaccion);
        }
        System.out.println("Gracias por usar nuestros servicios.");
    }
}