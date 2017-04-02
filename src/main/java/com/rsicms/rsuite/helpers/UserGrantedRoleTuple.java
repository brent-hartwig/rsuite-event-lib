package com.rsicms.rsuite.helpers;

/**
 * Information available about a user being granted a role.
 */
public class UserGrantedRoleTuple {

  private String grantingUserId;
  private String receivingUserId;
  private String roleName;

  public UserGrantedRoleTuple(String grantingUserId, String receivingUserId, String roleName) {
    this.grantingUserId = grantingUserId;
    this.receivingUserId = receivingUserId;
    this.roleName = roleName;
  }

  /**
   * @return the grantingUserId
   */
  public String getGrantingUserId() {
    return grantingUserId;
  }

  /**
   * @return the receivingUserId
   */
  public String getReceivingUserId() {
    return receivingUserId;
  }

  /**
   * @return the roleName
   */
  public String getRoleName() {
    return roleName;
  }
}
