package org.tripservice;

import org.tripservice.exception.UserNotLoggedInException;
import org.tripservice.trip.Trip;
import org.tripservice.trip.TripDAO;
import org.tripservice.user.User;
import org.tripservice.user.UserSession;

import java.util.ArrayList;
import java.util.List;

public class TripService_Original {

	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		List<Trip> tripList = new ArrayList<Trip>();
		User loggedUser = UserSession.getInstance().getLoggedUser();
		boolean isFriend = false;
		if (loggedUser != null) {
			for (User friend : user.getFriends()) {
				if (friend.equals(loggedUser)) {
					isFriend = true;
					break;
				}
			}
			if (isFriend) {
				tripList = TripDAO.findTripsByUser(user);
			}
			return tripList;
		} else {
			throw new UserNotLoggedInException();
		}
	}
	
}
