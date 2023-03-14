/**********************************************************************
   Реазизуйте очередь с помощью LinkedList со следующими методами:
   enqueue() - помещает элемент в конец очереди.
   dequeue() - возвращает первый элемент из очереди и удаляет его.
   first()   - возвращает первый элемент из очереди, не удаляя его
 ***********************************************************************/
package HomeWorks.HomeWork4;

import java.util.LinkedList;

public class H42_Queue_Linked {
    public static void main(String[] args) {
        LinkedList<Integer> que = new LinkedList<>();
        for (int i = 2; i < 5; i++) {
            que.add(i);
        }
        System.out.println(que);
        que = enqueue(que, 15);     // Помещаем новый элемент в конец очереди
        System.out.println(que);
        int a = dequeue(que);                 // Возвращаем первый элемент из очереди и удаляем его
        System.out.print(a + " ");
        System.out.println(que);
        a = first(que);                         // Возвращаем первый элемент из очереди, не удаляя его
        System.out.print(a + " ");
        System.out.println(que);
    }
    /*****************************************************
     * Помещает новый элемент в конец очереди           */
    public static LinkedList<Integer> enqueue (LinkedList<Integer> inLinkedList, Integer newElement) {
        inLinkedList.add(newElement);
        return inLinkedList;
    }
    /*******************************************************
     *  Возвращает первый элемент из очереди и удаляет его */
    public static Integer dequeue (LinkedList<Integer> inLinkedList) {
        Integer temp = inLinkedList.pollFirst();
        return temp;
    }
    /********************************************************
     *  Возвращает первый элемент из очереди, не удаляя его */
    public static Integer first (LinkedList<Integer> inLinkedList) {
        Integer temp = inLinkedList.getFirst();
        return temp;
    }
}

