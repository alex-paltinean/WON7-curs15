package org.fasttrackit;

public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        if (name == null || age < 0 || age > 120) {
            throw new RuntimeException();
        }
        this.name = name;
        this.age = age;
    }

    public static Person createPerson(String name, Integer age) {
        if (name == null || age < 0 || age > 120) {
            return null;
        }
        return new Person(name, age);
    }

    public static void main(String[] args) {
        double x = (double) (100000000 - 32) * 5 / 9;
        System.out.println(x);
        System.out.println((double)Math.round(x * 10000000000L) / 10000000000L);



    }
}
