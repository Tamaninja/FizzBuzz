package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Condition> conditions= new ArrayList<Condition>();
        conditions.add(new Condition(3, "Fizz"));
        conditions.add(new Condition(5, "Buzz"));
        for (int i = 1; i <= 100 ; i++) {
            String output = "";
            for (Condition condition:conditions) {
                output = output + condition.check(i);
            }
            if (output.equals("")) {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }
}
