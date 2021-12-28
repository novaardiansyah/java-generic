package application;

public class ConstraintApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    NumberData<Integer> integerNumber = new NumberData<>(11000);
    NumberData<Long> longNumber = new NumberData<>(1100L);

    System.out.println("integer number: " + integerNumber.getData());
    System.out.println("long number: " + longNumber.getData());

    // ! Error : Cannot infer type of variable 'number'
    // NumberData<String> stringNumber = new NumberData<>("11000");
  }

  /**
   * ! Constraint
   * by default is object
   * but can be changed to derivative like below
   */
  public static class NumberData<T extends Number> {
    private T data;

    public NumberData(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }
  }
}