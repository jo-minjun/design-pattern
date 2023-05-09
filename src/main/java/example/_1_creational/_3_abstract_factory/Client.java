package example._1_creational._3_abstract_factory;

import example._1_creational._3_abstract_factory.product.Product;

public class Client {

  public void print(Product product) {
    System.out.println(product.getName());
    System.out.println(product.getPart1().getClass());
    System.out.println(product.getPart2().getClass());
    System.out.println();
  }
}
