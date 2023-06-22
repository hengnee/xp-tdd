package org.tripservice.user;

import org.junit.Test;
import org.tripservice.trip.UserBuilder;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {

  private static final User BOB = new User();
  private static final User PAUL = new User();

  @Test public void
  should_inform_when_user_is_not_friend() {
    User user = UserBuilder.aUser()
        .friendsWith(BOB)
        .build();
    assertFalse(user.isFriendsWith(PAUL));
  }

  @Test public void
  should_inform_when_users_are_friends() {
    User user = UserBuilder.aUser()
        .friendsWith(BOB, PAUL)
        .build();
    assertTrue(user.isFriendsWith(PAUL));
  }
}
