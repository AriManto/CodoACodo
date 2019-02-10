import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args) {
    
       List<String> lista = new ArrayList<String>();
        
        /*Declaramos la lista del tipo dinámico "List" y 
        creamos el objeto que contendrá la variable lista 
       (un ArrayList de String)*/
       
       lista.add("Azul");
       lista.add("Rojo");
       lista.add("Blanco");
       lista.add("Amarillo");
       lista.add("Negro");
       
       //Agregamos elementos (objetos tipo String) a la lista
       System.out.println("Estos son los " + lista.size() + " colores que contiene la lista:\n");
       
       //Mensaje opcional
       for(String color: lista) {
       //Usamos un for each (for extendido) para recorrer la lista y analizar su contenido
       
       System.out.println(color);
       //Cada elemento que se encuentre durante la ejecución del for each sera mostrado por pantalla
       }
    }
}