import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        System.out.println("Which option will you select?");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");  

        int choice = 0;

        // Validate user choice
        while (!isValid) {
            try {
                System.out.print("Enter your choice (1 or 2): ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) {
                    isValid = true;
                } else {
                    System.out.println("Invalid option. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value (1 or 2).");
            }
        }

        double temperature = 0.0;

        // Prompt for temperature and validate input
        isValid = false;
        while (!isValid) {
            try {
                System.out.print("Enter the temperature value: ");
                temperature = Double.parseDouble(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric temperature.");
            }
        }

        // Perform conversion based on user choice
        if (choice == 1) {
            // Convert Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("The temperature %.2f°C is equal to %.2f°F.%n", temperature, fahrenheit);
        } else if (choice == 2) {
            // Convert Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("The temperature %.2f°F is equal to %.2f°C.%n", temperature, celsius);
        }

        
        scanner.close();
    } 
}
