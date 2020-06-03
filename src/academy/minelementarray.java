package academy;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myarray = readintegers(5);
        int min=findmin(myarray);
        System.out.println(min);
        /*-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
                -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
                -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
                -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
                -Finally, print the minimum element in the array.*/


    }

    public static int[] readintegers(int count) {
        int[] value = new int[count];
        for (int i = 0; i < value.length; i++)
            value[i] = scanner.nextInt();
        return value;
    }
    public static int findmin(int[] myarray){
        int i,min=myarray[0];
        for(i=1;i<myarray.length;i++) {
            if(min>myarray[i])
                min=myarray[i];
        }



        return min;
    }
}
