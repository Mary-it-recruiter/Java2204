///Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rand.nextInt(10));
        }
        System.out.println(arr.toString());
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr.toString());
    }}