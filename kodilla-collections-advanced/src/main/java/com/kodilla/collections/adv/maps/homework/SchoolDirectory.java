package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal jones = new Principal("Robert", "Jones");
        Principal taylor = new Principal("John", "Taylor");
        Principal evans = new Principal("Thomas", "Evans");
        Principal johnson = new Principal("Edward", "Johnson");

        School one = new School("Washington High School");
        School two = new School("New York High School");
        School three = new School("Chicago High School");
        School four = new School("Boston High School");

        School school1 = new School(Arrays.asList(25, 27, 29));
        School school2 = new School(Arrays.asList(21, 26, 30, 28, 26, 22, 31, 35));
        School school3 = new School(Arrays.asList(32, 18, 26, 29));
        School school4 = new School(Arrays.asList(26, 35, 31, 22, 28));


        school.put(jones, one);
        school.put(taylor, two);
        school.put(evans, three);
        school.put(johnson, four);

        school.put(jones, school1);
        school.put(taylor, school2);
        school.put(evans, school3);
        school.put(johnson, school4);

        for (Map.Entry<Principal, School> principalSchoolEntry : school.entrySet()) {
            System.out.println(principalSchoolEntry.getKey().getFirstname() + " " + principalSchoolEntry.getKey().getLastname() +
                    " is a principal of the " + principalSchoolEntry.getValue().getSchoolName() +
                    ". Total number of students in this school is " + principalSchoolEntry.getValue().getSum() + ".");
        }
    }
}
