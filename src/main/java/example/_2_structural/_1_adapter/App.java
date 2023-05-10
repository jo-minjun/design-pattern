package example._2_structural._1_adapter;

import example._2_structural._1_adapter.adapter.AccountUserDetailServiceAdapter;
import example._2_structural._1_adapter.adaptee.AccountService;

public class App {

  public static void main(String[] args) {
    AccountUserDetailServiceAdapter adapter = new AccountUserDetailServiceAdapter(new AccountService());

    Client client = new Client(adapter);
    String login = client.login("minjun", "random");

    System.out.println(login);
  }
}
