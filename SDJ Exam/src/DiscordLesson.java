public class DiscordLesson extends OnlineLesson {

  private String channelName;
  private boolean voiceChannel;

  public DiscordLesson(String topic, Date date, Time start, Time end, File[] res, boolean screenSharing, String channel, boolean voice) {
    super(topic, date, start, end, res, screenSharing);
    this.channelName = channel;
    this.voiceChannel = voice;
  }

  public String getChannelName() {
    return channelName;
  }
  public boolean usesVoiceChannel() {
    return voiceChannel;
  }
  public String nameOfSoftware() {
    return "Discord";
  }

  public String toString() {
    return super.toString() + "\nChannel name: " + channelName + "\nVoice channel: " + voiceChannel;
  }
}
