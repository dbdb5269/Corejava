package ch05;

/**
 * Created by dubo on 16/9/21.
 */
public class Duration {
    private int hours;
    private int minutes;
    private int seconds;
    private int totalseconds;
    public Duration(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;

    }
    public Duration(int totalseconds ){
        this.totalseconds=totalseconds;
    }
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getTotalSeconds(int hours,int minutes,int seconds ){
        return hours*3600+minutes*60+seconds;
    }
    public String toString(){
        return hours+":"+minutes+":"+seconds;
    }
}
