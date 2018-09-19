//2.  Clase Programador (Especialización de Empleado - Clase Hija). Clase que hereda de Empleado todos los atributos y métodos.
//
//	Atributos:
//	- lineasDeCodigoPorHora : tipo entero
//		- lenguajeDominante: tipo String
//
//	Metodos:
//	- Constructor sin parámetros de entrada.
public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    //Getters y setters
    public int getLineasDeCodigoPorHora() {return lineasDeCodigoPorHora;}
    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora){this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;}
    public String getLenguajeDominante() {return lenguajeDominante;}
    public void setLenguajeDominante(String lenguajeDominante) {this.lenguajeDominante = lenguajeDominante;}
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Lenguaje dominante: "+this.getLenguajeDominante()
                +"\nLíneas de código/hora: "+this.getLineasDeCodigoPorHora());
    }


    public Programador(){
    }

    public static void main(String[] args) {
        //Carga 1 programador
        Programador programador1 = new Programador();
        programador1.setNombre("Fernando Lamas");
        programador1.setCedula("24E92B-602");
        programador1.setEdad(25);
        programador1.setCasado(false);
        programador1.setSalario(16500);
        programador1.setLenguajeDominante("Python");
        programador1.setLineasDeCodigoPorHora(120);
        //Carga 1 empleado
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Javier García");
        empleado1.setCedula("27A3C4-507");
        empleado1.setEdad(42);
        empleado1.setCasado(true);
        empleado1.setSalario(18000);
        programador1.mostrarDatos();
        empleado1.mostrarDatos();
    }
}
