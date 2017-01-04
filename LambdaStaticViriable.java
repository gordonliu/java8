import java.util.List;
import java.util.ArrayList;

public class LambdaStaticViriable {
    public static String salutation = "Hello! ";

    public static void main(String[] args) {
        GreetingService greetService1 = message ->
            System.out.println(salutation + message);
        greetService1.sayHello("Mahesh");

        List<String> names = new ArrayList<String>();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalresh");

        names.forEach(System.out::println);

        MyPrint myPrint = new MyPrint();
        names.forEach(myPrint::print);

        names.forEach(MyName::new);
    }

    interface GreetingService {
        void sayHello(String msg);
    }
}

class MyPrint {
    void print(String s) {
        System.out.println(s);
    }
}

class MyName {
    public MyName(String name) {
        System.out.println("my name is: " + name);
    }
}
