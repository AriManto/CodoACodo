import javax.swing.*;
import java.awt.*;

public class NombreApellido extends JFrame {
    private NombreApellido(){
        JFrame ventana = new JFrame("Ejemplo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600,400); //Tamaño de ventana
        ventana.setLocationRelativeTo(null); //Ventana en el centro
        ventana.setVisible(true); //Ventana visible
        ventana.setTitle("Alumnos"); //Título
        JPanel panel = (JPanel) ventana.getContentPane();
        JLabel etNombre = new JLabel("Nombre"); //Etiqueta Nombre
        panel.add(etNombre);
//        JLabel etApellido = new JLabel("Apellido"); //Etiqueta Apellido
//        panel.add(etApellido);
//        etApellido.setLocation(400,200);


    }
    public static void main(String[] args) {
        new NombreApellido();
    }
}
