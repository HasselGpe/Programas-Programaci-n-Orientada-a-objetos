package horno;
import javax.swing.*;
import java.awt.*;
public class ControlPanel2 extends JPanel {
            private Controles timeDisplay = new Controles();
            private VideoCAM tiposV = new VideoCAM();
            private CookButtonsPanel cookButtons = new CookButtonsPanel();
            private ControlesDrone ControlIzq = new ControlesDrone();
            public ControlPanel2(){
            setBackground(Color.black);
            setForeground(Color.blue);
            setLayout(new GridLayout(4,1));
            setSize(205,300);
            add(timeDisplay);
            add(tiposV);
            add(cookButtons);
            add(ControlIzq);
           
    }
}
