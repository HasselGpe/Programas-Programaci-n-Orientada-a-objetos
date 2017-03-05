package dronem600;
import javax.swing.*;
import java.awt.*;
// Clase Movimiento donde se crearan los botones para manejar el drone
public class Movimiento extends JPanel{
    //Creación de Botones
    JButton arriba = new JButton("Arriba");
    JButton abajo = new JButton("Abajo");
    JButton derecha= new JButton("Derecha");
    JButton Izquierda = new JButton("Izquierda");
    
    //Contructor de clase
    public Movimiento() {
         setLayout(new GridLayout(2,2));
         add(arriba);
         add(abajo);
         add(Izquierda);
         add(derecha);
         
    }   
}

