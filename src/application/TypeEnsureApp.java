package application;

// import generic.MyData;

public class TypeEnsureApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    /**
     * ! Type Erasure :
     * remove generic info from a class
     * not an error when compiling but an error when running
     */
    // MyData myData = new MyData("Eko Prasetyo");

    // MyData<Integer> myData1 = (MyData<Integer>) myData;
    // Integer integer = myData1.getData();

    // System.out.println(integer);
  }
}
