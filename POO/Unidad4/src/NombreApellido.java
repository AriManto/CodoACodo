import javax.swing.*;
public class NombreApellido {
    private NombreApellido(){
        JFrame frame = new JFrame("Ejemplo");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JLabel label = new JLabel("Etiqueta");
        contentPane.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new NombreApellido();
    }
}
