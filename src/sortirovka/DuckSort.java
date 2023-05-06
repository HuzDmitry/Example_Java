package sortirovka;

import java.util.Arrays;

public class DuckSort {
    public static void main (String[] args) {
        DuckOne[] ducks={
                new DuckOne ("Daffy",8),
                new DuckOne ("Dewey",2),
                new DuckOne ("Howard",7),
                new DuckOne ("Louie",2),
                new DuckOne ("Donald",10),
                new DuckOne ("Huey",2)
        };
        System.out.println ("массив не сортированный");
        display (ducks);
        Arrays.sort (ducks);
        System.out.println ("после сортировки");
        display (ducks);
    }
    public static void display(DuckOne[] ducks){
        for (DuckOne d:ducks
             ) {
            System.out.println (d);
        }
    }
}
class DuckOne implements Comparable<DuckOne>{
    String name;
    int weight;
    public DuckOne(String name, int weight){
        this.name=name;
        this.weight=weight;
    }

    @Override
    public String toString () {
        return name+" weight " + weight;
    }

    @Override
    public int compareTo (DuckOne o) {
        if (this.weight<o.weight)
            return -1;
        else if (this.weight==o.weight) {
            return 0;
        }else
            return 1;
    }
}