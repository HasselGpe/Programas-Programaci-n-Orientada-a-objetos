package tutorial.de.java.awt;
import java.awt.*;
public class Frame extends java.awt.Frame {
    public Frame() {
        // Se construyen tres Paneles con fondos de color diferente
        // y sin contener ningun elemento activo
        ///Panel Izquierdo creacion 
        Panel pIzquierdo = new Panel();
        pIzquierdo.setBackground(Color.yellow);
        pIzquierdo.add(new TextField("Panel izquierdo -> Amarillo"));

        //Panel Derecho Creacion 
        Panel pDerecho = new Panel();
        pDerecho.setBackground(Color.BLUE);
        pDerecho.add(new Button("Panel Derecho -> Azul"));

        // Panel Central creacion 
        Panel pCentral = new Panel();
        pCentral.setBackground(Color.red);
        pCentral.add(new Label("Panel Central -> Rojo"));
        // Se instancia un objeto Frame utilizando un FlowLayout y
        // se colocan los tres objetos Panel sobre el Frame
        Frame miFrame = new Frame();
        miFrame.setLayout(new FlowLayout());
        
        miFrame.add(pIzquierdo);
        miFrame.add(pCentral);
        miFrame.add(pDerecho);
        miFrame.setSize(500,200);
        miFrame.setVisible(true);
       
    }

}

