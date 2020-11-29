/* WAP TO IMPLEMENT ARRAY OF OBJECTS */
import java.util.*;
public class ArrayObject{
    public static void main(String args[]){
        Account obj[] = new Account[2] ;
        obj[0] = new Account();
        obj[1] = new Account();
        obj[1].setData(3,4);
        obj[0].setData(1,2);
        System.out.println("For Array Element 0");
        obj[0].showData();
        System.out.println("For Array Element 1");
        obj[1].showData();
     }
}
class Account{
    int a,b;
    public void setData(int c,int d){
        a=c;
        b=d;
    }
    public void showData(){
        System.out.println("Value of a ="+a);
        System.out.println("Value of b ="+b);
    }
}