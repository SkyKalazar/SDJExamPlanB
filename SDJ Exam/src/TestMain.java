import java.util.Arrays;

public class TestMain {

  public static void main(String [] args) {

    Date date = new Date(20,  2, 2015);
    Date date2 = new Date(25, 3, 2019);
    Time start = new Time(10, 44, 0);
    Time start2 = new Time(20, 10, 0);
    Time end = new Time(11, 45, 0);
    Time end2 = new Time(21, 30, 0);
    File src1 = new File("Reverence", "PDF");
    File src2 = new File("Rapacity", "docx");
    File src3 = new File("Propensity", "PDf");
    File src4 = new File("Rapture", "pdf");
    File[] res1 = {src1, src2, src3};
    File[] res2 = {src2, src4};


    Lesson lesson1 = new Lesson("Reap and Sow", date, start, end, res1);
    OnlineLesson lesson2 = new DiscordLesson("Happy thoughts", date, start, end, res2, false, "VIADiscord", true);
    OnlineLesson lesson3 = new SkypeLesson("The Body Keeps The Score", date, start, end, res1, true, "ClickMe.com");

    lesson1.delayBy(120);
//    System.out.println(lesson2.getDateTimeString());
//    System.out.println(lesson1);
//    System.out.println(lesson2);
//    System.out.println(lesson3);
//    System.out.println(lesson2.getAllPDFs());
//
//    System.out.println(lesson2.nameOfSoftware());

    Course dbs = new Course("Database Structures");
    dbs.addLesson(lesson1);
    dbs.addLesson(lesson3);

//    System.out.println(dbs);
//    System.out.println(dbs.getAllLessons());
//    dbs.removeLesson(lesson3);
//    System.out.println(dbs);
//    dbs.addLesson(lesson3);
//    System.out.println(dbs.getAllResources());
//    System.out.println(dbs.getAllTopics());
//    System.out.println(dbs.getDiscordLessons());
//    System.out.println(dbs.getNumberOfLessons());
//    System.out.println(dbs.getOnlineLessons());
//    System.out.println(dbs.getSkypeLessons());
//    System.out.println(dbs.hasLessonOnDate(date2));


    Student geralt = new Student(4567, "Geralt");
    Course mse = new Course("Mathematics");
    mse.addLesson(lesson2);

    geralt.addGrade(10, dbs);
    geralt.addCourse(dbs);
    geralt.addGrade(12, dbs);
    geralt.addGrade(7, dbs);
    geralt.addGrade(7, mse);
    System.out.println(Arrays.toString(geralt.getAllGrades()));
    System.out.println(Arrays.toString(geralt.getAllCourses()));
    System.out.println(geralt.getGradeAverage());
    System.out.println(geralt);
    System.out.println(geralt.getAllGrades()[1]);

    Grade grade1 = new Grade(10, mse);
    System.out.println(grade1);



  }
}
