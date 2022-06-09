package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testUsersManager() {
        List<String> names = UsersManager.filterChemistGroupUsernames();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");

        assertEquals(expectedList, names);
    }

    @Test
    public void testOlderUsers() {
        List<String> names = UsersManager.filterOlderUsers(45);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gus Firing");
        expectedList.add("Mike Ehrmantraut");

        assertEquals(expectedList, names);
    }

    @Test
    public void testOlderThanEveryone() {
        List<String> names = UsersManager.filterOlderUsers(59);
        List<String> expectedList = new ArrayList<>();

        assertEquals(expectedList, names);
    }

    @Test
    public void testOlderUsersWhenAgeIsBelowZero() {
        List<String> names = UsersManager.filterOlderUsers(-20);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Jessie Pinkman");
        expectedList.add("Tuco Salamanca");
        expectedList.add("Gus Firing");
        expectedList.add("Gale Boetticher");
        expectedList.add("Mike Ehrmantraut");

        assertEquals(expectedList, names);
    }

    @Test
    public void testNumberOfPost() {
        List<String> names = UsersManager.filterNumberOfPost(100);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Jessie Pinkman");
        expectedList.add("Tuco Salamanca");

        assertEquals(expectedList, names);
    }

    @Test
    public void testNumberOfPostMoreThanEveryone() {
        List<String> names = UsersManager.filterNumberOfPost(5000);
        List<String> expectedList = new ArrayList<>();

        assertEquals(expectedList, names);
    }

    @Test
    public void testNumberOfPostMinimumOne() {
        List<String> names = UsersManager.filterNumberOfPost(0);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Jessie Pinkman");
        expectedList.add("Tuco Salamanca");
        expectedList.add("Gale Boetticher");

        assertEquals(expectedList,names);
    }
}