public class Things {
    private String name;
    private float price;
    public Things(){
        this.name="a thing";
        this.price=99;
    }

    public Things(String name,float price){
        this.name=name;
        this.price=price;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String toString(){
        return this.name+" "+this.price;
    }
}
