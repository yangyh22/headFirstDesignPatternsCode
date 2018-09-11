package chapter08_template;

import java.util.Arrays;

/**
 * @author yangyh
 * @date 2018/9/11
 */
public class SortTest {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huely", 2)
        };

        System.out.println("before...");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("After....");
        display(ducks);

    }

    static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }

    }

}
