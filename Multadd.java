public class Multadd {
    public static void main(String[] args) {
        // Step 3: Test multadd with simple parameters
        System.out.println("Testing multadd(1.0, 2.0, 3.0): " + multadd(1.0, 2.0, 3.0));

        // Step 4a: Use multadd to compute sin(π/4) + cos(π/4)/2
        double trigResult = multadd(Math.sin(Math.PI/4), 1.0, Math.cos(Math.PI/4)/2.0);
        System.out.println("sin(π/4) + cos(π/4)/2 = " + trigResult);

        // Step 4b: Use multadd to compute log(10) + log(20)
        double logResult = multadd(Math.log(10), 1.0, Math.log(20));
        System.out.println("log(10) + log(20) = " + logResult);

        // Step 5: Test expSum method
        System.out.println("expSum(1.0) = " + expSum(1.0));
        System.out.println("expSum(25.0) = " + expSum(25.0));
    }

    // Step 2: Write multadd method that returns a * b + c
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // Step 5: Write expSum method that calculates xe^(-x) + sqrt(1 - e^(-x))
    public static double expSum(double x) {
        double eToMinusX = Math.exp(-x);
        double firstTerm = x * eToMinusX;
        double secondTerm = Math.sqrt(1 - eToMinusX);  // or Math.pow((1 - eToMinusX), 0.5)

        return multadd(firstTerm, 1.0, secondTerm);
    }
}