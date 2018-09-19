import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paridad extends JFrame {
    public Paridad() {
        //Opciones básicas
        setTitle("Paridad");
        setSize(250, 250);
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
        panel.setBackground(new Color(34, 34, 34));
        //-----
        //Campo para ingresar numero
        JTextField campoNumero = new JTextField();
        campoNumero.setBackground(Color.lightGray);
        campoNumero.setFont(new Font("Tahoma", Font.BOLD, 20));
        c.fill=GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 20, 10, 20);
        c.ipady=16;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx=0;
        c.gridy=0;
        panel.add(campoNumero,c);
        //-----
        //Etiqueta de error
        JLabel etError = new JLabel();
        etError.setForeground(new Color(199,0,0));
        c.gridx=0;
        c.gridy=1;
        c.weighty=1;
        panel.add(etError,c);
        //-----
        //Botón
        JButton btn = new JButton("Comprobar Paridad");
//        btn.setBackground(new Color(243, 153, 60));
        btn.setFont(new Font("Tahoma", Font.BOLD, 16));
        btn.setForeground(Color.BLUE);
        c.ipady=50;
        c.gridx=0;
        c.gridy=2;
        panel.add(btn,c);
        //Oyente de botón
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int numero=0;
                    try {
                        numero = Integer.parseInt(campoNumero.getText());
                        if (numero % 2 == 0) {
                            JOptionPane.showMessageDialog(null, "El número " + numero + " es par", "Paridad", JOptionPane.PLAIN_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El número " + numero + " es impar", "Paridad", JOptionPane.PLAIN_MESSAGE);
                        }
                        campoNumero.setText("");
                        etError.setText("");
                    } catch (NumberFormatException e2) {
                        etError.setText("Número Inválido. Ingrese un entero");
                    }
                }
        });
    }

    public static void main(String[] args) {
        Paridad ventana = new Paridad();
        ventana.setVisible(true);
    }
}
