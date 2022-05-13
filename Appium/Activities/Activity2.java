package activities;

import java.util.*;

public class Activity2 {
    public static boolean IsSum(int[] ar){
        int sum=0;
        for (int k=0;k<6;k++){
            if(ar[k]==10){
                sum+=ar[k];
            }
        }
        if(sum==30){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 array numbers");
        for (int i = 0; i < 6; i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println(IsSum(arr));

    }
}
