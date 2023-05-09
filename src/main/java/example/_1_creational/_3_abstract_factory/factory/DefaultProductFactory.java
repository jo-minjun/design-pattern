package example._1_creational._3_abstract_factory.factory;

import example._1_creational._3_abstract_factory.product.Product;

public class DefaultProductFactory extends ProductFactory {

  private final ProductPartsFactory productPartsFactory;

  public DefaultProductFactory(ProductPartsFactory productPartsFactory) {
    this.productPartsFactory = productPartsFactory;
  }

  @Override
  Product createProduct(String name, int price) {
    return new Product(name, price, productPartsFactory.createProductPart1(), productPartsFactory.createProductPart2());
  }
}
