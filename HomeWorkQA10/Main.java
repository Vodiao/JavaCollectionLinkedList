import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomLinkedList<Integer> array = new CustomLinkedList<>();

        array.add(5);
        array.add(3);
        array.add(4);
        array.add(2);
        array.add(1);

        array.delete(3);

        array.addFirst(10);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        System.out.println("-------------------------------");

        System.out.println(array.getFirst());
        System.out.println(array.getLast());


        //Task 3
        /**
         * ArrayList - это колекция которая реализует интерфейс  List, представляет собой динамический массив.
         * Преимущества: AddLast, Get
         * LinkedList - тоже реализует интерфейс List, представляет собой список где каждая Node(элемент),
         * хранит ссылку на следующую и предыдущую Node.
         * Преимущества: Add into middle, AddFirst, Get, Delete
         *
         */



    }
}