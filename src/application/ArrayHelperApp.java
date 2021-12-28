package application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    String[] names = { "John", "Mary", "Mike" };
    Integer[] numbers = { 1, 2, 3 };

    System.out.println(ArrayHelper.count(names));
    System.out.println(ArrayHelper.<Integer>count(numbers));
  }
}
