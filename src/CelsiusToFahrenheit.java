import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static double convert(double celsius){
        return  (celsius * 9.0 / 5) + 32;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        if (scanner.hasNextDouble()) {
            double c = scanner.nextDouble();
            double f = convert(c);
            System.out.printf("%.2fºC = %.2fºF%n", c, f);
        } else {
            System.out.println("Error: not a number entered.");
        }
        scanner.close();
    }
}
