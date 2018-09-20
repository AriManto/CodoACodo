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
        //-----Etiquetas
        //Nombre----
        JLabel etNombre = new JLabel("Nombre");
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(0,5,0,0);
        c.weightx = 0;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(etNombre, c);
        //Apellidos----
        JLabel etApellidos = new JLabel("Apellidos");
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(0,5,0,0);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(etApellidos, c);
        //-----Campos
        //Nombre----
        JTextField campoNombre = new JTextField();
        c.fill=GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0,5,0,15);
        c.gridx = 1;
        c.weightx = 0.5;
        c.weighty = 1;
        c.gridy = 0;
        c.gridwidth = 4;
        panel.add(campoNombre,c);
        //Apellido----
        JTextField campoApellidos = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 4;
        panel.add(campoApellidos,c);
        //Etiqueta Género----
        JLabel genero = new JLabel("Género");
        c.insets = new Insets(0,0,0,0);
        c.weighty= 1;
        c.weightx =0.2;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        panel.add(genero,c);
        //----Grupo de radio buttons
        ButtonGroup grupoGenero = new ButtonGroup();
        //Botón H-----
        JRadioButton botonH = new JRadioButton("H");
        c.insets = new Insets(0,0,0,5);
        c.weighty=1;
        c.weightx=0;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 2;
        grupoGenero.add(botonH);
        panel.add(botonH,c);
        //Botón M-----
        JRadioButton botonM = new JRadioButton("M");
        c.insets = new Insets(0,0,0,0);
        c.anchor=GridBagConstraints.EAST;
        c.weightx=0;
        c.gridx = 3;
        c.gridy = 2;
        c.gridwidth=1;
        grupoGenero.add(botonM);
        panel.add(botonM,c);
        //Etiqueta OK-----
        JLabel etAcuerdo = new JLabel("¿Estás de acuerdo?");
        c.insets = new Insets(0,0,5,0);
        c.anchor=GridBagConstraints.EAST;
        c.gridx = 1;
        c.weighty = 0.35;
        c.weightx=0.4;
        c.gridy = 3;
        c.gridwidth=3;
        panel.add(etAcuerdo,c);
        //Checkbox OK-----
        JCheckBox btnAcuerdo = new JCheckBox();
        c.insets = new Insets(0,0,5,5);
        c.weightx=2;
        c.weighty = 0.2;
        c.gridx=4;
        c.gridy=3;
        c.gridwidth=1;
        panel.add(btnAcuerdo,c);
        //Botón enviar-----
        JButton enviar = new JButton("Enviar");
        c.insets = new Insets(0,0,5,0);
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
