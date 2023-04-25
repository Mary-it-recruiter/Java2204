// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.(третье)
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            arr.add(a);
        }
        System.out.println(arr.toString());
        System.out.printf("Минимальное число в списке: %d\n", ArrayMin(arr));
        System.out.printf("Максимальное число в списке: %d\n", ArrayMax(arr));
        System.out.printf("Среднее арифметическое: %s\n",ArrayAvg(arr).toString());
    }

    static Integer ArrayMin(ArrayList<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        return arr.get(0);
    }
    static Integer ArrayMax(ArrayList<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        return arr.get(arr.size() - 1);
    }
    static Float ArrayAvg(ArrayList<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        float sum = 0;
        for (int i: arr
        ) {
            sum += i;
        }
        return (float) (sum/arr.size());
    }
}