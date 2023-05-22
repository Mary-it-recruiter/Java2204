
//3) В калькулятор добавьте возможность отменить последнюю операцию.
//Пример
//
//1
//+
//2
//ответ:
//3
//
//+
//4
//ответ:
//7
//+
//2
//
//ответ:
//9
//
//1
//Ответ 8
//Отмена -> 9
//Отмена -> 7
//Отмена -> 3
//+
//2
//Ответ 5
import java.util.*;

public class Task3_4  {
    static float calculator(float a, char o, float b){
        return switch (o) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
    public static void main(String[] args) {
        boolean flag = true;
        Float a = null;
        Float b = null;
        Scanner scan = new Scanner(System.in);
        Deque<Float> res = new LinkedList<>();
        while(flag) {
            if(a == null){
                System.out.print("Введите a: ");
                a = scan.nextFloat();
            }
            System.out.println("a: " + a.toString());
            System.out.print("Введите знак или 0 для отмены: ");
            String o = scan.next();
            if(o.equals("0")){
                System.out.println(a = res.pollLast());
            }else {
                System.out.print("Введите b: ");
                b = scan.nextFloat();

                res.add(calculator(a, o.toCharArray()[0], b));

                System.out.printf("%f %s %f = %f\n", a, o, b, res.getLast());

                a = res.getLast();
            }

        }
    }
}