package horno;
import javax.swing.*;
import java.awt.*;

public class VideoCAM extends JPanel{
    
            JButton tipoA = new JButton("BRip");
            JButton tipoB = new JButton("BDrip");
            JButton tipoC = new JButton("720p");
            JButton tipoD = new JButton("1080");
            
            public VideoCAM() {
            setLayout(new GridLayout(1,5));
            add(tipoA);
            add(tipoB);
            add(tipoC);
            add(tipoD);       
    }
}
