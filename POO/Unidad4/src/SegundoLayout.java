import javax.swing.*;
import java.awt.*;

public class SegundoLayout extends JFrame {
    public SegundoLayout(){
        //Opciones básicas
        setTitle ("Mi primer layout");
        setSize (600,300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //Centrar la ventana
        agregarComponentes();
    }
    public void agregarComponentes() {
        GridBagConstraints c = new GridBagConstraints();
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        this.add(panel);
        //Botones
        c.fill = GridBagConstraints.BOTH;
        //-------------------------------
        JButton btn0 = new JButton("Botón 0");
        c.weighty = 1;
        c.weightx = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 1;
        panel.add(btn0, c);
        //-------------------------------
        JButton btn1 = new JButton("Botón 1");
        c.weighty = 1;
        c.weightx = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 1;
        panel.add(btn1, c);
        //-------------------------------
        JButton btn2 = new JButton("Botón 2");
        c.weighty = 1;
        c.weightx = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 2;
        panel.add(btn2, c);
        //-------------------------------
        JButton btn3 = new JButton("Botón 3");
        c.weighty = 1;
        c.weightx = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 2;
        panel.add(btn3, c);
        //-------------------------------
        JButton btn5 = new JButton("Botón 5");
        c.weighty = 0;
        c.weightx = 1;
        c.gridwidth = 5;
        c.gridheight = 1;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(btn5, c);
        //-------------------------------
        JButton btn6 = new JButton("Botón 6");
        c.weighty = 1;
        c.weightx = 0;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(btn6, c);
        //-------------------------------
        JButton btn7 = new JButton("Botón 7");
        c.weighty = 0;
        c.weightx = 1;
        c.gridwidth = 5;
        c.gridheight = 1;
        c.gridx = 0;
        c.gridy = 3;
        panel.add(btn7, c);
        //-------------------------------
        JButton btn8 = new JButton("Botón 8");
        c.weighty = 1;
        c.weightx = 0;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 4;
        c.gridy = 1;
        panel.add(btn8, c);
    }
    public static void main(String[] args) {
        SegundoLayout ventana = new SegundoLayout();
        ventana.setVisible(true);
    }
}
