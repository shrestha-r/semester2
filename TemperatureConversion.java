import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
    int isContinue = 0;
    while (isContinue == 0) {
        Scanner scan = new Scanner(System.in);

        System.out.println("<--------------- Temperature Scale Conversions -------------->");
        System.out.println("1. Celsius to others");
        System.out.println("2. Fahrenheit to others");
        System.out.println("3. Kelvin to others");
        System.out.print(">>> ");
        int option = scan.nextInt();

        switch (option) {
            case 1: {
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Celsius to Kelvin");
                System.out.print(">>> ");
                int subOption = scan.nextInt();

                System.out.print("Enter temperature in Celsius: ");
                double celsius = scan.nextDouble();

                switch (subOption) {
                    case 1:
                        double fahrenheit = (celsius * 9.0 / 5) + 32;
                        System.out.printf("%.2f `C = %.2f `F%n", celsius, fahrenheit);
                        break;
                    case 2:
                        double kelvin = celsius + 273.15;
                        System.out.printf("%.2f `C = %.2f K%n", celsius, kelvin);
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
                break;
            }

            case 2: {
                System.out.println("1. Fahrenheit to Celsius");
                System.out.println("2. Fahrenheit to Kelvin");
                System.out.print(">>> ");
                int subOption = scan.nextInt();

                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scan.nextDouble();

                switch (subOption) {
                    case 1:
                        double celsius = (fahrenheit - 32) * 5.0 / 9;
                        System.out.printf("%.2f `F = %.2f `C%n", fahrenheit, celsius);
                        break;
                    case 2:
                        double kelvin = ((fahrenheit - 32) * 5.0 / 9) + 273.15;
                        System.out.printf("%.2f `F = %.2f K%n", fahrenheit, kelvin);
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
                break;
            }

            case 3: {
                System.out.println("1. Kelvin to Celsius");
                System.out.println("2. Kelvin to Fahrenheit");
                System.out.print(">>> ");
                int subOption = scan.nextInt();

                System.out.print("Enter temperature in Kelvin: ");
                double kelvin = scan.nextDouble();

                switch (subOption) {
                    case 1:
                        double celsius = kelvin - 273.15;
                        System.out.printf("%.2f K = %.2f `C%n", kelvin, celsius);
                        break;
                    case 2:
                        double fahrenheit = (kelvin - 273.15) * 9.0 / 5 + 32;
                        System.out.printf("%.2f K = %.2f `F%n", kelvin, fahrenheit);
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
                break;
            }

            default:
                System.out.println("Invalid main option!");
        }

        System.out.print("Enter 1 to close the program: ");
        isContinue = scan.nextInt();
        scan.close();
    }
}
}
