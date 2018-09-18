public class ProductoCongelado extends Producto {
    private double tempCong;
    public void setTempCong(double tempCong){
        this.tempCong= tempCong;
    }
    public double getTempCong(){return this.tempCong;}
    public void mostrarDatos(){
        System.out.println("Lote: "+this.getNumLote()
                +"\nFecha de caducidad: "+this.getFechaCaducidad());
        System.out.println("Temperatura de congelamiento: "+this.getTempCong()+"\n*");
    }
}