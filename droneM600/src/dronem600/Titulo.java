package dronem600;
import javax.swing.*;
import java.awt.*;
//Clase Titulo donde se creara un JLabel para poner el nombre del drone
public class Titulo extends JPanel{
    JLabel titulo = new JLabel( " \t " + " DRONE-M600    ");
    //Crea una linea como border en el Label especificando el color y el grosor
    javax.swing.border.Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
    
    //Constructor de clase 
    public Titulo(){
        titulo.setForeground(Color.BLUE);
        titulo.setBorder(border);// Se le da el border a el label
        titulo.setFont(new java.awt.Font("Castellar", 0,20)); // Se le asigna tipo de letra y tamaño
        setLayout(new GridLayout(1,1));// Me asigna 1 fila y 1 columna
        add(titulo);// add el  titulo en el Label
    }
}