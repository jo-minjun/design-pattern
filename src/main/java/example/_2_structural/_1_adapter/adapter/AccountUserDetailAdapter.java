package example._2_structural._1_adapter.adapter;

import example._2_structural._1_adapter.target.UserDetail;
import example._2_structural._1_adapter.adaptee.Account;

public class AccountUserDetailAdapter implements UserDetail {

  private Account account;

  public AccountUserDetailAdapter(Account account) {
    this.account = account;
  }

  @Override
  public String getUsername() {
    return account.getName();
  }

  @Override
  public String getPassword() {
    return account.getPassword();
  }
}
