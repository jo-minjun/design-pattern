package example._1_creational._3_abstract_factory.factory;

import example._1_creational._3_abstract_factory.product.Product;

public abstract class ProductFactory {

  public Product create(String name, int price) {
    validate(price);
    prepareFor(name);
    Product product = createProduct(name, price);
    delivery(product);

    return product;
  }

  abstract Product createProduct(String name, int price);

  private void validate(int price) {
    if (price < 0) {
      throw new IllegalArgumentException("상품 가격은 0원 이하일 수 없습니다.");
    }
  }

  private void prepareFor(String name) {
    System.out.printf("%s 상품 생산 중...\n", name);
  }

  private void delivery(Product product) {
    System.out.printf("%s 상품을 발송했습니다. (%s)\n", product.getName(), product.getPrice());
  }
}
