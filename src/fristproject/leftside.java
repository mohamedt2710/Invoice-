package fristproject;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class leftside {

    public JPanel panel1, leftSide, panel;
    private JScrollPane sp1;

    public void leftside() {
        leftSide = new JPanel();
       // this.add(leftSide); 
        String data[][] = {{"101", "Amit", "670000"},
        {"102", "Jai", "780000"},
        {"101", "Sachin", "700000"}};
        String column[] = {"ID", "NAME", "SALARY"};
        JTable tb = new JTable(data, column);
        tb.setBounds(0, 0, 200, 300);
        sp1 = new JScrollPane(tb);
        leftSide.add(sp1);
        leftSide.setSize(300, 400);
    }
}
