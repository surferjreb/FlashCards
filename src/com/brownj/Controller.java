package com.brownj;

public class Controller {

    private FlashCard myCards;
    private CardViewer myView;
    private InputChecker checker;
    private int cardCount;
    private String operator;
    private int digitCount;


    Controller(){
        checker = new InputChecker();
    }

    void runController(int cardCount, String operator, int digitCount){
        this.cardCount = cardCount;
        this.operator = operator;
        this.digitCount = digitCount;
        boolean runIt;

        try {
            runIt = checker.checkValues(cardCount, operator, digitCount);
            if(runIt){
                myCards = new FlashCard();
                myView = new CardViewer(myCards);
                myView.runViewCard();
            }
            else{
                checker.displayUsage();
            }


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }//end runController

}//end class
