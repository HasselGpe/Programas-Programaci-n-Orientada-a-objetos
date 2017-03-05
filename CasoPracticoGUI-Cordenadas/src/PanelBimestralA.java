import java.awt.BorderLayout;
import javax.swing.*;
public class PanelBimestralA extends JPanel{
    private JLabel cielo = new JLabel("Cielo");
    private JLabel suelo = new JLabel("Suelo");
    private  JButton Izquierda = new JButton("Izquierda");
    private  JButton Centro = new JButton("Centro");
    private JButton Derecha = new JButton("Derecha");
    
    public PanelBimestralA(){
        cielo.setHorizontalAlignment(JLabel.CENTER);
        suelo.setHorizontalAlignment(JLabel.CENTER);
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH,cielo);
        add(BorderLayout.SOUTH,suelo);
        add(BorderLayout.EAST,Izquierda);
        add(BorderLayout.WEST,Derecha);
        add(BorderLayout.CENTER,Centro);

    }
}
