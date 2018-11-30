public class Cuenta {
    private String titular;
    private float cantidad;

    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}
    public float getCantidad() {return cantidad;}
    public void setCantidad(float cantidad) {this.cantidad = cantidad;}

    public String toString(){
        return "*Titular de la cuenta: " + titular + "\n*Balance: $" + cantidad;
    }

    Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }
    Cuenta(String titular, float cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if (cantidad>=0){
            this.cantidad += cantidad;
            System.out.println("Se añadieron $" + cantidad + " a la cuenta de " + titular);
        }
    }
    public void retirar(double cantidad){
        if (cantidad>=0) {
            this.cantidad -= cantidad;
            System.out.println("Se retiraron $" + cantidad+ " de la cuenta de " + titular);
            if (this.cantidad < 0) {
                this.cantidad = 0;
            }
        }
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Pablo Pérez");
        System.out.println(cuenta1.toString());
        cuenta1.ingresar(15000);
        System.out.println(cuenta1.toString());
        Cuenta cuenta2 = new Cuenta("Jaime Rodríguez",3000);
        System.out.println(cuenta2.toString());
        cuenta2.retirar(4000);
        System.out.println(cuenta2.toString());
    }

}
