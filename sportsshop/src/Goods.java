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
    }
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
    }
public Things find(String name){
        Things foundthing=null;
        if(isEmpty()){
            return null;
        }
        else{
            for(int i=0;i<count;i++){
                boolean result;
                result= things[i].getName().contains(name);
                if(result) {
                        foundthing =  things[i];
                        System.out.println(things[i]);
                }
                }
            }
            return foundthing;
        }
    public  void buyThings(String name,int num){
        for(int i = 0; i< things.length; i++){
            if(things[i]!=null){
            if(things[i].getName().equals(name)){
                int number= things[i].getNumber()-num;
                things[i].setNumber(number);
                System.out.println("you succeed in buying what you want");
                break;
            }
            else {
                System.out.println("no goods match!");
              break;
            }
            }
    }
       }
       public void deleteAthing(String name){
           for (int i = 0; i < things.length; i++) {
               if(things[i]!=null){
                   if(things[i].getName().equals(name)){
                       things[i]=null;
                       if(i< things.length){
                           for (int j = i+1; j < things.length; j++) {
                               things[j-1]= things[j];
                           }
                           things[things.length-1]=null;
                       }
                       System.out.println("Successfully delete!");
                       break;
                   }
                   else {
                       System.out.println("no goods match!");
                       break;
                   }
               }
           }
       }
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
       }
       public boolean changeThing(String name){
           for (int i = 0; i < things.length; i++) {
               if(things[i]!=null){
                   if(things[i].getName().equals(name)){
                       return true;
                   }
               }
           }
           return false;
       }
    }

