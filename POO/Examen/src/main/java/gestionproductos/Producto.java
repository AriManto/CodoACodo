package gestionproductos;


public class Producto{
    private String fechaCaducidad;
    private String numLote;

    public String getFechaCaducidad() {return fechaCaducidad;}
    public void setFechaCaducidad(String fechaCaducidad) {this.fechaCaducidad = fechaCaducidad;}
    public String getNumLote() {return numLote;}
    public void setNumLote(String numLote) {this.numLote = numLote;}

    public String toString(){
        return "-----\nFecha de caducidad: "+ fechaCaducidad + "\nNº de Lote: " + numLote;
    }

    Producto(){
        this.fechaCaducidad="";
        this.numLote="";
    }

    Producto(String fechaCaducidad, String numLote){
        this.fechaCaducidad=fechaCaducidad;
        this.numLote=numLote;
    }

}
