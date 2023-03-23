/*********************************************************
 *  Создать структуру для хранения Номеров паспортов и
 *  Фамилий сотрудников организации
 *
 *  Вывести данные по сотрудникам с фамилией Иванов
 *********************************************************/

package Webinars.Webinar5;

import java.util.HashMap;
import java.util.Map;

public class W50_People {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(1234, "Иванов");
        people.put(1224, "Петров");
        people.put(12334, "Сидоров");
        people.put(122234, "Козлов");
        people.put(12554, "Иванов");
        people.put(12634, "Буйнов");
        people.put(12134, "Иванов");
        people.put(18234, "Иванов");
        people.put(12345, "Иннокентьев");
        if (people.containsValue("Иванов")) {
            for (Integer number: people.keySet()) {
                if (people.get(number).equals("Иванов"))
                    System.out.println(people.get(number) + " номер паспорта " + number);
            }
        } else
            System.out.println("Нет сотрудников с такой фамилией ");
    }
}
