package horno;
import javax.swing.*;
import java.awt.*;

public class StartStopPanel extends JPanel {
            JButton bStop = new JButton("ENCENDIDO");
            JButton bStart = new JButton("APAGADO");
         public StartStopPanel(){
         setLayout(new GridLayout(1,2));
         add(bStop);
         add(bStart);
         }
}
