package dronem600;
import javax.swing.*;
import java.awt.*;

public class ControlPanel1  extends JPanel {
            //Instanciacion de los JPaneles antes creados 
            private Kilometros KmDrone = new Kilometros();
            private  Bottoms EnAp = new Bottoms ();
            private VelocidadControl controlDerecho = new VelocidadControl();
            private Titulo  tituloDrone = new Titulo();
            //Creacion de contructor donde se agregaran casa uno de los JPaneles
            public ControlPanel1(){
            setBackground(Color.black);
            setForeground(Color.blue);
            setLayout(new GridLayout(4,1));
            setSize(125,200);
            add(tituloDrone);
            add( KmDrone);
            add(EnAp);
            add(controlDerecho);     
     }           
}
