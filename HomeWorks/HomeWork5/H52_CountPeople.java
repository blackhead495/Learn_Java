/***********************************************************************************************************************
    Пусть дан список сотрудников:
         Иван Иванов
         Светлана Петрова
         Кристина Белова
         Анна Мусина
         Анна Крутова
         Иван Юрин
         Петр Лыков
         Павел Чернов
         Петр Чернышов
         Мария Федорова
         Марина Светлова
         Мария Савина
         Мария Рыкова
         Марина Лугова
         Анна Владимирова
         Иван Мечников
         Петр Петин
         Иван Ежов
    - Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
    - Отсортировать по убыванию популярности.
 **********************************************************************************************************************/
package HomeWorks.HomeWork5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class H52_CountPeople {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        List<String> listName = new ArrayList<>();

        inputList.add("Иван Иванов");
        inputList.add("Светлана Петрова");
        inputList.add("Кристина Белова");
        inputList.add("Анна Мусина");
        inputList.add("Анна Крутова");
        inputList.add("Иван Юрин");
        inputList.add("Петр Лыков");
        inputList.add("Павел Чернов");
        inputList.add("Петр Чернышов");
        inputList.add("Мария Федорова");
        inputList.add("Марина Светлова");
        inputList.add("Мария Савина");
        inputList.add("Мария Рыкова");
        inputList.add("Марина Лугова");
        inputList.add("Анна Владимирова");
        inputList.add("Иван Мечников");
        inputList.add("Петр Петин");
        inputList.add("Иван Ежов");

        for(String listItem : inputList) {
            listName.add(listItem.split(" ")[0]);
        }

        Map <String, Long> counted = listName.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        counted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
