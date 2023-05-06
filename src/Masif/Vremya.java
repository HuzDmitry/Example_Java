package Masif;



public class Vremya {


    public static void main(String[] args) {
        A obj1=new A();
        obj1.print(10);
        obj1.print("fff");
        B <String>obj2=new B(33);
        obj2.print("fff", "ddd");

    }
}
class A{
    public <T> void print(T obj){
        System.out.println(obj.toString());
    }
}
class B<T>{
    private T obj;
    public B (T obj){
        this.obj=obj;
    }
    public <U> void print (T obj1, U obj2){
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(this.obj.toString());
    }
}