package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("M");
        hs.add("A");
        hs.add("D");
        hs.add("H");
        hs.add("U");
        System.out.println("Size is"+hs.size());
        hs.remove("U");
        hs.remove("P");
        System.out.println("Has M in it"+hs.contains("M"));
        //print the hashset
        for(String s:hs){
            System.out.println(s);
        }
    }
}
