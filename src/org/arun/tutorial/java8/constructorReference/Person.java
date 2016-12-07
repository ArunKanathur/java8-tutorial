package org.arun.tutorial.java8.constructorReference;

/**
 * Created by Arun on 17-Nov-16.
 */
public class Person {

    String name;
    int age;

    public Person() {
        this("defaultName", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
