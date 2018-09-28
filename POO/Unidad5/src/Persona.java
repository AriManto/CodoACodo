import java.util.concurrent.ThreadLocalRandom;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private int DNI;
    private boolean casado;


    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public char getSexo() {return sexo;}
    public void setSexo(char sexo) {this.sexo = sexo;}
    public int getDNI() {return DNI;}
    public void setDNI(int DNI) {this.DNI = DNI;}
    public boolean isCasado() {return casado;}
    public void setCasado(boolean casado) {this.casado = casado;}


    //Métodos
    public void comprobarSexo(char sexo){
        if (!(sexo=='H'||sexo=='h'||sexo=='M'||sexo=='m')){
            this.setSexo('H');
        }
    }
    public boolean esMayorDeEdad(){return (this.edad>=18)?true :false;} //Operador ternario
    public String toString(){
        StringBuilder datos = new StringBuilder(); //StringBuilder es más efectivo en la concatenación de Strings
        String datoCasado = (this.isCasado())?"Casado":"Soltero";
        datos.append("Nombre: "+this.getNombre()+"\nDNI: "+this.getDNI()+"\nSexo: "
                +this.getSexo()+"\nEdad: "+this.getEdad()+"\nEstado civil: "+datoCasado);
        return datos.toString();
    }
    public int generaDNI(){
        int maximo = 99999999;
        int minimo = 10000000;
        int azar = ThreadLocalRandom.current().nextInt(minimo,maximo + 1);
        return azar;
    }


    //Constructores
    public Persona(){
        this.setNombre("");
        this.setEdad(0);
        this.setSexo('?');
        this.setCasado(false);
        this.setDNI(this.generaDNI());
    }
    public Persona(String nombre, int edad, char sexo){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.comprobarSexo(sexo);
        this.setDNI(this.generaDNI());
    }
    public Persona(String nombre, int edad, char sexo, int DNI, boolean casado){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.comprobarSexo(sexo);
        this.setDNI(DNI);
        this.setCasado(casado);
    }


    public static void main(String[] args) {
        Persona milagros = new Persona("Milagros Ferraro",29,'z');
        System.out.println(milagros.toString());
    }
}
