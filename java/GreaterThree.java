import java.util.Scanner;

public class GreaterThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find greatest among three numbers.");
        while (true) {

            System.out.print("Number 1: ");
            int num1 = scan.nextInt();
            System.out.print("Number 2: ");
            int num2 = scan.nextInt();
            System.out.print("Number 3: ");
            int num3 = scan.nextInt();
            if (num1 == num2) {
                System.out.println("num1 and num2 are equal");
                if (num1 == num3) {
                    System.out.println("Num1, Num2 and Num3 are also equal.");

                }
            } else { // num1 != num2
                if (num1 == num3) {
                    System.out.println("num1 and num3 are equal");
                } else { // num1 != num2 and num1 != num3
                    if (num2 == num3) { // num1 != num2 and num1 != num3 and num2 != num3
                        System.out.println("Num1, Num2 and Num3 are also equal.");
                        if (num1 > num3) {
                        }

                    } else { // num2 is greater
                        if (num2 > num3) {
                            System.out.println("Num2 is greatest.");
                        } else {
                            System.out.println("Num3 is greatest.");
                        }

                    }
                }
            }
            // if (num1 == num2){
            // System.out.println("num1 and num2 is equal.");
            // if (num1 == num3){
            // System.out.println("Num1, Num2 and Num3 are equal.");
            // }
            // }
            // else{

            // }

        }
    }
}

// Find greatest among three numbers.
// Number 1: 1
// Number 2: 2
// Number 3: 3
// Num3 is greatest.
// Number 1: 3
// Number 2: 2
// Number 3: 1
// Num1 is greatest.
// Number 1: 1
// Number 2: 3
// Number 3: 2
// Num2 is greatest.
// Number 1: 2
// Number 2: 3
// Number 3: 1
// Num2 is greatest.
// Number 1: 2
// Number 2: 2
// Number 3: 1
// Num2 is greatest.
// Number 1: 1
// Number 2: 1
// Number 3: 2
// Num3 is greatest.
// Number 1: 3
// Number 2: 3
// Number 3: 3
// Num3 is greatest.
// Number 1: 1
// Number 2: 1
// Number 3: 1
// Num3 is greatest.
// Number 1: 2
// Number 2: 1
// Number 3: 2