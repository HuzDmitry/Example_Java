package sortirovka;

public class LinkListApp
{
    public static void main(String[] args)
    {
        LinkList theLink= new LinkList();
        theLink.inFirst(22, 2.99);
        theLink.inFirst(44, 4.99);
        theLink.inFirst(66, 6.99);
        theLink.inFirst(88, 8.99);

        theLink.displayList();
        Link f=theLink.find (44);
        if (f!=null)
            System.out.println ("значение по ключу "+f.dData);
        else
            System.out.println ("нет значение в списке");
        Link d=theLink.delKey (66);
        if (d!=null)
            System.out.println ("значение "+d.dData+"удалено значение по ключу "+d.iData);
        else
            System.out.println ("нет значение по ключу");
        //while(! theLink.isEmpty())
        //{
        //    Link aLink=theLink.delFirst();
        //    System.out.print("Удаляю ");
        //    aLink.displayLink();
        //    System.out.println("");
        //}
        theLink.displayList();
    }
}
