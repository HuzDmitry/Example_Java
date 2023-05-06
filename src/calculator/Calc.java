package calculator;

import java.util.Scanner;

public class Calc
{
    public static void main (String[] args)
    {
        Scanner scanner= new Scanner (System.in);
        String out=scanner.next ();
        A1 main=new A1 (out);

        do {

            if (out.equals ("ex"))

                break;
            else {
              //  System.out.println (main.getData ());
                //System.out.println (main.getIn1 ());
                //System.out.println (main.getIn2 ());
                main.analis ();
                main.setData (out=scanner.next ());
            }

        }while (true);
    }
}
