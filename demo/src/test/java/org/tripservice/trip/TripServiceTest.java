package org.tripservice.trip;

import org.junit.Before;
import org.junit.Test;
import org.tripservice.exception.UserNotLoggedInException;
import org.tripservice.user.User;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TripServiceTest {

  public static final User SOME_USER = null;
  private static final User GUEST = null;
  private static final User REGISTERED_USER = new User();
  private static User ANOTHER_USER = new User();
  private static final Trip TO_SINGAPORE = new Trip();
  private static final Trip TO_INDONESIA = new Trip();
  private User loggedInUser;
  TripService tripService;
  @Before
  public void setup() {
    tripService = new TestableTripService();
    loggedInUser = REGISTERED_USER;
    ANOTHER_USER = new User();
  }

  @Test(expected = UserNotLoggedInException.class) public void
  should_throw_an_exception_when_the_user_is_not_logged_in() {
    loggedInUser = GUEST;
    tripService.getTripsByUser(SOME_USER);
  }

  @Test public void
  should_not_return_any_trips_when_users_are_not_friends() {

    User notFriend = ANOTHER_USER;
    notFriend.addTrip(TO_SINGAPORE);

    List<Trip> trips = tripService.getTripsByUser(notFriend);
    assertEquals(0, trips.size());
  }

  @Test public void
  should_return_friend_trips_when_user_are_friends() {
    User friend = ANOTHER_USER;
    friend.addFriend(loggedInUser);
    friend.addTrip(TO_SINGAPORE);
    friend.addTrip(TO_INDONESIA);

    List<Trip> trips = tripService.getTripsByUser(friend);
    assertEquals(2, trips.size());

  }
  private class TestableTripService extends TripService {
    @Override
    protected User getLoggedInUser() {
      return loggedInUser;
    }

    @Override
    protected List<Trip> getTripsBy(User user) {
      return user.trips();
    }
  }
}
