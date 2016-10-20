package GUI;



import java.util.HashSet;
import java.util.Set;

/**
 * Created by dubo on 16/9/26.
 */
public class Girl {
    private String name;
    private Set<EmotionListener> persons;
    public Girl(){
        this("girl");
    }
    public Girl(String name){
        setName(name);
        persons =new HashSet<EmotionListener>();
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addEmotionListerner(EmotionListener li) {
        persons.add(li);
    }
    public void removeEmotionListerner(EmotionListener li){
        persons.add(li);
    }
    public void goodGrade(){
        EmotionEvent e=new EmotionEvent(this,"goodGrade");
        for(EmotionListener li:persons){
            li.happy(e);
        }
    }
    public void badGrade(){
        EmotionEvent e=new EmotionEvent(this,"badGrade");
        for(EmotionListener li:persons){
            li.sad(e);
        }
    }
}

