import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Test2 extends Applet implements ActionListener {

    private Button left, right;
    private TextField display;

    public void init() {
        left = new Button("Gauche");
        add(left);
        display = new TextField(5);
        add(display);
        right = new Button("Droit");
        add(right);
        left.addActionListener(this);
        right.addActionListener(this);
        left.setActionCommand("Izquierdo");
        right.setActionCommand("Derecho");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Izquierdo")) {
            display.setText("<---");
        } else if (s.equals("Derecho")) {
            display.setText("--->");
        }
    }
}
