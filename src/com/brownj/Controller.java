package com.brownj;

import java.util.ArrayList;

class Controller {

    private FlashCard myCard;
    private CardViewer myView;
    private InputChecker checker;

    private int cardCount;
    private String operator;
    private int digitCount;

    private ArrayList<FlashCard> myFlashCards;

    Controller(){
        myFlashCards = new ArrayList<FlashCard>();
    }

    void runController(InputChecker myInput){
    
              generateFlashCard(myInput);
     
    }//end runController

    private void generateFlashCard(InputChecker myInput){
        this.cardCount = myInput.getCardCount();
        this.operator = myInput.getOperator();
        this.digitCount = myInput.getDigitCount();


        for(int i = 0; i < cardCount; i++){
            myCard = new FlashCard(operator, digitCount);
            myCard.runFlashCards();
            myFlashCards.add(myCard);
        }

        presentFlashCards();
    }

    private void presentFlashCards(){
            myView = new CardViewer(myFlashCards);
            myView.runViewCard();
    }
}//end class
