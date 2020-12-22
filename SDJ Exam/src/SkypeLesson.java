public class SkypeLesson extends OnlineLesson{

  private String inviteLink;

  public SkypeLesson(String topic, Date date, Time start, Time end, File[] res, boolean screenSharing, String link) {
    super(topic, date, start, end, res, screenSharing);
    this.inviteLink = link;
  }

  public String getInviteLink() {
    return inviteLink;
  }
  public String nameOfSoftware() {
    return "Skype";
  }
  public String toString() {
    return super.toString() + "\nInvite link: " + inviteLink;
  }
}
