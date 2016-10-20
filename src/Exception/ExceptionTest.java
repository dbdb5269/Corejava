package Exception;

/**
 * Created by dubo on 16/9/22.
 */
//写OwnException类，要求继承Exception类
//
//        写OwnExceptionSource类，要求包含方法a()，a()抛出OwnException
//
//        写OwnExceptionHandler类，要求包含main()，在main()中调用OwnExceptionSource类的a()，并处理相关异常

class OwnException extends Exception{
    private String msg;
    public OwnException(){
        this("");
    }
    public OwnException(String msg){
        this.msg=msg;
    }
    public String getMessage(){
        return msg;
    }
}
public class ExceptionTest {


}
class OwnExceptionSource{
    public void a() throws OwnException{
        throw new OwnException("Exception.OwnException error");
    }
}
class OwnExceptionHandler {

    public static void main(String[] args){
        OwnExceptionSource ownExceptionSource=new OwnExceptionSource();
        try {
            ownExceptionSource.a();
        }catch (OwnException e){
            System.out.println(e.getMessage());
        }
    }
}
