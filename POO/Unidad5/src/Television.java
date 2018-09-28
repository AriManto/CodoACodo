public class Television extends Electrodomesticos {
    private double resolucion;
    private boolean sintonizadorTDT;


    //Get y set
    public double getResolucion() {return resolucion;}
    public void setResolucion(double resolucion) {this.resolucion = resolucion;}
    public boolean isSintonizadorTDT() {return sintonizadorTDT;}
    public void setSintonizadorTDT(boolean sintonizadorTDT) {this.sintonizadorTDT = sintonizadorTDT;}

    public double precioFinal(){
        double extraResolucion = 1;
        double extraSintonizador = 0;
        if (this.resolucion >40){
            extraResolucion = 1.3; //Incremento de 30%
        }
        if (this.sintonizadorTDT==true){
            extraSintonizador=7000;
        }
        double precioSuper=super.precioFinal();
        return (precioSuper*extraResolucion)+extraSintonizador;
    }
    //Constructores
    public Television(){
        super();
        resolucion=30;
        sintonizadorTDT=false;
    }
    public Television(double precio, double peso){
        super(precio,peso);
       }
    public Television(double resolucion, boolean sintonizadorTDT, double precio, String color, char consumo, double peso){
        super(precio,color,consumo,peso);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}
