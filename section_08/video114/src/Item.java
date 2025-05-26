public class Item {
    private String name;
    private String type;
    private double price;
    private String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getBasePrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getAdjustPrice(){
        if(size == "Large"){
            price = 15.00;
            return getBasePrice();
        }else if(getSize() == "Medium"){
            setPrice(10.00);
            return getBasePrice();
        }else{
            setPrice(5.00);
            return getBasePrice();
        }

    }

    public void printItem(){
        System.out.println("Name: " + getName() + "Price " + getAdjustPrice());
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + getBasePrice() +
                ", size='" + size + '\'' +
                '}';
    }
}
