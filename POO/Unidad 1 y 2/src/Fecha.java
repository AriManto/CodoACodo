//Leer tres números que denoten una fecha (día, mes, año).
// Comprobar que es una fecha válida. Si no es válida mostrar un mensaje de error.
// Si es válida escribir la fecha cambiando el número del mes por su nombre.
// Ej: si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”.
// El año debe ser mayor que 0 para que sea válido.
// (Recuerda la estructura switch para java).

import java.util.Scanner;

public class Fecha {
    //Atributos de clase
    private int dia;
    private int mes;
    private int anio;
    //Métodos Set y Get
    public void setDia(int dia){this.dia =dia;}
    public void setMes(int mes){this.mes=mes;}
    public void setAnio(int anio){this.anio=anio;}
    public int getDia(){return dia;}
    public int getMes(){return mes;}
    public int getAnio(){return anio;}
    //Nombre del mes
    public String nombreMes(int numMes){
        String mes="";
        switch(numMes){
            case 1: mes= "Enero";
            break;
            case 2: mes= "Febrero";
            break;
            case 3: mes= "Marzo";
            break;
            case 4: mes= "Abril";
            break;
            case 5: mes= "Mayo";
            break;
            case 6: mes= "Junio";
            break;
            case 7: mes= "Julio";
            break;
            case 8: mes= "Agosto";
            break;
            case 9: mes="Septiembre";
            break;
            case 10: mes= "Octubre";
            break;
            case 11: mes= "Noviembre";
            break;
            case 12: mes= "Diciembre";
            break;
        }
        return mes;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Fecha fecha = new Fecha();
        do {
            System.out.println("Ingrese el dia:");
            fecha.setDia(teclado.nextInt());
            if (!(fecha.getDia()>0&&fecha.getDia()<31)){
                System.out.println("El día ingresado no es válido.");
            }
        }
        while (!(fecha.getDia()>0&&fecha.getDia()<31));
        do {
            System.out.println("Ingrese el mes:");
            fecha.setMes(teclado.nextInt());
            if (!(fecha.getMes()>0&&fecha.getMes()<=12)){
                System.out.println("El mes ingresado no es válido.");
            }
        }
        while (!(fecha.getMes()>0&&fecha.getMes()<=12));
        do {
            System.out.println("Ingrese el año:");
            fecha.setAnio(teclado.nextInt());
            if(!(fecha.getAnio()>0))
                System.out.println("El año ingresado no es válido.");
        }
        while(!(fecha.getAnio()>0));
        System.out.println(fecha.getDia()+" de "+fecha.nombreMes(fecha.getMes())+" de "
                +fecha.getAnio());
    }


}
