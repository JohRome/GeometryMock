package main;

public class Rectangle {
    /**
     * Calculates the area of a rectangle given its width and height.
     *
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     * @return The area of the rectangle.
     */
    public double calculateArea(double width, double height) {
        double numberTooHigh = Double.MAX_EXPONENT;
        if (width <= 0 || height <= 0)
            throw new ArithmeticException("Width or height can't be set to 0");
        if (width > numberTooHigh || height > numberTooHigh)
            throw new ArithmeticException("Width or height can't be over " + numberTooHigh);
        return width * height;
    }

    /**
     * Calculates the circumference of a rectangle given its width and height.
     *
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     * @return The circumference of the rectangle.
     */
    public double calculateCircumference(double width, double height) {
        return 0;
    }
}
