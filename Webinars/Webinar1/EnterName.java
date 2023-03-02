package Webinars.Webinar1;

import java.util.Scanner;

public class EnterName {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.print("Hello " + name);
        scan.close();
    }
}
