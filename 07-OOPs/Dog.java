// Run Output in MyMainClass.java
public class Dog extends Inheritance{ // superclass of Inheritance
    Dog(){
        DogName = "Browny";
        Color = "Brown";
        Fav = "Swim in pool";
        Legs = 4;
    }
    public void Info(){
        Dog x;
        x = new Dog();
        System.out.println("    "+ "Example of Inheritance");
        System.out.println("Hello, I have a Pet and he is a Dog");
        System.out.println("And His name is " + DogName);
        System.out.println("He is Color "+ Color);
        System.out.println("And He Like to play and "+ Fav);
        System.out.println("He had "+ Legs + " Legs");
    }
}
// Thankyou for checking