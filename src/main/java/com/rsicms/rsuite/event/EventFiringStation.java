package com.rsicms.rsuite.event;

import org.apache.commons.lang.StringUtils;

import com.reallysi.rsuite.api.event.Event;
import com.reallysi.rsuite.service.EventPublisher;
import com.rsicms.rsuite.event.data.UsersGrantedRolesEventData;

/**
 * This class offers static methods to fire events known by this library.
 */
public class EventFiringStation {

  /**
   * Fire the "users were granted roles" event, for one user, without having to pass in an arbitrary
   * string.
   * 
   * @param eventPublisher RSuite's event publisher.
   * @param eventSource The object firing the event.
   * @param grantingUserId The ID of the user that granted the role.
   * @param receivingUserId The ID of the user that received the role.
   * @param roleName The name of the role granted to the user.
   */
  public static final void fireUsersGrantedRolesEvent(EventPublisher eventPublisher,
      Object eventSource, String grantingUserId, String receivingUserId, String roleName) {
    fireUsersGrantedRolesEvent(eventPublisher, eventSource, StringUtils.EMPTY, grantingUserId,
        receivingUserId, roleName);
  }

  /**
   * Fire the "users were granted roles" event, for one user.
   * 
   * @param eventPublisher RSuite's event publisher.
   * @param eventSource The object firing the event.
   * @param eventText An arbitrary string passed on to the event listeners.
   * @param grantingUserId The ID of the user that granted the role.
   * @param receivingUserId The ID of the user that received the role.
   * @param roleName The name of the role granted to the user.
   */
  public static final void fireUsersGrantedRolesEvent(EventPublisher eventPublisher,
      Object eventSource, String eventText, String grantingUserId, String receivingUserId,
      String roleName) {
    fireUsersGrantedRolesEvent(eventPublisher, eventSource, eventText,
        new UsersGrantedRolesEventData(grantingUserId, receivingUserId, roleName));
  }

  /**
   * Fire the "users were granted roles" event, for one or more users, without having to pass in an
   * arbitrary string.
   * 
   * @param eventPublisher RSuite's event publisher.
   * @param eventSource The object firing the event.
   * @param eventData The event's data. This method supports firing the event for multiple
   *        combinations of granting user ID, receiving user ID, and role name.
   */
  public static final void fireUsersGrantedRolesEvent(EventPublisher eventPublisher,
      Object eventSource, UsersGrantedRolesEventData eventData) {
    fireUsersGrantedRolesEvent(eventPublisher, eventSource, StringUtils.EMPTY, eventData);
  }

  /**
   * Fire the "users were granted roles" event, for one or more users.
   * 
   * @param eventPublisher RSuite's event publisher.
   * @param eventSource The object firing the event.
   * @param eventText An arbitrary string passed on to the event listeners.
   * @param eventData The event's data. This method supports firing the event for multiple
   *        combinations of granting user ID, receiving user ID, and role name.
   */
  public static final void fireUsersGrantedRolesEvent(EventPublisher eventPublisher,
      Object eventSource, String eventText, UsersGrantedRolesEventData eventData) {
    eventPublisher
        .publish(new Event(MoreEventTypes.USERS_GRANTED_ROLES, eventSource, eventText, eventData));
  }

}
