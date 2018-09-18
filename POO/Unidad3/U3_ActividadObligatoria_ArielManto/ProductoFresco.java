package unidad3;

import java.util.Scanner;

public class ProductoFresco extends Producto {
    String fechaEnvasado, paisOrigen;
    Scanner tecla = new Scanner(System.in);
    public ProductoFresco(){
        super();
        setFechaEnvasado();
        setPaisOrigen();
        System.out.println("*Producto registrado*");
    }
    public void mostrarDatos(){
        System.out.println("Lote: "+getNumLote()
                        +"\nFecha de caducidad: "+getFechaCaducidad());
        System.out.println("Fecha de envasado: "+getFechaEnvasado()
                +"\n"+"País de origen: "+getPaisOrigen()+"\n*");
    }
    public void setFechaEnvasado(){
        int dia, mes, año;
        System.out.println("Inserte fecha de envasado.");
        do {
            System.out.println("Día:");
            dia = tecla.nextInt();
            if (dia < 1 || dia >31){
                System.out.println("El día ingresado no es válido, intente nuevamente.");
            }
        } while (dia <1 || dia >31);
        do {
            System.out.println("Mes:");
            mes = tecla.nextInt();
            if (mes <1 || mes >12) {
                System.out.println("El mes ingresado no es válido, intente nuevamente.");
            }
        } while (mes <1 || mes >12);
        do {
            System.out.println("Año:");
            año = tecla.nextInt();
            if (año < 1990) {
                System.out.println("El año ingresado no es válido, intente nuevamente.");
            }
        } while (año < 1990);
        tecla.nextLine(); //Para poder utilizar el nextLine siguiente
        fechaEnvasado = dia + "/"+ mes + "/" + año;
    }
    public void setPaisOrigen(){
        System.out.println("Inserte país de origen:");
        paisOrigen = tecla.nextLine();
    }
    public String getFechaEnvasado(){return fechaEnvasado;}
    public String getPaisOrigen(){return paisOrigen;}

}
