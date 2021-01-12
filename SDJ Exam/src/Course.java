import java.util.ArrayList;
import java.util.Arrays;

public class Course {

  private String name;
  private ArrayList<Lesson> schedule;

  public Course(String name) {
    this.name = name;
    this.schedule = new ArrayList<>();
  }
  public String getName() {
    return name;
  }
  public int getNumberOfLessons() {
    return schedule.size();
  }
  public void addLesson(Lesson lesson) {
    schedule.add(lesson);
  }
  public void removeLesson(Lesson lesson) {
    for(int i = 0; i < schedule.size(); i++) {
      if(schedule.get(i).equals(lesson)) {
        schedule.remove(i);
        break;
      }
    }
  }
  public boolean hasLessonOnDate(Date date) {
    for(int i = 0; i < schedule.size(); i++) {
      if(schedule.get(i).getDate().equals(date))
        return true;
    }
    return false;
  }
  public ArrayList<Lesson> getAllLessons() {
    return schedule;
  }
  public ArrayList<String> getAllTopics() {
    ArrayList<String> temp = new ArrayList<>();
    for(Lesson lesson : schedule) {
      temp.add(lesson.getTopic());
    }
    return temp;
  }
  public ArrayList<OnlineLesson> getOnlineLessons() {
    ArrayList<OnlineLesson> temp = new ArrayList<>();
    for(Lesson lesson : schedule) {
      if(lesson instanceof OnlineLesson)
        temp.add((OnlineLesson)lesson);
    }
    return temp;
  }
  public ArrayList<SkypeLesson> getSkypeLessons() {
    ArrayList<SkypeLesson> temp = new ArrayList<>();
    for(Lesson lesson : schedule) {
      if(lesson instanceof SkypeLesson)
        temp.add((SkypeLesson)lesson);
    }
    return temp;
  }

  public ArrayList<DiscordLesson> getDiscordLessonsWithVoice() {
    ArrayList<DiscordLesson> temp = new ArrayList<>();
    for(Lesson lesson : schedule) {
      if(lesson instanceof DiscordLesson && ((DiscordLesson) lesson).usesVoiceChannel())
        temp.add((DiscordLesson)lesson);
    }
    return temp;
  }
  public ArrayList<File> getAllResources() {
    ArrayList<File> temp = new ArrayList<>();
    for(Lesson lesson : schedule) {
      for(int i = 0; i < lesson.getResources().length; i++) {
        if(!(temp.contains(lesson.getResources()[i])))
          temp.add(lesson.getResources()[i]);

      }
    }
    return temp;
  }
  public String toString() {
    return "Course name: " + name + "\nSchedule: " + schedule;
  }
}
