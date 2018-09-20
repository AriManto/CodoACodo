import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sumador extends JFrame{
    public Sumador() {
        //Opciones básicas
        setTitle("Sumador");
        setSize(312, 260);
        setResizable(false);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //Centrar la ventana
        agregarComponentes();
    }
    public void agregarComponentes(){
        GridBagConstraints c = new GridBagConstraints();
        //Panel Externo--------------
        JPanel panelExterno = new JPanel(new GridBagLayout());
        c.insets = new Insets(15,15,15,15);
        panelExterno.setBackground(new Color(236, 233, 216));
        panelExterno.setBorder(BorderFactory.createLineBorder(new Color(223,225,247),5));
        this.add (panelExterno);
        //Panel Interno--------------
        JPanel panelInterno = new JPanel (new GridBagLayout());
        c.insets = new Insets(12,15,12,15);
        panelInterno.setBackground(new Color(236, 233, 216));
        c.fill=GridBagConstraints.BOTH;
        c.weighty=1.9;
        panelExterno.add(panelInterno,c);
        //Borde
        TitledBorder titulo = BorderFactory.createTitledBorder("Number Addition");
        titulo.setTitleColor(new Color(23,100,205));
        titulo.setTitleFont(new Font("Tahoma", Font.PLAIN, 11));
        panelInterno.setBorder(titulo);
        //-----
        //Botón exit
        JButton exit = new JButton("Exit");
        c.insets = new Insets(0,15,15,15);
        c.anchor = GridBagConstraints.EAST;
        c.ipadx = 0;
        c.gridx=0;
        c.gridy=1;
        c.weighty=0.1;
        c.weightx=1;
        c.fill=GridBagConstraints.NONE;
        panelExterno.add(exit,c);
        //Oyente de botón exit
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        //-----
        //Reseteo alineación
        c.ipadx = 0;
        c.insets = new Insets(0,0,0,5);
        //X=0
        //-----Etiquetas
        c.weightx=0.4;
        //Etiqueta 1
        JLabel etNum1 = new JLabel("First Number:");
        c.insets = new Insets(10,10,0,5);
        c.gridx=0;
        c.gridy=0;
        etNum1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        panelInterno.add(etNum1,c);
        //Etiqueta 2
        JLabel etNum2 = new JLabel("Second Number:");
        c.insets = new Insets(0,0,0,5);
        c.gridx=0;
        c.gridy=1;
        etNum2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        panelInterno.add(etNum2,c);
        //Etiqueta 3
        JLabel etResult = new JLabel("Result:");
        c.gridx=0;
        c.gridy=2;
        etResult.setFont(new Font("Tahoma", Font.PLAIN, 11));
        panelInterno.add(etResult,c);
        //X=1------------
        //-----Campos
        c.weightx=1;
        //Campo 1
        JTextField campoNum1 = new JTextField();
        c.insets = new Insets(10,0,0,10);
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridwidth=5;
        c.gridx=1;
        c.gridy=0;
        panelInterno.add(campoNum1,c);
        //Campo 2
        c.insets = new Insets(0,0,0,10);
        JTextField campoNum2 = new JTextField();
        c.gridx=1;
        c.gridy=1;
        panelInterno.add(campoNum2,c);
        //Result
        JTextField campoResult = new JTextField();
        campoResult.setEditable(false);
        c.insets = new Insets(7,0,5,10);
        c.gridx=1;
        c.gridy=2;
        panelInterno.add(campoResult,c);
        c.fill=GridBagConstraints.NONE; //Reseteo del rellenado
        c.insets = new Insets(0,0,0,0); //Reseteo padding
        c.gridwidth=1;
        //-----Botón Add
        JButton btnAdd = new JButton("Add");
        c.insets = new Insets(0,0,10,0);
        c.anchor=GridBagConstraints.WEST;
        c.gridx=1;
        c.gridy=3;
        c.weightx=0.4;
        panelInterno.add(btnAdd,c);
        //Oyente botón Add***
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    double num1 = Double.parseDouble(campoNum1.getText());
                    double num2 = Double.parseDouble(campoNum2.getText());
                    String resultado = Double.toString(num1+num2);
                    campoResult.setText(resultado);
                }
                catch(NumberFormatException er){
                    campoResult.setText("Error");
                }
            }
        });
        //X=2------------
        //-----Botón Clear
        JButton btnClr = new JButton("Clear");
        c.anchor=GridBagConstraints.WEST;
        c.gridx=2;
        c.gridy=3;
        c.weightx=1.6;
        panelInterno.add(btnClr,c);
        //Oyente botón Clear***
        btnClr.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                campoResult.setText("");
                campoNum1.setText("");
                campoNum2.setText("");
            }
        });
    }
    public static void main(String[] args) {
        Sumador ventana = new Sumador();
        ventana.setVisible(true);
    }
}
