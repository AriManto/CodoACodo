import javax.swing.*;

public class SwingReversoNombre {
    public static void main(String args[]) {
        StringBuffer nombre = new StringBuffer(JOptionPane.showInputDialog(null,"Nombre:", "Inversor de nombre", JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, "Inverso: "+ nombre.reverse(), "Inversor de nombre", JOptionPane.PLAIN_MESSAGE);
    }
}