package com.brownj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlashCardDriver {

    public static void main(String[] args) {
        //int cardCount = Integer.parseInt(args[0]);
        int cardCount = 5;
        //String operator = args[1];
        String operator = "add";
        //int digitCount = Integer.parseInt(args[2]);
        int digitCount = 5;

        try {

            Controller myController = new Controller();

            myController.runController(cardCount, operator, digitCount);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
