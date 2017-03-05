/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2prueba;
import java.awt.*;
/**
 *
 * @author Maq
 */
public class PanelPersonalAWT extends Panel{
    public Label Texto1 = new Label("Mira el botón ---->");
    public Button boton1 = new Button("BOTON");
    public PanelPersonalAWT (){
        setLayout(new GridLayout(1,2));
        add(Texto1);
        add(boton1);
    }
}
