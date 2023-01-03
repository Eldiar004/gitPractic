import entity.Person;

import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Nuraiym",99);
        Person person2 = new Person("Eldiyar", 12);
        Person person3 = new Person("Argen" , 12);
        Person person4 = new Person("Nuraiym",99);
        Person person5 = new Person("Eldiyar", 2);
        Person person6 = new Person("Argen" , 1);
        Person person7 = new Person("Nuraiym",9);
        Person person8 = new Person("Eldiyar", 120);
        Person person9 = new Person("Argen" , 1244);

        List<Person> people1 = Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person8, person9);
        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);

        for (Person person: people ) {
            System.out.println(person);
        }


    }
}