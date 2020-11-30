// Philosophical Excursions
import acm.program.*;
public class Hailstone extends ConsoleProgram {
    public void run() {
        int n=readInt("Enter a positive Integer: ");
        if (n==0)
            println("0 entered Program Quits");
        else
            hailStone(n);
    }
    private void hailStone(int n){
        int total=0;
        String flag="";
        int newn=0;
        while (n!=1){
            boolean even=evenOrOdd(n);
            if (even) {
                newn=n/2;
                flag="even, so I take half: ";
            }
            else{
                newn=(3*n)+1;
                flag="odd, so I make 3n+1: ";
            }
            println(n+" is "+ flag+newn);
            total++;
            n=newn;
        }
        println("The process took "+ total + " to reach 1" );
    }
    private boolean evenOrOdd(int n){
        return (n%2==0);
    }
}