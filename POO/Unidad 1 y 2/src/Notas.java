import java.util.Scanner;

public class Notas {
    //Atributos de clase
    private int[] notas = new int[10];
    public int bajas = 0; //0 a 4
    public int regulares = 0; //5
    public int buenas = 0; //6 y 7
    public int muyBuenas = 0; //8 y 9
    public int excelentes = 0; //10

    //Set y Get
    public void setNotas(int valor, int i) { notas[i] = valor; }
    public int getNotas(int i) {return this.notas[i];}
    //
    public void informarNotas(){
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
        System.out.println("Inserte 10 notas:");
        for (int i=0;i<10;i++){
            do {
                System.out.println((i + 1)+":");
                listaNotas.setNotas(teclado.nextInt(),i);
            //Validación de la nota
                 if (!(listaNotas.getNotas(i) >= 0 && listaNotas.getNotas(i) <= 10)) {
                    System.out.println("La nota debe ser del 0 al 10");
                }
            }
            while (!(listaNotas.getNotas(i) >= 0 && listaNotas.getNotas(i) <= 10));
            //Anidamiento de if's
            if (listaNotas.getNotas(i) == 10) {
                listaNotas.excelentes++;}
            else if (listaNotas.getNotas(i) >= 8) {
                listaNotas.muyBuenas++;}
            else if (listaNotas.getNotas(i) >= 6) {
                listaNotas.buenas++;}
            else if (listaNotas.getNotas(i) == 5) {
                listaNotas.regulares++;}
            else if (listaNotas.getNotas(i)>=0) {
                listaNotas.bajas++;
            }
        }
        listaNotas.informarNotas();
        //Fuera del bucle
//        System.out.println("Bajas: "+listaNotas.bajas+"\nRegulares: "+listaNotas.regulares
//                +"\nBuenas: "+listaNotas.buenas+"\nMuy Buenas: "+listaNotas.muyBuenas
//                +"\nExcelentes: "+ listaNotas.excelentes);
//      for (int i = 0; i < 5; i++) {
//      System.out.println(listaNotas.getNotas(i));
    }
}




