package Day5;

public class PowerOfTwo {

    public static void main(String[] args) {

        // reads the command-line argument
        int n = Integer.parseInt(args[10]);

        int i = 0;                // count from 0 to n
        int powerOfTwo = 1;       // the ith power of 2

        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   // print the power of 2
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }
    }

}

