import java.util.Scanner;

public class Multadd {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        final double PI = 3.14;
        System.out.println("Testing multadd( 1.0 , 2.0, 3.0): "
                + multadd(1.0, 2.0, 3.0));

        System.out.println("Evaluating sin(pi/4) + (cos(pi/4))/2: " +
                multadd( Math.sin(PI/4), 1.0, (Math.cos(PI/4))/2.0 ) );

        System.out.println("Evaluating log10 + log20: " +
                multadd( Math.log10(10), 1.0, Math.log10(20) ) );

        System.out.print("What value will x be? ");
        double valueOfX = in.nextDouble();

        System.out.println("Evaluating (xe^-x) + (1-e^-x)^(1/2): " +
                expSum(valueOfX));
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double eToMinusX = Math.exp(-x);
        double firstTerm = x * eToMinusX;
        double secondTerm = Math.pow((1 - eToMinusX) , (1.0/2.0) );

        return multadd(firstTerm, 1.0, secondTerm);
    }
}
