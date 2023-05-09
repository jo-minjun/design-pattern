package example._1_creational._3_abstract_factory;

import example._1_creational._3_abstract_factory.factory.DefaultProductFactory;
import example._1_creational._3_abstract_factory.factory.GreenProductPartsFactory;
import example._1_creational._3_abstract_factory.factory.RedProductPartsFactory;

public class App {

  public static void main(String[] args) {
    Client client = new Client();

    client.print(new DefaultProductFactory((new RedProductPartsFactory())).create("빨간 상품", 1000));

    client.print(new DefaultProductFactory((new GreenProductPartsFactory())).create("초록 상품", 1000));
  }
}
