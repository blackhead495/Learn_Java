/**************************************************************
    Дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет перевернутый список.
 **************************************************************/
package HomeWorks.HomeWork4;

import java.util.Collections;
import java.util.LinkedList;

public class H41_ReverseList {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ls.add(i);
        }
        System.out.println(ls);
        Collections.reverse(ls);
        System.out.println(ls);
    }
}
