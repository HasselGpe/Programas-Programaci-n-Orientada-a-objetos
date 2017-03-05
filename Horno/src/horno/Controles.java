
package horno;
import java.awt.*;
public class Controles extends Canvas {
     public Controles (){
            setBackground(Color.white);
               }
            public void paint(Graphics g){
            Dimension mySize = getSize();
            g.setColor(Color.RED);
            g.draw3DRect(5, 5, mySize.width - 10, mySize.height - 10,
            true);
            g.setColor(Color.red);
            g.setFont(new Font("Consolas",Font.BOLD,25));
            g.drawString("RECORDER VIDEO", 20, 55 );
            
    }
}
