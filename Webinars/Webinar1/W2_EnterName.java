package Webinars.Webinar1;

import java.util.Scanner;

public class W2_EnterName {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scan = new Scanner(System.in);
        //String name = System.console().readLine();
        String name = scan.nextLine();
        System.out.print("Привет, " + name + "!");
        scan.close();
    }
}
