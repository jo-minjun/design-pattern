package example._1_creational._1_singleton;

public class App {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton == Singleton.getInstance());
  }
}
