import java.awt.GridLayout;
import javax.swing.*;
public class MainFrameA {
   private JFrame Princ = new JFrame();
   private PanelBimestralA PBA = new PanelBimestralA();
   private  CanvasBimestralA CBa = new CanvasBimestralA();

    public MainFrameA() {
        Princ.setTitle("Bimestral");
        Princ.setVisible(true);  
        Princ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Princ.pack();
        Princ.setSize(500,500);
        Princ.setLayout(new GridLayout(2, 1));
        Princ.add(PBA);
        Princ.add(CBa);
        
    }
    
    
    
    public static void main(String[] args) {
        MainFrameA Bimestral = new MainFrameA();
    }
}
