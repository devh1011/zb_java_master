package org.example.lambda;

public class Calculator {
    private final int a;
    private final int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(Operate operate) {
        return operate.operate(a, b); // 어떤 연산을 받는지에 따라 달라짐
    }

}
