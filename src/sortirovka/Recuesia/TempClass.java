package sortirovka.Recuesia;

import java.nio.file.Path;
import java.util.Scanner;

interface Scann {
    default String in(){
        Scanner scanner=new Scanner (System.in);
        String in =scanner.nextLine ();
        return in;
    }
}


public class TempClass {
    public static void main (String[] args) {
        Scann t1=new Kat ();
        Kat t2=new Kat ();
        String r1=t1.in();
        System.out.println (r1);
        String r2= t2.in ();
        System.out.println (r2);

    }
}
class Kat implements Scann{

}
