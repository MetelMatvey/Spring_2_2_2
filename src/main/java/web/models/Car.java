package web.models;

public class Car {

    private int id;
    private String colour;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(int id, String colour, int price) {
        this.id = id;
        this.colour = colour;
        this.price = price;
    }
}
