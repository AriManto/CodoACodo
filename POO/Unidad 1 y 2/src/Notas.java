import java.util.Scanner;

public class Notas {
    //Atributos de clase
    private int[] notas = new int[30];
    private int bajas = 0; //0 a 4
    private int regulares = 0; //5
    private int buenas = 0; //6 y 7
    private int muyBuenas = 0; //8 y 9
    private int excelentes = 0; //10
    //Set y Get
    private void setNotas(int valor, int i) { notas[i] = valor; }
    private int getNotas(int i) {return this.notas[i];}
    //Manipulación de notas
    private void calificarNotas(){
        for (int i=0; i<30; i++) {
            if (this.getNotas(i) == 10) {
                this.excelentes++;
            } else if (this.getNotas(i) >= 8) {
                this.muyBuenas++;
            } else if (this.getNotas(i) >= 6) {
                this.buenas++;
            } else if (this.getNotas(i) == 5) {
                this.regulares++;
            } else if (this.getNotas(i) >= 0) {
                this.bajas++;
            }
        }
    }
    private void informarNotas(){
        System.out.println("Bajas: "+this.bajas
                +"\nRegulares: "+this.regulares
                +"\nBuenas: "+this.buenas
                +"\nMuy Buenas: "+this.muyBuenas
                +"\nExcelentes: "+ this.excelentes);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Notas listaNotas = new Notas();
        //Inicio
        System.out.println("Inserte 30 notas:");
        //Ingreso de las notas
        for (int i=0;i<30;i++){
            do {
                System.out.println((i + 1)+":");
                listaNotas.setNotas(teclado.nextInt(),i);
            //Validación de la nota
                 if (!(listaNotas.getNotas(i) >= 0 && listaNotas.getNotas(i) <= 10)) {
                    System.out.println("La nota debe ser del 0 al 10");
                }
            }
            while (!(listaNotas.getNotas(i) >= 0 && listaNotas.getNotas(i) <= 10));
        }
        //Fin de ingreso notas
        listaNotas.calificarNotas();
        listaNotas.informarNotas();
    }
}




