public class Electrodomesticos {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    //Getters y setters
    public Electrodomesticos setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
        return this;
    }
    public Electrodomesticos setColor(String color) {
        this.color = color;
        return this;
    }
    public Electrodomesticos setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
        return this;
    }
    public Electrodomesticos setPeso(double peso) {
        this.peso = peso;
        return this;
    }
    public double getPrecioBase() {return precioBase;}
    public String getColor() {return color;}
    public char getConsumoEnergetico() {return consumoEnergetico;}
    public double getPeso() {return peso;}

    //Métodos
    private void comprobarConsumoEnergetico(char letra){
        if (!(letra=='A'||letra=='a'||letra=='B'||letra=='b'||letra=='C'||letra=='c'||letra=='D'||letra=='E'
                ||letra=='e'||letra=='F'||letra=='f')){
            this.setConsumoEnergetico('F');
        }
    }
    private void comprobarColor(String color){
        if(!(color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")
            ||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris"))){
            this.setColor("Blanco");
        }
    }
    public double precioFinal(){
        char consumoEnergetico = this.getConsumoEnergetico();
        double peso = this.getPeso();
        double extraConsumo = 0;
        double extraTamaño=0;
        if (consumoEnergetico=='D'||consumoEnergetico=='d'){
            extraConsumo=5000;
        }else if (consumoEnergetico=='C'||consumoEnergetico=='c'){
            extraConsumo=7000;
        }else if (consumoEnergetico=='B'||consumoEnergetico=='b'){
            extraConsumo=8000;
        }else if (consumoEnergetico=='A'||consumoEnergetico=='a'){
            extraConsumo=10000;
        }
        if (peso>=70){
            extraTamaño=25000;
        } else if (peso >=50){
            extraTamaño=17000;
        } else if (peso >=20){
            extraTamaño=10000;
        } else if (peso<20){
            extraTamaño=5000;
        }
        double precioFinal=this.precioBase+extraConsumo+extraTamaño;
        return precioFinal;
    }


    //Constructores
    public Electrodomesticos(){
        this.precioBase=10000;
        this.color="Blanco";
        this.consumoEnergetico='F';
        this.peso=5;
    }
    public Electrodomesticos(double precioBase, double peso){
        this.precioBase=precioBase;
        this.peso=peso;
    }
    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso){
        this.color=color;
        this.precioBase=precioBase;
        this.consumoEnergetico=consumoEnergetico;
        this.comprobarConsumoEnergetico(consumoEnergetico);
        this.comprobarColor(color);
        this.peso=peso;
    }

    public static void main(String[] args) {
        Electrodomesticos electro = new Electrodomesticos(10000,"negro",'a',20);
        //Salida datos
        System.out.printf("Electrodomestico\nPrecio base: %.2f -- Color: %s -- Consumo: %c -- Peso: %.2f\n",electro.getPrecioBase(),
                electro.getColor(), electro.getConsumoEnergetico(),electro.getPeso());
        System.out.printf("Precio final: %.2f\n",electro.precioFinal());
        System.out.println("-------");
        Lavarropas lava = new Lavarropas(40,7000,"verde",'d',45);
        //Salida datos
        System.out.printf("Lavarropas\nPrecio base: %.2f -- Color: %s -- Consumo: %c -- Peso: %.2f -- Carga: %.2f\n",lava.getPrecioBase(),
                lava.getColor(), lava.getConsumoEnergetico(),lava.getPeso(),lava.getCarga());
        System.out.printf("Precio final: %.2f\n",lava.precioFinal());
        System.out.println("-------");
        Television tele = new Television(50, true,10000,"azul",'b',25);
        //Salida datos
        System.out.printf("Televisor\nPrecio base: %.2f -- Color: %s -- Consumo: %c -- Peso: %.2f -- Resolución: %.2f\" --" +
                        "Sintonizador TDT: %b\n",tele.getPrecioBase(),
                tele.getColor(), tele.getConsumoEnergetico(),tele.getPeso(),tele.getResolucion(),tele.isSintonizadorTDT());
        System.out.printf("Precio final: %.2f\n",tele.precioFinal());
    }




}
