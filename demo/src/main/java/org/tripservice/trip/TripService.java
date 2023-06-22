package org.tripservice.trip;

import org.tripservice.exception.UserNotLoggedInException;
import org.tripservice.user.User;
import org.tripservice.user.UserSession;

import java.util.ArrayList;
import java.util.List;

public class TripService {

	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		User loggedUser = getLoggedInUser();
		if (loggedUser == null) { //guard
			throw new UserNotLoggedInException();
		}

		return user.isFriendsWith(loggedUser)
			? getTripsBy(user)
			: noTrips();
	}

	private static ArrayList<Trip> noTrips() {
		return new ArrayList<>();
	}

	protected List<Trip> getTripsBy(User user) {
		return TripDAO.findTripsByUser(user);
	}

	protected User getLoggedInUser() {
		return UserSession.getInstance().getLoggedUser();
	}

}
