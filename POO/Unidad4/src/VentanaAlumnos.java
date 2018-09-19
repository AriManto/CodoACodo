import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAlumnos extends JFrame {
    public VentanaAlumnos(){
        setTitle ("Alumnos");
        setSize (600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //Centrar la ventana
        agregarComponentes();
    }
    JPanel panel;
    GridBagConstraints c = new GridBagConstraints();
    public void agregarComponentes(){
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        this.add (panel);
//        etiquetas();
//    }
//    public void etiquetas(){
        JLabel etNombre = new JLabel ("Nombre:");
        JLabel etApellido = new JLabel ("Apellido:");
        etNombre.setFont (new Font("Calibri", Font.BOLD, 20));
        etApellido.setFont (new Font("Calibri", Font.BOLD, 20));
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
        c.anchor = GridBagConstraints.NORTH; //Lo ubica encima
        c.gridwidth = 2; //Ocupa 2 celdas de ancho, en este caso 2 celdas es 100% así
                         //que queda centrado
        c.gridx = 0;
        c.gridy = 2;
        panel.add(btnAceptar,c);
    }
}
