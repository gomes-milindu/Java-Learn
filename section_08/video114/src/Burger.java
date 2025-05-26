public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;


    public Burger(String name, String type, double price, String size, Item extra1, Item extra2, Item extra3) {
        super(name, type, price, size);
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public Item getExtra1() {
        return extra1;
    }

    public Item getExtra2() {
        return extra2;
    }

    public Item getExtra3() {
        return extra3;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "extra1=" + extra1+
                ", extra2=" + extra2+
                ", extra3=" + extra3+
                '}';
    }
}
