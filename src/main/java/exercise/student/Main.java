package main.java.exercise.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Student student1 = new Student(rand.nextInt(1000), "Lucia", "White", 21);
        Student student2 = new Student(rand.nextInt(1000), "Lena", "Smith", 20);
        Student student3 = new Student(rand.nextInt(1000), "Nicol", "Green", 19);
        Student student4 = new Student(rand.nextInt(1000), "Tom", "Taylor", 17);
        Student student5 = new Student(rand.nextInt(1000), "Paul", "Miller", 18);
        Student student6 = new Student(rand.nextInt(1000), "Alen", "Lee", 16);
        Student student7 = new Student(rand.nextInt(1000), "David", "King", 17);
        Student student8 = new Student(rand.nextInt(1000), "Roger", "Lum", 22);
        Student student9 = new Student(rand.nextInt(1000), "Rick", "Novak", 20);
        Student student10 = new Student(rand.nextInt(1000), "Jeff", "Johnson", 16);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        AgeSort ageSort = student -> {
            if (student.getAge() > 18) {
                System.out.println(student);
            }
        };

        for (Student student : students) {
            ageSort.ageSortFunc(student);
        }

        ArrayList<Student> newStudents = new ArrayList<>();

//        AgeUpTo ageUpTo = student -> {
//            if(student.getAge()>18){
//                newStudents.add(student);
//            }
//        };
//
//        for(Student student:students){
//            ageUpTo.ageUpTo18Func(student);
//        }
//        System.out.println(newStudents);

        Predicate<Integer> morethan = age -> (age > 18);

        for(Student student:students) {
            if(morethan.test(student.getAge())){
                newStudents.add(student);
            }
        }
        System.out.println(newStudents);

        Comparator<Student> nameCompare = (Student a, Student b) -> a.getName().compareTo(b.getName());
        students.sort(nameCompare);
        System.out.println(students);


        for (int i = 0; i < students.size(); i++){
        Collections.sort(students, new CompareByAge());
        }
        System.out.println(students);

    }
}
class CompareByAge implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.getAge() - b.getAge();
    }
}

@FunctionalInterface
    interface AgeCompare {
    void ageCompareFunc(Student a, Student b);
}

@FunctionalInterface
    interface AgeSort{
    void ageSortFunc(Student student);
}

@FunctionalInterface
    interface AgeUpTo{
    void ageUpTo18Func(Student student);
}