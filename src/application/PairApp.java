package application;

import generic.Pair;

public class PairApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Pair<String, Integer> pair1 = new Pair<String, Integer>("Hello", 123);
    System.out.println(pair1.getFirst());
    System.out.println(pair1.getSecond());
  }
}
