package Experiment9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

public class E9T2
    {
        public static void main(String[] args)
            {
                new MainF();
            }
    }

class MainF extends JFrame implements ActionListener
    {
        JButton jButton = new JButton("绘制");
        public static JTextField a, b, c;

        MainF()
            {
                JFrame jFrame = new JFrame("我的绘图实例——绘制抛物线");
                jFrame.setLayout(new BorderLayout());
                jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                jFrame.setBounds(100, 100, 700, 600);
                JPanel jPanel = new JPanel();
                jFrame.add(jPanel, BorderLayout.NORTH);
                JLabel la, lb, lc;
                la = new JLabel("抛物线: y=ax^2+bx+c, 请输入系数    a");
                lb = new JLabel("b");
                lc = new JLabel("c");
                a = new JTextField(3);
                b = new JTextField(3);
                c = new JTextField(3);
                jPanel.add(la);
                jPanel.add(a);
                jPanel.add(lb);
                jPanel.add(b);
                jPanel.add(lc);
                jPanel.add(c);
                jPanel.add(jButton);
                jPanel.setVisible(true);
                jButton.addActionListener(this);
                jFrame.setVisible(true);
                jFrame.setLayout(new FlowLayout());
            }

        public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == jButton)
                    {
                        //new DrawF(Integer.parseInt(a.getText()),Integer.parseInt(b.getText()),Integer.parseInt(c.getText()));
                        new DrawF();
                    }
            }
    }

class DrawF extends JFrame
    {
        DrawF()
            {
                JFrame jFrame = new JFrame("抛物线");
                jFrame.setVisible(true);
                jFrame.add(new DrawC());
                jFrame.pack();
            }
    }

class DrawC extends JComponent
    {
        private static final int DEFAULT_WIDTH = 700;
        private static final int DEFAULT_HEIGHT = 600;

        public void paintComponent(Graphics g)
            {
                var g2 = (Graphics2D) g;
                g2.setColor(Color.BLUE);
                Line2D line1 = new Line2D.Double(50, 300, 650, 300);
                Line2D line2 = new Line2D.Double(350, 0, 350, 700);
                BasicStroke bs = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER);
                g2.setStroke(bs);
                g2.draw(line1);
                g2.draw(line2);
                g2.setColor(Color.BLACK);
                BasicStroke bs2 = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER);
                g2.setStroke(bs2);
                Polygon p = new Polygon();
                double a1 = Double.parseDouble(MainF.a.getText());
                double b1 = Double.parseDouble(MainF.b.getText());
                double c1 = Double.parseDouble(MainF.c.getText());
                for (int x = 50; x < 650; x++)
                    {
                        p.addPoint(x, 300 - (int) ((a1 * (x - 350) * (x - 350) + b1 * (x - 350) + c1) ));
                    }
                g2.drawPolyline(p.xpoints, p.ypoints, p.npoints);
            }

        public Dimension getPreferredSize()
            {
                return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
            }
    }