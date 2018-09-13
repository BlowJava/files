// Run Output in MyMainClass.java
class Encapsulation {
    private double Money = 500.25;
    private double Actual = 500.25;
    private double Profit = 100.96;
    public void actual() {
        System.out.println("Instead of original money "+ Actual);
        System.out.println(""); // For linebreak only!!
    }
    public void Company(double x) {
        if (Profit < Money) {
            Money += Profit;
            System.out.println("    "+"Example of Encapsulation");
            System.out.println("Your Money Amount with invest profit is: "+ Money);
        }
    }
}
// Thankyou for checking