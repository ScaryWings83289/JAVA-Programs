/* WAP TO SWAP TWO NUMBER WITHOUT USING TEMPORARY VARIABLE */
import java.util.*;
public class Swapping {
    public static void main(String args[]){
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First number: ");
        a = s.nextInt();
        System.out.print("Enter Second number: ");
        b = s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Changed value of a: " + a);
        System.out.println("Changed value of b: " + b);
    }
}