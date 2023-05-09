package example._1_creational._2_factory_method.product;

public class Product {

  private String name;

  private int price;

  public Product(String name, int price, String detail) {
    this.name = name;
    this.price = price;
    this.detail = detail;
  }

  private String detail;

  public String getName() {
    return name;
  }

  public String getDetail() {
    return detail;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", detail='" + detail + '\'' +
        '}';
  }
}
