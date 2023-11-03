package com.example.gittuto;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonManipulation {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person(1,"Mohamed",34,"gmail"),
                new Person(2,"Haythem",38,"hotmail"),
                new Person(3,"Bramli",44,"yahoo"),
                new Person(4,"Haoutaro",38,"gmail"));
//        persons.stream().forEach(person -> {
//            System.out.println(person.getAge());
//        });
        //persons.stream().filter(person -> person.getAge()>37).forEach(System.out::println);
        Predicate<Person> stringPredicate = person -> {
            return person.getName().startsWith("H") && (person.getEmail().equals("gmail")||person.getEmail().equals("hotmail"));
        };
        persons.stream().filter(stringPredicate).forEach(System.out::println);
//       persons.stream().collect(Collectors.toMap(Person::getId, person -> person)).entrySet().forEach(integerPersonEntry ->{
//           System.out.println("Person id " + integerPersonEntry.getKey() +
//                   " Person Name "+ integerPersonEntry.getValue().getName()
//           +" Person Age "+integerPersonEntry.getValue().getAge());
//       });

    }

    private static boolean test(Person person) {
        return person.getName().startsWith("H")
                && (person.getEmail().equals("gmail") || (person.getEmail().equals("hotmail")));
    }
}
