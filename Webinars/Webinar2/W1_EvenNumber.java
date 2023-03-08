// Дано четное число N(>0) и символы с1 и с2
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов с1 и с2, начиная с с1

package Webinars.Webinar2;

import java.util.Scanner;

public class W1_EvenNumber {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите положительное четное число N: ");
        int n = iScanner.nextInt();
        if (n%2 != 0 && n > 0) {
            System.out.println("Четное число, это то что делится на 2! Положительное - больше 0.");
            return;
        }
        System.out.print("Введите символ с1: ");
        String c1 = iScanner.next();
        System.out.print("Введите символ с2: ");
        String c2 = iScanner.next();
        if (c1.length() != 1 || c2.length() != 1) {
            System.out.println("Просили ввести символ, а не целый набор!");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            result = result.append(c1 + c2);
        }
        System.out.println("Результатом операции стала строка вида: ");
        System.out.println(result);
        iScanner.close();
    }
}
