public class Flower {
    private String name;
    private int num_of_petals;
    private float price;

    public Flower(String name, int num_of_petals, float price) {
        this.name = name;
        this.num_of_petals = num_of_petals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum_of_petals() {
        return num_of_petals;
    }

    public void setNum_of_petals(int num_of_petals) {
        this.num_of_petals = num_of_petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
