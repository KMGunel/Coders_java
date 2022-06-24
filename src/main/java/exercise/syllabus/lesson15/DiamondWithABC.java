package main.java.exercise.syllabus.lesson15;

public class DiamondWithABC {
    public static void main(String[] args) {

        int num=7;
        StringBuilder str = new StringBuilder();
        int n= 65;
        int star = 1;
        int space=(2*num-1)/2;
        for (int i = 0; i < num; i++) {
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(str.appendCodePoint(n));
            }

            System.out.println();
            n+=1;
            space-=1;
        }

    }
}
