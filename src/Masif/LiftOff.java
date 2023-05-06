package Masif;

class LiftOff implements  Runnable{
    protected int contDown =10;
    private  static int taskCount=0;
    private final int id= taskCount++;

    public LiftOff() {}
    public LiftOff(int countDown){
        this.contDown=countDown;
    }
    @Override
    public void run() {
        while (contDown-- > 0){
            System.out.print(status());
            Thread.yield();
        }
    }
    public String status(){
        return "#"+id +"("+(contDown>0? contDown:"The end!")+"), ";
    }
}
class MainThread {
    public static void main(String[] args) {
        for(int i=0; i<5; i++)
            new Thread(new LiftOff()).start();

        System.out.println("ssssssss");
    }

}
