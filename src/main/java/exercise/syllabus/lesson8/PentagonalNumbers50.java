package main.java.exercise.syllabus.lesson8;

public class PentagonalNumbers50 {
    public static void main(String[] args) {

        pentagonalNumbers();
    }

    public static void pentagonalNumbers() {
        int number = 0;
        for (int i = 0; i < 50; i++) {
            number = number + (3 * i + 1);
            System.out.println(number);
        }
    }
}
