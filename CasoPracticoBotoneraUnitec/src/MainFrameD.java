
import java.awt.GridLayout;
import javax.swing.*;

public class MainFrameD extends JFrame {

    private JFrame princ = new JFrame();
    private PanelBimestralD PD = new PanelBimestralD();
    private CanvasBimestralD CD = new CanvasBimestralD();
    private CanvasBimestralD2 CD2 = new CanvasBimestralD2();

    public MainFrameD() {
        princ = new JFrame("Bimestral");
        princ.getContentPane().setLayout(new GridLayout(3, 1));
        princ.getContentPane().add(CD2);
        princ.getContentPane().add(CD);
        princ.getContentPane().add(PD);
        princ.pack();
        princ.setVisible(true);
        princ.setSize(500, 500);
        princ.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MainFrameD Princ = new MainFrameD();
    }
}
