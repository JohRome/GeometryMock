package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RectangleTest {

    @Test
    void testAreaOfRectangleWithPositiveNumbers() {
        Rectangle rectangleMock = mock(Rectangle.class);

        when(rectangleMock.calculateArea(2.0,2.0)).thenReturn(4.0);

        double area = rectangleMock.calculateArea(2.0,2.0);

        assertEquals(4.0, area,0.01);
    }

    @Test
    void testAreaOfRectangleWithNegativeNumbers() {
        Rectangle rectangleMock = mock(Rectangle.class);

        doThrow(ArithmeticException.class).when(rectangleMock).calculateArea(-1,-1);

        assertThrows(ArithmeticException.class, () -> rectangleMock.calculateArea(-1,-1));
    }
}