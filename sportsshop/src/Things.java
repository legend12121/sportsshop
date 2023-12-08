public class Things {
private String name;
private double price;
private int number;
    public Things() {
    }
    public Things(String name, double price, int number) {

        this.name = name;
        this.price = price;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String toString(){
        return this.name+","+this.price+","+this.number;
    }
}
