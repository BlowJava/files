public class ArraySample {
    public static void main(String[] args){
        System.out.println("Counting the array index using for loop and increment");
        //the Array index for loops
        int[] Mycount = new int[11];
        int Mycounter = 0;
        for (int i = 1;i<Mycount.length;i++){
            Mycount[i] = i;
            System.out.println(Mycount[i]);
        } 
            System.out.println (" "); // TO BREAK THE LINE
        System.out.println("int: in basic for loops");
        int[] count = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String arr[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        for (int t: count) {
            System.out.println (t); // For loops
        }
            System.out.println (" "); // TO BREAK THE LINE
            System.out.println("String: in basic for loops");
        for (String a: arr) { // For loops
            System.out.println(a);
        }
        
    }      
}


