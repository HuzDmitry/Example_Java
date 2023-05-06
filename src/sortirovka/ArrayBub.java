package sortirovka;

import java.util.Random;

public class ArrayBub {
    private  long[] a;
    private int nElems;

    ArrayBub(int max){
        a=new long[max];
        nElems=0;
    }
    public void rand(){
        Random rnd= new Random();
        for(int i=0; i<a.length; i++){
            insert(rnd.nextInt(10000));
        }
    }

    public void insert(long value){
        a[nElems]=value;
        nElems++;
    }
    public void display(){
        for(int j=0; j<nElems; j++)
            System.out.print(a[j]+" ");
        System.out.println("");
    }
    public void bubbleSort(){
        long start=System.currentTimeMillis();
        int out, in;
        for(out=nElems-1; out>1; out--){
            for(in=0; in<out; in++){
                if (a[in] > a[in+1])
                    swap(in, in+1);
            }
        }
        System.out.println(System.currentTimeMillis()-start);
    }
    public void selectionSort(){
        long start=System.currentTimeMillis();
        int out, in, min;
        for(out=0; out<nElems-1; out++){
            min=out;
            for(in=out+1; in<nElems; in++){
                if(a[in]<a[min])
                    min=in;
                swap(out, min);
            }
        }
        System.out.println(System.currentTimeMillis()-start);
    }
    public void insertionSort(){
        long start=System.currentTimeMillis();
        int in, out;
        for(out=1; out<nElems; out++){
            long temp=a[out];
            in=out;
            while (in > 0 && a[in-1]>=temp){
                a[in]=a[in-1];
                --in;
            }
            a[in]=temp;
        }
        System.out.println(System.currentTimeMillis()-start);
    }

    private void swap(int one, int two){
        long temp=a[one];
        a[one]=a[two];
        a[two]=temp;
    }
}
