/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fristproject;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class RightSide extends JFrame {

    public static String data[][] = new String[5][5];
    private static JLabel InoiceDate_label,
            CN_labl,
            InvoiceNum_lable,
            InvoiceTotal,
            total;
    static JTextField t1, t2;
    public static JPanel panel1, leftSide, rightSide, panel;
    private JScrollPane sp1;
    public String Name;

    public void RightSide() {

    }

    public void RightPanel() {
        GridBagConstraints x;
        x = new GridBagConstraints();
        GridLayout layout = new GridLayout(1, 2);
        setLayout(layout);
        rightSide = new JPanel();
        // this.add(leftSide);
        this.add(rightSide);
        rightSide.setLayout(null);

    }

    public void uprightside() {
        InoiceDate_label = new JLabel("Inoice Number");
        rightSide.add(InoiceDate_label);
        InoiceDate_label.setBounds(5, 0, 100, 50);
        InvoiceNum_lable = new JLabel("23");
        rightSide.add(InvoiceNum_lable);
        InvoiceNum_lable.setBounds(110, 0, 100, 50);
        InoiceDate_label = new JLabel("Invoice Date");
        rightSide.add(InoiceDate_label);
        InoiceDate_label.setBounds(5, 50, 100, 50);
        t1 = new JTextField(30);
        rightSide.add(t1);
        t1.setBounds(110, 60, 400, 25);
        CN_labl = new JLabel("Customer Name");
        rightSide.add(CN_labl);
        CN_labl.setBounds(5, 100, 100, 30);
        t2 = new JTextField(30);
        rightSide.add(t2);
        t2.setBounds(110, 100, 400, 25);
        InvoiceTotal = new JLabel("Invoice Total");
        rightSide.add(InvoiceTotal);
        InvoiceTotal.setBounds(5, 60, 300, 200);
        total = new JLabel("");
        rightSide.add(total);
        total.setBounds(110, 60, 300, 200);

    }

    public void setborder() {
        Border blackline = BorderFactory.createTitledBorder(" Invoice Item ");
        panel = new JPanel();
        panel.setSize(800, 800);
        panel.setBorder(blackline);
        rightSide.add(panel);
        panel.setBounds(5, 180, 600, 400);
        pack();
    }

    public void Createtabel() {
        panel1 = new JPanel();
        String column[] = {"No", "Item NAME", "Item Price", "count", "Item total"};
        JTable jt = new JTable(data, column);
        //  tabellisten e = new tabellisten();
        jt.setBounds(0, 0, 100, 100);
        JScrollPane sp = new JScrollPane(jt);
        panel1.add(sp);
        panel1.setSize(200, 200);
        panel.add(panel1);
        pack();
    }

}
