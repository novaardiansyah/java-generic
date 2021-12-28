package application;

import generic.MyData;

public class WildcardApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    print(new MyData<Integer>(1000));
    print(new MyData<String>("Hello"));
  }

  /**
   * ! Wildcard :
   * will accept a parameter with any data type (object)
   * be careful when converting data types
   */
  public static void print(MyData<?> myData) {
    System.out.println(myData.getData());
  }
}
