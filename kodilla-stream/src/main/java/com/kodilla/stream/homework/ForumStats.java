package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;


public class ForumStats {

    public static double avarageOlderUsers(List<User> users) {
        double avg1 = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);

        return avg1;
    }

    public static double averageYoungerUsers(List<User> users) {
        double avg2 = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);

        return avg2;
    }

    public static void main(String[] args) {
        System.out.print("Average number of posts for older users: ");
        System.out.println(avarageOlderUsers(UsersRepository.getUsersList()));

        System.out.print("Average number of posts for younger users: ");
        System.out.println(averageYoungerUsers(UsersRepository.getUsersList()));

    }


}
