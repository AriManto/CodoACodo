package unidad3;

import java.util.Scanner;

public abstract class Producto {
    String fechaCaducidad, numLote;
    Scanner tecla = new Scanner(System.in);
    //método constructor
    public Producto(){
        setFechaCaducidad();
        setNumLote();
    }
    public abstract void mostrarDatos();

    public String getFechaCaducidad(){return fechaCaducidad;}
    public String getNumLote(){return numLote;}

    public void setFechaCaducidad(){
        int dia, mes, año;
        System.out.println("Inserte fecha de caducidad.");
        //Validación de Día
        do {
            System.out.println("Día:");
            dia = tecla.nextInt();
            if(dia <1 || dia >31){
                System.out.println("El día ingresado no es válido, intente nuevamente.");
            }
        } while (dia <1 || dia >31);
        //Validación de Mes
        do {
            System.out.println("Mes:");
            mes = tecla.nextInt();
            if (mes <1 || mes >12){
                System.out.println("El mes ingresado no es válido, intente nuevamente.");
            }
        } while (mes <1 || mes >12);
        //Validación de Año
        do {
            System.out.println("Año:");
            año = tecla.nextInt();
            tecla.nextLine(); //Para solucionar un error del scanner salteando el nextline
            if (año < 2018) {
                System.out.println("El año ingresado no es válido, intente nuevamente.");
            }
        }while (año <2018);
        fechaCaducidad = dia + "/"+ mes + "/" + año;
    }
    public void setNumLote(){
        System.out.println("Inserte número de lote:");
        numLote = tecla.nextLine();
    }
}
