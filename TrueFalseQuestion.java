import java.util.Arrays;
import javax.swing.*;

public class TrueFalseQuestion extends Question{
    String answer;

    TrueFalseQuestion(String question, String answer){
        super(question);

        JPanel buttons = new JPanel();

        addButton(buttons, "TRUE");
        addButton(buttons, "FALSE");

        this.question.add(buttons);

        initQuestionDialog();

        if(isValid(answer)){
            this.correctAnswer = answer;
        }else{
            try{
                throw new Exception("Correct Answer has to be in valid format. Please enter TRUE or False");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.toString());
            }
        }
    }


    void addButton(JPanel buttons,String label){
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }

    boolean isValid(String answer){
        String[] optionsFalse = { "f", "false", "False", "FALSE", "n", "no", "No", "NO"};
        String[] optionsTrue = { "t", "true","T", "True", "TRUE", "y", "yes", "Y", "Yes", "YES"};
        
        if(Arrays.asList(optionsTrue).contains(answer)){
            answer ="TRUE";
            return true;
        }else if(Arrays.asList(optionsFalse).contains(answer)){
            answer ="FALSE";
            return true;
        }

        return false;
    }
}
