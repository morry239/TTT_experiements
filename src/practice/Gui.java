package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;

public class Gui {

    JFrame jFrame;
    Draw dr;
    JButton btnReset;

    static JButton button1[] = new JButton[9]; //warum 9?
    static int state[] = new int[9];
    static int spieler = 0;
    static int winner = 0;

    public Gui(){

        jFrame = new JFrame();
        jFrame.setSize(800 , 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setTitle("Tic Tac Toe");

        for(int i = 0; i < button1.length; i++){
            button1[i] = new JButton();
            button1[i].setVisible(true);
            button1[i].addActionListener(new ActionHandler());
            button1[i].setFocusPainted(false);
            button1[i].setContentAreaFilled(false);
            button1[i].setBorder(null);
            jFrame.add(button1[i]);
        }

        ButtonPlacement.place();

        btnReset = new JButton("Resetten!");
        btnReset.setBounds(675, 500, 100, 40);
        btnReset.setVisible(true);
        btnReset.setBackground(new Color(51, 102, 153));
        btnReset.setForeground(Color.WHITE);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Funktion.reset();
            }
        });

        jFrame.add(btnReset);

        dr = new Draw();
        dr.setBounds(0,0,800, 600);
        dr.setVisible(true);
        jFrame.add(dr);

        jFrame.setVisible(true);

    }
}
