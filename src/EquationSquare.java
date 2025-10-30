import java.util.Scanner;
import static java.lang.Math.sqrt;

public class EquationSquare {
    public static void main(){
        System.out.println("The program calculates the roots of the equation ax^2+bx+c = 0.");
        double a, b = 0, c = 0, x1, x2;
        double delta;

        //getting value of A
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = value.nextDouble();

        // Checking a using switch (by converting to int condition)
        int checkA = (a == 0) ? 0 : 1;

        switch (checkA){
            case 0: System.out.println("Invalid value of the coefficient a.");
            return;
            default: {
                //getting value of B
                System.out.println("Enter b: ");
                b = value.nextDouble();

                //getting value of C
                System.out.println("Enter c: ");
                c = value.nextDouble();
            }
            break;
        }
        delta = ((b*b)-4*a*c);
        int discriminant = (delta < 0) ? 0 : (delta == 0 ? 1 : 2);
        //int numberOfRoots = 0;

        switch (discriminant){
            case 0: System.out.println("There are no real roots");
            break;
            case 1:
                x1 = x2 = -b/(2*a);
                System.out.printf("For a = " + "%.2f,",a);
                System.out.printf(" b = " + "%.2f,", b);
                System.out.printf(" c = " + "%.2f. \n", c);
                System.out.printf("The equation has two same real roots: x1 = %.2f and x2 = %.2f%n", x1, x2);
            break;
            case 2:
                x1 = (-b-sqrt(delta))/(2*a);
                x2 = (-b+sqrt(delta))/(2*a);
                System.out.printf("For a = " + "%.2f,",a);
                System.out.printf(" b = " + "%.2f,", b);
                System.out.printf(" c = " + "%.2f. \n", c);
                System.out.printf("The equation has two distinct real roots: x1 = %.2f and x2 = %.2f%n", x1, x2);
                break;
        }
        value.close();
    }
}
