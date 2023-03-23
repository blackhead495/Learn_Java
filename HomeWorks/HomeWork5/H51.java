/*************************************************************************
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
    что 1 человек может иметь несколько телефонов.
 *************************************************************************/
package HomeWorks.HomeWork5;
import java.util.*;
public class H51 {
    public static void main(String[] args) {
        HashMap <String, List<String>> dict = new HashMap<>();
        Scanner iScan = new Scanner(System.in);

        while (true) {
            System.out.print("Введите Имя или \"q\" для выхода: ");
            String name = iScan.next();

            if (name.equals("q")) break;

            System.out.print("Введите номер телефона : ");
            List<String> tempList = new ArrayList<>();
            String phone = iScan.next();

            if (dict.containsKey(name)) {
                tempList.addAll(dict.get(name));
                tempList.add(phone);
                dict.put(name, tempList);

            } else {
                tempList.add(phone);
                dict.put(name, tempList);
            }
        }
        System.out.println(Arrays.asList(dict));
    }
}
