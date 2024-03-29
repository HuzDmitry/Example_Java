package sortirovka;

class Link
{
    public  int iData; //ключ
    public  double dData; //данные
    public Link next; //следующий элемент в списке

    public Link(int id, double dd)
    {
        iData=id;
        dData=dd;
    }
    public void displayLink()
    {
        System.out.print("{"+iData+", "+dData+"} ");
    }

}
public class LinkList
{
    private Link first;

    public LinkList()
    {
        first=null;

    }
    public boolean isEmpty()//добавление объекта
    {
        return (first==null);
    }
    public void inFirst(int id, double dd)
    {
        Link newLink= new Link(id, dd);
        newLink.next=first; //старый первый объект
        first=newLink;
    }
    public Link delFirst() // удаление объекта
    {
        Link temp= first;
        first=first.next;
        return temp;
    }
    public void displayList()
    {
        System.out.print("List(first-->last: ");
        Link current =first;
        while(current !=null)
        {
            current.displayLink();
            current=current.next;
        }
    }
    public Link find(int key)// поиск значения по ключу
    {
        Link current=first;
        while(current.iData!=key)
        {
            if(current.next==null)
                return null;
            else
                current=current.next;
        }
        return current;
    }
    public Link delKey(int key)
    {
        Link current=first;
        Link previous=first;
        while(current.iData!=key)
        {
            if (current.next==null)
                return null;
            else
            {
                previous=current;
                current=current.next;
            }
        }
        if (current==first)
            first=first.next;
        else
            previous.next=current.next;
        return current;
    }
}