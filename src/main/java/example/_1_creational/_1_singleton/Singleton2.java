package example._1_creational._1_singleton;

/**
 * Thread safe 하지만, 인스턴스가 생성되는데 시간이 오래걸리면 애플리케이션의 부트가 느려진다.
 */
public class Singleton2 {

  private final static Singleton2 INSTANCE = new Singleton2();

  private Singleton2() {
  }

  public static Singleton2 getInstance() {
    return INSTANCE;
  }
}
