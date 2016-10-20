package GUI;

import java.util.EventObject;
import java.util.Objects;

/**
 * Created by dubo on 16/9/26.
 */
public class EmotionEvent extends EventObject {
    private String msg;
    public EmotionEvent(Object source){
        this(source,"");
    }
    public EmotionEvent(Object source,String msg){
        super(source);
        setMsg(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "EmotionEvent"+msg;
    }
}
