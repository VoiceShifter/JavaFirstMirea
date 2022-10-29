package ru.mirea.task8;
import javax.swing.JPanel;
import java.awt.Graphics;


public class Custom extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(10, 10, 200, 200);
        g.drawOval(4, 4, 200, 200);
    }
}

