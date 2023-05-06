package potoki;

public class PriorytetyDemo {
    public static void main(String[] args) {
        Prioritety mt1=new Prioritety("Высокий приоритет");
        Prioritety mt2=new Prioritety("Низкий приоритет");
        Prioritety mt3=new Prioritety("Обычный приоритет №1");
        Prioritety mt4=new Prioritety("Обычный приоритет №2");
        Prioritety mt5=new Prioritety("Обычный приоритет №3");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();
        try{
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        }catch (InterruptedException exc){
            System.out.println("Прерван основной поток");
        }
        System.out.println("\nСчетчик потока с высоким приоритетом: "+mt1.count);
        System.out.println("Счетчик потока с низким приоритетом: "+mt2.count);
        System.out.println("Счетчик потока 1 с обычным приоритетом: "+mt3.count);
        System.out.println("Счетчик потока 2 с обычным приоритетом: "+mt4.count);
        System.out.println("Счетчик потока 3 с обычным приоритетом: "+mt5.count);
    }
}

