package com.rsicms.rsuite.event.data;

import java.util.ArrayList;
import java.util.List;

import com.rsicms.rsuite.event.MoreEventTypes;
import com.rsicms.rsuite.helpers.UserGrantedRoleTuple;

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
  private List<UserGrantedRoleTuple> userGrantedRoleTuples;

  /**
   * Default constructor. Tuples may immediately be added afterwards via
   * {@link #add(String, String, String)}.
   */
  public UsersGrantedRolesEventData() {
    userGrantedRoleTuples = new ArrayList<UserGrantedRoleTuple>(1);
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
    userGrantedRoleTuples.add(new UserGrantedRoleTuple(grantingUserId, receivingUserId, roleName));
  }

  /**
   * Add another tuple to this instance of the event.
   * 
   * @param grantingUserId
   * @param receivingUserId
   * @param roleName
   */
  public void add(String grantingUserId, String receivingUserId, String roleName) {
    userGrantedRoleTuples.add(new UserGrantedRoleTuple(grantingUserId, receivingUserId, roleName));
  }

  /**
   * Find out if this event data object has information on at least one user being granted a role.
   * 
   * @return True if instance is aware of at least one user being granted a role.
   */
  public boolean hasUserWithGrantedRole() {
    return userGrantedRoleTuples != null && userGrantedRoleTuples.size() > 0;
  }

  /**
   * Get all the tuples associated with this instance of the event.
   * 
   * @return List of UserGrantedRoleTuple instances which are all of the granting user ID, receiving
   *         user ID, and role name combinations associated with this instance of the event.
   */
  public List<UserGrantedRoleTuple> getAll() {
    return userGrantedRoleTuples;
  }

}
