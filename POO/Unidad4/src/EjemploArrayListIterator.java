
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
public class EjemploArrayListIterator {

    public static void main(String[] args) {
      
        /*Declaramos la lista del tipo dinámico "List" y creamos el 
        objeto que contendrá la variable lista (un ArrayList de String)*/
        List<String> lista = new ArrayList<String>();
      
        //Agregamos elementos (objetos tipo String) a la lista
        lista.add("Azul");
        lista.add("Rojo");
        lista.add("Blanco");
        lista.add("Amarillo");
        lista.add("Negro");
      
        System.out.println("Estos son los " + lista.size() + " colores que contiene la lista:\n");
        //Creamos un objeto tipo Iterator que contendrá una especie de copia 
        //de cada elemento que contenga la lista
      
        /*Usamos un ciclo while combinado con métodos propios de la clase Iterator 
        invocados sobre el objeto it previamente creado, para recorrer la lista 
        y analizar su contenido*/
      
        Iterator<String> it = lista.iterator();
      
        while(it.hasNext()) {
            System.out.println(it.next());
            //Cada elemento que se encuentre durante cada ciclo del bucle while sera mostrado por pantalla
        }
   }
}