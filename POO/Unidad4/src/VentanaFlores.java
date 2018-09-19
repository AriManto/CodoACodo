import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaFlores extends JFrame {
    public VentanaFlores(){
        //Opciones básicas
        setTitle ("Flores");
        setSize (550,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //Centrar la ventana
        agregarComponentes();
    }
    public void agregarComponentes(){
        JPanel panel = new JPanel();
        GridBagConstraints c = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());
        this.add (panel);
        //Etiqueta flores
        JLabel etFlores = new JLabel ("Flores:");
        c.anchor = GridBagConstraints.EAST;
        c.weightx=1;
        c.weighty=1;
        c.insets = new Insets(0,10,0,10); //Padding horizontal de 10px
        c.gridx = 0;
        c.gridy = 0;
        panel.add(etFlores,c);
        //Lista desplegable
        JComboBox<String> listaFlores = new JComboBox<>();
        listaFlores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Margarita", "Rosa", "Jazmín",
                "Lavanda", "Orquídea", "Violeta"}));
        c.anchor = GridBagConstraints.WEST;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(listaFlores,c);
        //Botón
        JButton btnAceptar = new JButton("Aceptar");
        //Oyente botón
        btnAceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setTitle(listaFlores.getSelectedItem().toString());
            }
        });
        c.anchor = GridBagConstraints.NORTH;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(btnAceptar,c);
    }
}
