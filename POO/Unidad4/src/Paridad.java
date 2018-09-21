import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paridad extends JFrame {
    private GridBagConstraints gc = new GridBagConstraints();
    public Paridad() {
        //Opciones básicas
        setTitle("Paridad");
        setSize(250, 250);
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
        panel.setBackground(new Color(128, 130, 132));
        //-----
        //Campo para ingresar numero
        JTextField campoNumero = new JTextField();
        campoNumero.setBackground(new Color(229, 231, 233));
        campoNumero.setFont(new Font("Tahoma", Font.BOLD, 20));
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(20, 20, 0, 20);
        gc.ipady=16;
        posicionCelda(0,0,1,1);
        panel.add(campoNumero,gc);
        //-----
        //Etiqueta de error
        JLabel etError = new JLabel();
        etError.setForeground(new Color(255, 252, 221));
        gc.insets = new Insets(10, 20, 10, 20);
        posicionCelda(0,1,0,1);
        etError.setMinimumSize(new Dimension(208,22));   //Fija el tamaño de la etiqueta para que no varíe
        etError.setPreferredSize(new Dimension(208,22)); //cuando su contenido es vacío
        panel.add(etError,gc);
        //-----
        //Botón
        JButton btn = new JButton("Comprobar Paridad");
//        btn.setBackground(new Color(243, 153, 60));
        btn.setFont(new Font("Tahoma", Font.BOLD, 16));
        btn.setForeground(Color.BLUE);
        gc.insets = new Insets(10, 20, 20, 20);
        gc.ipady=50;
        posicionCelda(0,2);
        gc.gridx=0;
        gc.gridy=2;
        panel.add(btn,gc);
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
