import java.util.ArrayList;

public class Student {

  private int studentNumber;
  private String name;
  private ArrayList<Course> courses;
  private ArrayList<Grade> grades;

  public Student(int studentNumber, String name) {
    this.studentNumber = studentNumber;
    this.name = name;
    this.courses = new ArrayList<>();
    this.grades = new ArrayList<>();
  }
  public int getStudentNumber() {
    return studentNumber;
  }
  public String getName() {
    return name;
  }
  public void addCourse(Course course) {
    courses.add(course);
  }
  public void addGrade(int grade, Course course) {
    for(Course subject : courses) {
      if(subject.equals(course)) {
        grades.add(new Grade(grade, course));
      }
    }
  }
  public double getGradeAverage() {
    double sum = 0;
    for(Grade grade : grades) {
      sum += grade.getGrade();
    }
    return sum/grades.size();
  }

  public Grade[] getAllGrades() { 
    Grade[] temp = new Grade[grades.size()];
    for(int i = 0; i < grades.size(); i++) {
      temp[i] = grades.get(i).copy();
    }
    return temp;
  }

  public Course[] getAllCourses() {
    Course[] temp = new Course[courses.size()];
    for(int i = 0; i < courses.size(); i++) {
      temp[i] = courses.get(i);
    }
    return temp;
  }
}
