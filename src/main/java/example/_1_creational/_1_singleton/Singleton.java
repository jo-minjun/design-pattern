package example._1_creational._1_singleton;

public class Singleton {

  private Singleton() {
  }

  public static Singleton getInstance() {
    return SingletonHolder.INSTANCE;
  }

  // getInstance 를 호출하기 전까지 SingletonHolder 의 Singleton 인스턴스가 생성되지 않는다.
  // Lazy Loading 이면서, Thread safe한 방법이다.
  private static final class SingletonHolder {
    private static final Singleton INSTANCE = new Singleton();
  }
}
