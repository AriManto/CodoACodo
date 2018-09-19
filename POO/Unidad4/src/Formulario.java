import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {
    public Formulario(){
        //Opciones básicas
        setTitle ("Formulario");
        setSize (264,264);
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
        JLabel etNombre = new JLabel("Nombre");
        c.insets = new Insets(0,5,0,0);
        c.weightx = 0;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(etNombre, c);
        JLabel etApellidos = new JLabel("Apellidos");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(etApellidos, c);
        JTextField campoNombre = new JTextField();
        c.fill=GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0,5,0,15);
        c.gridx = 1;
        c.weightx = 0.5;
        c.weighty = 1;
        c.gridy = 0;
        c.gridwidth = 4;
        panel.add(campoNombre,c);
        JTextField campoApellidos = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 4;
        panel.add(campoApellidos,c);
        JLabel genero = new JLabel("Género");
        c.insets = new Insets(0,0,0,0);
        c.weighty= 1;
        c.weightx =0.2;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        panel.add(genero,c);
        JRadioButton botonH = new JRadioButton("H");
        c.insets = new Insets(0,0,0,0);
        c.weighty=1;
        c.weightx=0;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 2;
        panel.add(botonH,c);
        JRadioButton botonM = new JRadioButton("M");
        c.weightx=0;
        c.gridx = 3;
        c.gridy = 2;
        panel.add(botonM,c);
        JLabel etAcuerdo = new JLabel("¿Estás de acuerdo?");
        c.gridx = 1;
        c.weighty = 0.35;
        c.weightx=0;
        c.gridy = 3;
        c.gridwidth=3;
        panel.add(etAcuerdo,c);
        JCheckBox btnAcuerdo = new JCheckBox();
        c.weightx=0.5;
        c.weighty = 0.2;
        c.gridx=4;
        c.gridy=3;
        c.gridwidth=1;
        panel.add(btnAcuerdo,c);
        JButton enviar = new JButton("Enviar");
        c.fill=GridBagConstraints.NONE;
        c.anchor=GridBagConstraints.CENTER;
        enviar.setSize (72,28);
        c.gridx=0;
        c.gridy=4;
        c.gridwidth=5;
        panel.add(enviar,c);

    }

    public static void main(String[] args) {
        Formulario ventana = new Formulario();
        ventana.setVisible(true);
    }
}
