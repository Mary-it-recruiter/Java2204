//2) Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
//
//Пример:
//[1, 2, 3, 4, 5, 6, 7]
//spisok.enqueue(8)
//[1, 2, 3, 4, 5, 6, 7,8]
//spisok.dequeue
//1
//[2, 3, 4, 5, 6, 7,8]
//spisok.first()
//2
//[2, 3, 4, 5, 6, 7,8]


import java.util.Arrays;
        import java.util.LinkedList;

public class Task2_4 {
    static LinkedList enqueue(LinkedList arr, Object var){
        arr.add(var);
        return arr;
    }
    static Object dequeue(LinkedList arr){
        return arr.pollFirst();
    }
    static Object first(LinkedList arr){
        return arr.getFirst();
    }
    public static void main(String[] args) {
        LinkedList arr = new LinkedList<>(Arrays.asList(4, 2,5,72, 7, 14, 55, 6));
        System.out.println(arr.toString());
        arr = enqueue(arr, 8);
        System.out.println(arr.toString());
        System.out.println(dequeue(arr).toString());
        System.out.println(arr.toString());
        System.out.println(first(arr).toString());
        System.out.println(arr.toString());
    }
}
