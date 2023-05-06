package Collections;

import java.util.ArrayList;
import java.util.*;

public class ListIteration {
    public static void main(String[] args) {


        List<String> pets= new ArrayList<String>();
        String[] mob= {"Rat","Pet","Mutt","Pug","Manx","Cimryc","Cimryc","Pet" };
        for(int i=0; i<mob.length; i++)
            pets.add(mob[i]);
        ListIterator<String>it= pets.listIterator();
        while(it.hasNext())
            System.out.print(it.next()+", "+it.nextIndex()+", "+it.previousIndex()+", ");
        System.out.println();
        while (it.hasPrevious())
            System.out.print(it.previous().length()+", ");
        System.out.println();
        System.out.print(pets);
        it=pets.listIterator(3);
        while (it.hasNext())
        { it.next();
            it.set("Fad");}
        System.out.println(mob);
    }
}

