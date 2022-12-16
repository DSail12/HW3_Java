// Пусть дан произвольный список целых чисел, удалить из него четные числа

package hw3_java;

import java.util.ArrayList;
import java.util.Random;

public class example2 {
    public static void main(String[] args) {

        int i = 0;
        int size = 20;
        Random random = new Random();
        ArrayList<Integer> arrayOfList = new ArrayList<>(size);

        while (i < size) {
            arrayOfList.add(random.nextInt(10));
            i++;
        }
        System.out.println("Массив на входе, длиной " + size + " элементов, полученный случайным образом: " + arrayOfList);

        arrayOfList.removeIf(x -> x % 2 == 0);

        System.out.println("Массив на выходе, без четных чисел " + arrayOfList);
    }
    
}
