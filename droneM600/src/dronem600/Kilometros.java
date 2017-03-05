package dronem600;
import java.awt.*;
public class Kilometros  extends Canvas{
    //Creacion de contructor
    public Kilometros(){
            setBackground(Color.LIGHT_GRAY);
               }
    @Override
            public void paint(Graphics g){
            Dimension mySize = getSize();
            g.setColor(Color.black);
            g.draw3DRect(2, 2, mySize.width - 5, mySize.height - 5,
            true);
            g.setColor(Color.BLACK);
            g.setFont(new Font("SansSerif",Font.BOLD,20));
            g.drawString("600 KM", 12, 45);
    }
}
