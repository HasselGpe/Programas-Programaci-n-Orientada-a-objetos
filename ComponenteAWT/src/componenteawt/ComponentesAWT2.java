package componenteawt;
import java.awt.*;
public class ComponentesAWT2 extends Frame {      
    public ComponentesAWT2() {
        Panel buttomPanel = new Panel();
        Panel centerPanel = new Panel();
        MenuBar mb = new MenuBar();
        Menu m = new Menu("Menu");
        m.add(new MenuItem("Menu Selección 1"));
        m.add(new CheckboxMenuItem("Menu Selección 2"));
        m.add(new MenuItem("Menu Selección 3"));
        mb.add(m);
        setMenuBar(mb);
        //Incorporamos los elementos pequeños en la zona inferior 
        buttomPanel.add(new TextField("Campos de Texto"));
        buttomPanel.add(new Button("Boton"));
        buttomPanel.add(new Checkbox("Casilla de verificación"));

        Choice c = new Choice();
        c.addItem("Selección Item 1");
        c.addItem("Selección Item 2");
        c.addItem("Selección Item 3");
        buttomPanel.add(c);

        //En la zona central colocamos los elementos mayores 
        centerPanel.setLayout(new GridLayout(1, 2));

        //En la columno izquierda posicionamos un canvas
        centerPanel.add(new MiCanvas());

        //EN la zona central colocamos una etiqueta y una zona de texto 
        Panel p = new Panel();
        p.setLayout(new BorderLayout());
        p.add("North", new Label("Etiqueta", Label.CENTER));
        p.add("Center", new TextArea("Zona de Texto", 5, 10));//Primera cordenada es la altura y la segunda es el ancho
        centerPanel.add(p);

        setLayout(new BorderLayout());
        add("South", buttomPanel);
        add("Center", centerPanel);

        //En la columna derecha colocamos una lista de selección
        List I = new List(3, false);
        I.add("Listas Item 1");
        I.add("Listas Item 2");
        I.add("Listas Item 3");
        I.add("East");

  
    }
}
