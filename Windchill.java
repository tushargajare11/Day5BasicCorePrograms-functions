package FunctionalDay5;

public class Windchill {
    public static void main(String[] args) {



        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double windChill;

        if (t< -58 ||t > 50) {

            System.out.println ("The temperature you entered is invalid.");

        }
        if (v > 120  &&  v<3) {

            System.out.println ("The wind speed you entered is invalid.");
        }

        else {

            windChill = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);



            System.out.print("The wind chill index is " + windChill);

        }

    }

}
