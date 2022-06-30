package ua.ithillel.lms;

public class Ex1 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if (i == 13 || i == 66) {
                continue;
            }

            System.out.println(i);
        }
    }
}