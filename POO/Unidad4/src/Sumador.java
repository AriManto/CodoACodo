import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Sumador {
    //MÉTODO para crear la interfaz
    private static void crearVentana() {
        //Opciones básicas
        JFrame ventana = new JFrame("Sumador");
        ventana.setTitle("Sumador");
        ventana.setSize(317, 262); //317,262
        ventana.setResizable(false);
        ventana.setUndecorated(true);  //Para quitarle el borde a la ventana, pero no se puede desplazar
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); //Centrar la ventana
        Paneles panelExterno = new Paneles();
        ventana.add(panelExterno);
        ventana.setVisible(true);
    }

    //MÉTODO MAIN
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> crearVentana()); //GUI en un single thread, para evitar problemas de sincronización
    }
}
class Paneles extends JPanel{
    private GridBagConstraints gc = new GridBagConstraints();
    public void posicionCelda(int x, int y){ //
        gc.gridx=x;
        gc.gridy=y;
    }
    //Polimorfismo, para más opciones
    public void posicionCelda(int x, int y, double pesox, double pesoy){
        gc.gridx=x;
        gc.gridy=y;
        gc.weightx=pesox;
        gc.weighty=pesoy;
    }
    //Constructor
    public Paneles(){
        //Panel Externo--------------
        this.setBackground(new Color(236, 233, 216));
        this.setBorder(BorderFactory.createLineBorder(new Color(223, 225, 247), 5, true));
        System.out.println(this.getInsets());
        this.setLayout(new GridBagLayout());
        //----------------- Botón Exit
        JButton exit = new JButton("Exit");
        gc.insets = new Insets(5, 5, 5, 12);
        gc.anchor = GridBagConstraints.EAST;
        gc.ipadx = 0;
        posicionCelda(1,1,1,1); //0,1,1,1
        gc.fill = GridBagConstraints.NONE;
        this.add(exit, gc);
        //Oyente de botón exit
        exit.addActionListener(e -> System.exit(0));
        //Panel Interno--------------
        JPanel panelInterno = new JPanel(new GridBagLayout());
        panelInterno.setBackground(new Color(236, 233, 216));
        gc.fill = GridBagConstraints.BOTH;
        gc.insets = new Insets(10, 10, 3, 10);
        gc.gridwidth=2;
        posicionCelda(0,0,1,1.9);
        this.add(panelInterno, gc);
        gc.gridwidth=1;
        //Borde
        TitledBorder titulo = BorderFactory.createTitledBorder("Number Addition");
        titulo.setTitleColor(new Color(23, 100, 205));
        titulo.setTitleFont(new Font("Tahoma", Font.PLAIN, 11));
        panelInterno.setBorder(titulo);
        //----------------------
        //Icono de botones
//        BufferedImage buttonIcon = null;
//        try {
//            buttonIcon = ImageIO.read(getClass().getClassLoader().getResource("btnIcon.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //Botón exit-----------

        //-----
        //X=0
        //-----Etiquetas
        gc.weightx = 0.4;
        //Etiqueta 1
        JLabel etNum1 = new JLabel("First Number:", SwingConstants.RIGHT);
        gc.anchor = GridBagConstraints.EAST;
        gc.insets = new Insets(10, 10, 0, 0); //10,10,0,5
        posicionCelda(0,0);
        etNum1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        panelInterno.add(etNum1, gc);
        //Etiqueta 2
        JLabel etNum2 = new JLabel("Second Number:", SwingConstants.RIGHT);
        gc.insets = new Insets(0, 0, 0, 0); //0,0,0,5
        posicionCelda(0,1);
        etNum2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        panelInterno.add(etNum2, gc);
        //Etiqueta 3
        JLabel etResult = new JLabel("Result:", SwingConstants.RIGHT);
        gc.insets = new Insets(0, 0, 0, 0);
        posicionCelda(0,2);
        etResult.setFont(new Font("Tahoma", Font.PLAIN, 11));
        panelInterno.add(etResult, gc);
        //X=1------------
        //-----Campos
        gc.weightx = 1;
        //Campo 1
        JTextField campoNum1 = new JTextField();
        gc.insets = new Insets(10, 5, 0, 10);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridwidth = 5;
        posicionCelda(1,0);
        panelInterno.add(campoNum1, gc);
        //Campo 2
        gc.insets = new Insets(0, 5, 0, 10);
        JTextField campoNum2 = new JTextField();
        posicionCelda(1,1);
        panelInterno.add(campoNum2, gc);
        //Result
        JTextField campoResult = new JTextField();
        campoResult.setEditable(false);
        gc.insets = new Insets(7, 5, 5, 10);
        posicionCelda(1,2);
        panelInterno.add(campoResult, gc);
        gc.fill = GridBagConstraints.NONE; //Reseteo del rellenado
        gc.insets = new Insets(0, 0, 0, 0); //Reseteo padding
        gc.gridwidth = 1;
        //-----Botón Add
        JButton btnAdd = new JButton("Add");
        gc.insets = new Insets(0, 5, 10, 0);
        gc.anchor = GridBagConstraints.WEST;
        posicionCelda(1,3,0.4,1);
        panelInterno.add(btnAdd, gc);
        //Oyente botón Add***
        btnAdd.addActionListener(e -> { //Expresión Lambda
            try {
                double num1 = Double.parseDouble(campoNum1.getText());
                double num2 = Double.parseDouble(campoNum2.getText());
                String resultado = Double.toString(num1 + num2);
                campoResult.setText(resultado);
            } catch (NumberFormatException er) {
                campoResult.setText("Error");
            }
        });
        //X=2------------
        //-----Botón Clear
        JButton btnClr = new JButton("Clear");
        gc.anchor = GridBagConstraints.WEST;
        gc.insets = new Insets(0, 0, 10, 0);
        posicionCelda(2,3,1.6,1);
        panelInterno.add(btnClr, gc);
        //Oyente botón Clear***
        btnClr.addActionListener(e -> {
            campoResult.setText("");
            campoNum1.setText("");
            campoNum2.setText("");
        });
    }
}