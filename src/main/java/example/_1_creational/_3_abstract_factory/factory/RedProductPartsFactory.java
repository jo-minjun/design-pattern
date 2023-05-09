package example._1_creational._3_abstract_factory.factory;

import example._1_creational._3_abstract_factory.product.ProductPart1;
import example._1_creational._3_abstract_factory.product.ProductPart2;
import example._1_creational._3_abstract_factory.product.RedProductPart1;
import example._1_creational._3_abstract_factory.product.RedProductPart2;

public class RedProductPartsFactory implements ProductPartsFactory {

  @Override
  public ProductPart1 createProductPart1() {
    return new RedProductPart1();
  }

  @Override
  public ProductPart2 createProductPart2() {
    return new RedProductPart2();
  }
}
