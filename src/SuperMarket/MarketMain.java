package SuperMarket;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class MarketMain {

    private static final List<String> BUYERS = List.of(
            "Иван", "Семён", "Ольга" , "Антон" , "Мария" ,"Татьяна" , "Олег" , "Дмитрий",
            "Оксана","Саша" , "Вася" ,"Петя" , "Даша" ,"Витя" , "Света");

    private final static Random RANDOM = new Random();
    private final static int MAX_SIZE = 5;

    public static void main(String[] args) {

        System.out.println("Домашнее задание: Введение в коллекции. Очереди в Супермаркете _______________ ");
        System.out.println();

        Queue<String> kassa1 = new ArrayDeque<>();
        Queue<String> kassa2 = new ArrayDeque<>();

        randomFilling(kassa1); randomFilling(kassa2);

        add("НИКОЛАЙ",kassa1,kassa2);
        System.out.println("1-я очередь: " + kassa1);
        System.out.println("2-я очередь: " + kassa2);
        System.out.println();

        remove(kassa1,kassa2);
        System.out.println("1-я очередь: " + kassa1);
        System.out.println("2-я очередь: " + kassa2);

    } // main ----------------------------------------------------------------------------------------------
    public static void randomFilling (Queue<String> queue) { // метод - принимает и заполненяет очереди случайным образом.
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
             queue.offer(BUYERS.get(RANDOM.nextInt(BUYERS.size())));
        }
    }
    private static void add (String name, Queue<String> queue1,Queue<String> queue2 ) {  // Позвать Галю, если !!!
        if (queue1.size() > queue2.size() && queue1.size() <= MAX_SIZE) {                // все очереди = 5.
            queue2.offer(name);
        } else if (queue2.size() > queue1.size() && queue2.size() <= MAX_SIZE) {
            queue1.offer(name);
        } else if (queue2.size() == queue1.size() && queue1.size() + queue2.size() == MAX_SIZE * 2) {
            System.out.println("Надо позвать Галю !!!");
        } else  queue1.offer(name);
    }
    public static void remove (Queue<String> queue1,Queue<String> queue2 ) {  // случайное удаление из очереди
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else queue2.poll();
    }

} // class
