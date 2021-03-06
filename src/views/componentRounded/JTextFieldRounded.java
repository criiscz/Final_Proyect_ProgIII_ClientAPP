package views.componentRounded;

import javax.swing.*;
import java.awt.*;

public class JTextFieldRounded extends JTextField {

    public JTextFieldRounded(int columns) {
        super(columns);
        setOpaque(false);
        this.setHorizontalAlignment(JTextField.CENTER);
    }

    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
    }
}
