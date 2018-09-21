import javax.swing.*;
import java.awt.*;

public class SegundoLayout extends JFrame {
    private GridBagConstraints gc = new GridBagConstraints();
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
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        this.add(panel);
        //Botones
        gc.fill = GridBagConstraints.BOTH;
        //-------------------------------
        JButton btn0 = new JButton("Botón 0");
        posicionCelda(1,1,1,1);
        gc.gridwidth = 1;
        gc.gridheight = 1;
        panel.add(btn0, gc);
        //-------------------------------
        JButton btn1 = new JButton("Botón 1");
        posicionCelda(3,1);
        gc.gridwidth = 1;
        gc.gridheight = 1;
        panel.add(btn1, gc);
        //-------------------------------
        JButton btn2 = new JButton("Botón 2");
        posicionCelda(1,2);
        gc.gridwidth = 1;
        gc.gridheight = 1;
        panel.add(btn2, gc);
        //-------------------------------
        JButton btn3 = new JButton("Botón 3");
        posicionCelda(3,2);
        gc.gridwidth = 1;
        gc.gridheight = 1;
        panel.add(btn3, gc);
        //-------------------------------
        JButton btn5 = new JButton("Botón 5");
        posicionCelda(0,0,1,0);
        gc.gridwidth = 5;
        gc.gridheight = 1;
        panel.add(btn5, gc);
        //-------------------------------
        JButton btn6 = new JButton("Botón 6");
        posicionCelda(0,1,0,1);
        gc.gridwidth = 1;
        gc.gridheight = 2;
        panel.add(btn6, gc);
        //-------------------------------
        JButton btn7 = new JButton("Botón 7");
        posicionCelda(0,3,1,0);
        gc.gridwidth = 5;
        gc.gridheight = 1;
        panel.add(btn7, gc);
        //-------------------------------
        JButton btn8 = new JButton("Botón 8");
        posicionCelda(4,1,0,1);
        gc.gridwidth = 1;
        gc.gridheight = 2;
        panel.add(btn8, gc);
    }
    public static void main(String[] args) {
        SegundoLayout ventana = new SegundoLayout();
        ventana.setVisible(true);
    }
}