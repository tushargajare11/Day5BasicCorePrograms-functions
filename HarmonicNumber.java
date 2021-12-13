package Day5;
import java.io.*;
import java.util.Scanner;

public class HarmonicNumber {

    //harmonic number= Any of a series of numbers formed from the sum of the reciprocals of consecutive integers.

    // Java program to find N-th Harmonic Number

    // Function to find N-th Harmonic Number
    static double nthHarmonic(int N)
    {
        // H1 = 1
        float harmonic = 1;

        // loop to apply the formula
        // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
        for (int i = 2; i <= N; i++) {
            harmonic += (float)1 / i;
        }

        return harmonic;
    }

// Driver Code

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int N = sc.nextInt();

        System.out.print(nthHarmonic(N));

    }





}
