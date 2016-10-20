package OOAD.shopping;

/**
 * Created by dubo on 16/10/19.
 */
public class Goods {
    private String name;
    private double price;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Goods(int id,String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
