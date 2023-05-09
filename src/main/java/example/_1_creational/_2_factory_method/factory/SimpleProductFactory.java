package example._1_creational._2_factory_method.factory;

import example._1_creational._2_factory_method.product.Product;
import example._1_creational._2_factory_method.product.RedProduct;

public class SimpleProductFactory extends ProductFactory {

  @Override
  Product createProduct(String name, int price) {
    return switch (name) {
      case "빨간 볼펜" -> new RedProduct(name, price, "이 상품은 빨간색입니다.");
      case "초록 볼펜" -> new RedProduct(name, price, "이 상품은 초록색입니다.");
      case "파란 볼펜" -> new RedProduct(name, price, "이 상품은 파란색입니다.");
      default -> throw new IllegalArgumentException("존재하지 않는 상품입니다.");
    };
  }
}
