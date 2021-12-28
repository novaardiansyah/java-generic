package application;

import generic.MyData;

public class CovariantApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    MyData<String> data1 = new MyData<String>("John");
    process(data1);
  }

  /**
   * ! Covariant :
   * can access a method whose return value is a generic type
   * does not access methods that accept parameters that are generic type
   */
  public static void process(MyData<? extends Object> data) {
    System.out.println(data.getData());
  }
}
