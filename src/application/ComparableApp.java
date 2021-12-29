package application;

import java.util.Arrays;
import generic.Person;

public class ComparableApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Person[] people = {
        new Person("Tinu Budoyo", "Malang"),
        new Person("Eko Prasetyo", "Jakarta"),
        new Person("Linu Arfrex", "Bandung"),
    };

    Arrays.sort(people);
    System.out.println(Arrays.toString(people));
  }
}
