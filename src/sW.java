import java.util.Scanner;
public class sW {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i;
        System.out.println("1.Start");
        System.out.println("2.End");
        i=sc.nextInt();
        stopWatch newStopWatch=new stopWatch();
        if(i==1){
            newStopWatch.start();
            System.out.println("2.End");
            i=sc.nextInt();
        }
        if(i==2){
            newStopWatch.stop();
            System.out.println(newStopWatch.getElapsedTime()+" ms");
        }

    }
}
class stopWatch{
    private double startTime, endTime;

public stopWatch(){
}
    public void start(){
        startTime= System.currentTimeMillis();
    }
    public void stop(){
        endTime= System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return endTime-startTime;
    }
}
