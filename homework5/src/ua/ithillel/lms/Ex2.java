package ua.ithillel.lms;

public class Ex2 {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i <= 100; i++) {
            number *= i;
            if (number >= 1000) {
                System.out.println(number);
                return;
            }
        }
    }
}
