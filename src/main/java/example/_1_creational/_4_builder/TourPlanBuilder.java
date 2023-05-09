package example._1_creational._4_builder;

import java.time.LocalDate;

public interface TourPlanBuilder {

  TourPlanBuilder title(String title);

  TourPlanBuilder nightsAndDays(int nights, int days);

  TourPlanBuilder startDate(LocalDate startDate);

  TourPlanBuilder whereToStay(String whereToStay);

  TourPlanBuilder addPlan(int day, String plan);

  TourPlan getPlan();
}
