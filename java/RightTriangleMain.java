import java.util.Scanner;

class RightTriangle{
    double hypotenuse;
    double base;
    double perpendicular;
    
    double area(){
        double area = 0.5 * perpendicular*base;
        return area;
    }
    double perimeter(){
        double perimeter = perpendicular + base + hypotenuse;
        return perimeter;
    }
    double calculateHypotenuse(){
        if (base != null && perpendicular != null){
            hypotenuse = Math.sqrt(Math.pow(perpendicular, 2)+Math.pow(base, 2));
            return hypotenuse;
        }
        return -1;
    }
    
}

public class RightTriangleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Right Triangle Calculation");
        System.out.println("\t1. Hypotenuse");
        System.out.println("\t2. Area");
        System.out.println("\t3. Perimeter");
        System.out.println("\t4. Perpendicular");
        System.out.println("\t5. Base");
        
        System.out.print("Select option: ");
        int option = scan.nextInt();
        RightTriangle triangle = new RightTriangle();

        switch (option) {
            case 1:
                System.out.println("Hypotenuse Calculation");
                System.out.print("Base in cm: ");
                triangle.base = scan.nextDouble();
                System.out.print("Perpendicular in cm: ");
                triangle.perpendicular = scan.nextDouble();
                double hypotenuse = triangle.calculateHypotenuse();
                System.out.printf("Hypotenuse of the Right Angle Triangle is %.2f cm.%n", hypotenuse);
                break;
                
            case 2:
                System.out.println("Area Calculation");
                System.out.print("Base in cm: ");
                triangle.base = scan.nextDouble();
                System.out.print("Perpendicular in cm: ");
                triangle.perpendicular = scan.nextDouble();
                double area = triangle.calculateArea();
                System.out.printf("Area of the Triangle is %.2f cm².%n", area);
                break;
                
            case 3:
                System.out.println("Perimeter Calculation");
                System.out.print("Base in cm: ");
                triangle.base = scan.nextDouble();
                System.out.print("Perpendicular in cm: ");
                triangle.perpendicular = scan.nextDouble();
                double perimeter = triangle.calculatePerimeter();
                System.out.printf("Perimeter of the Triangle is %.2f cm.%n", perimeter);
                break;
                
            case 4:
                System.out.println("Perpendicular Calculation");
                System.out.print("Hypotenuse in cm: ");
                triangle.hypotenuse = scan.nextDouble();
                System.out.print("Base in cm: ");
                triangle.base = scan.nextDouble();
                double perpendicular = triangle.calculatePerpendicular();
                System.out.printf("Perpendicular of the Right Angle Triangle is %.2f cm.%n", perpendicular);
                break;
                
            case 5:
                System.out.println("Base Calculation");
                System.out.print("Hypotenuse in cm: ");
                triangle.hypotenuse = scan.nextDouble();
                System.out.print("Perpendicular in cm: ");
                triangle.perpendicular = scan.nextDouble();
                double base = triangle.calculateBase();
                System.out.printf("Base of the Right Angle Triangle is %.2f cm.%n", base);
                break;
                
            default:
                System.out.println("Invalid option!");
        }
        scan.close();
    }
}
