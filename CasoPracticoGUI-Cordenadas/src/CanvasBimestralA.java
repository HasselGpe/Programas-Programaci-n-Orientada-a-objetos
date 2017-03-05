
import java.awt.*;
        

public class CanvasBimestralA extends Canvas{
       public CanvasBimestralA(){
           setBackground(Color.BLACK);
       }
       public void paint(Graphics g){
          // super.paint(g);
          // Toolkit t = Toolkit.getDefaultToolkit();
          // Image imagen = t.getImage("");
           //g.drawImage(imagen, 0, 0, this);
            Dimension MySize = getSize();
           g.setColor(Color.WHITE);
           g.drawLine(0, 0, MySize.width, MySize.height);
           g.drawLine(MySize.width, 0,0, MySize.height);
       
       }
       
}
