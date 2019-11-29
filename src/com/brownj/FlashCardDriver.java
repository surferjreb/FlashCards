package com.brownj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlashCardDriver {

    public static void main(String[] args) {
        //int cardCount = Integer.parseInt(args[0]);

        //For testing purpose in IDE
        String cardCount = "5";
        //String operator = args[1];
        String operator = "add";
        //int digitCount = Integer.parseInt(args[2]);
        String digitCount = "3";
        //test case
        args = new String[3];
        args[0] = cardCount;
        args[1] = operator;
        args[2] = digitCount;


        InputChecker myCheck = new InputChecker();
        Controller myController = new Controller();

        try {
            if(myCheck.checkValues(args)) {
                myController.runController(myCheck);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//end main

}//end class
