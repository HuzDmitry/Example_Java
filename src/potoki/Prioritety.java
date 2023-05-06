package potoki;

public class Prioritety implements Runnable{
    int count;
    Thread thrd;
    static boolean stop=false;
    static String currentName;
    Prioritety(String name){
        thrd= new Thread(this, name);
        count=0;
        currentName=name;
    }
    public void run(){
        System.out.println(thrd.getName()+" - запуск");
        do{
            count++;
            if(currentName.compareTo(thrd.getName())!=0){
                currentName=thrd.getName();
                System.out.println("В "+currentName);
            }
        }while(stop==false && count<10000000);
        stop=true;
        System.out.println("\n"+thrd.getName()+" - прерывание.");
    }
}
