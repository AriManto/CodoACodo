import javax.swing.*;
//import java.lang.*;

public class SwingReversoNombre {
    public static void main(String args[]) {
        StringBuffer nombre = new StringBuffer(JOptionPane.showInputDialog(null,"Nombre:"));
        JOptionPane.showMessageDialog(null, "Inverso: "+ nombre.reverse());
    }
}