

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
