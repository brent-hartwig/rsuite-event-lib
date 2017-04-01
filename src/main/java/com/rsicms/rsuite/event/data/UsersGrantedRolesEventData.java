package com.rsicms.rsuite.event.data;

import java.util.ArrayList;
import java.util.List;

import com.rsicms.rsuite.event.MoreEventTypes;

/**
 * The event data class for the {@link MoreEventTypes#USERS_GRANTED_ROLES}. suited for a single user
 * being granted a single role, a single event may also be used to notify listeners about multiple
 * users being granted roles.
 */
public class UsersGrantedRolesEventData {

  /**
   * The list of tuples representing each granting user ID, receiving user ID, and role combinations
   * associated with this instance of the event.
   */
  private List<UserGrantedRoleEventData> eventDataList;

  /**
   * Default constructor. Tuples may immediately be added afterwards via
   * {@link #add(String, String, String)}.
   */
  public UsersGrantedRolesEventData() {
    eventDataList = new ArrayList<UserGrantedRoleEventData>(1);
  }

  /**
   * Handy if only firing the event for one tuple. No harm in stacking more on via
   * {@link #add(String, String, String)} as well.
   * 
   * @param grantingUserId
   * @param receivingUserId
   * @param roleName
   */
  public UsersGrantedRolesEventData(String grantingUserId, String receivingUserId,
      String roleName) {
    this();
    eventDataList.add(new UserGrantedRoleEventData(grantingUserId, receivingUserId, roleName));
  }

  /**
   * Add another tuple to this instance of the event.
   * 
   * @param grantingUserId
   * @param receivingUserId
   * @param roleName
   */
  public void add(String grantingUserId, String receivingUserId, String roleName) {
    eventDataList.add(new UserGrantedRoleEventData(grantingUserId, receivingUserId, roleName));
  }

  /**
   * Get all the tuples associated with this instance of the event.
   * 
   * @return List of UserGrantedRoleEventData instances which are all of the granting user ID,
   *         receiving user ID, and role name combinations associated with this instance of the
   *         event.
   */
  public List<UserGrantedRoleEventData> getAll() {
    return eventDataList;
  }

  /**
   * Event data for one combination of granting user ID, receiving user ID, and role name. There may
   * be more than one.
   */
  public class UserGrantedRoleEventData {

    private String grantingUserId;
    private String receivingUserId;
    private String roleName;

    public UserGrantedRoleEventData(String grantingUserId, String receivingUserId,
        String roleName) {
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

}
