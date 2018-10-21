package gestionproductos;

public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public String getFechaEnvasado() {return fechaEnvasado;}
    public void setFechaEnvasado(String fechaEnvasado) {this.fechaEnvasado = fechaEnvasado;}
    public String getPaisOrigen() {return paisOrigen;}
    public void setPaisOrigen(String paisOrigen) {this.paisOrigen = paisOrigen;}

    public String toString(){
        return super.toString() + "\nFecha envasado: " + this.fechaEnvasado + "\nPaís de Origen: " + this.paisOrigen;
    }

    ProductoFresco(){
        super();
        this.fechaEnvasado="";
        this.paisOrigen="";
    }

    ProductoFresco(String fechaCad, String numLote, String fechaEnvasado, String paisOrigen){
        super(fechaCad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
}
