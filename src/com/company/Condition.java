package com.company;

public class Condition {
    private int condition;
    private String response;
    public Condition(int condition, String response) {
        this.condition = condition;
        this.response = response;
    }
    public String check(int i) {
        if (i % condition == 0) {
            return (response);
        } else {
            return ("");
        }
    }
}
