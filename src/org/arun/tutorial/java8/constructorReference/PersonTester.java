package org.arun.tutorial.java8.constructorReference;

/**
 * Created by Arun on 17-Nov-16.
 */
public class PersonTester {

    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        Person person = personFactory.createPerson("arun", 23);

        PersonFactoryWithDefaultValues personFactoryWithDefaultValues = Person::new;
        Person defaultPerson = personFactoryWithDefaultValues.createPerson();

        System.out.println("person==");
        System.out.println(person.name);
        System.out.println(person.age);

        System.out.println();

        System.out.println("defaultPerson==");
        System.out.println(defaultPerson.name);
        System.out.println(defaultPerson.age);
    }
}
