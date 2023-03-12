// К калькулятору из предыдущего дз добавить логирование.

package HomeWorks.HomeWork2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class H24_CalculatorWLog {
    public static void main(String[] args) throws IOException {

        Logger log = Logger.getLogger(H22_BubbleSort.class.getName());
        FileHandler fh = new FileHandler("HomeWorks/HomeWork2/log_H24.txt", false);
        log.addHandler(fh);
        log.setUseParentHandlers(false);                // Не отображать в терминале
        SimpleFormatter sf = new SimpleFormatter();     // Задать простой формат
        fh.setFormatter(sf);
        log.info("Создал новый логгер");

        double num1;
        double num2;
        double ans;
        char op;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        log.info("Запросил первое число");
        num1 = reader.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        log.info("Запросил арифметическое действие");
        op = reader.next().charAt(0);
        System.out.print("Введите второе число: ");
        log.info("Запросил второе число");
        num2 = reader.nextDouble();

        switch(op) {
            case '+': ans = num1 + num2;
                log.info("Получил результат сложения " + ans);
                break;
            case '-': ans = num1 - num2;
                log.info("Получил результат вычитания " + ans);
                break;
            case '*': ans = num1 * num2;
                log.info("Получил результат умножения " + ans);
                break;
            case '/':
                if (num2 == 0) {
                    log.warning ("Деление на ноль");
                    System.out.println("На ноль делить нельзя");
                    return;
                } else {
                    ans = num1 / num2;
                    log.info("Получил результат деления " + ans);
                }
                break;
            default:  System.out.printf("Ошибка! Введен некорректный оператор");
                log.info("Некорректный оператор ");
                return;
        }
        System.out.print("Результат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
