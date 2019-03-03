package main;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        if (a++ == 0 && a++ > 0)
            System.out.println("It did not increament");

        System.out.println("However the new value is " + ++a);
    }
}
