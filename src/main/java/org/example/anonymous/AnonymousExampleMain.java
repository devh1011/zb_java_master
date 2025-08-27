package org.example.anonymous;

public class AnonymousExampleMain {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();
        
        // 까마귀로 익명클래스를 연습 => 1회용으로 쓸 때 유용
        Animal crow = new Animal() {
            @Override
            public void sound() {
                System.out.println("까악 까악");
            }
        };
        crow.sound();

        Animal sparrow = new Animal() {
            @Override
            public void sound() {
                System.out.println(soundString() + soundString());
            }
            // 추가로 메서드 만들어서 사용도 가능하다
            public String soundString() {
                return "짹쨱";
            }
        };
        sparrow.sound();
    }




}
