

import java.util.InputMismatchException;

class InputChecker {

    private int cardCount;
    private String operator;
    private int digitCount;

    private final int DEFAULT = 12;

    private enum OPERATOR {ADD, SUBTRACT, MULTIPLY, DIVIDE}

    //InputChecker(){}//constructor

    boolean checkValues(String[] args){
        if(args != null) {

            switch(args.length){
                case 2:
                        setValues(args);
                        return true;
                case 3:
                        setAdditionValues(args);
                        return true;
                default:
                        displayUsage();
                        return false;
            }
        }

        return false;
    }

    private void setValues(String[] args){
        try {
            this.cardCount = checkCardCount(args[0]);
            this.operator = checkOperator(args[1]);
            this.digitCount = DEFAULT;
        }
        catch(InputMismatchException e){
            
            throw new InputMismatchException();
        }
    }

    private void setAdditionValues(String[] args){
        try {
            this.cardCount = checkCardCount(args[0]);
            this.operator = checkOperator(args[1]);
            this.digitCount = checkDigitNumber(args[2]);
        }
        catch(InputMismatchException b){
            
            throw new InputMismatchException();
        }

    }

    private int checkCardCount(String number){
        int temp;

        try{
            temp = Integer.parseInt(number);
            return temp;
        }
        catch(NumberFormatException e){
            throw new InputMismatchException();
        }

    }

    private String checkOperator(String operator) throws InputMismatchException{
        String temp = operator.toUpperCase();

            for (OPERATOR value : OPERATOR.values()) {

                if(temp.equals(String.valueOf(value)))
                    return temp;

            }//end for

        throw new InputMismatchException();

    }

    private int checkDigitNumber(String number){
        int temp;

        try{
            temp = Integer.parseInt(number);
            return temp;
        }
        catch(NumberFormatException e){
            throw new InputMismatchException();
        }

    }
//-----------------------------------------
    int getCardCount() {
        return cardCount;
    }
//-----------------------------------------
    String getOperator() {
        return operator;
    }
//-----------------------------------------
    int getDigitCount() {
        return digitCount;
    }
//-----------------------------------------

    public void displayUsage(){
        System.out.println();
        System.out.println("Usage: java FlashCardDriver <#cards> <operator> <#digits>");
        System.out.println();
        System.out.print("\t<#card>    : The number of flash cards to be shown in\n"+
                "\t\t\t\t succession on the screen from 1 to n.\n");
        System.out.println();
        System.out.print("\t<operator> : The math operator to be practiced.  Choices are\n"+
                "\t\t\t\t \"add\", \"subtract\", \"multiply\", \"divide\"/\n");
        System.out.println();
        System.out.print("\t<#digits>  : The number of digits in each of the two\n" +
                "\t\t\t\t operands.  This only applies to the \"add\"\n" +
                "\t\t\t\t operator.  All other operators use numbers from 1\n"+
                "\t\t\t\t to 12 by default.");
    }
}//end class
