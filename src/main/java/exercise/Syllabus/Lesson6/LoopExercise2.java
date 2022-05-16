package main.java.exercise.Syllabus.Lesson6;

public class LoopExercise2 {
    public static void main(String[] args) {
        int n = 0;// həmin ədədlərin sayını göstərmək üçün şərtdən əlavə
        for (int i = 1000; i < 10000 ; i++) {
            int startSum = i/1000+i/100%10;
            int endSum = i/10%10+i%10;
            if(startSum == endSum){
                n++;
                System.out.println(i);
            }
        }
        System.out.printf("1000-10000 intervalında başlanğın iki rəqəmin cəmi ilə son iki rəqəmin cəminin bərabər olduğu halların sayı : %s . \n ", n);

    }
}
