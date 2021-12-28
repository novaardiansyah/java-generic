package application;

import generic.MyData;

public class Contravariant {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    MyData<Object> objectMyData = new MyData<>("John Doe");
    MyData<? super String> myData = objectMyData;

    process(objectMyData);
    System.out.println(myData.getData());
  }

  public static void process(MyData<? super String> data) {
    data.setData("Khun Leo");
  }
}