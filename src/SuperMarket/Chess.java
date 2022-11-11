package SuperMarket;

import java.util.ArrayList;
import java.util.List;

public class Chess {

    public static void main(String[] args) {

        System.out.println("Домашнее задание: Введение в коллекции. Шахматная доска _______________ ");
        System.out.println();
        example();

//        List<List<String>> biDemArrList = new ArrayList<>();
//        int ourNumber = biDemArrList.get(0).get(1);


    } // main --------------------------------------------------------
    public static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {                 // заполнение списка
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
               if ((i + j) % 2 != 0) {
                   biDemArrList.get(i).add(j, "●");
                  //  biDemArrList.get(i).add(j, (i+j)%2 == 1 ? "●" : "◯"); - вариант Бизина.
               } else biDemArrList.get(i).add(j, "◯");
            }
        }
        for (int i = 0; i < 8; i++) {                 // вывод списка
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
                }
            System.out.println();
        }
    }


} // class
