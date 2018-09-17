package unidad3;

import java.util.Scanner;

public class ProductoCongelado extends Producto {
    double tempCong;
    Scanner tecla = new Scanner(System.in);
    public ProductoCongelado(){
        super();
        setTempCong();
        System.out.println("*Producto registrado*");
    }
    public void mostrarDatos(){
        System.out.println("Lote: "+getNumLote()
                        +"\nFecha de caducidad: "+getFechaCaducidad());
        System.out.println("Temperatura de congelamiento: "+getTempCong()+"\n*");
    }
    public void setTempCong(){
        System.out.println("Inserte temperatura de congelamiento:");
        tempCong = tecla.nextDouble();
    }

    public double getTempCong(){return tempCong;}


}