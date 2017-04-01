package com.rsicms.rsuite.event;

import org.apache.commons.lang.StringUtils;

import com.reallysi.rsuite.api.event.Event;
import com.reallysi.rsuite.service.EventPublisher;
import com.rsicms.rsuite.event.data.UserGrantedRoleEventData;

/**
 * This class offers static methods to fire events known by this library.
 */
public class EventFiringStation {

  /**
   * Fire the "user was granted a role" event, without having to pass in an arbitrary string.
   * 
   * @param eventPublisher RSuite's event publisher.
   * @param eventSource The object firing the event.
   * @param grantingUserId The ID of the user that granted the role.
   * @param receivingUserId The ID of the user that received the role.
   * @param roleName The name of the role granted to the user.
   */
  public static final void fireUserGrantedRoleEvent(EventPublisher eventPublisher,
      Object eventSource, String grantingUserId, String receivingUserId, String roleName) {
    eventPublisher
        .publish(new Event(MoreEventTypes.USER_GRANTED_ROLE, eventSource, StringUtils.EMPTY,
            new UserGrantedRoleEventData(grantingUserId, receivingUserId, roleName)));
  }

  /**
   * Fire the "user was granted a role" event.
   * 
   * @param eventPublisher RSuite's event publisher.
   * @param eventSource The object firing the event.
   * @param eventText An arbitrary string passed on to the event listeners.
   * @param grantingUserId The ID of the user that granted the role.
   * @param receivingUserId The ID of the user that received the role.
   * @param roleName The name of the role granted to the user.
   */
  public static final void fireUserGrantedRoleEvent(EventPublisher eventPublisher,
      Object eventSource, String eventText, String grantingUserId, String receivingUserId,
      String roleName) {
    eventPublisher.publish(new Event(MoreEventTypes.USER_GRANTED_ROLE, eventSource, eventText,
        new UserGrantedRoleEventData(grantingUserId, receivingUserId, roleName)));
  }

}
