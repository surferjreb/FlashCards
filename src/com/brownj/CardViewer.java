package com.brownj;

import javax.swing.*;
import java.awt.*;

public class CardViewer {
    private final String TITLE = "Flash Math";
    private final int WIDTH = 200;
    private final int HEIGHT = 300;
    private JFrame myFrame;
    private JLabel cardCount, mathProblem;

    private FlashCard myCard;

    public CardViewer(FlashCard myCard){
        myFrame = new JFrame(TITLE);
        this.myCard = myCard;
    }

    public void runViewCard(){
        setCardElements();
        myFrame.setVisible(true);
    }

    private void setCardElements(){
        //this is temp
        cardCount = new JLabel(myCard.getCount());
        mathProblem = new JLabel("3 + 5");
        JButton nextButton = new JButton("Next");

        myFrame.setSize(WIDTH,HEIGHT);

        myFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10));
        //setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(cardCount);
        myFrame.add(mathProblem);
        myFrame.add(nextButton);

    }
//    JFrame frame = new JFrame("Will this Work?");
//    final JTextField text = new JTextField();
//    final JLabel label1;
//
//    label1 = new JLabel("Some text here..");
//    JButton butt = new JButton("Click");
//        label1.setBounds(50, 25, 100, 30);
//        butt.setBounds(width/4,100,100, 40);
//        text.setBounds(50,50, 100, 40);
//
//        butt.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            text.setText("It Works!!");
//        }
//    });
//        frame.add(label1);
//        frame.add(text);
//        frame.add(butt);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frame.setSize(width,height);
//        frame.setLayout(null);
//        frame.setVisible(true);
}
