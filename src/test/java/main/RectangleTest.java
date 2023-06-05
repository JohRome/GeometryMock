package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * A test class for the Rectangle class.
 */
class RectangleTest {

    /**
     * Tests the calculation of the area of a rectangle with positive numbers.
     */
    @Test
    void testAreaOfRectangleWithPositiveNumbers() {
        Rectangle rectangleMock = mock(Rectangle.class);

        when(rectangleMock.calculateArea(2.0,2.0)).thenReturn(4.0);

        double area = rectangleMock.calculateArea(2.0,2.0);

        assertEquals(4.0, area,0.01);
    }

    /**
     * Tests the calculation of the area of a rectangle with negative numbers.
     */
    @Test
    void testAreaOfRectangleWithNegativeNumbers() {
        Rectangle rectangleMock = mock(Rectangle.class);

        when(rectangleMock.calculateArea(-1,-1)).thenReturn((double) -1);

        double area = rectangleMock.calculateArea(-1,-1);

        assertEquals(-1, area,0.01);
    }

    /**
     * Tests the parameter calculation of a rectangle with negative numbers.
     */
    @Test
    void testParameterWithNegativeNumbers() {
        Rectangle rectangleMock = mock(Rectangle.class);

        doThrow(ArithmeticException.class).when(rectangleMock).calculateArea(-1,-1);

        assertThrows(ArithmeticException.class, () -> rectangleMock.calculateArea(-1,-1));
    }

    /**
     * Tests the parameter calculation of a rectangle with positive numbers.
     */
    @Test
    void testParameterWithPositiveNumbers() {
        Rectangle rectangleMock = mock(Rectangle.class);

        when(rectangleMock.calculateParameter(2, 2)).thenReturn(8.0);

        double parameter = rectangleMock.calculateParameter(2.0, 2.0);

        assertEquals(8, parameter);
    }
}