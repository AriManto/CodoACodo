import javax.swing.*;
import java.awt.*;

public class PrimerLayout extends JFrame {
    private GridBagConstraints gc = new GridBagConstraints();
    public PrimerLayout(){
        //Opciones básicas
        setTitle ("Mi primer layout");
        setSize (600,300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //Centrar la ventana
        agregarComponentes();
    }
    public void posicionCelda(int x, int y){ //
        gc.gridx=x;
        gc.gridy=y;
    }
    public void posicionCelda(int x, int y, double pesox, double pesoy){
        gc.gridx=x;
        gc.gridy=y;
        gc.weightx=pesox;
        gc.weighty=pesoy;
    }
    public void agregarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        this.add(panel);
        //Botones
        gc.fill=GridBagConstraints.BOTH;
        JButton btn0 = new JButton("Botón 0");
        posicionCelda(0,0,1,1);
         panel.add(btn0,gc);
        //--------------------
        JButton btn1 = new JButton("Botón 1");
        posicionCelda(1,0);
        panel.add(btn1,gc);
        //--------------------
        JButton btn2 = new JButton("Botón 2");
        posicionCelda(2,0);
        panel.add(btn2,gc);
        //--------------------
        JButton btn3 = new JButton("Botón 3");
        posicionCelda(3,0);
        panel.add(btn3,gc);
        //--------------------
        JButton btn4 = new JButton("Botón 4");
        posicionCelda(4,0);
        panel.add(btn4,gc);
        //--------------------
        JButton btn5 = new JButton("Botón 5");
        posicionCelda(0,1);
        panel.add(btn5,gc);
        //--------------------
        JButton btn6 = new JButton("Botón 6");
        posicionCelda(1,1);
        panel.add(btn6,gc);
        //--------------------
        JButton btn7 = new JButton("Botón 7");
        posicionCelda(2,1);
        panel.add(btn7,gc);
        //--------------------
        JButton btn8 = new JButton("Botón 8");
        posicionCelda(3,1);
        panel.add(btn8,gc);
        //--------------------
        JButton btn9 = new JButton("Botón 9");
        posicionCelda(4,1);
        panel.add(btn9,gc);
        //--------------------
        JButton btn10 = new JButton("Botón 10");
        posicionCelda(0,2);
        panel.add(btn10,gc);
        //--------------------
        JButton btn11 = new JButton("Botón 11");
        posicionCelda(1,2);
        panel.add(btn11,gc);
        //--------------------
        JButton btn12 = new JButton("Botón 12");
        posicionCelda(2,2);
        panel.add(btn12,gc);
        //--------------------
        JButton btn13 = new JButton("Botón 13");
        posicionCelda(3,2);
        panel.add(btn13,gc);
        //--------------------
        JButton btn14 = new JButton("Botón 14");
        posicionCelda(4,2);
        panel.add(btn14,gc);
        //--------------------
        JButton btn15 = new JButton("Botón 15");
        posicionCelda(0,3);
        panel.add(btn15,gc);
        //--------------------
        JButton btn16 = new JButton("Botón 16");
        posicionCelda(1,3);
        panel.add(btn16,gc);
        //--------------------
        JButton btn17 = new JButton("Botón 17");
        posicionCelda(2,3);
        panel.add(btn17,gc);
        //--------------------
        JButton btn18 = new JButton("Botón 18");
        posicionCelda(3,3);
        panel.add(btn18,gc);
        //--------------------
        JButton btn19 = new JButton("Botón 19");
        posicionCelda(4,3);
        panel.add(btn19,gc);
        //--------------------
        JButton btn20 = new JButton("Botón 20");
        posicionCelda(0,4);
        panel.add(btn20,gc);
        //--------------------
        JButton btn21 = new JButton("Botón 21");
        posicionCelda(1,4);
        panel.add(btn21,gc);
        //--------------------
        JButton btn22 = new JButton("Botón 22");
        posicionCelda(2,4);
        panel.add(btn22,gc);
        //--------------------
        JButton btn23 = new JButton("Botón 23");
        posicionCelda(3,4);
        panel.add(btn23,gc);
        //--------------------
        JButton btn24 = new JButton("Botón 24");
        posicionCelda(4,4);
        panel.add(btn24,gc);
        //--------------------
    }

    public static void main(String[] args) {
        PrimerLayout ventana = new PrimerLayout();
        ventana.setVisible(true);
    }
}