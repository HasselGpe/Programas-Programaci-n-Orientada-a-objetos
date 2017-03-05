
import java.awt.*;
import java.awt.event.*;

public class Display extends Canvas implements ActionListener {

    private Point center;

    public Display() {
        center = new Point(50, 50);
        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent e) {
//Obtine el rótulo del botón que generó el evento 
        String direction = e.getActionCommand();
//Mover el punto a la izquierda o derecha, según cual
//botón haya generado el evento 
        if (direction.equals("Izquierda")) {
            center.x -= 12;
        } else if (direction.equals("Derecha")) {
            center.x += 12;
        }
//puesto que se movió el punto, se fuerza una llamada a paint() 
//para mostrarlo en su nueva posición 
        repaint();
    }

    /**
     * Pinta punto rojo
     */
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(center.x - 5, center.y - 5, 10, 10);
    }
}
