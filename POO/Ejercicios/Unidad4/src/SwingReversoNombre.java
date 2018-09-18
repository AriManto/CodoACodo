import javax.swing.*;

public class SwingReversoNombre {
    public static void main(String args[]) {
        StringBuffer nombre = new StringBuffer(JOptionPane.showInputDialog(null,"Nombre:", "Inversor de nombre", 3));
        JOptionPane.showMessageDialog(null, "Inverso: "+ nombre.reverse(), "Inversor de nombre", 2);
    }
}