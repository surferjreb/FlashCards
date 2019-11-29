package com.brownj;

import java.util.Random;

public class FlashCard {
    private static enum OPERATOR {ADD, SUBTRACT, MULTIPLY, DIVIDE};
    private final int MAXSEED = 12;
    private int result;
    private int cardNumber;
    private String operator;
    private int digitCount;
    private Random rand;
    private int num1;
    private int num2;
    private String mathProblem;

    FlashCard(int cardNumber, String operator, int digitCount){
        this.cardNumber = cardNumber;
        this.operator = operator;
        this.digitCount = digitCount;
        rand = new Random();
    }
//----------------------------------------------------------------

    String getCardNumber(){

        return String.valueOf(cardNumber);
    }
//----------------------------------------------------------------
    String getOperator(){

        switch(operator){
            case "ADD" :
                        return "+";
            case "SUBTRACT":
                        return "-";
            case "multiply":
                        return "x";
            case "divide":
                        return "/";

        }//end switch

        return null;
    }
//----------------------------------------------------------------
    private String getNum1() {
        return String.valueOf(num1);
    }

    private String getNum2() {
        return String.valueOf(num2);
    }

    private void setNum1(int num1) {
        this.num1 = num1;
    }

    private void setNum2(int num2) {
        this.num2 = num2;
    }
//------------------------------------------------------------------
    private void setResult(int result) {
        this.result = result;
    }

    int getResult(){
        return result;
    }

//------------------------------------------------------------------
    private void setMathProblem(int seed){
        setNum1(rand.nextInt(seed));
        setNum2(rand.nextInt(seed));

        if(operator.equals("DIVIDE")) {
            if(num2 > num1) {
                mathProblem = getNum2() + " " + getOperator() + " " + getNum1();
            }
            else{
                mathProblem = getNum1() + " " + getOperator() + " " + getNum2();
            }
        }
        else{
            mathProblem = getNum1() + " " + getOperator() + " " + getNum2();
        }

    }

    public String getMathProblem(){
        return mathProblem;
    }

    //--------------------------------------------------------------
    void runFlashCards(){
        //Used to select which operation

        switch(operator){
            case "ADD" :
                        startAdditionCard();
                        break;
            case "SUBTRACT":
                        startSubtractCard();
                        break;
            case "multiply":
                        startMultiplyCard();
                        break;
            case "divide":
                        startDivideCard();
                        break;
        }//end switch

    }//end choose operator

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
//------------------------------------------------------------------
    private void startAdditionCard(){

        int numLength = additionNumberLengthGenerator(digitCount);
        setMathProblem(numLength);

            setResult(addValues(num1, num2));

    }

    private void startSubtractCard(){

            setMathProblem(MAXSEED);

            setResult(subtractValues(num1, num2));

    }

    private void startMultiplyCard(){

            setMathProblem(MAXSEED);

            setResult(multiplyValues(num1, num2));

    }

    private void startDivideCard(){

        setMathProblem(MAXSEED);

        if(num1 > 0 && num2 > 0 ) {

            setResult(divideValues(num1, num2));

        }
        else{
            startDivideCard();
        }

    }
//--------------------------------------------------------
    private int addValues(int num1, int num2){
        int sum = 0;

        sum = num1 + num2;

        return sum;
    }

    private int subtractValues(int num1, int num2){
        int minuend = 0;

        if(num2 > num1){
            minuend = num2 - num1;
        }
        else {
            minuend = num1 - num2;
        }
        return minuend;

    }

    private int multiplyValues(int num1, int num2){
        int product = 0;

        product = num1 * num2;

        return product;
    }

    private int divideValues(int num1, int num2){
        int quotient = 0;

        if(num1 !=0 && num2 !=0) {
            if (num2 > num1) {
                quotient = num2 / num1;
            } else {
                quotient = num1 / num2;
            }

            return quotient;
        }

        return quotient;
    }
}//end class