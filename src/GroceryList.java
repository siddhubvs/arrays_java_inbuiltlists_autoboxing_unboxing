package Arraylist;

import java.util.ArrayList;

public class GroceryList {

    int i;
    private ArrayList<String> grocerylist=new ArrayList<String>();
    public void addgrocerylist(String item){
        grocerylist.add(item);
    }
    public void printArrayList(){
        for(i=0;i<grocerylist.size();i++){
            System.out.println((i+1)+" "+grocerylist.get(i));
        }
    }
    public int FindItem(String Item){
        return grocerylist.indexOf(Item);
    }
    public void modifyGroceryItem(String currentitem,String newitem) {
        int position = FindItem(currentitem);
        if (position >= 0) {
            modifyGroceryItem(position, newitem);
        }
    }
     public void modifyGroceryItem(int position,String newitem){
        grocerylist.set(position,newitem);

    }
    public void removeGroceryItem(String newitem){
        int position = FindItem(newitem);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        grocerylist.remove(position);
    }
    public boolean OnFile(String searchItem){
        int position=FindItem(searchItem);
        if(position>=0)
            return true;
        else
            return false;
    }
}
