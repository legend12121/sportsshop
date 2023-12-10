import java.util.Scanner;
public class Main {
    public Scanner input=new Scanner(System.in);
    public Goods ashop=new Goods();
    public static void main(String[] args) {
        System.out.println("test");
        Main driver=new Main();
        driver.setup();
        driver.runMenu();
    }//Build a new main named driver.
    public int mainMenu(){
        System.out.println("""
                \u001b[4;33;255m
                Shop Menu
                (1)add a thing
                (2)list the things
                (3)find the thing
                (4)buy a thing
                (5)delete a thing
                (6)change a thing
                (0)exit
                ==>>\u001b[0;30;255m""");
        int option=input.nextInt();
        return option;
    }//Provide operational guidance and input commands through the keyboard to run.
    private void runMenu(){
        int option=mainMenu();
        while (option!=0){
            switch (option){
                case 1-> addAthing();
                case 2-> listAllthings();
                case 3-> fingAthing();
                case 4-> buyThings();
                case 5->deleteAthing();
                case 6->changeAthing();
                default -> System.out.println("Invalid option entered"+option);
            }
            System.out.println("\nPress enter key to continue");
            input.nextLine();
            input.nextLine();
            option=mainMenu();
        }
        System.out.println("exiting,bye!");
        System.exit(0);
    }//Referencing the corresponding method through the value of the input option in mainMenu.
    private void fingAthing(){
        input.nextLine();
        System.out.println("enter a thing name");
        String name=input.nextLine();
        Things foundThing = ashop.find(name);
        if(foundThing==null){
            System.out.println("There are no things with the name [" + name + "] in the store.");
        }
    }//The methods for finding products can be divided into two situations: responding with or without products.You can also search for products through fuzzy search.
    public void setup(){
        System.out.println("How many things do you want to store?");
        int num=input.nextInt() ;
        ashop.shop(num);
    }//Opening guidance
    public void addAthing(){
        input.nextLine();
        System.out.println("enter the thing name");
        String thingName=input.nextLine();
        System.out.println("enter the price");
        double thingPrice=input.nextFloat();
        System.out.println("enter the amount");
        int thingNumber=input.nextInt();
        Things temp=new Things(thingName,thingPrice,thingNumber);
        boolean isadded=ashop.add(temp);
        if(isadded){
            System.out.println("Thing Added Successfully");
        }
        else {
            System.out.println("No Thing Added");
        }
    }//The method of adding products and integrating the name, price, and number of the products.
    public void listAllthings(){
        System.out.println("products are");
        System.out.println(ashop.list());
    }//Display the products entered in addAthing.
    public void buyThings(){
        input.nextLine();
        System.out.println("enter the name you want to buy");
        String name=input.nextLine();
        System.out.println("enter how many the goods you want to buy");
        int num=input.nextInt();
        ashop.buyThings(name,num);
    }//Purchase the products added in addNothing by entering the name and quantity of the desired product.

    public void deleteAthing(){
        System.out.println("enter the name you want to delete");
        String name=input.next();
        ashop.deleteAthing(name);
    }//Delete items added in addAthing by entering the name of the product you want to delete.
    public void changeAthing(){
        System.out.println("enter the name of the goods you want to change");
        String name=input.next();
        if(ashop.changeThing(name)){
            System.out.println("enter the new amount");
            int num=input.nextInt();
            System.out.println("enter the new price");
            double price=input.nextDouble();
            ashop.changeAthing(name,price,num);
        }
        else {
            System.out.println("what you want to change doesn't exist");
        }
    }//Enter the name of the product you want to change, and then define its new number and price.
}