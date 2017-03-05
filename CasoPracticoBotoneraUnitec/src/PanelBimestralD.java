
import java.awt.GridLayout;
import javax.swing.*;

public class PanelBimestralD extends JPanel {
    private JButton U = new JButton("U");
    private  JButton N = new JButton("N");
    private  JButton I = new JButton("I");
    private  JButton T = new JButton("T");
    private  JButton E = new JButton("E");
    private  JButton C = new JButton("C");
    
    public PanelBimestralD() {
        setLayout(new GridLayout(1, 6));
        add(U);
        add(N);
        add(I);
        add(T);
        add(E);
        add(C);
    }
        
}
