package GUI;

/**
 * Created by dubo on 16/9/26.
 */
public class EmotionTest {
    public static void main(String[] args) {
        Girl girl=new Girl("Andy");
        Boy boy1=new Boy("weiwei");
        Boy boy2=new Boy("baoyifang");
        girl.addEmotionListerner(boy1);
        girl.goodGrade();
        girl.badGrade();
    }
}
