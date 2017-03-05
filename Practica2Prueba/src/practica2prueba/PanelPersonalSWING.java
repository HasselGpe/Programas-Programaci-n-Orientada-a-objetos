/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2prueba;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Maq
 */
public class PanelPersonalSWING extends JPanel{
    public JLabel Texto1 = new JLabel("Mira el botón ---->");
    public JButton boton1 = new JButton("BOTON");
        
        public PanelPersonalSWING (){
        setLayout(new GridLayout(1,2));
        add(Texto1);
        add(boton1);
    }
    
}
