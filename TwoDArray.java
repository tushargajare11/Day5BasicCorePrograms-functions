package FunctionalDay5;
import java.util.Scanner;


public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int a= sc.nextInt();
        System.out.println("enter the number of columns");
        int b=sc.nextInt();
        int arr[][]  = new int[a][b];          //declare an array

        for (int i = 0; i < a; i++) {          //Reading input from user
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] i : arr) {                   //printing array elements
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(); // new line
        }


    }
}
