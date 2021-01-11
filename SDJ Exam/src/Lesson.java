import java.util.ArrayList;
import java.util.Arrays;

public class Lesson {

  private String topic;
  private Date date;
  private File[] resources;
  private Time start;
  private Time end;
  private int delayed;

  public Lesson(String topic, Date date, Time start, Time end, File[] res) {
    if(hasValidTime(start, end)) {
      this.topic = topic;
      this.date = date.copy();
      this.resources = res;
      this.start = start.copy();
      this.end = end.copy();
      this.delayed = 0;
    }
    else
      throw new IllegalArgumentException("Invalid time - the lesson can not take place earlier than 8:20 or later than 21:15 and it has to start before it ends.");
  }

  public String getTopic() {
    return topic;
  }
  public Date getDate() {
    return date.copy();
  }
  //Currently returns the address, not the actual values of elements
  public File[] getResources() {
    return resources;
  }
  public ArrayList<File> getAllPDFs() {
    ArrayList<File> temp = new ArrayList<>();
    for(int i = 0; i < resources.length; i++) {
      if(resources[i].isPDF())
        temp.add(resources[i]);
    }
    return temp;
  }
  public Time getDuration() {
    return start.timeTo(end);
  }
  public static boolean hasValidTime(Time startTime, Time endTime) {
    return (startTime.convertToSeconds() >= 30000 && endTime.convertToSeconds() <= 76500 && startTime.isBefore(endTime));
  }
  public void delayBy(int minutes) {
    if (delayed == 0) {
      Time localStart = start.copy();
      Time localEnd = end.copy();
      if (minutes <= 120) {
        localStart.tic(minutes * 60);
        localEnd.tic(minutes * 60);
        if (hasValidTime(localStart, localEnd)) {
          start.tic(minutes * 60);
          end.tic(minutes * 60);
          delayed++;
        }
        else
          throw new IllegalArgumentException("Invalid end and/or start time");
      }
      else
        throw new IllegalArgumentException("The lesson can not be delayed by more than 120 minutes");
    }
    else
      throw new IllegalArgumentException("The lesson has been already delayed");
  }
  public String getDateTimeString() {
    return date + " " + start + " - " + end;
  }
  public String toString() {
    return "\nTopic: " + topic + ", " + getDateTimeString() + "\nResources: " + Arrays.toString(resources);
  }


}
