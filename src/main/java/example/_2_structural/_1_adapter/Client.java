package example._2_structural._1_adapter;

import example._2_structural._1_adapter.target.UserDetail;
import example._2_structural._1_adapter.target.UserDetailService;

public class Client {

  private UserDetailService userDetailService;

  public Client(UserDetailService userDetailService) {
    this.userDetailService = userDetailService;
  }

  public String login(String username, String password) {
    UserDetail userDetail = userDetailService.loadUser(username);
    if (userDetail.getPassword().equals(password)) {
      return userDetail.getUsername();
    }

    throw new IllegalArgumentException();
  }
}
