import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class TheCollections {
    public static void main(String[] args) {
        ArrayList<String> Hero = new ArrayList();
            Hero.add("Aldous");
            Hero.add("Lunox");
            Hero.add("Gatotkaca");
            Hero.add("Martis");
            Hero.add("Grock");
            Hero.remove("Aldous");
        
            System.out.println(Hero);
            // Outputs "[Lunox, Gatotkaca, Martis, Grock]"
        //
        //
        LinkedList<String> Pos = new LinkedList();
            Pos.add("width: 150px;");
            Pos.add("height: 150px;");
            Pos.add("background-color: blue;");
            Pos.add("border: 3px solid orange;");
            Pos.remove("border: 3px solid orange;");
        
            System.out.println(Pos);
            // Outputs "[width: 150px;, height: 150px;, background-color: blue;]"
        //
        //
        HashMap<String, Integer> IQ = new HashMap<String, Integer>();
            // IQ RESULT 
            String res = "Result: ";
                IQ.put("Patrick", 169); // The Guide Guy
                IQ.put("Erick", 169); // Simple Goodboy
                IQ.put("Jhebrix", 169); // The Active Genius, Burger
                IQ.put("Treizer", 255); // The Philosopher
                IQ.put("Leonardo", 165); // The Nood likod Guy
                IQ.put("Jeremy", 199); // The Sir of "ICT-104"
                IQ.put("Frince", 165); // The Manok, The Frince Balls
                IQ.put("Derick", 199); // The Thermos Guy and Taba ng Baboy
                IQ.put("Red", 267); // The Silent, Mysterious Guy ??
                    // Insert the Others 
                System.out.println(IQ.get("Patrick"));
                System.out.println(IQ.get("Erick"));
                System.out.println(IQ.get("Jhebrix"));
            //
            //
            HashSet<String> set = new HashSet<String>();
                set.add("Hello");
                set.add("Java");
                set.add("Hello");
                
                System.out.println(set);
                // Outputs [Java, Hello]
            //
            //
                LinkedList<String> animal = new LinkedList<String>();
                    animal.add("fox");
                    animal.add("cat");
                    animal.add("dog");
                    animal.add("rabbit");
                Iterator<String> bas = animal.iterator();
                    String value = bas.next();
                    System.out.println(value);
                    // Outputs "fox"
    }
    
}
