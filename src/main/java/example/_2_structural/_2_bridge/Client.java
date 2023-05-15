package example._2_structural._2_bridge;

public class Client {

  public static void main(String[] args) {
    Champion KDA_ari = new Ari(new KDA());
    KDA_ari.move();
  }
}
