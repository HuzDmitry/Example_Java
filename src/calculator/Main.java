package calculator;

import java.util.Scanner;

public class Main
{
    private static final char[] ZNAK={'+','-','*','/'};
    private  static final String[] ARAB={"1","2","3","4","5","6","7","8","9","10"};


    public static void main (String[] args) throws Exception
    {
        System.out.println ("Могу вычислить простое выражение из арабских или римских чисел ");
        Scanner scanner=new Scanner (System.in);
        String output= Main.calc (scanner.next ());
        System.out.println (output);

    }
    public static String calc(String input)throws Exception
    {
        int znak=znaki (input);
        String output="";
        if (znak<0)
            throw new Exception ();
        else
        {
            String input1 = input.substring (0,znak);
            String input2 = input.substring (znak+1);
            boolean arab1=arabiza (input1);
            boolean arab2=arabiza (input2);
            //if (!arab1 && !arab2)



        }
        return output;
    }
    private static int znaki (String input) throws Exception
    {
        int znak = -1;

        for (char d : ZNAK)
        {
            int temp = input.indexOf (d);
            if (temp >= 0)
            {
                znak = temp;
                String data2 = input.substring (znak + 1);
                for (char t : ZNAK)
                {
                    temp = data2.indexOf (t);
                    if (temp >= 0)
                    {
                        throw new Exception ();
                    }
                }
                break;
            }


        }
        return znak;
    }
    private static boolean arabiza (String input)
    {
        boolean temp=false;
        for (String d: ARAB)
        {
            if (input.equals (d))
            {
                temp=true;
                break;
            }
        }
        return temp;

    }
}
class RimMath{}

