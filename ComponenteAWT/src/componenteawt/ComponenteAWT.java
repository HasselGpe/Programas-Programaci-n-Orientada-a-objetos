package componenteawt;
import java.awt.event.*;

public class ComponenteAWT {

    public static void main(String[] args) {
        ComponentesAWT2 window = new ComponentesAWT2();
        window.setTitle("Los componentes del AWT");
        window.pack();
        window.setVisible(true);
            window.addWindowListener( new WindowAdapter() {
            public void windowClosing( WindowEvent evt ) {
                // Concluye la aplicacion cuando el usuario cierra la 
               // ventana
                System.exit( 0 );
                }
            } );
  
    }   
}
