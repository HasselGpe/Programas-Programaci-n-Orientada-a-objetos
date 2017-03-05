
import java.awt.*;

public class CanvasBimestralD extends Canvas {

    public CanvasBimestralD() {
        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        Dimension miSize = getSize();
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, miSize.width / 2, miSize.height);
        g.drawLine(miSize.width, 0, miSize.width / 2, miSize.height);

    }

}
