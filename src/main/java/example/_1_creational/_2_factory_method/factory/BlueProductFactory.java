package example._1_creational._2_factory_method.factory;

import example._1_creational._2_factory_method.product.BlueProduct;
import example._1_creational._2_factory_method.product.Product;

public class BlueProductFactory extends ProductFactory {

  @Override
  public Product createProduct(String name, int price) {
    return new BlueProduct(name, price, "이 상품은 파란색입니다.");
  }
}
