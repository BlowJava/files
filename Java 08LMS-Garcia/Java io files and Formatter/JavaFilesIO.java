import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class JavaFilesIO {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter("C:\\Users\\sound\\Desktop\\hello.txt");
            // Location only works in My PC try to change it to yours
                f.format("%s %s %s", "Hello", "World", "Happy \r\n");
                f.format("%s %s %s", "Thankyou", "For Listening", "Me");
                f.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        try {
            File x = new File("C:\\Users\\sound\\Desktop\\hello.txt");
            // Location only works in My PC try to change it to yours
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Sorry File not Found!");
        }
    }
    
}
