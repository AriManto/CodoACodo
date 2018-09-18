//Se desea desarrollar un programa en Java que permita la gestión de una empresa
//agroalimentaria que trabaja con dos tipos de productos: productos frescos y productos
//congelados. Todos los productos llevan esta información común: fecha de caducidad y número
//de lote. A su vez, cada tipo de producto lleva alguna información específica. Los productos
//frescos deben llevar la fecha de envasado y el país de origen. Los productos congelados deben
//llevar la temperatura de congelación recomendada. Crear el código de las clases Java
//implementando una relación de herencia desde la superclase Producto hasta las subclases
//Producto Fresco y Producto Congelado. Crear una clase TestHerencia con el método main
//donde se cree un objeto de cada tipo y se muestran los datos de cada uno de los objetos
//creados.
public abstract class Producto {
    private String fechaCaducidad, numLote;
    public abstract void mostrarDatos();
    //Getters y setters
    public String getFechaCaducidad(){return this.fechaCaducidad;}
    public String getNumLote(){return this.numLote;}
    public void setFechaCaducidad(int dia,int mes, int año){
        this.fechaCaducidad = dia + "/"+ mes + "/" + año;
    }
    public void setNumLote(String numLote){
        this.numLote=numLote;
    }
}
