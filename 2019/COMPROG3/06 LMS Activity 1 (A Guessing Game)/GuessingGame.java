import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[]args){
        int a;
        a = (int) (Math.random()*49 +1);
        Scanner key = new Scanner(System.in);
        int b;
        int count = 0;
        System.out.println("Guess a number from 1 to 50");
        try {
            do {
                b = key.nextInt();
                if(b<=50){
                    if(b == a)
                        System.out.println("Your guess is correct. Congratulations!");
                    else if (b < a)
                        System.out.println("Too Low. Try again");
                    else if (b > a)
                        System.out.println("Too High. Try again");
                    count++;
                } else {
                    System.out.println("Out of range");
                }
            }
            while(b != a);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("You got it in "+ count +" attempt(s)");
        }
    }
}
