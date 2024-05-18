public class BroadcastsTime<E> implements Comparable<E>{
    protected String time;
    protected byte hour;
    protected byte minute;
    @Override
    public int compareTo(E e) {
        return 0;
    }
    public BroadcastsTime(String time){
        this.time = time;
        this.hour = hour(time);
        this.minute = minute(time);
    }


    public byte hour(String time) {
        return Byte.parseByte(time.substring(0, 2));
    }

    public byte minute(String time) {
        return Byte.parseByte(time.substring(3));
    }

//    boolean after(BroadcastsTime t) {
//
//    }
//    boolean befor(BroadcastsTime t) {
//
//    }
//    boolean between(BroadcastsTime t1, BroadcastsTime t2) {
//
//    }
}
