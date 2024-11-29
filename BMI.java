import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        if (bmi < 16) {
            System.out.println("Severely underweight");
        } else if (bmi >= 16 && bmi < 17) {
            System.out.println("Moderately underweight");
        } else if (bmi >= 17 && bmi < 18.5) {
            System.out.println("Mildly underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal (healthy weight)");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}