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

    Lesson sdj = new Lesson("Reap and Sow", wick, start, end, geralt);

    System.out.println(sdj);
    System.out.println(sdj.getDuration());
    sdj.delayBy(100);
    System.out.println(sdj);
    System.out.println(sdj.getDateTimeString());

  }
}
