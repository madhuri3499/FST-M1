package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        //Adding object at specific index
        myList.add(3, "Grapes");
        myList.add(1, "Papaya");

        //print the list
        for(String s:myList){
            System.out.println(s);
        }
        //3r element in arraylist
        System.out.println("3rd element is "+myList.get(2));
        //contains apple
        System.out.println("Does the list have apple"+myList.contains("Apple"));
        //size of arraylist
        System.out.println("size of array is"+myList.size());
        //remove an element
        myList.remove("Apple");
        //size of arraylist
        System.out.println("size of array is"+myList.size());
    }
}
