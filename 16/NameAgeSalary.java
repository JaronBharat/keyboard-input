import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        double salary;
        
        System.out.print("What is your name? ");
        name = keyboard.next();
        
        System.out.print("Hello, " + name + " How old are you? ");
        age = keyboard.nextInt();
        
        System.out.print(age + "! You're so old! How much do you make " + name + "? ");
        salary = keyboard.nextDouble();
        
        System.out.println(salary + "! Wow that is a lot of money!");
        }
}
