package sortirovka;

public class BubbleSortApp {
    public static void main(String[] args) {
        //int maxSize=1000;
        //ArrayBub arr=new ArrayBub(maxSize);
        //ArrayBub ar1=new ArrayBub(maxSize);
        //ar1.rand();
        SteckX theSteck=new SteckX(10);
        theSteck.push(20);
        theSteck.push(44);
        theSteck.push(60);
        theSteck.push(80);
        while(!theSteck.isEmpty()){
            long value=theSteck.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");

        //arr.rand();
        //ar1.insertionSort();
        //ar1.selectionSort();
       // arr.display();
        //arr.bubbleSort();
      //  arr.display();
    }
}
