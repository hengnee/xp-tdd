package refactoring.functions;

import org.apache.commons.lang3.StringUtils;

public class Rating {

  private final String rating;

  public Rating(String rating) {
    this.rating = rating;
  }

  public boolean isValidRating() {
    return this.getRating() == null ||
          (isValidRating("A", 3)) ||
          (isValidRating("B", 2) && isBRatingWithinRange(5));
  }

  private String getRating() {
    return rating;
  }

  private boolean isBRatingWithinRange(int max) {
    int range = Integer.parseInt(this.getRating().substring(1, 2));
    return  range > 0 && range < max;
  }

  private boolean isValidRating(String prefix, int limit) {
    return this.getRating().substring(0, 1).equalsIgnoreCase(prefix) &&
            this.getRating().length() == limit &&
            StringUtils.isNumeric(this.getRating().substring(1, limit));
  }
}
