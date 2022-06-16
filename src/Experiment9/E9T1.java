package Experiment9;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class MenuFrame extends JFrame implements ActionListener
    {
        JMenuBar jmb;
        JMenu menu1, menu2, menu3;
        JMenuItem menuItem11, menuItem12, menuItem13, menuItem14;
        JMenuItem menuItem21, menuItem22, menuItem23;
        JMenuItem menuItem31, menuItem32, menuItem33;
        Font ft = new Font("宋体", Font.PLAIN, 18);

        MenuFrame()
            {
                setTitle(";-)我的菜单:-)");
                setLayout(new FlowLayout());
                init();
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setBounds(100, 100, 700, 600);
                setVisible(true);
            }

        void init()
            {
                jmb = new JMenuBar();
                setJMenuBar(jmb);
                menu1 = new JMenu("成长的我");
                menu1.setFont(ft);
                menu2 = new JMenu("温馨一刻");
                menu2.setFont(ft);
                menu3 = new JMenu("关于我");
                menu3.setFont(ft);
                jmb.add(menu1);
                jmb.add(menu2);
                jmb.add(menu3);
                menuItem11 = new JMenuItem("我的小学");
                menuItem11.setFont(ft);
                menuItem12 = new JMenuItem("我的初中");
                menuItem12.setFont(ft);
                menuItem13 = new JMenuItem("我的高中");
                menuItem13.setFont(ft);
                menuItem14 = new JMenuItem("我的大学");
                menuItem14.setFont(ft);
                menu1.add(menuItem11);
                menu1.add(menuItem12);
                menu1.add(menuItem13);
                menu1.add(menuItem14);
                menuItem11.addActionListener(this);
                menuItem12.addActionListener(this);
                menuItem13.addActionListener(this);
                menuItem14.addActionListener(this);
                menuItem21 = new JMenuItem("儿时玩伴");
                menuItem21.setFont(ft);
                menuItem22 = new JMenuItem("青梅竹马");
                menuItem22.setFont(ft);
                menuItem23 = new JMenuItem("大学室友");
                menuItem23.setFont(ft);
                menuItem21.addActionListener(this);
                menuItem22.addActionListener(this);
                menuItem23.addActionListener(this);
                menu2.add(menuItem21);
                menu2.add(menuItem22);
                menu2.add(menuItem23);
                menuItem31 = new JMenuItem("关于我");
                menuItem31.setFont(ft);
                menuItem32 = new JMenuItem("猜猜我的爱好");
                menuItem32.setFont(ft);
                menuItem33 = new JMenuItem("Help");
                menuItem33.setFont(ft);
                menu3.add(menuItem31);
                menu3.add(menuItem32);
                menu3.add(menuItem33);
                menuItem31.addActionListener(this);
                menuItem32.addActionListener(this);
                menuItem33.addActionListener(this);
            }

        public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == menuItem11)
                    {
                        new Frame1("成长的我——我的小学");
                    }
                if (e.getSource() == menuItem12)
                    {
                        new Frame1("成长的我——我的初中");
                    }
                if (e.getSource() == menuItem13)
                    {
                        new Frame1("成长的我——我的高中");
                    }
                if (e.getSource() == menuItem14)
                    {
                        new Frame1("成长的我——我的大学");
                    }
                if (e.getSource() == menuItem21)
                    {
                        new Frame1("温馨一刻——儿时玩伴");
                    }
                if (e.getSource() == menuItem22)
                    {
                        new Frame1("温馨一刻——青梅竹马");
                    }
                if (e.getSource() == menuItem23)
                    {
                        new Frame1("温馨一刻——大学室友");
                    }
                if (e.getSource() == menuItem31)
                    {
                        JOptionPane.showMessageDialog(null, "21计算机H2班，学号30，李成蹊");
                    }
                if (e.getSource() == menuItem32)
                    {
                        new Frame2();
                    }
                if (e.getSource() == menuItem33)
                    {
                        JOptionPane.showMessageDialog(null, "Version 1.0, 2022.2");
                    }
            }
    }

class Frame1 extends JFrame implements ActionListener
    {
        Frame1(String title)
            {
                JFrame jFrame = new JFrame(title);
                jFrame.setLayout(new FlowLayout());
                jFrame.setBounds(200, 170, 500, 440);
                jFrame.setVisible(true);
                BufferedImage img = null;
                try
                    {
                        img = ImageIO.read(new File("D:\\D-Data\\Coding\\JavaExperiment\\src\\Experiment9\\Pics\\" + title + ".jpg"));
                    } catch (IOException err)
                    {
                        err.printStackTrace();
                    }
                JLabel label = new JLabel(new ImageIcon(img));
                jFrame.add(label);
            }

        public void actionPerformed(ActionEvent e)
            {

            }
    }

class Frame2 extends JFrame implements ActionListener
    {
        Frame2()
            {
                JFrame jFrame = new JFrame("猜猜我的爱好");//新建窗体
                jFrame.setLayout(new BorderLayout());//解除布局限制
                jFrame.setBounds(200, 170, 500, 440);//设置大小
                jFrame.setVisible(true);//设置可视度
                JComboBox<String> items = new JComboBox<>();
                //设置复选框子项
                items.addItem("学习");
                items.addItem("音乐");
                items.addItem("旅游");
                items.addItem("文学艺术");
                items.addItem("静处");
                items.addItem("和平");
                JPanel jPanel = new JPanel();
                jPanel.setLayout(null);
                jPanel.add(items);
                items.setBounds(50, 0, 100, 20);//设置大小
                jFrame.add(jPanel);
                JTextField jTextField = new JTextField();
                jTextField.setBounds(150, 0, 300, 20);
                jTextField.setVisible(true);
                jFrame.setVisible(true);
                jPanel.add(jTextField);
                items.addItemListener(e1 ->//添加监听器
                    {
                        String s = (String) items.getSelectedItem();
                        if ("和平".equals(s))
                            {
                                jTextField.setText("猜对了我爱和平");
                            }
                    });
            }

        public void actionPerformed(ActionEvent e)
            {

            }
    }

public class E9T1
    {
        public static void main(String[] args)
            {
                new MenuFrame();
            }
    }
