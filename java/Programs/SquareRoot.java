//  Babylonian Method (also known as Heron's Method) for calculating the square root of number

public class SquareRoot {
    public static void main(String[] args) {
        double x = 25;
        double new_x = x / 2;

        // Keep iterating until the guess is close enough
        while (Math.abs(Math.pow(new_x, 2) - x) > 0.00001) {
            new_x = (new_x + x / new_x) / 2;
        }

        System.out.printf("Square root of %.2f is approximately %.5f.\n", x, new_x);
    }
}
