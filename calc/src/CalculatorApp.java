import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        double output = performCalculation(firstNumber, secondNumber, operation);

        if (!Double.isNaN(output)) {
            System.out.println("Результат: " + output);
        }
    }

    public static double performCalculation(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль невозможно!");
                    return Double.NaN;
                }
            }
            default -> {
                System.out.println("Ошибка: неверный оператор!");
                return Double.NaN;
            }
        }
        return result;
    }
}
