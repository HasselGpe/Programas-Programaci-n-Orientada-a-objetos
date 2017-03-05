
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends Applet {

    private Button left, right;
    private Display myDisplay;

    public void init() {
        setLayout(new BorderLayout());
        myDisplay = new Display();
        add(BorderLayout.CENTER, myDisplay);

        Panel p = new Panel();
        left = new Button("Izquierda");
        p.add(left);
        right = new Button("Derecha");
        p.add(right);
        add(BorderLayout.SOUTH, p);

        //Registrar myDisplay con cada botón      
        left.addActionListener(myDisplay);
        right.addActionListener(myDisplay);
    }
}
