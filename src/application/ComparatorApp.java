package application;

import java.util.Arrays;
import java.util.Comparator;

import generic.Person;

public class ComparatorApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Person[] people = {
        new Person("Tinu Budoyo", "Malang"),
        new Person("Eko Prasetyo", "Jakarta"),
        new Person("Linu Arfrex", "Bandung"),
    };

    Comparator<Person> comparator = new Comparator<Person>() {
      @Override
      public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
      }
    };

    Arrays.sort(people, comparator);
    System.out.println(Arrays.toString(people));
  }
}
