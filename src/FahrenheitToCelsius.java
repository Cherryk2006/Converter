import  java.util.Scanner;

public class FahrenheitToCelsius {
    public static double convert(double fahrenheit){
        return  (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        if (scanner.hasNextDouble()) {
            double f = scanner.nextDouble();
            double c = convert(f);
            System.out.printf("%.2fºF = %.2fºC%n", f, c);
        } else {
            System.out.println("Error: not a number entered.");
        }
        scanner.close();
    }
}
