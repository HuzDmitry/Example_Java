package sortirovka;

 class Links
{
    public  long dData;
    public Links next;

    public Links(long d){dData=d;}
    public void display()
    {
        System.out.print (dData+" ");
    }

}

class FirstLastList
{
    private Links first;
    private Links last;

    public FirstLastList()
    {
        first=null;
        last=null;
    }
    public boolean isEmpty()
    {return first==null;}

    public void inFirst(long d)
    {
        Links newLinks = new Links (d);
        if (isEmpty ())
            last=newLinks;
        newLinks.next=first;
        first=newLinks;
    }
    public void inLast(long d)
    {
        Links newLinks=new Links (d);
        if (isEmpty ())
            first=newLinks;
        else
            last.next=newLinks;
        last=newLinks;
    }
    public long delFirst()
    {
        long temp=first.dData;
        if (first.next==null)
            first=null;
        first=first.next;
        return temp;
    }
    public void displayList()
    {
        System.out.print ("List--> last: ");
        Links current=first;
        while(current!=null)
        {
            current.display ();
            current=current.next;
        }
        System.out.println ("");
    }

}

class FirstLastListApp
{
    public static void main (String[] args) {
        FirstLastList theList=new FirstLastList ();
        theList.inFirst (22);
        theList.inFirst (44);
        theList.inFirst (66);
        theList.inLast (11);
        theList.inLast (33);
        theList.inLast (55);
        theList.displayList ();
        System.out.println ("удалено значение "+theList.delFirst ());
        System.out.println ("удалено значение "+theList.delFirst ());
        theList.displayList ();


    }
}
