
public class Quiz{
    public static void main(String[] args){
       
        Question multi1 = new MultipleChoiceQuestion(
            "What is the meaning of life?",
            "a",
            "42",
            "23",
            "Reading Hitchhiker's Guide to the Galaxy",
            "A Towel",
            "Ford Prefect"
        );
        
        Question multi2 = new MultipleChoiceQuestion(
            "What type of potato is best suited to make fries?", 
            "b", 
            "Laura potato",
            "Russet burbank",
            "Vitelotte",
            "Yukon Gold Potato",
            "King Edward Potato"
        );

        Question multi3 = new MultipleChoiceQuestion(
            "How many records do you need to sell to win a Golden Record?", 
            "e",
            "10",
            "2,340",
            "20,000",
            "696,969",
            "500,00"
        );

        Question multi4 = new MultipleChoiceQuestion(
            "What kind of lamp is best", 
            "a", 
            "Desk Lamps", 
            "Living Room Lamps", 
            "No lamps", 
            "Eco Friendly Lamps", 
            "Torches"
        );

        Question multi5 = new MultipleChoiceQuestion(
            "Whats is the right answer?", 
            "d", 
            "Not this one.", 
            "Keep going!", 
            "Answer smells close.", 
            "Right here. This is it", 
            "Nope. You went too far."
        );

        Question tof1 = new TrueFalseQuestion(
            "Sora from Kingdom Hearts is in Smash!", 
            "TRUE"
        );

        Question tof2 = new TrueFalseQuestion(
            "The earth has an inclination of 22 degrees", 
            "FALSE"
        );

        Question tof3 = new TrueFalseQuestion(
            "All music is great. As long as you really like it.", 
            "TRUE"
        );

        Question tof4 = new TrueFalseQuestion(
            "True color blue is incredibly rare in nature.", 
            "TRUE"
        );

        Question tof5 = new TrueFalseQuestion(
            "The sky is actually purple.", 
            "FALSE"
        );


        multi1.check();
        multi2.check();
        multi3.check();
        multi4.check();
        multi5.check();

        tof1.check();
        tof2.check();
        tof3.check();
        tof4.check();
        tof5.check();
        
        MultipleChoiceQuestion.showResults();
    }
}