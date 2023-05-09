package example._1_creational._1_singleton;

public class App {

  public static void main(String[] args) {
    Singleton1 singleton1 = Singleton1.getInstance();
    System.out.println(singleton1 == Singleton1.getInstance());
  }
}
