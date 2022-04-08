package activities;
import java.util.*;
public class Activity13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(sc.hasNextInt()){
            al.add(sc.nextInt());
        }
        System.out.println(al);
        Integer a[] = al.toArray(new Integer[0]);
        int index = rand.nextInt(a.length);
        System.out.println("index num generated"+index);
        System.out.println("Value at index is"+a[index]);
    }
}
