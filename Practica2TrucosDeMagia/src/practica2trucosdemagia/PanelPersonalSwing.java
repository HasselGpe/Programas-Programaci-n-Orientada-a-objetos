package practica2trucosdemagia;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextArea;
public class PanelPersonalSwing extends JPanel {
    /*
    * Clase PanelPersonalSwing
    * Hasssel Guadalupe Ortega Pelaez 
    * NetBeans 8.1 
    * Fecha: 07/02/2017
    *
    */
    public JLabel Texto1 = new JLabel("    Mira el  truco del “hombre levitando”   ---->");
    String text = (" Estos chicos están por todas partes, en muchas calles de muchas "+"\n" 
                 + "ciudades del mundo."+"\n" 
                 + "Parece que como si se estuvieran sosteniendo ellos solos en poste"+"\n"
                 + " diminuto. ¿Lo están haciendo realmente? "+"\n"
                 + "Bueno, el secreto no está en las flexiones, por supuesto. "+"\n" 
                 + "El secreto es que tienen una “pequeña silla que se encuentra"+"\n" 
                 + " incorporada en ese diminuto bastón. Una capa holgada "+ "\n" 
                 + "esconderá el secreto.");
    JTextArea textArea = new JTextArea(text, 100, 100);
   
        public PanelPersonalSwing (){
        setLayout(new GridLayout(1,2,5,5));
        add(Texto1);
        add(textArea); 
        textArea.setBackground(Color.PINK);       
    }       
         
}
 //absoluta desde disco raiz c: 
//relativa: desde que empiza el directorio de mi proyecto