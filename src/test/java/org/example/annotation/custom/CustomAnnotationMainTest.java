package org.example.annotation.custom;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CustomAnnotationMainTest {

    @Test
    public void testValidYearRange() {
        Car car = CarFactory.createCar(new CarRequest("BMW", 2021));
        assertThat(car.getYear()).isEqualTo(2021);

        System.out.println(car);
    }

    @Test
    public void testInvalidYearRange() {
        assertThatThrownBy(() -> CarFactory.createCar(new CarRequest("BMW", 2026)))
            .isInstanceOf(IllegalArgumentException.class);
    }
}