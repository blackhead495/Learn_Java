//  Реализовать консольное приложение, которое:
//  Принимает от пользователя и “запоминает” строки.
//  Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//  Если введено revert, удаляет предыдущую введенную строку из памяти.

package Webinars.Webinar4;

import java.util.*;

public class W42_MemString {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        Scanner iScan = new Scanner(System.in);
        String temp = "";
        while (!temp.toLowerCase().equals("quit")) {
            System.out.print("Введите строку: ");
            temp = iScan.nextLine();
            if(temp.toLowerCase().equals("print")) {
                Collections.reverse(ls);
                System.out.println(ls);
                Collections.reverse(ls);
            } else if (temp.toLowerCase().equals("revert")) {
                if (!ls.isEmpty()) {
                    ls.remove(ls.size()-1);
                    System.out.println(ls);
                } else {
                    System.out.println("Список пуст. ");
                }
            } else {
                ls.add(temp);
            }
        }
    }
}
