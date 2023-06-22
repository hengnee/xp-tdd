package refactoring.comments;

public class Matcher {
  public Matcher() {}

  public boolean match(int[] expected, int[] actual,
                       int clipLimit, int delta) {

    clipTooLargeValues(actual, clipLimit);

    if (isLengthSame(expected, actual))
      return false;

    return isWitinExpectedDelta(expected, actual, delta);
  }

  private static boolean isLengthSame(int[] expected, int[] actual) {
    return actual.length != expected.length;
  }

  private static boolean isWitinExpectedDelta(int[] expected, int[] actual, int delta) {
    for (int i = 0; i < actual.length; i++)
      if (Math.abs(expected[i] - actual[i]) > delta)
        return false;
    return true;
  }

  private static void clipTooLargeValues(int[] actual, int clipLimit) {
    for (int i1 = 0; i1 < actual.length; i1++)
      if (actual[i1] > clipLimit)
        actual[i1] = clipLimit;
  }

}
