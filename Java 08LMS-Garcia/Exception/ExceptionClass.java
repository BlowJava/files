public class ExceptionClass {
    public static void main(String[] args) {
        try {
            int num[] = new int[2];
            System.out.println(num[5]);
        }
        catch (Exception e) {
            System.out.println("Error !");
        }
        // Outputs "Error !"
    }
}
