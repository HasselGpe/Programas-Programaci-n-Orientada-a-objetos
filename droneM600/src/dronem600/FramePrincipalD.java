package dronem600;
import javax.swing.*;
import java.awt.*;
public class FramePrincipalD {
    private final JFrame framePrinc = new JFrame("Interface Grafica de Drone");
    private final ControlPanel1 misControles = new ControlPanel1();
    private final ControlPanel2 misControles2 = new ControlPanel2();
        //Creacion del contructor donde se le agregaran todos los controlespaneles y se les ordenara 
        public FramePrincipalD() {
            framePrinc.getContentPane().setLayout(new BorderLayout());
            framePrinc.getContentPane().add(misControles,BorderLayout.EAST);
            framePrinc.getContentPane().add(misControles2,BorderLayout.WEST);
            framePrinc.pack();
            framePrinc.setVisible(true); 
    } 
        //Metodo para la agregación de imagen principal en el frame
        public void imagenesPanel() {
        //framePrinc.setVisible(true);
        JPanel panel = new JPanel();
        panel.setSize(10, 10);
        panel.setBackground(Color.WHITE);
        ImageIcon imagen = new ImageIcon("Imagenes/Principal.jpg");
        JLabel etiqueta = new JLabel(imagen);
        etiqueta.setSize(10, 10);
        panel.add(etiqueta);
        framePrinc.add(panel);
        framePrinc.pack();    
    }    
}
