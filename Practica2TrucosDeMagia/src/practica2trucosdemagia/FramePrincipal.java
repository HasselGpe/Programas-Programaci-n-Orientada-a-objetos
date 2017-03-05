package practica2trucosdemagia;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
public class FramePrincipal {
    /*
    * ClaseFramePrincipal
    * Hasssel Guadalupe Ortega Pelaez 
    * NetBeans 8.1 
    * Fecha: 07/02/2017
    *
    */
    private JFrame f;
    private JTextField textoCaptura;
    private PanelPersonalSwing panelDatosSWING;
    private PanelPersonalAWT panelDatosAWT;
    public FramePrincipal (){
        f = new JFrame("Prueba Frame");
        textoCaptura = new JTextField("\t"+ "\t"+"\t" +"\t"+"TRUCOS DE MAGIA!!!!");
        textoCaptura.setBackground(Color.pink);
        panelDatosSWING = new PanelPersonalSwing();
        panelDatosAWT = new PanelPersonalAWT();      
    }
    public void CreaFrame(){
        f.getContentPane().setLayout(new GridLayout(4,2, 5,5));
        f.setSize(500,500);
        f.getContentPane().add(textoCaptura);
        f.getContentPane().add(panelDatosSWING);
        f.getContentPane().add(panelDatosAWT);
        f.setBackground(Color.blue);
        f.setVisible(true);
    }
    public void imagenesPanel() {
        
        f.setVisible(true);
        JPanel panel = new JPanel();
        panel.setSize(100, 100);
        panel.setBackground(Color.PINK);
        ImageIcon imagen = new ImageIcon("Imagenes/header.jpg");
        JLabel etiqueta = new JLabel(imagen);
        etiqueta.setSize(100, 100);
        panel.add(etiqueta);
        f.add(panel);
        f.pack();    
    } 
}
