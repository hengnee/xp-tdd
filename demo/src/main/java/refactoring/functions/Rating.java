package refactoring.functions;

import org.apache.commons.lang3.StringUtils;

import static java.lang.Integer.parseInt;
import static org.apache.commons.lang3.StringUtils.isNumeric;

public class Rating {

  private final String rating;

  public Rating(String rating) {
    this.rating = rating;
  }

  public boolean isValidRating() {
    // guard clause
    if (this.getRating() == null) {
      return false;
    }
    if (isRatingB() && isValid()) {
      return true;
    }
    return isRatingA();
  }

  private boolean isValid() {
    return isNumeric(this.getRating().substring(1, 2))
        && parseInt(this.getRating().substring(1, 2)) > 0
        && parseInt(this.getRating().substring(1, 2)) < 5;
  }

  private boolean isRatingA() {
    return this.getRating().substring(0, 1).equalsIgnoreCase("A")
        && this.getRating().length() == 3
        && isNumeric(this.getRating().substring(1, 3));
  }

  private boolean isRatingB() {
    return this.getRating().substring(0, 1).equalsIgnoreCase("B") &&
        this.getRating().length() == 2;
  }

  private String getRating() {
    return rating;
  }

}
