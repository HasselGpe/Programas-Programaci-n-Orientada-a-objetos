package dronem600;
import javax.swing.*;
import java.awt.*;

public class VelocidadControl extends JPanel{
   JButton acelerar = new JButton("Acelerar");
   JButton frenar = new JButton("Frenar");
   JPanel Control = new JPanel();
   //Creacion de contructor
   public VelocidadControl(){
         setLayout(new GridLayout(2,2));
        add(acelerar);
        add(frenar);        
   }
}
