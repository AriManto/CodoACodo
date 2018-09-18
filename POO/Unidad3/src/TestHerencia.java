public class TestHerencia {
    public static void main (String[] args) {
        ProductoCongelado prod1 = new ProductoCongelado();
        ProductoFresco prod2 = new ProductoFresco();
        prod1.setFechaCaducidad(20,12,2025);
        prod1.setNumLote("24798236");
        prod1.setTempCong(-79);
        prod2.setFechaCaducidad(16,10,2018);
        prod2.setNumLote("17984567");
        prod2.setPaisOrigen("Colombia");
        prod2.setFechaEnvasado(7,5,2018);
        prod1.mostrarDatos();
        prod2.mostrarDatos();
    }
}
