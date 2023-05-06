package calculator;


public class A1
{


    private String data;
    private String in1;
    private  String in2;
    private int isZnak;

    private   final char[] arab={'0','1','2','3','4','5','6','7','8','9'};
    private   final char[] rim1={'I','V','X','L','C','D','M'};
    private   final int[] rim2={1,5,10,50,100,500,1000};

    private   final char[] ZNAK={'+','-','*','/'};

    public A1(String data)
    {
        this.data=data;
        this.isZnak=znaki (ZNAK);
    }

    public void setData (String data) {
        this.data = data;
        this.isZnak=znaki (ZNAK);
    }

    public String getData () {
        return data;
    }

    public String getIn1 () {
        if (isZnak>=0)
            return in1=data.substring (0, isZnak);
        else
            in1="0";
        return in1;
    }

    public String getIn2 () {
        if (isZnak>=0)
            return  in2=data.substring (isZnak+1);
        else
            in2="0";
        return in2;
    }
    private int znaki (char[] var)
    {
        int znak1=0;
        int temp=0;
        for (char d: var) {
             temp=data.indexOf (d);
             if (temp>=0)
             {
                 znak1=temp;
                 String data2=data.substring (znak1+1);
                 for (char  t: var)
                 {
                     temp=data2.indexOf (t);
                     if (temp>=0) {
                         znak1 = -1;
                         System.out.println ("много знаков");
                         break;
                     }
                 }
                 //  System.out.println ("pologenie "+znak1);
                 break;
             }



        }
        return znak1;
    }
    public void analis ()
    {
        int i1;
        int i2;
        if (isZnak<0)
            System.out.println ("нет знака вычисления");
        else
        {
           getIn1 ();
           getIn2 ();
           // int a1=znaki (this.arab);//наличие принадлежности системы счисления
          //  int a2=znaki (this.arab);// арабское или римское
           // int r1=znaki (this.rim1);
          //  int r2=znaki (this.rim1);
          //  if(a1>=0 && a2>=0 && r1<0 && r2<0)
           // {
            i1 = Integer.parseInt (in1);
            i2 = Integer.parseInt (in2);
            switch (data.charAt (isZnak))
                {
                    case '+':
                        int ok = i1+i2;
                        System.out.println (ok);
                        break;
                    case '-':
                         ok=i1-i2;
                        System.out.println (ok);
                        break;
                    case '*':
                        ok=i1*i2;
                        System.out.println (ok);
                        break;
                    case '/':
                        ok=i1/i2;
                        System.out.println (ok);
                        break;

                }
          //  }
          //  else
          //      System.out.println ("неправильное выражение");
        }

    }
}
