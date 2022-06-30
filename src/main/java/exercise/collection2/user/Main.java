package main.java.exercise.collection2.user;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand=new Random();

        Set<User>users=new HashSet<>();

        User user=new User(rand.nextInt(1000), sc.next(), sc.next());
        User user1=new User(rand.nextInt(1000),sc.next(),sc.next());

        users.add(user);
        addUser(user1,users);


        Iterator<User> i = users.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void addUser(User user,Set<User>users){
        for(User value:users){
            if (value.getName().equals(user.getName()) || value.getSurname().equals(user.getSurname())){
                break;
            }
            users.add(user);
        }
    }
}
