public class Date {

  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year) {

    this.day = day;
    this.month = month;
    this.year = year;
  }
  public Date copy() {
    return new Date(day, month, year);
  }
  public boolean equals(Object banana) {
    if(!(banana instanceof Date))
      return false;
    Date temp = (Date) banana;
    return (temp.day == day && temp.month == month && temp.year == year);
  }
  public String toString() {
    return String.format("%02d/%02d/%04d", day, month, year);
  }
}
