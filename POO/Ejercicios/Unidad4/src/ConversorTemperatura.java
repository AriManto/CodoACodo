import javax.swing.*;
public class ConversorTemperatura {
    public static void main(String[] args) {
        double num3;
        do {
            num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte temperatura ºC:"));
        }
        while (num3 <=273);
        double gradosF = num3*1.8+32;
        JOptionPane.showMessageDialog(null, "La temperatura es ºF " + gradosF);
    }
}
