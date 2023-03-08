// Написать метод, который сжимает строку
// Пример: aaaabbbcdd -> a4b3c1d2

package Webinars.Webinar2;

import java.util.Scanner;

public class W2_PressString {
    public static void main (String[] args) {
        String inChar = "aaaabbbcccdeeйй";
        char[] arrChar = inChar.toCharArray();  // Создаем массив char из строки
        StringBuilder sb = new StringBuilder(); // Создаем пустую строку
        int count = 1;                          // Счетчик букв
        for (int i = 0; i < arrChar.length-1; i++) {
            if (arrChar[i] == arrChar[i+1]) {
                count++;
            } else {
                sb.append(arrChar[i]).append(count); // в строку добавляем букву и цифру
                count = 1;                           // счетчик в исходное состояние
            }
            if (i + 1 == arrChar.length - 1) {       // Когда i - предпоследний элемент
                sb.append(arrChar[i + 1]).append(count); // в строку добавляем букву и цифру
            }                                        // поскольку это завершающий элемент
        }
        System.out.println(sb);                      // Выводим результат
    }
}
