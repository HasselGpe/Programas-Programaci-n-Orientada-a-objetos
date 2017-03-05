/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2prueba;
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author Maq
 */
public class FramePrincipal {
    private JFrame f;
    private JTextField textoCaptura;
    private PanelPersonalSWING panelDatosSWING;
    private PanelPersonalAWT panelDatosAWT;
    
    public FramePrincipal (){
        f = new JFrame("Prueba Frame");
        textoCaptura = new JTextField("Default");
        panelDatosSWING = new PanelPersonalSWING();
        panelDatosAWT = new PanelPersonalAWT();
    }
    public void CreaFrame(){
        f.getContentPane().setLayout(new GridLayout(3,1));
        f.setSize(200,200);
        f.getContentPane().add(textoCaptura);
        f.getContentPane().add(panelDatosSWING);
        f.getContentPane().add(panelDatosAWT);
        f.setVisible(true);
    }
}
