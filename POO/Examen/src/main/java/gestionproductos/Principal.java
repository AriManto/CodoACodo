package gestionproductos;
//TODO Crear productos con ingreso de usuario

public class Principal {
    public static void main(String[] args) {
        Producto fresco1 = new ProductoFresco("20/12/2018","688374","27/09/2018","Colombia");
        System.out.println(fresco1.toString());
        Producto refrigerado1 = new ProductoRefrigerado("/2020","132789878","AR2798");
        System.out.println(refrigerado1.toString());
        Producto congelado1 = new ProductoCongelado("13/04/2022","45657898",-35);
        System.out.println(congelado1.toString());
    }
}
