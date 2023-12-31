public class Goods {
   int count=0;
    public Things[] things;
   public void shop(int thingNumber){
      things =new Things[thingNumber];
   }
   public boolean isFull(){
       return count== things.length;
   }
   public boolean isEmpty(){
       return count==0;
   }
   public boolean add(Things things1){
     if(isFull()){
         if(things[count-1]==null) {
             things[count-1]=things1;
             return true;
         }
         return false;
     }
     else {
         for (int i = 0; i < things.length; i++) {
             things[count]=things1;
             count++;
             break;
         }
         return true;
     }
    }//2~29:Use the defined isFull and isEmpty methods to determine and store the added items in the newly created array things.
    public String list(){
        String listofproduct="";
        if(isEmpty()){
            return ("nothing");
        }
        else {
            for (int i=0;i<count;i++) {
                if (things[i] != null) {
                    listofproduct += i + 1 + ":" + "name:" + things[i].getName() + " price:" + things[i].getPrice() + " number:" + things[i].getNumber() + "\n";
                }
            }
        }
        return listofproduct;
    }//30~43:Use the isFull and isEmpty methods to make judgments, and integrate the data and other information in the array things to assign new values to the listof product.
public Things find(String name){
        Things foundThing=null;
        if(isEmpty()){
            return null;
        }
        else{
            for(int i=0;i<count;i++){
                boolean result;
                result= things[i].getName().contains(name);
                if(result) {
                        foundThing =  things[i];
                    System.out.print("name:" + foundThing.getName() + " price:" +foundThing.getPrice() + " number:" + foundThing.getNumber() + "\n");
                }
                }
            }
            return foundThing;
        }//44~60:Using the isEmpty and isFull methods to provide integrated output results for findAthing.
    public  void buyThings(String name,int num){
        for(int i = 0; i< things.length; i++){
            if(things[i]!=null){
            if(things[i].getName().equals(name)){
                int number= things[i].getNumber()-num;
                things[i].setNumber(number);
                System.out.println("you succeed in buying what you want");
                break;
            }
            }
    }
        if(!changeThing(name)){
            System.out.println("no goods match!");
        }
       }//61~75:When there is a product in the i+1st space of the array things, provide a purchase service.
       public void deleteAthing(String name){
           for (int i = 0; i < things.length; i++) {
               if(things[i]!=null) {
                   if (things[i].getName().equals(name)) {
                       things[i] = null;
                       if (i < things.length - 1) {
                           for (int j = i + 1; j < things.length; j++) {
                               things[j - 1] = things[j];
                           }
                       }
                       things[things.length - 1] = null;
                       System.out.println("Successfully delete!");
                       break;
                   }
                   if(!changeThing(name)){
                       System.out.println("nothing is deleted!");
                       break;
                   }
               }
           }
       }//76~95:When there is a product in the i+1st space of the array things, provide the service of deleting the product.
       public void changeAthing(String name,double price,int number){
           for (int i = 0; i < things.length; i++) {
               if(things[i]!=null){
                   if(things[i].getName().equals(name)){
                       things[i].setNumber(number);
                       things[i].setPrice(price);
                       break;
                   }
               }
           }
       }//96~106:Provide a service to change the product number and price when there is a product in the i+1st space of the array things.
    public boolean changeThing(String name){
           for (int i = 0; i < things.length; i++) {
               if(things[i]!=null){
                   if(things[i].getName().equals(name)){
                       return true;
                   }
               }
           }
           return false;
       }//107~116:Provide a service to change the product name when there is a product in the i+1st space of the array things.
}

