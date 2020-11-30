import java.util.*;
public class Hail {
    public static void main(String[] args) {
        int i=0,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        while (n>1){
            if(n%2==0){
                c = n/2;
                i++;
                System.out.println(n+" is even, so I take half = "+c );
                n=c;
            }  
            else{
                c = (3*n)+1;
                i++;
                System.out.println(n+" is odd, so I make 3n+1 = "+c );
                n=c;
            }
        }
        System.out.println("The process took "+ i+ " steps to reach 1.");
    }
}