package refactoring.naming;

class Event {
  public static final int SATURDAY = 6;
  public static final int SUNDAY = 0;
  public static final int START_WORK_HOUR = 8;
  public static final int END_WORK_HOURS = 18;
  private final int d;
  private final Time t;

  public Event(int d, Time t) {
    this.d = d;
    this.t = t;
  }
  public int getDay() {
    return d;
  }

  public Time getTime() {
    return t;
  }

  public boolean canApply() {
    if (this.getDay() == SATURDAY || this.getDay() == SUNDAY) {
      return false;
    } else {
      return (this.getTime().getHour() >= START_WORK_HOUR && this.getTime().getHour() < END_WORK_HOURS);
    }
  }
}
