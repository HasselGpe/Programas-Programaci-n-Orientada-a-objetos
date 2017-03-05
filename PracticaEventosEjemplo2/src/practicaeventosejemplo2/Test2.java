package practicaeventosejemplo2;

import java.awt.*;
import java.awt.event.*;

public class Test2 extends Frame implements ActionListener {

    private Button left, right, up, down, Reconstituer;
    private TextField display;
    private Frame Ventana = new Frame("EJEMPLO 2");

    public Test2() {
        Ventana.setLayout(new GridLayout(2, 4));
        Ventana.setSize(400, 300);
        Ventana.setLocationRelativeTo(null);
        left = new Button("Gauche");
        Ventana.add(left);
        display = new TextField(5);
        Ventana.add(display);
        right = new Button("Droit");
        Ventana.add(right);
        up = new Button("En haut");
        Ventana.add(up);
        Reconstituer = new Button("Reconstituer");
        Ventana.add(Reconstituer);
        down = new Button("En bas");
        Ventana.add(down);
        left.addActionListener(this);
        right.addActionListener(this);
        up.addActionListener(this);
        down.addActionListener(this);
        Reconstituer.addActionListener(this);
        left.setActionCommand("Izquierdo");
        right.setActionCommand("Derecho");
        up.setActionCommand("Arriba");
        down.setActionCommand("Abajo");
        Reconstituer.setActionCommand("Restaurar");
        Ventana.setVisible(true);
      
        Font fuente = new Font("Calibri", 3, 50);
        display.setFont(fuente);
        display.setForeground(Color.white);
        display.setBackground(Color.black);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Izquierdo")) {
            display.setText("←");

        } else if (s.equals("Derecho")) {
            display.setText("→ ");
            display.setBackground(Color.BLACK);
        } else if (s.equals("Arriba")) {
            display.setText("↑");
            display.setBackground(Color.BLACK);
        } else if (s.equals("Abajo")) {
            display.setText("↓ ");
            display.setBackground(Color.BLACK);
        }else if (s.equals("Restaurar")) {
            display.setText("");
            display.setBackground(Color.white);
        }
    }

    public static void main(String[] args) {
        Test2 ejecucion = new Test2();
    }
}
