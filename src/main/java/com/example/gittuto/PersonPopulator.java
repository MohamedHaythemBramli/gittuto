package com.example.gittuto;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonPopulator {
    public static void main(String[] args) {
        List<Person> persons = IntStream.range(0, 100)
                .mapToObj(i -> new Person(i, generateRandomName(), generateRandomAge(), generateRandomEmail()))
                .collect(Collectors.toList());

        // Now you have a List of 100 dynamically created Person objects
        persons.forEach(System.out::println);
    }

    private static String generateRandomName() {
        // Implement logic to generate random names
        return "RandomName" + new Random().nextInt(100);
    }

    private static int generateRandomAge() {
        // Implement logic to generate random ages
        return new Random().nextInt(100);
    }

    private static String generateRandomEmail() {
        // Implement logic to generate random email addresses
        return "random" + new Random().nextInt(100) + "@example.com";
    }
}
