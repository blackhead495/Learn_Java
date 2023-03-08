// Написать метод, который принимает на вход строку (String)
// и определяет, является ли строка палиндромом (возвращает значение boolean)

package Webinars.Webinar2;

import java.util.Scanner;

public class W3_Palindrom {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        Scanner iScan = new Scanner(System.in);
        String st = iScan.nextLine().replace(" ", "").toLowerCase();
        System.out.println(check(st));
    }

    public static boolean check(String str) {
        char[] tmp = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            if (tmp[i] != tmp[str.length() - i - 1]) {
                return false;
            }
        }
        return true;
    }
}



