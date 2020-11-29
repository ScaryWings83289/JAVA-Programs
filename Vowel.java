/* WAP TO FIND WHETHER A CHARACTER IS VOWEL OR NOT */
import java.util.*;
public class Vowel {
    public static void main(String args[]) {
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = s.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is not a vowel");
        }
    }
}