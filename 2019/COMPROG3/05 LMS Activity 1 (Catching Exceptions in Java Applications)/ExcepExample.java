import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepExample {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        a = sc.nextInt();
        System.out.println("Enter Number Again");
        b = sc.nextInt();
        try {
            if(a>b){
                System.out.println(a+" is Bigger than "+ b);
            }
            else {
                System.out.println(b+" is Bigger than "+ a);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("Try Again, Thank you!");
        }
    }
    
}
