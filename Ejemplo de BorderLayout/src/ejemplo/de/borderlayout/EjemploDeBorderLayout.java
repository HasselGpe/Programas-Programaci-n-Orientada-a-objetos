package ejemplo.de.borderlayout;

import java.awt.event.*;

public class EjemploDeBorderLayout {

    public static void main(String[] args) {
        BorderF F = new BorderF();
        F.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                // Concluye la aplicacion cuando el usuario cierra la 
                // ventana
                System.exit(0);
            }
        });
    }

}
