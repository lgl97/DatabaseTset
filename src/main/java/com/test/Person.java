package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public enum status{
        pass("已审批",1,"sda"),unpass,none,withdraw;
        String status;
        int index;
        String info;
        status(String status,int index,String info){
            this.status = status;
            this.index = index;
            this.info = info;
        }
        status() {
        }

        @Override
        public String toString() {
            return "status{" +
                    "status='" + status + '\'' +
                    ", index=" + index +
                    ", info='" + info + '\'' +
                    '}';
        }
    }

    public Person() {
    }

    Person(String f, String l, int age){
            this.firstName = f;
            this.lastName = l;
            this.age = age;
        }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

//    public final Comparator<Person> comparFname = (p1, p2)->p1.firstName.compareTo(p2.firstName);

    public static void main(String... args) {
        /*Person[] people = new Person[] {
                new Person("Ted", "Neward", 41),
                new Person("Charlotte", "Neward", 41),
                new Person("Michael", "Neward", 19),
                new Person("Matthew", "Neward", 13)
        };
        // Sort by first name
        Arrays.sort(people,
                (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName));
        for (Person p : people)
            System.out.println(p);*/
        Person person = new Person();
        status status = Person.status.withdraw;
        switch (status) {
            case none:
                System.out.println(status.toString());
                break;
            case withdraw:
                System.out.println(status.toString());
                break;
            case pass:
                System.out.println(status.toString());
                break;
            case unpass:
                System.out.println(status.toString());
                break;
            default:
                break;
        }
        person.firstName = status.pass.toString();
        System.out.println(person);
    }
}
