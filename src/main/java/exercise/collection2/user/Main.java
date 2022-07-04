package main.java.exercise.collection2.user;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand=new Random();

        Set<User> users=new HashSet<>();
        while(users.size()!=5) {
            User user = new User(rand.nextInt(1000), sc.next(), sc.next());
            users.add(user);
        }
        Iterator<User> i = users.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
