import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    while (true){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number.");
        } else {
            System.out.println(num + " is Odd Number.");
        }
        System.out.println("");
        int con = scan.nextInt();
        if (con == 1){
            break;
        }
    }
// 07551129680
}
}