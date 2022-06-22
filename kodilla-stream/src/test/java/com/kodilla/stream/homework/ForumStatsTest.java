package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import  org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ForumStatsTest {

    @Test
    public void testAverageOlderUsersWhenThereAreOnlyYounger() {
        List<User> users = new ArrayList<>();
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));


        double avg = ForumStats.avarageOlderUsers(users);

        assertEquals(0.0, avg);
    }

    @Test
    public void testAverageOlderUsersEmptyList() {
        List<User> users = new ArrayList<>();

        double avg = ForumStats.avarageOlderUsers(users);

        assertEquals(0.0, avg);
    }

    @Test
    public void testAverageYoungerUsersWhenThereAreOnlyOlder() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));

        double avg = ForumStats.averageYoungerUsers(users);

        assertEquals(0.0, avg);


    }
}