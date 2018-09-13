/**
 * 07 LMS - Main class, this is the entire activity of 07LMS Prog #1
 * Please run this only and check my function(method) code
 * My Java Project made in NetBeans IDE 8.2
 * @author Patrick Renz, Garcia B.
 * Instructor: Sir, Mark Escalante
 */
public class MyMainClass {
    // Run THE OUTPUT here in Main Class 
    public static void main(String[] args) {
        // Output of my Method/Class Encapsulation
        Encapsulation exe;
        exe = new Encapsulation();
        exe.Company(0x0); // Hexadecimal Constant value 0x0 !!
        exe.actual();
        
        // Output of my Method/Class Inheritance(subclass) and Dog(superclass)
        Dog cute;
        cute = new Dog();
        cute.Info();
        
        // Output of my Method/Class Absxmpl,ImplementingClass,SecondImplementingClass, AbstractMethod(), ImplementedMethod(), finalMethod() and Rewrite() to print output
        Rewrite abstracted;
        abstracted = new Rewrite();
        abstracted.Rewrite();
        
        //
        Human polymorph; // print this as a Human() output and no Overriding !!
        polymorph = new Human();
        polymorph.Human();
        
        Human override; // print Human() is now @Override here with Method/CLass Voice
        override = new Voice();
        override.Human();
        //
    }
    
}
// Thankyou for checking