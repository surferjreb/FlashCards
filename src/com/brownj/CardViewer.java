package com.brownj;

import javax.swing.*;

public class CardViewer extends JFrame {
    private final String TITLE = "Flash Math";
    private final int WIDTH = 200;
    private final int HEIGHT = 300;

    public CardViewer(){
        super();
        setTitle(TITLE);
        setSize(WIDTH,HEIGHT);
        //setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void runViewCard(){
        setVisible(true);
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
