
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CardViewer extends JFrame implements ActionListener{


    private final int WIDTH = 200;
    private final int HEIGHT = 300;
    private JFrame myFrame;
    private JLabel cardCount, answer, mathProblem, result, finalAnswer;
    private JTextField userAnswer;
    private JButton nextButton;

    private int cardMaxIndex;
    private int cardIndex;
    private int displayIndex;
    private int userCorrectIndex;

    private ArrayList<FlashCard> myCards;


    CardViewer(ArrayList<FlashCard> myCards){
        super("Flash Math");
        this.myCards = myCards;
        this.cardMaxIndex = myCards.size();
        this.cardIndex = 0;
        this.displayIndex = 1;
    }

    void runViewCard(){

            setCardElements();
            setVisible(true);

    }

    private void setCardElements(){

            cardCount = new JLabel(displayIndex + " of " + cardMaxIndex);
            mathProblem = new JLabel(myCards.get(cardIndex).getMathProblem());
            answer = new JLabel("Answer: ");
            result = new JLabel();
            result.setVisible(false);
            finalAnswer = new JLabel();
            finalAnswer.setVisible(false);
            userAnswer = new JTextField(10);
            nextButton = new JButton("Next");

            setSize(WIDTH, HEIGHT);

            userAnswer.addActionListener(this);
            userAnswer.setToolTipText("Hit enter to answer");
            nextButton.addActionListener(this);

            setLayout(new FlowLayout(FlowLayout.CENTER, 100, 15));
            //setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(cardCount);
            add(mathProblem);
            add(answer);
            add(finalAnswer);
            add(userAnswer);
            add(result);
            add(nextButton);

    }

    private void showResultCard(){
        cardCount.setVisible(false);
        mathProblem.setVisible(false);
        answer.setText("You answered: ");
        finalAnswer.setText(userCorrectIndex + " out of " + cardMaxIndex);
        result.setText("Correctly");
        finalAnswer.setVisible(true);
        userAnswer.setVisible(false);
        
        nextButton.setVisible(false);
    }

    private boolean checkAnswer(String answer){

        if(answer.equals(myCards.get(cardIndex).getResult())) {
            userCorrectIndex++;
            return true;
        }

        return false;

    }

    private void runCheckAnswer(String answer){

        if(checkAnswer(answer)){
            result.setText("CORRECT");
            result.setVisible(true);
        }
        else{
            result.setText("WRONG");
            result.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();


        if(action.equals("Next")){
            cardIndex++;
            if(cardIndex < cardMaxIndex) {
                displayIndex++;

                cardCount.setText(displayIndex + " of " + cardMaxIndex);
                mathProblem.setText(myCards.get(cardIndex).getMathProblem());
                userAnswer.setText(" ");
                result.setText(" ");
                result.setVisible(false);
            }
            else{
                showResultCard();
            }

        }
        else{

            runCheckAnswer(e.getActionCommand().strip());

        }
    }
//    JFrame frame = new JFrame("Will this Work?");
//    final JTextField text = new JTextField();
//    final JLabel label1;
//
//    label1 = new JLabel("Some text here..");
//    JButton butt = new JButton("Click");
//        label1.setBounds(50, 25, 100, 30);
//        butt.setBounds(width/4,100,100, 40);
//        text.setBounds(50,50, 100, 40);
//
//        butt.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            text.setText("It Works!!");
//        }
//    });
//        frame.add(label1);
//        frame.add(text);
//        frame.add(butt);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frame.setSize(width,height);
//        frame.setLayout(null);
//        frame.setVisible(true);
}
