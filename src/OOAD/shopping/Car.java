package OOAD.shopping;


import java.util.*;

/**
 * Created by dubo on 16/10/19.
 */
//设计一个购物车,购物车可以添加商品，也可以删除商品，也可以显示出购买商品的列表，同时还可以查看购物车中商品的总价
public class Car {
    private List<Goods> list;

    public Car(){
        this.list=new LinkedList<>();
    }
    public void add(Goods goods){
        list.add(goods);
    }
    public void removed(Goods goods){
        list.remove(goods);
    }
    public void iterator(){

        Iterator iterator=list.iterator();
        int size=list.size();
        if(size<=0){
            System.out.println("购物车为空");
            System.exit(-1);
        }
        while (iterator.hasNext()){
            Goods tempgoods=(Goods) iterator.next();
            System.out.println("商品编号"+tempgoods.getId()+"商品名字"+tempgoods.getName()+"商品价格"+tempgoods.getPrice());

        }
    }
    public double sum(){
        double sum=0;
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Goods tempgoods=(Goods) iterator.next();
//            System.out.println("商品编号"+tempgoods.getId()+"商品名字"+tempgoods.getName()+"商品价格"+tempgoods.getPrice());
            sum=sum+tempgoods.getPrice();

        }
        return sum;
    }
    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

}
