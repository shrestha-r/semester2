import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = scan.nextDouble();

        System.out.println("1.Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divison");
        System.out.println("5. Reminder");

        System.out.print("Enter num2: ");
        int operator = scan.nextInt();

        switch (operator) {
            case 1:
                double sum = num1 + num2;
                System.out.println("Addition:("+num1+" + "+num2+") = "+ sum);
                break;
            case 2:
                double sub = num1 - num2;
                System.out.println("Subtraction:("+num1+" - "+num2+") = "+ sub);
                break;
            case 3:
                double mul = num1 * num2;
                System.out.println("Multiplication:("+num1+" x "+num2+") = "+ mul);
                break;
            case 4:
                double division = num1/num2;
                System.out.println("Division:("+num1+" / "+num2+") = "+ division);
                break;
            case 5:
                double reminder = num1%num2;
                System.out.println("Reminder:("+num1+" % "+num2+") = "+ reminder);  
                break;
            default:
                System.out.println("Not a valid option.");
                break;
        }

    }
}
