package example._1_creational._3_abstract_factory.product;

public class Product {

  private final String name;
  private final int price;
  private final ProductPart1 part1;
  private final ProductPart2 part2;

  public Product(String name, int price, ProductPart1 part1, ProductPart2 part2) {
    this.name = name;
    this.price = price;
    this.part1 = part1;
    this.part2 = part2;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public ProductPart1 getPart1() {
    return part1;
  }

  public ProductPart2 getPart2() {
    return part2;
  }
}
