package dronem600;
import javax.swing.*;
import java.awt.*;

public class Bottoms extends JPanel{
          
            JButton bStop = new JButton("ENCENDIDO");
            JButton bStart = new JButton("APAGADO");
         public Bottoms(){
         setLayout(new GridLayout(1,3));
         add(bStop);
         add(bStart);
         
         }
}
