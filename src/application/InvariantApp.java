package application;

import generic.MyData;

public class InvariantApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    /**
     * ? Invariant: from child to parent
     */

    // MyData<String> data1 = new MyData<String>("John");
    // ! Error: data1 is not a MyData<Object>
    // doIt(data1);

    // ! Error: cannot convert from MyData<String> to MyData<Object>
    // MyData<Object> data2 = data1;

    /**
     * ? Invariant: from parent to child
     */

    // MyData<Object> data3 = new MyData<>(1000);

    // ! Error: cannot convert from MyData<String> to MyData<Object>
    // MyData<Integer> data4 = data3;
  }

  public static void doIt(MyData<Object> objectMyData) {
    /**
     * ! Invariant:
     * cannot be passed down to a child or raised to a parent
     */
  }
}
