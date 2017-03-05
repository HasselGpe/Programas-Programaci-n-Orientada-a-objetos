
package tutorial.de.java.awt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Conclusion extends WindowAdapter{
        public void windowClosing( WindowEvent evt ) {
        // Concluye la aplicacion cuando el usuario cierra la ventana
        System.exit( 0 );
        }

}
