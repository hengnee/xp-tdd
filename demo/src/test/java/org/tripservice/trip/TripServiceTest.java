package org.tripservice.trip;

import org.junit.Test;
import org.tripservice.exception.UserNotLoggedInException;
import org.tripservice.user.User;

public class TripServiceTest {

  public static final User SOME_USER = null;
  private static final User GUEST = null;

  private User loggedInUser;
  @Test(expected = UserNotLoggedInException.class) public void
  should_throw_an_exception_when_the_user_is_not_logged_in() {
    TripService tripService = new TestableTripService();
    loggedInUser = GUEST;
    tripService.getTripsByUser(SOME_USER);
  }

  private class TestableTripService extends TripService {
    @Override
    protected User getLoggedInUser() {
      return loggedInUser;
    }
  }
}
