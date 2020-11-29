/* WAP TO CHANGE CMS IN INCHES & FEET */
import java.util.*;
public class Conversion {
    public static void main(String args[]){
        double n,inches;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length in cms: ");
        n = s.nextFloat();
        inches = n/2.54;
        int foot = (int)inches/12;
        inches = inches%12;
        System.out.println("Value = " + foot + " feet " + " and " + String.format("%.2f",inches) + " inches");
    }
}