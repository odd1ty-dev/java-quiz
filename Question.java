import java.awt.*;
import javax.swing.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect= 0;
    QuestionDialog question;
    String correctAnswer;


    Question(String question){
        this.question = new QuestionDialog ();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel("    "+question+"     ",JLabel.CENTER));
    }
    
    void initQuestionDialog(){
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }
    
    String ask(){

        question.setVisible(true);
        return question.answer;
    }
    
    void check(){
        String answer = ask();
        nQuestions++;
        if(answer.equals(correctAnswer)){
            nCorrect++;
        }

        JOptionPane.showMessageDialog(null, answer.equals(correctAnswer) ?  
            "Correct!"
            : 
            "Incorrect. The answer is: " + correctAnswer
        );
    }

    static void showResults(){
        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions.");
        
    }
}
