package practica2trucosdemagia;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Imagen1 extends javax.swing.JPanel  {
   private static void imagenesPanel() {
        JFrame ventana = new JFrame();
        ventana.setVisible(true);
        JPanel panel = new JPanel();
        panel.setSize(100, 200);
        panel.setBackground(Color.BLUE);
        
        ImageIcon imagen = new ImageIcon("Imagenes/Hombre.png");
        JLabel etiqueta = new JLabel(imagen);
        etiqueta.setSize(200, 200);
        panel.add(etiqueta);
        ventana.add(panel);
        ventana.pack(); 
    } 
}
