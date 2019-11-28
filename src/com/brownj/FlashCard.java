package com.brownj;

import java.util.Random;

public class FlashCard {
    private int cardCount;
    private String operator;
    private int digitCount;
    private Random rand;

    FlashCard(){
        cardCount = 5;
    }

    String getCount(){
        //String temp;

        return String.valueOf(cardCount);
    }

    public void operatorSelector(String operator){
        //Used to select which operation

        switch(operator){
            case "add":
                        addvalues();
                        break;
            case "subtract":
                        subtractValues();
                        break;
            case "multiply":
                        multiplyValues();
                        break;
            case "divide":
                        divideValues();
                        break;
        }//end switch
    }//end choose operator

    private void addvalues(){}

    private void subtractValues(){}

    private void multiplyValues(){}

    private void divideValues(){}

    private int additionNumberLengthGenerator(int digitCount){
        int temp = 0;
        StringBuilder additionMax = new StringBuilder();
        String number = " ";

        for(int i = 0; i < digitCount; i++){
            additionMax.append(9);
        }

        number = additionMax.toString();
        temp = Integer.parseInt(number);

        return temp;
    }
}//end class
