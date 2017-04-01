# rsuite-event-lib
An RSuite Java library for events, specifically custom events.

The initial pattern for each custom event known by this library:

1. Define the event's name in MoreEventTypes.
2. Define an event data class for the event, within the data package.
3. Add a method or two in EventFiringStation that fires the event.

The first event known by this library is for one or more users being granted a role.
