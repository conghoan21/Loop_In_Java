import java.util.Scanner;
public class loopwhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int expectedAnswer = input.nextInt();
        while (number1+number2!=expectedAnswer){
            System.out.println("Wrong Answer");
            expectedAnswer=input.nextInt();
        }
        System.out.println("You got it");
    }
}
