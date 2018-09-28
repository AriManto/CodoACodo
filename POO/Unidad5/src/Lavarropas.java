public class Lavarropas extends Electrodomesticos {
    private double carga;


    //Get y set
    public double getCarga() {return carga;}
    public void setCarga(double carga) {this.carga = carga;}


    //Métodos
    public double precioFinal(){
        double extraCarga = 0;
        if (this.carga >=30){
            extraCarga = 10000;
        }
        double precioSuper=super.precioFinal();
        return precioSuper+extraCarga;
    }


    //Constructores
    public Lavarropas(){
        super();
        this.carga=5;
    }
    public Lavarropas(double precio, double peso){
        super(precio,peso);
    }
    public Lavarropas(double carga, double precioBase, String color, char consumoEnergetico, double peso){
        super(precioBase,color,consumoEnergetico,peso);
        this.setCarga(carga);
    }
}
