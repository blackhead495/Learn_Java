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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H52 {
    public static void main(String[] args) {
        Map <String, String> listPerson = new HashMap<>();

        listPerson.put("Петрова",   "Светлана");
        listPerson.put("Белова",    "Кристина");
        listPerson.put("Мусина",    "Анна");
        listPerson.put("Крутова",   "Анна");
        listPerson.put("Юрин",      "Иван");
        listPerson.put("Лыков",     "Петр");
        listPerson.put("Чернов",    "Павел");
        listPerson.put("Чернышов",  "Петр");
        listPerson.put("Федорова",  "Мария");
        listPerson.put("Светлова",  "Марина");
        listPerson.put("Савина",    "Мария");
        listPerson.put("Рыкова",    "Мария");
        listPerson.put("Лугова",    "Мария");
        listPerson.put("Владимирова", "Анна");
        listPerson.put("Мечников",  "Иван");
        listPerson.put("Петин",     "Петр");
        listPerson.put("Ежов",      "Иван");

        //System.out.println(listPerson);

        Map <String, Integer> listCount = new HashMap<>();
        int someKey = 0;
        int defaultVal = 0;


        for (Map.Entry <String, String> item : listPerson.entrySet()) {
            someKey = listCount.getOrDefault(item.getValue(), defaultVal);
            listCount.put(item.getValue(), ++someKey );
        }

        List<Integer> sortedList = new ArrayList<>(listCount.values());
        sortedList = sortedList.stream().sorted().toList();

        for (int i = sortedList.size() - 1; i >= 0 ; i--) {
            for (Map.Entry<String, Integer> item : listCount.entrySet()){
                if (sortedList.get(i) == item.getValue()) {
                    System.out.println(item.getKey() + " : " + item.getValue() + " раз(а)" );
                }
            }
        }
    }
}
