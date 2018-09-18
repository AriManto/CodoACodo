//Una empresa de informática quiere llevar un registro de todos sus empleados, para eso ha debemos crear las clases correspondientes en Java , las cuales deben incluir lo siguiente :
//A) Clase Empleado (Clase padre)
//	Atributos:
//	- nombre: tipo String (Debe ser nombre y apellido)
//	- cedula: tipo String
//	- edad : entero (Rango entre 18 y 45 años)
//	- casado: boolean
//	- salario: tipo numérico doble
//
//	Métodos a crear en la clase Empleado:
//
//	- Constructor  sin parámetros de entrada
//
//- Imprimir los datos del empleado por pantalla (utilizar salto de línea \n para separar
// los atributos.

public class Empleado {
    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;
    //Setters y Getters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getCedula() { return cedula;}
    public void setCedula(String cedula) {this.cedula = cedula;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {
        if (edad >= 18 && edad <=45) {
            this.edad = edad;
        }
    }
    public boolean isCasado() {return casado;}
    public String stringCasado(){
        if (this.isCasado()){
            return "Sí";
        }
        else {return "No";}
    }
    public void setCasado(boolean casado) {this.casado = casado;}
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
    //Constructor
    public Empleado(){}
    public void mostrarDatos(){
        System.out.println("----------------------------------------------");
        System.out.println("Nombre: "+this.getNombre()
        +"\nCedula: "+this.getCedula()+"\nEdad: "+this.getEdad()
        +"\nCasado: "+this.stringCasado()+"\nSalario: "+this.getSalario());
    }

}
