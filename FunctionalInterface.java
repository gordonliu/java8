import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Output all:");
        eval(list, n -> true);

        System.out.println("Output even:");
        eval(list, n -> n % 2 == 0);

        System.out.println("Output >=3:");
        eval(list, n -> n >= 3 );
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        System.out.println(predicate);
        list.forEach(n -> {
            if(predicate.test(n))
                System.out.println(n);
            }
        );
    }
}

