package Masif;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int []x = {2,5,57,10,33,100,20,47,8};
        System.out.println("min arr : "+min(x));
        System.out.println("max arr : "+max(x));
        System.out.println(Arrays.toString(x));
        Arrays.fill(x, 50);
        System.out.println(Arrays.toString(x));
    }
    static int min(int[] arr){
        int x = arr[0];
        for(int c=0; c<arr.length; c++){
            if(x>arr[c]) x=arr[c];
        }
        return x;
    }
    static int max(int[] arr){
        int x=arr[0];
        for(int c=0; c < arr.length; c++){
            if(x<arr[c]) x=arr[c];
        }
        return x;
    }
}
