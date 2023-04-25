//1) Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.


import java.lang.reflect.Array;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Iterator;
        import java.util.LinkedList;

public class Task1_4 {
    static LinkedList reversedLL(LinkedList arr){
        Iterator itr = arr.descendingIterator();
        LinkedList res = new LinkedList<>();
        while(itr.hasNext()){
            res.add(itr.next());
        }
        return res;
    }

    public static void main(String[] args) {

        LinkedList<Integer> arr = new LinkedList<>(Arrays.asList(1, 2, 4, 10, 56, 4,46,10,17));
        System.out.println(arr.toString());
        System.out.println(reversedLL(arr));
    }
}