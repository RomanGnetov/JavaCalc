public class CalculatorTests {

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        System.out.println("Запуск тестов:");

        assert performTest(5, 3, '+', 8) : "Тест 1 провален";
        assert performTest(10, 4, '-', 6) : "Тест 2 провален";
        assert performTest(6, 2, '*', 12) : "Тест 3 провален";
        assert performTest(9, 3, '/', 3) : "Тест 4 провален";
        assert performTestWithNaN(7, 0, '/') : "Тест 5 провален (деление на ноль)";
        assert performTestWithNaN(4, 5, 'x') : "Тест 6 провален (неизвестный оператор)";

        System.out.println("Все тесты пройдены успешно!");
    }

    private static boolean performTest(double num1, double num2, char operator, double expected) {
        double result = CalculatorApp.performCalculation(num1, num2, operator);
        return result == expected;
    }

    private static boolean performTestWithNaN(double num1, double num2, char operator) {
        double result = CalculatorApp.performCalculation(num1, num2, operator);
        return Double.isNaN(result);
    }
}
