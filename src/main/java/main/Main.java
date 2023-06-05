package main;

public class Main {
    public static void main(String[] args) {

        var rectangle = new Rectangle();
        // w or h > 1023 is too large
        System.out.println(rectangle.calculateArea(1023, 1023));
        System.out.println(rectangle.calculateParameter(1023,102));
    }
}
