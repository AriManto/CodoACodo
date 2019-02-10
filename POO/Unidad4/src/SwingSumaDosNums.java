import javax.swing.*;

public class SwingSumaDosNums {
    public static void main(String[] args) {
        int num1;
        int num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte otro número:"));
        JOptionPane.showMessageDialog(null, "La suma es " + (num1 + num2));
    }
}