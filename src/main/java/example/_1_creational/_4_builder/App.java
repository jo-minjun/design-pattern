package example._1_creational._4_builder;

public class App {

  public static void main(String[] args) {
    TourPlan tourPlan1 = new TourDirector(new DefaultTourBuilder()).cancunTrip();
    System.out.println(tourPlan1);

    TourPlan tourPlan2 = new TourDirector(new DefaultTourBuilder()).longBeachTrip();
    System.out.println(tourPlan2);
  }
}
