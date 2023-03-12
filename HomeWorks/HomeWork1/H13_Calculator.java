package HomeWorks.HomeWork1;
import java.util.Scanner;
public class H13_Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        num1 = reader.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        op = reader.next().charAt(0);
        System.out.print("Введите 2 число: ");
        num2 = reader.nextDouble();

        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Ошибка! Введен некорректный оператор");
                return;
        }
        System.out.print("Результат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
