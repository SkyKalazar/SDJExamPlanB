public class Time {

  private int hour;
  private int minute;
  private int second;

  public Time(int h, int m, int s) {

    this.hour = h;
    this.minute = m;
    this.second = s;
  }
  public Time(int totalTimeInSeconds) {

    this.hour = totalTimeInSeconds/3600;
    totalTimeInSeconds = totalTimeInSeconds - hour*3600;
    this.minute = totalTimeInSeconds/60;
    this.second = totalTimeInSeconds%60;
  }

  public void tic() {
    if(hour == 23 && minute == 59 && second == 59) {
      hour = 0;
      minute = 0;
      second = 0;
    }
    else if(minute == 59 && second == 59) {
      hour++;
      minute = 0;
      second = 0;
    }
    else if(second == 59) {
      minute++;
      second = 0;
    }
    else
      second++;

  }
  public void tic(int seconds) {
    for(int i = 0; i < seconds; i++)
      tic();
  }

  public int convertToSeconds() {
    return hour*3600 + minute*60 + second;
  }

  public boolean isBefore(Time time2) {
    return (time2.convertToSeconds() > convertToSeconds());
  }

  public Time timeTo(Time time2) {
    int temp = time2.convertToSeconds() - convertToSeconds();
    return new Time(temp);
  }

  public Time copy() {
    return new Time(hour, minute, second);
  }

  public boolean equals(Object banana) {
    if(!(banana instanceof Time))
      return false;
    Time temp = (Time) banana;
    return(temp.hour == hour && temp.minute == minute && temp.second == second);
  }

  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}
