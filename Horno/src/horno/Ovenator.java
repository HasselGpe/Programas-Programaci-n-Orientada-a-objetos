package horno;
import javax.swing.*;
import java.awt.*;

public class Ovenator {
    private JFrame framePrinc = new JFrame("Ovenator");
    private JPanel panelPublicidad = new JPanel();
    private ControlPanel misControles = new ControlPanel();
    private ControlPanel2 misControles2 = new ControlPanel2();
        public Ovenator() {
            panelPublicidad.setLayout(new BorderLayout());
            JLabel etiqueta = new JLabel();
            panelPublicidad.add(etiqueta,BorderLayout.SOUTH);
            framePrinc.getContentPane().setLayout(new BorderLayout());
            framePrinc.getContentPane().add(misControles,BorderLayout.EAST);
            framePrinc.getContentPane().add(misControles2,BorderLayout.WEST);
            framePrinc.pack();
            framePrinc.setVisible(true);
    }
        public void imagenesPanel() {
        
        framePrinc.setVisible(true);
        JPanel panel = new JPanel();
        panel.setSize(100, 100);
        panel.setBackground(Color.WHITE);
        ImageIcon imagen = new ImageIcon("Imagenes/header.jpg");
        JLabel etiqueta = new JLabel(imagen);
        etiqueta.setSize(100, 100);
        panel.add(etiqueta);
        framePrinc.add(panel);
        framePrinc.pack();    
    } 
}