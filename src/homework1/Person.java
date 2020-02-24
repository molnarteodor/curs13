package homework1;

import java.util.ArrayList;

public class Person {
    static String name;
    static String hairColour;
    static int age;

    Person(String name, int age, String hairColour) {
        Person.name = name;
        Person.hairColour = hairColour;
        Person.age = age;
    }

    public static void main(String[] args) {
        Person alina = new Person("Alina", 22, "black");
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(alina);
        Person steve = new Person("Steve", 28, "brown");
        people.add(steve);
        Person kevin = new Person("Kevin", 25, "silver");
        people.add(kevin);
    }
}