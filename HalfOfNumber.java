// Read a number. Do half of number after last odd digit. Input 3 times. 
import java.util.*; 
import java.lang.*;
class HalfOfNumber {
    public static void main (String[] args)  { 
        int n, y=0, z=0, count=0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        while(n>0){
            y=n%10;
            if(n%2!=0){
                break;
            }
            n = n/10;
            z=(int)(z+y*Math.pow(10,count));
            count++;
        }
        z=z/2;
        n=(int)(n*Math.pow(10,count));
        n=(n+z)*3;
        System.out.println(n);
    }
}