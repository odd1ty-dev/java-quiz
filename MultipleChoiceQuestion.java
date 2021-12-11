import java.awt.*;
import javax.swing.*;

import java.util.Arrays;

public class MultipleChoiceQuestion extends Question{

    MultipleChoiceQuestion(String query, String answer,String a, String b, String c, String d, String e){
        super(query);
        addChoice("A", a);
        addChoice("B", b);
        addChoice("C", c);
        addChoice("D", d);  
        addChoice("E", e);
        initQuestionDialog();
        correctAnswer = answer.toUpperCase();
    }

    static void showResults(){
        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions.");
        
    }

    void addChoice(String name,String label){
        JPanel choice = new JPanel(new BorderLayout());
        JButton button = new JButton(name);

        button.addActionListener(question);
        choice.add(button,BorderLayout.WEST);
        choice.add(new JLabel(label+"   ",JLabel.LEFT),BorderLayout.CENTER);
        question.add(choice);
    }

    // String ask(){
    //     String[] options = {"A","B","C","D","E"};
    //     String answer;
    //     do{
    //         answer = JOptionPane.showInputDialog(question);
    //         answer = answer.toUpperCase();
            
    //     }while(!Arrays.asList(options).contains(answer));

    //     return answer;
    // }

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
}