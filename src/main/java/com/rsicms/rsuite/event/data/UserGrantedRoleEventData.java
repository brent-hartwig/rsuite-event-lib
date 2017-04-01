package com.rsicms.rsuite.event.data;

/**
 * The event data class for the TODO
 */
public class UserGrantedRoleEventData {

  private String grantingUserId;
  private String receivingUserId;
  private String roleName;

  public UserGrantedRoleEventData(String grantingUserId, String receivingUserId, String roleName) {
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
