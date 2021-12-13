package Day5;
import java.util.Scanner;

public class FlipCoin {
    public static int Head=0;     //declaring variables
    public static int tail=0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of times you want to flip the coin");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            int flip=(int) Math.floor(Math.random()*10)%2;        //using random method to get number 0 and 1
            //System.out.println("number of times head "+flip);
            System.out.println(""+flip);
            if(flip==1)
            {
                Head++;
            }
            else
            {
                tail++;


            }

        }
        int percent=(Head*100)/10;             //calculating percentage
        int percent1=(tail*100)/10;

        System.out.println("number of times tails "+Head);
        System.out.println("number of times head "+tail);
        System.out.println("percentage of head is "+percent+"%");
        System.out.println("percentage of tail is "+percent1+"%");


    }

}
