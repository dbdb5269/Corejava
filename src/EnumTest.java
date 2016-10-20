/**
 * Created by dubo on 16/9/22.
 */
interface GernderDesc{
    public void desc();
}
public class EnumTest {
    enum Gender implements GernderDesc{
        MALE("男"){
            public void desc(){
                System.out.println(getName());
            }
        },FEMALE("女"){
            public void desc(){
                System.out.println(getName());
            }
        };
        private String name;
        private Gender(String name){
            this.name=name;
        }
        //public abstract void hello();
        public String getName() {
            return name;
        }
//        public void desc(){
//            System.out.println("123");
//        }

    }
    public static void main(String[] args){
        Gender gender=Gender.FEMALE;
        System.out.println(gender);
        System.out.println(gender.getName());
        Gender gernders=Gender.valueOf("MALE");


        System.out.println(gernders.getName());
        Gender[] g=Gender.values();
        print1(g);
        print2(g);
    }
    public static void print1(Gender[] g){
        for(int i=0;i<g.length;i++){
            System.out.println(g[i]);
        }
    }
    //power forloop
    public static void print2(Gender[] g){
        for(Gender gender:g){
            System.out.println(gender);
        }
    }
}
