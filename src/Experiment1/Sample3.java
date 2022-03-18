package Experiment1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MenuFrame extends JFrame implements ActionListener
{
    JMenuBar jmb;
    JMenu menu1,menu2,menu3;
    JMenuItem menuItem11,menuItem12,menuItem13;
    JMenuItem menuItem21,menuItem22;
    JMenuItem menuItem31,menuItem32;
    Font ft=new Font("宋体",Font.PLAIN,18);
    MenuFrame()
    {
        setTitle(";-)我的菜单:-)");
        setLayout(new FlowLayout());
        init();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,500,400);
        setVisible(true);
    }
    void init()
    {
        jmb=new JMenuBar();
        setJMenuBar(jmb);
        menu1=new JMenu("成长的我"); menu1.setFont(ft);
        menu2=new JMenu("温馨一刻"); menu2.setFont(ft);
        menu3=new JMenu("关于我"); menu3.setFont(ft);
        jmb.add(menu1);
        jmb.add(menu2);
        jmb.add(menu3);
        menuItem11=new JMenuItem("我的小学");menuItem11.setFont(ft);
        menuItem12=new JMenuItem("我的初中");menuItem12.setFont(ft);
        menuItem13=new JMenuItem("我的高中");menuItem13.setFont(ft);
        menu1.add(menuItem11);
        menu1.add(menuItem12);
        menu1.add(menuItem13);
        menuItem21=new JMenuItem("儿时玩伴");menuItem21.setFont(ft);
        menuItem22=new JMenuItem("大学室友");menuItem22.setFont(ft);
        menu2.add(menuItem21);
        menu2.add(menuItem22);
        menuItem31=new JMenuItem("关于我");menuItem31.setFont(ft);
        menuItem32=new JMenuItem("Help");menuItem32.setFont(ft);
        menu3.add(menuItem31);
        menu3.add(menuItem32);
        menuItem31.addActionListener(this);
        menuItem32.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == menuItem31)
        {
            JOptionPane.showMessageDialog(null, "21计算机H2班，学号30，李成蹊");
        }
        if (e.getSource() == menuItem32)
        {
            JOptionPane.showMessageDialog(null, "Version 1.0, 2022.2");
        }
    }
}
public class Sample3
{
    public static void main(String[] args)
    {
        new MenuFrame();
    }
}
