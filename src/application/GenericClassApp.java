package application;

import generic.MyData;

public class GenericClassApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    MyData<String> myData1 = new MyData<String>("Hello");
    System.out.println(myData1.getData());

    MyData<Integer> myData2 = new MyData<Integer>(123);
    System.out.println(myData2.getData());
  }
}
