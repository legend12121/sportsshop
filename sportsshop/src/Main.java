import java.util.Scanner;

public class Main {
    private Scanner input=new Scanner(System.in);
    private shop ashop;
    public static void main(String[] args) {
        System.out.println("test");
        Main driver=new Main();
        driver.setup();
        driver.runmenu();

        }
        private int mainmenu(){
        System.out.println("""
                Shop Menu
                
                1)add a thing
                2)list the things
                3)find the thing
                0)exit
                ==>>""");
        int option=input.nextInt();
        return option;

        }
        private void runmenu(){
        int option=mainmenu();
        while (option!=0){
            switch (option){
                case 1->addathing();
                case 2->listallthings();
                case 3->findathing();
                default -> System.out.println("Invalid option entered"+option);
            }
            System.out.println("\nPress enter key to continue");
            input.nextLine();
            input.nextLine();
            option=mainmenu();


        }
        System.out.println("exiting,bye!");
        System.exit(0);
        }
private void findathing(){
        input.nextLine();
        System.out.println("enter a thing name");
        String name=input.nextLine();
        Things foundThing = ashop.find(name);
        if(foundThing!=null){
            System.out.println("the foundthing is "+foundThing);


        }
        else{
            System.out.println("There are no Things with the name [" + name + "] in the store.");
        }

}
private void setup(){
        System.out.println("How many things do you want to store?");
        int num=input.nextInt() ;
        ashop=new shop(num);

    }
    private void addathing(){
        input.nextLine();
        System.out.println("enter the thing name");
        String thingname=input.nextLine();
        System.out.println("enter the price");
        float thingprice=input.nextFloat();
        Things temp=new Things(thingname,thingprice);
        boolean isadded=ashop.add(temp);
        if(isadded){
            System.out.println("Thing Added Successfully");
        }
        else {
            System.out.println("No Thing Added");
        }
}
public void listallthings(){
        System.out.println("products are");
        System.out.println(ashop.list());
}
    }
