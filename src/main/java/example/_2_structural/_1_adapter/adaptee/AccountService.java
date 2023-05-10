package example._2_structural._1_adapter.adaptee;

public class AccountService {

  public Account findAccountByUsername(String username) {
    return new Account(username, "random", username + "@gmail.com");
  }

  public void createNewAccount(Account account) {

  }

  public void updateAccount(Account account) {

  }
}
