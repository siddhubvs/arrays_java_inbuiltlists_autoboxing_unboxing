package Arraylist;

import java.util.Scanner;

public class grocerylist_main {
    public static Scanner sc=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        while (!quit){
            System.out.println("Enter your choice: ");

            choice=sc.nextInt();
            switch (choice){
                case 0:printInstructions();
                       break;
                case 1:groceryList.printArrayList();
                       break;
                case 2:addItem();
                       break;
                case 3:modifyItem();
                       break;
                case 4:removeItem();
                       break;
                case 5:searchForItem();
                       break;
                case 6:quit=true;
                       break;
            }

        }
    }
    public static void printInstructions(){
        System.out.println("1.printList");
        System.out.println("2.addItem");
        System.out.println("3.modifyItem");
        System.out.println("4.removeItem");
        System.out.println("5.searchForItem");
        System.out.println("6.Exit");
    }
    public static void addItem(){
        System.out.println("Please enter grocery item:\n");
        groceryList.addgrocerylist(sc.next());
    }
    public static void modifyItem(){
        System.out.println("Enter itemno");
        int itemno=sc.nextInt();
        System.out.println("Enter new item:");
        String newitem=sc.next();
        groceryList.modifyGroceryItem(itemno,newitem);
    }
    public static void removeItem(){
        System.out.println("Enter itemname");
        String itemname=sc.next();
        groceryList.removeGroceryItem(itemname);
    }
    public static void searchForItem(){
        System.out.println("Item to search for:");
        String searchItem=sc.next();
        if(groceryList.OnFile(searchItem))
            System.out.println("Found"+searchItem);
        else
            System.out.println(searchItem+" not on list");
    }
}
