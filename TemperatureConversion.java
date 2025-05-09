import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args){
        System.out.println("<---------------Temperature Scale Conversions-------------->");
        System.out.println("1. Celsius to other");
        System.out.println("2. Fahrenheit to other");
        System.out.println("3. Kelvin to other");
        Scanner scan = new Scanner(System.in);
        System.out.print(">>> ");
        int option = scan.nextInt();
        switch (option) {
            case 1:
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Celsius to Kelvin");
                System.out.print(">>> ");
                int op = scan.nextInt();
                switch (op) {
                    case 1:
                        double celcius = scan.nextFloat();
                        double fahrenheit = celcius *(9/5) + 32;
                        System.out.printf("%f Celcius in Fahrenheit is %f.",celcius,fahrenheit);
                        break;
                    case 2:
                        fahrenheit = scan.nextFloat();
                        celcius = (5/9)*(fahrenheit - 32);
                        System.out.printf("%f Celcius in Fahrenheit is %f.",celcius,fahrenheit);
                        break;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }
                break;

            case 2:
                System.out.println("1. Fahrenheit to Celsius");
                System.out.println("2. Fahrenheit to Kelvin");
                System.out.print(">>> ");
                int op = scan.nextInt();
                switch (op) {
                    case 1:
                        double celcius = scan.nextFloat();
                        double fahrenheit = celcius *(9/5) + 32;
                        System.out.printf("%f Celcius in Fahrenheit is %f.",celcius,fahrenheit);
                        break;
                    case 2:
                        fahrenheit = scan.nextFloat();
                        celcius = (5/9)*(fahrenheit - 32);
                        System.out.printf("%f Celcius in Fahrenheit is %f.",celcius,fahrenheit);
                        break;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }
                break;
            case 3:
                System.out.println("1. Kelvin to Celcius");
                System.out.println("2. Kelvin to Fahrenheit");
                System.out.print(">>> ");
                int op = scan.nextInt();
                switch (op) {
                    case 1:
                        double celcius = scan.nextFloat();
                        double fahrenheit = celcius *(9/5) + 32;
                        System.out.printf("%f Celcius in Fahrenheit is %f.",celcius,fahrenheit);
                        break;
                    case 2:
                        fahrenheit = scan.nextFloat();
                        celcius = (5/9)*(fahrenheit - 32);
                        System.out.printf("%f Celcius in Fahrenheit is %f.",celcius,fahrenheit);
                        break;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }
                break;
            default:
                System.err.println("Invalid Input!");
                break;
        }
        

    }
}
