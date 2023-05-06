import java.util.Arrays;

public class Example {
    public static void main (String[] args) {
//        int [] numbers = {2, 5, 13, 7, 6, 4};
//        int size =numbers.length;
//        int sum = 0;
//        //int avg=0;
//        int index=0;
//        while (index<size){
//            sum+=numbers[index];
//            System.out.println (sum);
//            index++;
//        }
//        //avg=sum/size;
//        sum/=size;
//        //System.out.println (avg);
//        System.out.println (sum);
//        for (int i=1; i<50; i++)
//        {
//            System.out.println("f("+i+")"+fibonacci(i));
//
//
//        }
        for(int m=0;m<65;m++) {
            System.out.println(m+"= "+Integer.toString(m,2));

        }
    }
    public static double factorial(int fak)
    {
        if (fak==1) return 1;
        else return fak* factorial(fak-1);
    }
    static double fibonacci(int t)
    {
        if (t==1||t==2)return 1;
        else return fibonacci(t-1)+fibonacci(t-2);
    }
}
