package practicaeventos;
import javax.swing.*;
import java.awt.*;
public class FramePrinc {

    private final JFrame framePrinc = new JFrame("Juego");
    private Button left, right, up, down,restaurar;
    private Display myDisplay;

    public FramePrinc() {
        framePrinc.getContentPane().setLayout(new BorderLayout());
        myDisplay = new Display();
        Panel p = new Panel();
        framePrinc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrinc.add(BorderLayout.CENTER, myDisplay); 
        framePrinc.add(BorderLayout.SOUTH, p);  
        framePrinc.setLocationRelativeTo(null);
        framePrinc.setSize(400,300);
        framePrinc.setResizable(false);
        framePrinc.setVisible(true); 
        left = new Button("Izquierda");
        p.add(left);
        right = new Button("Derecha");
        p.add(right);
        up = new Button("Arriba");
        p.add(up);
        down = new Button("Abajo");
        p.add(down);
        restaurar = new Button("Restaurar");
        p.add(restaurar);
        //Registrar myDisplay con cada botón      
        left.addActionListener(myDisplay);
        right.addActionListener(myDisplay);
        up.addActionListener(myDisplay);
        down.addActionListener(myDisplay);
        restaurar.addActionListener(myDisplay);
    }
}
