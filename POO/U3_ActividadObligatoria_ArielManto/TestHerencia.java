package unidad3;
public class TestHerencia {
    public static void main (String[] args) {
        Producto a1 = new ProductoFresco();
        Producto a2 = new ProductoCongelado();
        a1.mostrarDatos();
        a2.mostrarDatos();
    }
}
