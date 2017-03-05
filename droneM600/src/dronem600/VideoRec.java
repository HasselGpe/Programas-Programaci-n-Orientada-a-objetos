package dronem600;
import java.awt.*;

public class VideoRec extends Canvas {
    //Creacion de constructor
    public  VideoRec  (){      
        setBackground(Color.BLACK);
    }
    @Override
            public void paint(Graphics g){
            Dimension mySize = getSize();// Trae el tamaño
            g.setColor(Color.white);// Asigna el color del borde 
            g.draw3DRect(5, 5, mySize.width - 10, mySize.height - 10,
            true);// Dibuja mi canvas y le asigna el tamaño
            g.setColor(Color.red);//Asigna color de letra
            g.setFont(new Font("Consolas",Font.BOLD,15));// Tipo de letra y tamaño
            g.drawString("RECORDER VIDEO....", 20, 55 );// Letrero a mostrar
    }
}
