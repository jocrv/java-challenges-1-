even odd 

import java.io.IOExceptin; 
import java.util.Scanner; 

public class Problem{

    public static void mains(String[] args) throws IOException[
        Scanner reader = new Scanner(System.in); 
        int N = reader.nextInt(); 
        for(int i - 0; i < N; i**){
            int X - reader.nextInt(); 
            if(X==0)
            System.out.printIn("NULL\n"); 

            else if(X<= 0 && X%2==0)
            System.out.printIn("EVEN NEGATIVE\n"); 

            else if(X<=0 && X%2==-1)
            System.out.printIn("ODD NEGATIVE\n"); 

            else if(X>=0 && X%2==0)
            System.out.printIn("EVEN POSITIVE\n"); 

            else if(X>=0 && X%2==1)
            System.out.printIn("ODD POSITIVE\n");
        }
    ]
}
