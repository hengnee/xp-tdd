package org.tripservice.trip;

import java.util.List;

import org.tripservice.exception.CollaboratorCallException;
import org.tripservice.user.User;

public class TripDAO {

	public static List<Trip> findTripsByUser(User user) {
		throw new CollaboratorCallException(
				"TripDAO should not be invoked on an unit test.");
	}
	
}