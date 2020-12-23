package Linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> places=new LinkedList<String>();
        places.add("Ahmedabad");
        addInorder(places,"Delhi");
        addInorder(places,"Mumbai");
        addInorder(places,"Chennai");
        addInorder(places,"Bangalore");
        addInorder(places,"Kolkata");
        addInorder(places,"Hyderabad");
        addInorder(places,"Lucknow");
        addInorder(places,"Pune");
        addInorder(places,"Guwahati");
        addInorder(places,"Kochin");

        printList(places);
        visit(places);

    }
    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now Visiting "+i.next());
        }
    }
    private static boolean addInorder(LinkedList<String> linkedList,String newcity){
        ListIterator<String> stringlist=linkedList.listIterator();
        while(stringlist.hasNext()) {
            int comparision = stringlist.next().compareTo(newcity);
            if (comparision == 0) {
                System.out.println(newcity + " is already added included as a destination");
                return false;
            } else if (comparision > 0) {
                stringlist.previous();
                stringlist.add(newcity);
                return true;
            } else if (comparision < 0) {
            }
        }
        stringlist.add(newcity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner sc=new Scanner(System.in);
        boolean quit=false;
        boolean goingforward=true;
        ListIterator<String> listIterator=cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in the iternary");
            return;
        }else{
            System.out.println("\nNow visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int action=sc.nextInt();
            sc.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit=true;
                    break;
                case 1:
                    if(!goingforward){
                        if(listIterator.hasNext())
                            listIterator.next();
                    goingforward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the list");
                        goingforward=false;
                    }
                    break;
                case 2:if(goingforward){
                    if(listIterator.hasPrevious())
                        listIterator.previous();
                    goingforward=false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Now visiting "+listIterator.previous());
                }
                else{
                    System.out.println("We are at start of the list");
                    goingforward=true;
                }
                break;
                case 3:printMenu();
                       break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("0-to quit\n1-go to next city\n2-go to previous city\n3-print menu options");
    }

}
