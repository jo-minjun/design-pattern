package example._1_creational._2_factory_method;

import example._1_creational._2_factory_method.factory.BlueProductFactory;
import example._1_creational._2_factory_method.factory.GreenProductFactory;
import example._1_creational._2_factory_method.factory.RedProductFactory;

public class App {

  public static void main(String[] args) {
    Client client = new Client();

    client.print(new RedProductFactory());
    client.print(new GreenProductFactory());
    client.print(new BlueProductFactory());

    System.out.println("=======================================\n");

    client.printWithSimpleFactory("빨간 볼펜");
    client.printWithSimpleFactory("초록 볼펜");
    client.printWithSimpleFactory("파란 볼펜");
  }
}
