package example._1_creational._1_singleton;

/**
 * getInstance 를 호출하기 전까지 SingletonHolder 의 Singleton 인스턴스가 생성되지 않는다.
 * Lazy Loading 이면서, Thread safe한 방법이다.
 */
public class Singleton1 {

  private Singleton1() {
  }

  public static Singleton1 getInstance() {
    return SingletonHolder.INSTANCE;
  }

  private static final class SingletonHolder {
    private static final Singleton1 INSTANCE = new Singleton1();
  }
}
