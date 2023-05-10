package example._2_structural._1_adapter.adapter;

import example._2_structural._1_adapter.target.UserDetail;
import example._2_structural._1_adapter.target.UserDetailService;
import example._2_structural._1_adapter.adaptee.Account;
import example._2_structural._1_adapter.adaptee.AccountService;

public class AccountUserDetailServiceAdapter implements UserDetailService {

  private AccountService accountService;

  public AccountUserDetailServiceAdapter(AccountService accountService) {
    this.accountService = accountService;
  }

  @Override
  public UserDetail loadUser(String username) {
    Account account = accountService.findAccountByUsername(username);
    return new AccountUserDetailAdapter(account);
  }
}
