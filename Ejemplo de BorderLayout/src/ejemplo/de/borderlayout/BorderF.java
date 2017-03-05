package ejemplo.de.borderlayout;
import java.awt.*;
public class BorderF extends Frame{
    Button botonN, botonS, botonE, botonO, botonC;
    
   
    public BorderF() {
         // Craemos un boton en cada posicion que permite el layout
        botonN = new Button("Norte");
        botonS = new Button("SUR");
        botonE = new Button("ESTE");
        botonO = new Button("OESTE");
        botonC = new Button("CENTRO");
        
        Frame miframe = new Frame("EJEMPLO DE BORDERLAYOUT");
        miframe.setLayout(new BorderLayout());
        miframe.setVisible(true);
        miframe.setSize(500,300);
        // Los hacemos aparecer en pantalla
        miframe.add(botonN);
        miframe.add(botonS);
        miframe.add(botonE);
        miframe.add(botonO);
        miframe.add(botonC);
        
    }
         
    
}
