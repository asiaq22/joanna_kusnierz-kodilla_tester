package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        List<String> olderUsers = filterOlderUsers(30);
        List<String> minOnePost = filterNumberOfPost(1);
        System.out.println(chemistGroupUsernames);
        System.out.println(olderUsers);
        System.out.println(minOnePost);
    }

    static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    static List<String> filterOlderUsers(int age) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;

    }

    static List<String> filterNumberOfPost(int numberOfPost) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > numberOfPost)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
}
