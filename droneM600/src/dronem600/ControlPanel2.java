package dronem600;
import javax.swing.*;
import java.awt.*;

public class ControlPanel2 extends JPanel{
         //Instanciacion de los JPaneles antes creados 
            private VideoRec  videoR = new VideoRec ();
            private TiposVideo tiposV = new TiposVideo();
            private Movimiento controlIzquierdo = new Movimiento();
          //Creacion de contructor donde se agregaran casa uno de los JPaneles
            public ControlPanel2(){
            tiposV.CheckBox();
            setBackground(Color.black);
            setForeground(Color.blue);
            setLayout(new GridLayout(3,1));
            setSize(205,300);
            add(videoR);
            add(tiposV);
            add(controlIzquierdo);         
    }            
}
