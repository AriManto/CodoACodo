import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Ventana extends JFrame {
   public Ventana (){
       setTitle ("Alumnos");
       setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
       setSize  (600, 400);
       this.setLocationRelativeTo(null);
       agregaComponente();
   
   }
   
   JPanel panel;
   JTextField c_nombre;
   JTextField c_apellido;
   
   public void agregaComponente () {
       this.agregaPanel();
       this.agregaEtiquetas();
       this.agregaCampos();
       this.agregarBoton();
               
   }
   
   public void agregaPanel(){
       panel = new JPanel();
       panel.setLayout(null);
       this.add (panel);
   }
   
   public void agregaEtiquetas () {
       JLabel nombre = new JLabel ("Nombres",JLabel.RIGHT);
       JLabel apellido = new JLabel ("Apellido", JLabel.RIGHT);
       
                        
       nombre.setBounds(50,60,100,30);
       apellido.setBounds(50,160,100,30);
       
       nombre.setFont (new Font ("Verdana",Font.BOLD, 16));
       apellido.setFont (new Font ("Verdana",Font.BOLD, 16)); 
       
       panel.add (nombre);
       panel.add (apellido);
   }
   
   public void agregaCampos (){
       c_nombre = new JTextField (15);
       c_apellido = new JTextField (15);
       
       c_nombre.setBounds (170, 60,300,30);
       c_apellido.setBounds (170, 160, 300, 30);
       
       c_nombre.setFont (new Font ("Verdana", 3,16));
       c_apellido.setFont (new Font ("Verdana", 3,16));
       panel.add (c_nombre);
       panel.add (c_apellido);
       
   }
   
   public void agregarBoton (){
       JButton boton1 = new JButton ("Aceptar" , new ImageIcon ("src/imboton.png"));
       int d = this.getWidth();
       boton1.setBounds (d/2-75,250,150,70);
       Escuchando oyente = new Escuchando ();
       boton1.addActionListener (oyente);
       
       panel.add(boton1);
       
       
       
       
   }

   private class Escuchando implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nombre = c_nombre.getText();
            String apellido = c_apellido.getText ();
            setTitle (nombre + " " + apellido);
            c_nombre.setText("");
            c_apellido.setText("");
        }
    
}
}
