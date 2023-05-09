package example._1_creational._2_factory_method.factory;

import example._1_creational._2_factory_method.product.GreenProduct;
import example._1_creational._2_factory_method.product.Product;

public class GreenProductFactory extends ProductFactory {

  @Override
  public Product createProduct(String name, int price) {
    return new GreenProduct(name, price, "이 상품은 초록색입니다.");
  }
}
