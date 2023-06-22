package org.tripservice.trip;

import org.tripservice.user.User;

public class UserBuilder {
  private User[] friends = new User[]{};
  private Trip[] trips = new Trip[]{};

  public static UserBuilder aUser() {
    return new UserBuilder();
  }

  public UserBuilder friendsWith(User... anotherUsers) {
    this.friends = anotherUsers;
    return this;
  }

  public UserBuilder withTrips(Trip... trips) {
    this.trips = trips;
    return this;
  }

  public User build() {
    User user = new User();
    addTripsToUser(user);
    addFriendsToUser(user);
    return user;
  }

  private void addTripsToUser(User user) {
    for(Trip trip: this.trips) {
      user.addTrip(trip);
    }
  }
  private void addFriendsToUser(User user) {
    for(User friend : this.friends) {
      user.addFriend(friend);
    }
  }
}
