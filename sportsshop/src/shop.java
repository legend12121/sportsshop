import java.util.Scanner;
public class shop {
    public Scanner input=new Scanner(System.in);
    public Things[] things;
    public int total=0;
    public shop(int numberItems){
        things=new Things[numberItems];
    }

    private boolean isfull(){
        return total ==things.length;
    }
    private boolean isempty(){
        return total==0;
    }
    public boolean add(Things thing){

        if(isfull()){
            return false;
        }
        else {
            things[total]=thing;
            total++;
        return true;
        }}

    String list(){
        String listofproduct="";
    if(isempty()){
        return ("nothing");
    }
    else {

        for (int i=0;i<total;i++){
            listofproduct+=i+1+":"+things[i]+"\n";
        }

    }
        return listofproduct;
}
public  Things find(String name){
        Things foundthing=null;
        if(isempty()){
            return null;

        }
        else{
            for(int i=0;i<total;i++){
                if(things[i].getName().equals(name)){
                    foundthing=things[i];
                }
            }
            return foundthing;
        }

}
}
