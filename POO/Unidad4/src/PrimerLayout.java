import javax.swing.*;
import java.awt.*;

public class PrimerLayout extends JFrame {
    public PrimerLayout(){
        //Opciones básicas
        setTitle ("Mi primer layout");
        setSize (600,300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //Centrar la ventana
        agregarComponentes();
    }
    public void agregarComponentes() {
        GridBagConstraints c = new GridBagConstraints();
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        this.add(panel);
        //Botones
        c.fill=GridBagConstraints.BOTH;
        JButton btn0 = new JButton("Botón 0");
        c.weighty=1;
        c.weightx=1;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(btn0,c);
        //--------------------
        JButton btn1 = new JButton("Botón 1");
        c.gridx = 1;
        c.gridy = 0;
        panel.add(btn1,c);
        //--------------------
        JButton btn2 = new JButton("Botón 2");
        c.gridx = 2;
        c.gridy = 0;
        panel.add(btn2,c);
        //--------------------
        JButton btn3 = new JButton("Botón 3");
        c.gridx = 3;
        c.gridy = 0;
        panel.add(btn3,c);
        //--------------------
        JButton btn4 = new JButton("Botón 4");
        c.gridx = 4;
        c.gridy = 0;
        panel.add(btn4,c);
        //--------------------
        JButton btn5 = new JButton("Botón 5");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(btn5,c);
        //--------------------
        JButton btn6 = new JButton("Botón 6");
        c.gridx = 1;
        c.gridy = 1;
        panel.add(btn6,c);
        //--------------------
        JButton btn7 = new JButton("Botón 7");
        c.gridx = 2;
        c.gridy = 1;
        panel.add(btn7,c);
        //--------------------
        JButton btn8 = new JButton("Botón 8");
        c.gridx = 3;
        c.gridy = 1;
        panel.add(btn8,c);
        //--------------------
        JButton btn9 = new JButton("Botón 9");
        c.gridx = 4;
        c.gridy = 1;
        panel.add(btn9,c);
        //--------------------
        JButton btn10 = new JButton("Botón 10");
        c.gridx = 0;
        c.gridy = 2;
        panel.add(btn10,c);
        //--------------------
        JButton btn11 = new JButton("Botón 11");
        c.gridx = 1;
        c.gridy = 2;
        panel.add(btn11,c);
        //--------------------
        JButton btn12 = new JButton("Botón 12");
        c.gridx = 2;
        c.gridy = 2;
        panel.add(btn12,c);
        //--------------------
        JButton btn13 = new JButton("Botón 13");
        c.gridx = 3;
        c.gridy = 2;
        panel.add(btn13,c);
        //--------------------
        JButton btn14 = new JButton("Botón 14");
        c.gridx = 4;
        c.gridy = 2;
        panel.add(btn14,c);
        //--------------------
        JButton btn15 = new JButton("Botón 15");
        c.gridx = 0;
        c.gridy = 3;
        panel.add(btn15,c);
        //--------------------
        JButton btn16 = new JButton("Botón 16");
        c.gridx = 1;
        c.gridy = 3;
        panel.add(btn16,c);
        //--------------------
        JButton btn17 = new JButton("Botón 17");
        c.gridx = 2;
        c.gridy = 3;
        panel.add(btn17,c);
        //--------------------
        JButton btn18 = new JButton("Botón 18");
        c.gridx = 3;
        c.gridy = 3;
        panel.add(btn18,c);
        //--------------------
        JButton btn19 = new JButton("Botón 19");
        c.gridx = 4;
        c.gridy = 3;
        panel.add(btn19,c);
        //--------------------
        JButton btn20 = new JButton("Botón 20");
        c.gridx = 0;
        c.gridy = 4;
        panel.add(btn20,c);
        //--------------------
        JButton btn21 = new JButton("Botón 21");
        c.gridx = 1;
        c.gridy = 4;
        panel.add(btn21,c);
        //--------------------
        JButton btn22 = new JButton("Botón 22");
        c.gridx = 2;
        c.gridy = 4;
        panel.add(btn22,c);
        //--------------------
        JButton btn23 = new JButton("Botón 23");
        c.gridx = 3;
        c.gridy = 4;
        panel.add(btn23,c);
        //--------------------
        JButton btn24 = new JButton("Botón 24");
        c.gridx = 4;
        c.gridy = 4;
        panel.add(btn24,c);
        //--------------------
    }





    public static void main(String[] args) {
        PrimerLayout ventana = new PrimerLayout();
        ventana.setVisible(true);
    }
}
