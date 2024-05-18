public class Program {
    protected String name;
    protected String chanel;
    protected BroadcastsTime broadcastsTime;


    public Program() {
    }
    public Program( String name, String chanel, BroadcastsTime broadcastsTime) {
        this.name = name;
        this.chanel = chanel;
        this.broadcastsTime = broadcastsTime;

    }

    public String getTitle() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannel() {
        return chanel;
    }

    public void setChannel(String chanel) {
        this.chanel = chanel;
    }

    public BroadcastsTime getBroadcastsTime() {
        return broadcastsTime;
    }

    public void setBroadcastsTime(BroadcastsTime broadcastsTime) {
        this.broadcastsTime = broadcastsTime;
    }
    public String getTime(){
        return broadcastsTime.time;
    }

}
