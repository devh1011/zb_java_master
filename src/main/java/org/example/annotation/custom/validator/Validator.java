package org.example.annotation.custom.validator;

import java.lang.reflect.Field;
import org.example.annotation.custom.CarRequest;
import org.example.annotation.custom.annotation.YearRange;

public class Validator {

    public static void validateYear(CarRequest request) {
        try {
            Field field = request.getClass().getDeclaredField("year"); // 클래스 정보에서 year라는 필드를 참조함
            field.setAccessible(true); // 접근 true
            YearRange yr = field.getAnnotation(YearRange.class); // 어노테이션 얻어온다
            
            int year = request.getYear();
            

            if(year < yr.min() || year > yr.max()){
                throw new IllegalArgumentException("Invalid year range");
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("No such field");
        }
    }

}
