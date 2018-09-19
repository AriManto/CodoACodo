import sun.plugin2.util.ColorUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAlumnos extends JFrame {
    public VentanaAlumnos(){
        //Opciones básicas
        setTitle ("Alumnos");
        setSize (600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //Centrar la ventana
        agregarComponentes();
    }
    public void agregarComponentes(){
        JPanel panel = new JPanel();
        GridBagConstraints c = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());
        this.add (panel);
        JLabel etNombre = new JLabel ("Nombre:");
        JLabel etApellido = new JLabel ("Apellido:");
        etNombre.setFont (new Font("Calibri", Font.BOLD, 26));
        etApellido.setFont (new Font("Calibri", Font.BOLD, 26));
        //Etiquetas
        //Nombre
        c.anchor = GridBagConstraints.LINE_END; //Alinear a derecha
        c.insets = new Insets(0,10,0,10); //Separación "padding" de los componentes,
                                          //10px a la izquierda y a la derecha
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(etNombre,c);
        //Apellido
        c.gridx = 0;
        c.gridy = 1;
        panel.add(etApellido,c);

        //Campos de texto
        //Nombre
        JTextField campoNombre = new JTextField(12);
        c.anchor = GridBagConstraints.LINE_START; //Alinear a izquierda
        c.gridx = 1;
        c.gridy = 0;
        panel.add(campoNombre,c);
        //Apellido
        c.gridx = 1;
        c.gridy = 1;
        JTextField campoApellido = new JTextField(12);
        panel.add(campoApellido,c);
        //Botón
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setIcon(new ImageIcon("/iconoAlumnos.jpg"));
        ImageIcon icono= new ImageIcon(getClass().getResource("/iconoAlumnos.jpg"));
        btnAceptar.setIcon(new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        btnAceptar.setFont(new Font("Impact", Font.PLAIN, 30));
        btnAceptar.setOpaque(true);
        btnAceptar.setBackground(new Color(192, 232, 237)); //Color de botón en RGB
        //Listener del botón
        btnAceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String textoTitulo = nombre + " " + apellido;
                setTitle(textoTitulo);
                campoNombre.setText("");
                campoApellido.setText("");
            }
        });
        c.fill = GridBagConstraints.VERTICAL;
        c.insets = new Insets(30, 0, 30, 0);
        c.anchor = GridBagConstraints.NORTH; //Lo ubica encima
        c.gridwidth = 2; //Ocupa 2 celdas de ancho, en este caso 2 celdas es 100% así
                         //que queda centrado
        c.gridx = 0;
        c.gridy = 2;
        panel.add(btnAceptar,c);
        validate();
    }
}
