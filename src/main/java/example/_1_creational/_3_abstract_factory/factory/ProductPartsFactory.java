package example._1_creational._3_abstract_factory.factory;

import example._1_creational._3_abstract_factory.product.ProductPart2;
import example._1_creational._3_abstract_factory.product.ProductPart1;

public interface ProductPartsFactory {

  ProductPart1 createProductPart1();

  ProductPart2 createProductPart2();
}
