import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        String firstWord;
        String secondWord;
        int firstNum;
        int secondNum;
        
        System.out.print("Give me a word! ");
        firstWord = keyboard.next();
        
        System.out.print("Give me another word! ");
        secondWord = keyboard.next();
        
        System.out.print("Now give me your favourite number! ");
        firstNum = keyboard.nextInt();
        
        System.out.print("Give me another number! ");
        secondNum = keyboard.nextInt();
        
        System.out.println("That was fun!");
        }
}
