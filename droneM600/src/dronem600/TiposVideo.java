package dronem600;
import javax.swing.*;
import java.awt.*;
//Creacion de la clase Tipos de Video para la resolución del Drone 
public class TiposVideo extends JPanel{
    JPanel ventana = new JPanel();//instanciacion de Jpanel
    // Creacion del Metodo ChecBox 
          public void CheckBox(){
            ventana.setVisible(true);
            ventana.setSize(500, 350);
            JPanel panel = new JPanel(new GridLayout(5, 2));
            JLabel etiqueta = new JLabel("Resolución de video: ");
            String[] arreglo = new String[]{"BRip","BDrip","720p","1080","4k","HD"};
            JComboBox combo = new JComboBox(arreglo);
            combo.setVisible(true);
            combo.setSelectedIndex(0);
            panel.add(etiqueta);
            panel.add(combo);
            ventana.add(panel);
            }
          //Creación de contructor
               public TiposVideo () {
            setLayout(new GridLayout(1,5));
            add(ventana);      
    }
}
  
