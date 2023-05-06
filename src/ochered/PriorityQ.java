package ochered;

public class PriorityQ
{
    private int maxSize;
    private long[] queArry;
    private int nItems;
    PriorityQ(int s)
    {
        maxSize=s;
        queArry=new long[maxSize];
        nItems=0;
    }
    public void insert(long item)
    {
        int j;
        if(nItems==0)
            queArry[nItems++]=item;
        else
        {
            for(j=nItems-1; j>=0; j--)
            {
                if(item>queArry[j])
                    queArry[j+1]=queArry[j];
                else
                    break;
            }
            queArry[j+1]=item;
            nItems++;
        }
    }
    public long remove()
    {return queArry[--nItems];}
    public long peekMin()
    {return queArry[nItems-1];}
    public boolean isEmpty()
    {return (nItems==0);}
    public boolean isFull()
    {return (nItems==maxSize);}
}
