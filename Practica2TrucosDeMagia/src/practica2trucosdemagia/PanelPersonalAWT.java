package practica2trucosdemagia;
import java.awt.*;
import javax.swing.JTextArea;
    public class PanelPersonalAWT extends Panel{
    /*
    * Clase PanelPersonalAWT
    * Hasssel Guadalupe Ortega Pelaez 
    * NetBeans 8.1 
    * Fecha: 07/02/2017
    *
    */
    public Label Texto1 = new Label("    Sacar conejo del sombrero     ---->");
    String text = "Para realizar este truco Agarre la pieza de material negro "+ "\n"
            + "y conecte las cuatro piezas, sin apretar, coloque al conejo "+ "\n"
            + "en un saco improvisado en el que tendrás que fijar la hebilla debajo "+ "\n"
            + "de la mesa que tendrá enfrente de usted durante la actuación.La sábana"+ "\n"
            + "debe fijarse de manera que no pueda visto con el saco del conejo."+ "\n"
            + "Muestre el sombrero al público con el fin de demostrar que no"+ "\n"
            + "hay nada en él.Ponga el sombrero sobre la mesa levante el sombrero"+ "\n"
            + "forma rápida e inserte la bolsa en su interior";
    JTextArea textArea2 = new JTextArea(text, 100, 100);
    public PanelPersonalAWT (){
        setLayout(new GridLayout(1,2,5,5));
        add(Texto1);
        add(textArea2);
        textArea2.setBackground(Color.PINK);
    }
}
