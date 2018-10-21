package gestionproductos;

public class ProductoCongelado extends Producto {
    private float tempCongelacion;

    public float getTempCongelacion() {return tempCongelacion;}
    public void setTempCongelacion(float tempCongelacion) {this.tempCongelacion = tempCongelacion;}

    public String toString(){
        return super.toString() + "\nTemperatura de congelación recomendada: " + this.tempCongelacion+" ºC";
    }

    ProductoCongelado(){
        super();
        this.tempCongelacion=0;
    }
    ProductoCongelado(String fechaCad, String numLote, float tempCongelacion){
        super(fechaCad,numLote);
        this.tempCongelacion=tempCongelacion;
    }
}
