package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Madhu");
        hm.put(2,"Apple");
        hm.put(3,"rain");
        hm.put(4,"sunshine");
        System.out.println(hm);
        hm.remove(1,"Madhu");
        System.out.println("Has rain in it"+hm.containsValue("rain"));
        System.out.println(hm.size());
        //print values only
        for(String s:hm.values()){
            System.out.println(s);
        }
    }
}
