package com.rsicms.rsuite.event;

/**
 * Defines the event types known by this library.
 */
public interface MoreEventTypes {

  /**
   * When one or more users are granted roles, this event is to be fired. The code granting the
   * role(s) is responsible for firing the event.
   */
  final String USERS_GRANTED_ROLES = "custom.users.granted.roles";
}
