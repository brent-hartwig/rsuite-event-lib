package com.rsicms.rsuite.event;

/**
 * Defines the event types known by this library.
 */
public interface MoreEventTypes {

  /**
   * When a user is granted a role, this event is to be fired. The code granting the role is
   * responsible for firing the event.
   */
  final String USER_GRANTED_ROLE = "custom.user.granted.role";
}
