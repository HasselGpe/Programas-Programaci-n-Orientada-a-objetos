package practicaeventos;

import java.awt.*;
import java.awt.event.*;

public class Display extends Canvas implements ActionListener {

    private final Point center;

    public Display() {
        center = new Point(50, 50);
        setBackground(Color.white);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String direction = e.getActionCommand();
        if (direction.equals("Izquierda")) {
            center.x -= 12;
        } else if (direction.equals("Derecha")) {
            center.x += 12;
        } else if (direction.equals("Arriba")) {
            center.y -= 12;
        } else if (direction.equals("Abajo")) {
            center.y += 12;
        } else if (direction.equals("Restaurar")) {
            center.x = 27 ;
        } else if (direction.equals("Restaurar")) {
            center.y += 12;
        }
        repaint();
    }
    // Pinta punto 

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(center.x - 5, center.y - 5, 10, 10);
    }
       public static void main(String[] args) {
        FramePrinc test = new FramePrinc();
    }
}
