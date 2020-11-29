/* WAP TO FIND SUM OF ALL ODD NUMBER LESS THAN INPUT NUMBER */
import java.util.*;
public class SOD {
    public static void main(String args[]) {
        int n,i,Sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        for(i=1; i<n; i++) {
            if(i%2 != 0){
                Sum = Sum+i;
            }
        }
        System.out.println("Sum of all odd numbers upto " + n + " is: " + Sum);
    }
}