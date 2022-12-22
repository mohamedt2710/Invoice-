package fristproject;

import static fristproject.RightSide.rightSide;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class mainJframe extends JFrame {

    public String totals;
    RightSide RightSide = new RightSide();
    leftside leftside = new leftside();

    public mainJframe() {
       // leftside.leftside();
        RightSide.RightPanel();
        RightSide.uprightside();
        RightSide.setborder();
        RightSide.Createtabel();
        JButton btn = new JButton("save");
        //   listener l = new listener();
        //  btn.addActionListener(l);
        rightSide.add(btn);
        btn.setBounds(15, 600, 100, 30);

    }

    public static void main(String[] args) {
        mainJframe x = new mainJframe();
        x.setVisible(true);
        x.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
