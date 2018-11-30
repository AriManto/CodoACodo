package com.arielmanto.gestionproductos;


public class Producto{
    private String fechaCaducidad;
    private int numLote;

    public String getFechaCaducidad() {return fechaCaducidad;}
    public void setFechaCaducidad(String fechaCaducidad) {this.fechaCaducidad = fechaCaducidad;}
    public int getNumLote() {return numLote;}
    public void setNumLote(int numLote) {this.numLote = numLote;}

    public String toString(){
        return "-----\nFecha de caducidad: "+ fechaCaducidad + "\nNº de Lote: " + numLote;
    }

    Producto(){
        this.fechaCaducidad="";
        this.numLote=0;
    }

    Producto(String fechaCaducidad, int numLote){
        this.fechaCaducidad=fechaCaducidad;
        this.numLote=numLote;
    }

}
