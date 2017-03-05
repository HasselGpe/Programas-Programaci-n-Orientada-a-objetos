import java.awt.*;
import javax.swing.*;

public class CanvasBimestralD2 extends Canvas {

    public CanvasBimestralD2() {
        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        Dimension miSize = getSize();
        g.setColor(Color.BLACK);
        g.drawLine(miSize.width / 2,2,5, miSize.height);
        g.drawLine(miSize.width / 2, 0, miSize.width, miSize.height);

    }
}
