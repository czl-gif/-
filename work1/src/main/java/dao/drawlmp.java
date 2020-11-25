package dao;
import pojo.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class drawlmp implements draw {
    @Override
    public void drawLine(final LineShipe lineShipe){
        JFrame jf = new JFrame();
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.black);
                graphics.drawLine(lineShipe.getX1(),lineShipe.getY1(),lineShipe.getX2(),lineShipe.getY2());
            }
        };
        jf.add(jPanel);
        jf.setVisible(true);
    }
    public void drawRect(final RectShipe rectShipe) {
        JFrame jf = new JFrame();
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.black);
                graphics.drawRect(rectShipe.getX(),rectShipe.getY(),rectShipe.getWidth(),rectShipe.getHeight());
            }
        };
        jf.add(jPanel);
        jf.setVisible(true);
    }

    public void drawCircle(final CircleShape circleShape) {
        JFrame jf = new JFrame();
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.black);
                graphics.drawOval(circleShape.getX(),circleShape.getY(),circleShape.getWidth(),circleShape.getHeight());
            }
        };
        jf.add(jPanel);
        jf.setVisible(true);
    }
}
