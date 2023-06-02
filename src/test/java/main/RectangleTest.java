package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class RectangleTest {
    // Testing with JUnit 5

    Rectangle rectangle = null;

    @BeforeEach
    void setup() {
        rectangle = new Rectangle();
    }

    @ParameterizedTest
    @CsvSource({"2, 2, 4", "1, 1, 1", "10, 20, 200"})
    void testCalculateArea(double width, double height, double expectedArea) {
        double actual = rectangle.calculateArea(width,height);
        assertEquals(expectedArea, actual);
    }
    @ParameterizedTest
    @CsvSource({"-2, 5", "-5, 2", "-2, -4", "0, 2", "2, 0", "0, 0"})
    void zeroOrNegativeValuesShouldThrowArithmeticException(double width, double height) {
        assertThrows(ArithmeticException.class,
                () -> rectangle.calculateArea(width,height));
    }
}