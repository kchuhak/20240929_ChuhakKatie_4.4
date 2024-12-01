import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the side length of the hexagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // calculate the area of the hexagon
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);

        // display the result
        System.out.printf("The area of the hexagon is %.2f%n", area);
    }
}