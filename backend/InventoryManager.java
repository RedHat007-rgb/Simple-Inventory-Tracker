import java.util.Scanner;

public class InventoryManager {
     private Item[] items;
     private int size;
     public InventoryManager(int inventory_size){
        this.items=new Item[inventory_size];
        this.size=0;
     }
     public String addItem(){
        System.out.println("Please enter the below details to add the Item:");
        System.out.println(" Item Name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(" Item Quantity:");
        int quantity=sc.nextInt();
        System.out.println(" Item Price:");
        double price=sc.nextDouble();
        if (size>=items.length){
         return "Inventory full";
        }
        for(int i=0;i<items.length;i++){
            if(items[i]==null){
                items[i]=new Item(name,quantity,price);
                size++;
                break;
            }
        }
        return "Added Item successfully..";
     }

     public String deleteItem(){
        System.out.println("Please enter the name of the item to delete:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=0;i<items.length;i++){
            if(name.equals(items[i].getName())){
                items[i]=null;
                  break;
            }
          
        }
        return "Item delete successfully";
    }


     
}
