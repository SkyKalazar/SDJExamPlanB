import java.util.Arrays;

public class TestMain {

  public static void main(String [] args) {

    Date wick = new Date(20,  2, 2015);
    Time start = new Time(11, 44, 0);
    Time end = new Time(11, 45, 0);
    File src1 = new File("Reverence", "PDF");
    File src2 = new File("Rapacity", "docx");
    File src3 = new File("Propensity", "PDf");
    File[] geralt = {src1, src2, src3};

    Lesson lesson1 = new Lesson("Reap and Sow", wick, start, end, geralt);

//    System.out.println(lesson1);
//    System.out.println(lesson1.getDuration());
//    lesson1.delayBy(100);
//    System.out.println(lesson1);
//    System.out.println(lesson1.getDateTimeString());

    Lesson lesson5 = new DiscordLesson("Alacrity", wick, start, end, geralt, true, "VIA", false);
//    System.out.println(lesson5);
//    System.out.println(lesson5.getAllPDFs());

    Course sse = new Course("Study Skills for Software Engineers");
    Course mse = new Course("The Distant Land of Desolation");
    sse.addLesson(lesson1);
    sse.addLesson(lesson5);

//    System.out.println(sse.getAllLessons());

    Student yen = new Student(542137, "Yennefer");
    yen.addCourse(sse);
    yen.addGrade(12, mse);
    System.out.println(Arrays.toString(yen.getAllGrades()));



  }
}
