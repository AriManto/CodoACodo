import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        boolean error = true;
        int caramelos=0;
        int personas=0;
        int caramelosPorPersona=0;
        int resto=0;
        Scanner leer = new Scanner(System.in);
        while (error){
            try{
                System.out.println("Ingrese cantidad de caramelos:");
                caramelos = leer.nextInt();
                System.out.println("Ingrese número de personas:");
                personas = leer.nextInt();
                caramelosPorPersona = caramelos/personas;
                resto = caramelos%personas;
                error=false;
            }
            catch(InputMismatchException e){
                System.out.println("No se admiten letras, símbolos ni números decimales");
                error=true;
            }
            catch(ArithmeticException e){
                System.out.println("No se puede dividir por 0");
                error=true;
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("Error: "+e.getMessage());
                error=true;
            }
            finally {leer.nextLine();}
        }
        System.out.println("Cada persona recibe "+caramelosPorPersona+" caramelos, y sobran "+resto+" caramelos.");
    }

}
