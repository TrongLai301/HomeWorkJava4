import java.util.Scanner;
public class ClassFan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int speed,slow,medium,fast,radius,choose;
        String color,status;
        System.out.println("1. On");
        System.out.println("2. Off");
        System.out.print("Select: ");
        choose = sc.nextInt();

        if(choose==1){
            fan fanNew;
            boolean on=true;
            System.out.println("1. Slow");
            System.out.println("2.Medium");
            System.out.println("3.Fast");
            System.out.print("Enter speed:");
            speed= sc.nextInt();
            System.out.print("Enter radius: ");
            radius= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter color: ");
            color= sc.nextLine();
            status="on";
            fanNew= new fan(speed,color,radius,status,on);
            System.out.println(fanNew);
        }
        if(choose==2){
            fan fanNew1;
            boolean on=false;

            System.out.println("1. Slow");
            System.out.println("2.Medium");
            System.out.println("3.Fast");
            System.out.print("Enter speed:");
            speed= sc.nextInt();
            System.out.print("Enter radius: ");
            radius= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter color: ");
            color= sc.nextLine();
            status="off";
            fanNew1= new fan(speed,color,radius,status,on);
            System.out.println(fanNew1);
        }

    }
}
class fan{
    private final int SLOW=1,MEDIUM=2,FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    private String status;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed=SLOW;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius=5;
    }

    public String getColor() {
        return color="blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public fan(){

    }
    public fan(int speed,String color,double radius, String status, boolean on){
        this.speed=speed;
        this.color=color;
        this.on=on;
        this.radius=radius;
        this.status=status;
    }
    public String toString(){
        String state=" ";
        if(this.isOn()){
            state+="on";
        }else {
            state+="off";
        }

        return "Speed: "+speed+ ",radius is: "+radius+",color is: "+color+",fan is "+status;
    }
}
