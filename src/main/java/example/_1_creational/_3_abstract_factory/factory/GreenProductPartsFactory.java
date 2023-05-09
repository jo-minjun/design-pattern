package example._1_creational._3_abstract_factory.factory;

import example._1_creational._3_abstract_factory.product.GreenProductPart1;
import example._1_creational._3_abstract_factory.product.GreenProductPart2;
import example._1_creational._3_abstract_factory.product.ProductPart1;
import example._1_creational._3_abstract_factory.product.ProductPart2;

public class GreenProductPartsFactory implements ProductPartsFactory {

  @Override
  public ProductPart1 createProductPart1() {
    return new GreenProductPart1();
  }

  @Override
  public ProductPart2 createProductPart2() {
    return new GreenProductPart2();
  }
}
