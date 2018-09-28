public class Cuenta {
    //Atributos
    private String titular;
    private double cantidad;
    //Getters y setters
    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}
    public double getCantidad() {return cantidad;}
    public void setCantidad(double cantidad) {this.cantidad = cantidad;}

    public String toString(){
        String cuenta = "Esta cuenta pertenece a "+this.getTitular()+
                " y posee $"+Double.toString(this.getCantidad());
        return cuenta;
    }

    private void ingresar(double cantidad){
        if (cantidad>=0){
            this.setCantidad(this.getCantidad()+cantidad);
            System.out.println("Ingresó $"+cantidad);
        }
    }
    private void retirar(double cantidad){
        this.setCantidad(this.getCantidad()-cantidad);
        if (this.getCantidad()<0){
            this.setCantidad(0);
        }
        System.out.println("Retiró $"+cantidad+", saldo $"+this.getCantidad());
    }
    //Constructores. Titular es obligatorio.
    public Cuenta (String titular){
        this.setTitular(titular);
    }
    public Cuenta (String titular, double cantidad){
        this.setTitular(titular);
        this.setCantidad(cantidad);
    }


    public static void main(String[] args) {
        Cuenta q1 = new Cuenta("Jaime López",1347.95);
        System.out.println(q1);
        q1.ingresar(4000);
        System.out.println(q1);
        q1.retirar(2500);
        System.out.println(q1);
    }


}
