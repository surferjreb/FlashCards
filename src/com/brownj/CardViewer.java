package com.brownj;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CardViewer {
    private final String TITLE = "Flash Math";
    private final int WIDTH = 200;
    private final int HEIGHT = 300;
    private JFrame myFrame;
    private JLabel cardCount, mathProblem;
    private int index;

    private ArrayList<FlashCard> myCards;

    CardViewer(ArrayList<FlashCard> myCards){
        myFrame = new JFrame(TITLE);
        this.myCards = myCards;
        this.index = 0;
    }

    public void runViewCard(){
        int cardIndex = setCardElements();
        myFrame.setVisible(true);
    }

    private int setCardElements(){
        //this is temp

            index = Integer.parseInt(myCards.get(index).getCardNumber()) + 1;

            cardCount = new JLabel(index + " of " + myCards.size());
            mathProblem = new JLabel(myCards.get(index - 1).getMathProblem());

            JButton nextButton = new JButton("Next");

            myFrame.setSize(WIDTH, HEIGHT);

            myFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10));
            //setVisible(true);
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.add(cardCount);
            myFrame.add(mathProblem);
            myFrame.add(nextButton);

            return index;
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
