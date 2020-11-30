// Make a Square
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception{
        int testCases;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        testCases=Integer.parseInt(in.readLine());
        while(testCases-->0) {
            int noOfVectors=Integer.parseInt(in.readLine());
            boolean lXComp=false,lYComp=false;
            for(int i=0;i<noOfVectors;i++){
                String s=in.readLine();
                int xComp=Integer.parseInt(s.substring(0,s.indexOf(" ")));
                int yComp=Integer.parseInt(s.substring(s.indexOf(" ")+1));
                if(xComp-yComp>=0){
                    lXComp=true;
                }
                else{
                    lYComp=true;
                }
            }
            if (lXComp&&lYComp){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}