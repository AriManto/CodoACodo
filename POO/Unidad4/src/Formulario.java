import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {
    private GridBagConstraints gc = new GridBagConstraints();
    public Formulario(){
        //Opciones básicas
        setTitle ("Formulario");
        setSize (264,264);
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
        //-----Etiquetas
        //Nombre----
        JLabel etNombre = new JLabel("Nombre");
        gc.anchor = GridBagConstraints.EAST;
        gc.insets = new Insets(0,5,0,0);
        posicionCelda(0,0,0,1);
        panel.add(etNombre, gc);
        //Apellidos----
        JLabel etApellidos = new JLabel("Apellidos");
        gc.anchor = GridBagConstraints.EAST;
        gc.insets = new Insets(0,5,0,0);
        posicionCelda(0,1);
        panel.add(etApellidos, gc);
        //-----Campos
        //Nombre----
        JTextField campoNombre = new JTextField();
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(0,5,0,15);
        posicionCelda(1,0,0.5,1);
        gc.gridwidth = 4;
        panel.add(campoNombre,gc);
        //Apellido----
        JTextField campoApellidos = new JTextField();
        posicionCelda(1,1);
        gc.gridwidth = 4;
        panel.add(campoApellidos,gc);
        //Etiqueta Género----
        JLabel genero = new JLabel("Género");
        gc.insets = new Insets(0,0,0,0);
        posicionCelda(1,2,0.2,1);
        gc.gridwidth = 1;
        panel.add(genero,gc);
        //----Grupo de radio buttons
        ButtonGroup grupoGenero = new ButtonGroup();
        //Botón H-----
        JRadioButton botonH = new JRadioButton("H");
        gc.insets = new Insets(0,0,0,5);
        posicionCelda(2,2,0,1);
        grupoGenero.add(botonH);
        panel.add(botonH,gc);
        //Botón M-----
        JRadioButton botonM = new JRadioButton("M");
        gc.insets = new Insets(0,0,0,0);
        gc.anchor=GridBagConstraints.EAST;
        posicionCelda(3,2,0,1);
        grupoGenero.add(botonM);
        panel.add(botonM,gc);
        //Etiqueta OK-----
        JLabel etAcuerdo = new JLabel("¿Estás de acuerdo?");
        gc.insets = new Insets(0,0,5,0);
        gc.anchor=GridBagConstraints.EAST;
        posicionCelda(1,3,0.4,0.35);
        gc.gridwidth=3;
        panel.add(etAcuerdo,gc);
        //Checkbox OK-----
        JCheckBox btnAcuerdo = new JCheckBox();
        gc.insets = new Insets(0,0,5,5);
        posicionCelda(4,3,2,0.2);
        gc.gridwidth=1;
        panel.add(btnAcuerdo,gc);
        //Botón enviar-----
        JButton enviar = new JButton("Enviar");
        enviar.setSize (72,28);
        gc.insets = new Insets(0,0,5,0);
        gc.fill=GridBagConstraints.NONE;
        gc.anchor=GridBagConstraints.CENTER;
        posicionCelda(0,4);
        gc.gridx=0;
        gc.gridy=4;
        gc.gridwidth=5;
        panel.add(enviar,gc);

    }

    public static void main(String[] args) {
        Formulario ventana = new Formulario();
        ventana.setVisible(true);
    }
}
