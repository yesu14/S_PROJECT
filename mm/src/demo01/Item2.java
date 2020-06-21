package demo01;

public class Item2 {
    private String brand;
    private String model;
    private int price;
    private boolean male;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public static void main(String[] args) {
        Item2 item=new Item2();
        item.setBrand("samsung");
        item.setPrice(1000);
        item.setModel("12qww");
        item.setMale(true);
        System.out.println("品牌："+item.getBrand()+"价格"+item.getPrice()+"型号"+item.getModel()+"性别"+item.isMale());
    }
}
