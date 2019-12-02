package com.brownj;

public class FlashCardDriver {

    public static void main(String[] args) {

        InputChecker myCheck = new InputChecker();
        Controller myController = new Controller();

        try {
            if(myCheck.checkValues(args)) {
                myController.runController(myCheck);
            }
        }
        catch(Exception e){
            myCheck.displayUsage();
        }
    }//end main

}//end class
