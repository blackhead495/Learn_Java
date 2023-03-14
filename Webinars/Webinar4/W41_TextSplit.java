// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
//      text~num
//  2. Нужно рассплитить строку по ~, сохранить text в связанный список на позицию num
//  3. Если введено print~num, вывести строку из позиции num в связанном списке
//      и удалит её из списка


package Webinars.Webinar4;

import java.util.LinkedList;
import java.util.Scanner;

public class W41_TextSplit {
    public static void main(String[] args) {
        String[] iArr;
        String input = "";
        Scanner sc = new Scanner(System.in);
        LinkedList<String> Hranilishe = new LinkedList<>();
        while (!input.equals("exit")) {
            System.out.print("Введите текст: ");
            input = sc.nextLine();
            iArr = input.split("~");

            if (!iArr[0].equals("print")) {
                if (Hranilishe.size() < Integer.parseInt(iArr[1])) {
                    for (int i = Hranilishe.size(); i < Integer.parseInt(iArr[1]); i++) {
                        Hranilishe.add(null);
                    }
                }
                Hranilishe.add(Integer.parseInt(iArr[1]), iArr[0]);
                System.out.println(Hranilishe);
            } else {
                System.out.println(Hranilishe.get(Integer.parseInt(iArr[1])));
                Hranilishe.remove(Integer.parseInt(iArr[1]));
            }
        }
        return;
    }
}
