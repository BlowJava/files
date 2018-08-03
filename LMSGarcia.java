public class LMSGarcia {
    public static void main(String[] args) {
        int x = 0;
        int y = 21;
        int z = 0;
        
        if (x>y) {
            System.out.println("Lets count start from 1 to 20");
            do {
                x++;
                z = x;
                System.out.print(z );
            } while (z<y);  
        }
        else {
            System.out.println("Lets count Backward start from 20 to 1");
            do {
                y--;
                z = y;
                System.out.println(y);
            } while (z>1) ;
                
        }
    }    
}