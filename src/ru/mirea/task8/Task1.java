
package ru.mirea.task8;

import javax.swing.JFrame;
import java.util.concurrent.CyclicBarrier;


public class Task1 {
    public Task1(){
    JFrame frame = new JFrame("example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Custom Test = new Custom();
        frame.add(Test);
        frame.setSize(300,300);
        frame.setVisible(true);


    //protected void paintComponent(Graphics g) {
//
//        Graphics2D g2= (Graphics2D) g;
//        Rectangle r=getBounds();
//        g2.setBackground(Color.white);
//        g2.clearRect(0, 0, r.width, r.height);
//
//        // выводим надпись и выводим квадрат красного цвет
//        g.setColor(Color.red);
//        g.drawString("Hello, world", 20, 20);
//        g.fillRect(60,60, 120, 120);
    }


    public static void main(String[] args) {
    new Task1();
    }
}
