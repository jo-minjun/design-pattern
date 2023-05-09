package example._1_creational._2_factory_method;

import example._1_creational._2_factory_method.factory.ProductFactory;
import example._1_creational._2_factory_method.factory.SimpleProductFactory;
import example._1_creational._2_factory_method.product.Product;

public class Client {

  public void print(ProductFactory factory) {
    Product product = factory.create("볼팬", 1000);
    System.out.println(product + "\n");
  }

  public void printWithSimpleFactory(String name) {
    Product product = new SimpleProductFactory().create(name, 1000);
    System.out.println(product + "\n");
  }
}
