package application;

public class MultipleConstraintApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    // Data<Manager> managerData = new Data<Manager>(new Manager());
    // Data<VicePresident> vicePresidentData = new Data<VicePresident>(new
    // VicePresident());
  }

  public static interface CanSayHello {
    public void sayHello(String name);
  }

  public static abstract class Employee {

  }

  public static class Manager extends Employee {

  }

  public static class VicePresident extends Employee implements CanSayHello {

    @Override
    public void sayHello(String name) {
      System.out.println("Hello " + name);
    }

  }

  public static class Data<T extends Employee & CanSayHello> {
    private T data;

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
      this.data.sayHello("name");
    }

  }
}
