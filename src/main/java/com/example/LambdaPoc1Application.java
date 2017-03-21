package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaPoc1Application {
    interface MathOperation {
        int operation(int a, int b);
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {
        SpringApplication.run(LambdaPoc1Application.class, args);
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subraction = (int a, int b) -> a - b;
        //System.out.println("10 + 5 = " + operate(10, 5, addition));
        //System.out.println("10 - 5 = " + operate(10, 5, subraction));
    }
}
