package chapter08_template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yangyh
 * @date 2018/9/11
 */
public class CoffeeWithHook extends CaffineBerverageWithHook {

    @Override
    void brew() {
        System.out.println("brew Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("addCondiments tea");
    }

    @Override
    boolean customerWantsCondiments() {
        try {
            final String answer = getUserInput();
            if (answer.startsWith("y")) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;

    }

    String getUserInput() throws IOException {
        String answer = null;
        System.out.println("Would you like any suager");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = br.readLine();
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}

