public class ProductoFresco extends Producto {
    private String fechaEnvasado, paisOrigen;
    public ProductoFresco(){
        super();
    }
    //Getters y Setters
    public String getFechaEnvasado(){return fechaEnvasado;}
    public String getPaisOrigen(){return paisOrigen;}
    public void setFechaEnvasado(int dia, int mes, int año){
        this.fechaEnvasado = dia + "/"+ mes + "/" + año;
    }
    public void setPaisOrigen(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }
    public void mostrarDatos(){
        System.out.println("Lote: "+this.getNumLote()
                        +"\nFecha de caducidad: "+this.getFechaCaducidad());
        System.out.println("Fecha de envasado: "+this.getFechaEnvasado()
                +"\n"+"País de origen: "+this.getPaisOrigen()+"\n*");
    }
}
