package com.brownj;

public class InputChecker {

    //InputChecker(){}//constructor

    boolean checkValues(int cardCount, String operator, int digitCount){
        if(digitCount > 0){
            if(checkOperatorValue(operator))
            {
                if(checkDigitCount(digitCount, operator)){
                    return true;
                }

            }
        }
        else if(checkCardCount(cardCount)){
            if(checkOperatorValue(operator)) {
                return true;
            }
        }


        return false;
    }

    private boolean checkOperatorValue(String operator){

        if(operator.equals("add") || operator.equals("subtract") || operator.equals("multiply")
                || operator.equals("divide"))
            return true;

        return false;
    }

    private boolean checkDigitCount(int digitCount, String operator){

        if(operator.equals("add")){
            return true;
        }

        return false;
    }

    private boolean checkCardCount(int cardCount){
        if(cardCount > 0)
            return true;

        return false;
    }

    public void displayUsage(){
        System.out.println();
        System.out.println("Usage: java FlashCardDriver <#cards> <operator> <#digits>");
        System.out.println();
        System.out.print("\t<#card>    : The number of flash cards to be shown in\n"+
                "\t\t\t\t succession on the screen from 1 to n.\n");
        System.out.print("\t<operator> : The math operator to be practiced.  Choices are\n"+
                "\t\t\t\t \"add\", \"subtract\", \"multiply\", \"divide\"/\n");
        System.out.print("\t<#digits>  : The number of digits in each of the two\n" +
                "\t\t\t\t operands.  This only applies to the \"add\"\n" +
                "\t\t\t\t operator.  All other operators use numbers from 1\n"+
                "\t\t\t\t to 12 by default.");
    }
}//end class
