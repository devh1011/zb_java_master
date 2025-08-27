package org.example.lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    
    // 1. 익명클래스 사용 방식
    @Test
    void testAdd() {
        Calculator calculator = new Calculator(10, 20);
        int result = calculator.calculate( // 덧셈을 한다고 가정
            new Operate() {
                @Override
                public int operate(int a, int b) {
                    return a + b;
                }
            }
        );

        System.out.println(result);

    }
    // 2. 람다식으로 테스트코드 작성
    @Test
    void testAddLambda() {
        Calculator calculator = new Calculator(20, 20);
        int result = calculator.calculate((int a, int b) -> a + b);
        System.out.println(result);
    }

    // 3. 따로 변수로 빼서
    @Test
    void testAddLambda2() {
        Calculator calculator = new Calculator(30, 20);
        Operate operate = (int a, int b) -> a + b;
        int result = calculator.calculate(operate);
        System.out.println(result);
    }
    // 4. 메서드 참조 방식
    @Test
    void testAddLambda3() {
        Calculator calculator = new Calculator(40, 20);
        int result = calculator.calculate(Integer::sum);
        System.out.println(result);
    }
}