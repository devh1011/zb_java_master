package org.example.annotation.general.safevarargs;

public class SafeVarargsExample {
    @SafeVarargs // 제네릭 가변인자에 대한 경고를 무시.
    
    // 실무에서 사용하지 않는걸 추천 => 실무에서 써본 적도 없음
    // 제네릭은 유연성을 위한것인데 이걸 제한하는게 강타입의 안정성을 지향하는게 모순됨
    public static<T> void printMessage(T... messages) {
        for (T message : messages) {
            System.out.println(message);
        }
    }
}
