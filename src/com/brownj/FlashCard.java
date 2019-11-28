package com.brownj;

public class FlashCard {
    private int cardCount;
    private String operator;
    private int digitCount;

    FlashCard(){
        cardCount = 5;
    }

    String getCount(){
        //String temp;

        return String.valueOf(cardCount);
    }

}
