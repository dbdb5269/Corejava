package ch05;

/**
 * Created by dubo on 16/9/21.
 */
public class Track {
    private String title;
    private Duration duration;

    public Duration getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        return "my my Track title is:  "+title+" duration is: "+duration;
    }
}
