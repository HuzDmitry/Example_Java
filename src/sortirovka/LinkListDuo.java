package sortirovka;


import java.util.ArrayList;
import java.util.List;

public class LinkListDuo {
    public static void main (String[] args) {
        DoublyLinkedList theList=new DoublyLinkedList ();
        theList.inFirst (22);
        theList.inFirst (44);
        theList.inFirst (66);
        theList.inLast (11);
        theList.inLast (33);
        theList.inLast (55);
        theList.displayForward ();
        theList.displayBackward ();
        theList.deleteFirst ();
        theList.deleteLast ();
        theList.deleteKey (11);
        theList.displayForward ();
        theList.inAfter (77,22);
        theList.inAfter (88,33);
        theList.displayForward ();

    }
}
class LinkDuo{
    public long dData;
    public LinkDuo next;
    public LinkDuo previous;
    public LinkDuo(long d){
        dData=d;
    }
    public void displayLink(){
        System.out.print (dData+" ");
    }
}
class DoublyLinkedList{
    private LinkDuo first;
    private LinkDuo last;

    public DoublyLinkedList(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void inFirst(long dd){
        LinkDuo newLink= new LinkDuo (dd);
        if (isEmpty ())
            last=newLink;
        else
        {   first.previous=newLink;
            newLink.next=first;
        }
        first=newLink;
    }
    public void inLast(long dd){
        LinkDuo newLink=new LinkDuo (dd);
        if (isEmpty ())
            first=newLink;
        else {
            last.next=newLink;
            newLink.previous=last;
        }
        last=newLink;
    }
    public LinkDuo deleteFirst(){
        LinkDuo temp=first;
        if (first.next==null)
            last=null;
        else
            first.next.previous=null;
        first=first.next;
        return temp;
    }
    public LinkDuo deleteLast(){
        LinkDuo temp=last;
        if (first.next==null)
            first=null;
        else
            last.previous.next=null;
        last=last.previous;
        return temp;
    }
    public boolean inAfter(long dd, long key){
        LinkDuo current=first;
        while (current.dData!=key)
        {
            current=current.next;
            if (current==null)
                return false;
        }
        LinkDuo newLink=new LinkDuo (dd);
        if (current==last)
        {
            newLink.next=null;
            last=newLink;
        }
        else {
            newLink.next=current.next;
            current.next.previous=newLink;
        }
        newLink.previous=current;
        current.next=newLink;
        return true;
    }
    public LinkDuo deleteKey(long key){
        LinkDuo current=first;
        while(current.dData!=key){
            current=current.next;
            if (current==null)
                return null;
        }
        if (current==first)
            first=current.next;
        else
            current.previous.next=current.next;
        if (current==last)
            last=current.previous;
        else
            current.next.previous=current.previous;
        return current;
    }
    public void displayForward(){
        System.out.print ("List(first-->last): ");
        LinkDuo current=first;
        while(current!=null)
        {
            current.displayLink ();
            current=current.next;
        }
        System.out.println ("");
    }
    public void displayBackward(){
        System.out.print("List (last-->first): ");
        LinkDuo current=last;
        while (current!=null)
        {
            current.displayLink ();
            current=current.previous;
        }
        System.out.println ("");
    }
}
