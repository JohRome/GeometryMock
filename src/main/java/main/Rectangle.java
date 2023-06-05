package main;

public class Rectangle {

    /**
     * Calculates the area of a rectangle given its width and height.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     * @return The area of the rectangle.
     */
    public double calculateArea(double width, double height) {
        tellMeWhenNumbersAreTooHighOrLow(width, height);
        return width * height;
    }

    /**
     * Calculates the parameter of a rectangle given its width and height.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     * @return The circumference of the rectangle.
     */
    public double calculateParameter(double width, double height) {
        tellMeWhenNumbersAreTooHighOrLow(width, height);
        return (width + height) * 2;
    }

    private void tellMeWhenNumbersAreTooHighOrLow(double width, double height) {
        double tellWhenTooHigh = Double.MAX_EXPONENT;
        boolean numbersTooHigh = width > Double.MAX_EXPONENT || height > Double.MAX_EXPONENT;
        boolean numbersTooLow = width <= 0 || height <= 0;

        if (numbersTooLow) throw new ArithmeticException("Width or height can't be set to 0 or less");
        if (numbersTooHigh) throw new ArithmeticException("Width or height can't be over " + tellWhenTooHigh);
    }
}
