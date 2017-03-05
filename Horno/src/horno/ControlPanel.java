package horno;
import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
            private TimeCanvas timeDisplay = new TimeCanvas();
            private TimeButtonsPanel timeButtons = new TimeButtonsPanel();
            private CookButtonsPanel cookButtons = new CookButtonsPanel();
            private StartStopPanel startStop = new StartStopPanel();
            public ControlPanel(){
            setBackground(Color.black);
            setForeground(Color.blue);
            setLayout(new GridLayout(4,1));
            setSize(125,300);
            add(timeDisplay);
            add(startStop);
            add(timeButtons);
            add(cookButtons);
            
    }
}
