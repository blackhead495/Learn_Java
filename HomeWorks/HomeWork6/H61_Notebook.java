/***********************************************************************************************************************
  1. Подумать над структурой класса Ноутбук для магазина техники —
       выделить поля и методы. Реализовать в Java.
  2. Создать множество ноутбуков.
       Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
        отвечающие фильтру. Критерии фильтрации можно хранить в Map.
    Например:
    “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объём ЖД
    3 - Операционная система
    4 - Цвет …

  1. Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
  2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 **********************************************************************************************************************/

package HomeWorks.HomeWork6;

import java.util.*;

public class H61_Notebook {
    public static void main(String[] args) throws Exception {
        List<Notebook> list = new ArrayList<>();
        Notebook note1 = new Notebook("Lenovo", 19.0f, "i5", "Windows", 8, 128);
        Notebook note2 = new Notebook("Asus",    15.6f, "i3", "Windows", 16, 128);
        Notebook note3 = new Notebook("HP",     15.6f, "i7", "Windows", 32, 256);
        Notebook note4 = new Notebook("MacBook", 13.3f, "i3", "iOS", 16, 512);
        Notebook note5 = new Notebook("MacBook", 13.3f, "i3", "iOS", 32, 128);
        Notebook note6 = new Notebook("Acer",   17.0f, "i9", "Windows", 16, 256);
        Notebook note7 = new Notebook("Samsung", 17.0f, "i7", "Windows", 8, 512);

        Collections.addAll(list, note1, note2, note3, note4, note5, note6, note7);

        System.out.print("По какому критерию отсортировать? :\n" +
                "1 - Производитель\n" +
                "2 - Диагональ экрана\n" +
                "3 - Процессор\n" +
                "4 - Операционная система\n" +
                "5 - Оперативная память\n" +
                "6 - Размер жесткого диска\n" +
                "Введите через пробел ->> ");

        Scanner iScan = new Scanner(System.in);
        String[] choice = iScan.nextLine().split(" ");

        try {
            for (String str : choice) {
                switch (str) {
                    case "1" -> {
                        System.out.print("Введите одну из моделей - Lenovo, Asus, HP, MacBook, Acer, Samsung: ");
                        sortManufacture(list, iScan.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "2" -> {
                        System.out.print("Введите один из размеров диагонали - 13.3, 15.6, 17.0: ");
                        sortDiagonal(list, iScan.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "3" -> {
                        System.out.print("Введите модель процессора - i3, i5, i7: ");
                        sortCPU(list, iScan.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "4" -> {
                        System.out.print("Введите операционную систему - Linux, Windows, iOS: ");
                        sortOS(list, iScan.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "5" -> {
                        System.out.print("Введите объем ОЗУ (GB) - 4, 8, 16, 32: ");
                        sortRAM(list, iScan.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "6" -> {
                        System.out.print("Введите объем SSD (GB): 128, 256, 512, 1024: ");
                        sortSSD(list, iScan.next().toLowerCase());
                        System.out.println(list);
                    }
                    default -> throw new Exception();
                }
            }
        }
        catch (Exception e){
            System.out.println("Введены некорректные данные!!! ");
        }
        iScan.close();
    }

    private static void sortManufacture(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getManufacturer()));
    }
    private static void sortDiagonal(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getDiagonal().toString()));
    }
    private static void sortCPU(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getCpu()));
    }
    private static void sortOS(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getOs()));
    }
    private static void sortRAM(List<Notebook> list, String str) {
        list.removeIf(item -> !(item.getRam() == Integer.parseInt(str)));
    }
    private static void sortSSD(List<Notebook> list, String str) {
        list.removeIf(item -> !(item.getSsd() == Integer.parseInt(str)));
    }
}
