package example._1_creational._2_factory_method.factory;

import example._1_creational._2_factory_method.product.Product;
import example._1_creational._2_factory_method.product.RedProduct;

public class RedProductFactory extends ProductFactory {

  @Override
  public Product createProduct(String name, int price) {
    return new RedProduct(name, price, "이 상품은 빨간색입니다.");
  }
}
