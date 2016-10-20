package GUI;

/**
 * Created by dubo on 16/9/26.
 */
public class Boy implements EmotionListener{
    private String name;
    public Boy(String name){
        super();
        setName(name);
    }
    public Boy(){
        this("boy");
    }
    @Override
    public void sad(EmotionEvent e) {
        Object o=e.getSource();
        if(e.getSource() instanceof Girl){
            Girl g=((Girl)o);
            System.out.println(name + "is sad because" + g.getName()+"sadded"+e.getMsg());
        }
    }

    @Override
    public void happy(EmotionEvent e) {
        Object o=e.getSource();
        if(e.getSource() instanceof Girl){
            Girl g=((Girl)o);
            System.out.println(name + "is happy because" + g.getName()+"happened"+e.getMsg());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
