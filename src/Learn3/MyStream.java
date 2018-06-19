package Learn3;

import java.util.Arrays;
import java.util.List;

public class MyStream {
    public static void main(String[] args) {
        List<String> topNames2017 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );


        topNames2017
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted()
                .forEach(System.out::println);

        System.out.println("*****");

        for (String item : topNames2017) {
            System.out.println(item);
        }
    }
    
    
}
